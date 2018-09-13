/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.monitor.samples;

import com.microsoft.azure.PagedList;
import com.microsoft.azure.management.Azure;
import com.microsoft.azure.management.monitor.ActionGroup;
import com.microsoft.azure.management.monitor.ActivityLogAlert;
import com.microsoft.azure.management.monitor.EventData;
import com.microsoft.azure.management.resources.fluentcore.arm.Region;
import com.microsoft.azure.management.resources.fluentcore.utils.SdkContext;
import com.microsoft.azure.management.samples.Utils;
import com.microsoft.azure.management.storage.AccessTier;
import com.microsoft.azure.management.storage.StorageAccount;
import com.microsoft.azure.management.storage.StorageAccountKey;
import com.microsoft.rest.LogLevel;
import org.joda.time.DateTime;

import java.io.File;
import java.util.List;

/**
 * This sample shows examples of configuring Activity Log Alerts for potential security breach or risk notifications.
 *  - Create a storage account
 *  - Setup an action group to trigger a notification to the security teams
 *  - Create an activity log alerts for storage account access key retrievals
 *  - List Storage account keys to trigger an alert.
 *  - Retrieve and show all activity logs that contains "List Storage Account Keys" operation name in the resource group for the past 7 days for the same Storage account.
 */
public final class SecurityBreachOrRiskActivityLogAlerts {

    /**
     * Main function which runs the actual sample.
     * @param azure instance of the azure client
     * @return true if sample runs successfully
     */
    public static boolean runSample(Azure azure) {
        final String storageAccountName = Utils.createRandomName("saMonitor");
        final String rgName = Utils.createRandomName("rgMonitor");

        try {
            // ============================================================
            // Create a storage account
            System.out.println("Creating a Storage Account");

            StorageAccount storageAccount = azure.storageAccounts().define(storageAccountName)
                    .withRegion(Region.US_EAST)
                    .withNewResourceGroup(rgName)
                    .withBlobStorageAccountKind()
                    .withAccessTier(AccessTier.COOL)
                    .create();

            System.out.println("Created a Storage Account:");
            Utils.print(storageAccount);

            // ============================================================
            // Create an action group to send notifications in case activity log alert condition will be triggered
            ActionGroup ag = azure.actionGroups().define("securityBreachActionGroup")
                    .withExistingResourceGroup(rgName)
                    .defineReceiver("tierOne")
                        .withPushNotification("security_on_duty@securecorporation.com")
                        .withEmail("security_guards@securecorporation.com")
                        .withSms("1", "4255655665")
                        .withVoice("1", "2062066050")
                        .withWebhook("https://www.weseemstobehacked.securecorporation.com")
                    .attach()
                    .defineReceiver("tierTwo")
                        .withEmail("ceo@securecorporation.com")
                        .attach()
                    .create();
            Utils.print(ag);

            // ============================================================
            // Set a trigger to fire each time
            ActivityLogAlert ala = azure.alertRules().activityLogAlerts()
                    .define("Potential security breach alert")
                    .withExistingResourceGroup(rgName)
                    .withTargetSubscription(azure.subscriptionId())
                    .withDescription("Security StorageAccounts ListAccountKeys trigger")
                    .withRuleEnabled()
                    .withActionGroups(ag.id())
                    // fire an alert when all the conditions below will be true
                    .withEqualsCondition("category", "Security")
                    .withEqualsCondition("resourceId", storageAccount.id())
                    .withEqualsCondition("operationName", "Microsoft.Storage/storageAccounts/listkeys/action")
                    .create();
            Utils.print(ala);

            // this should trigger an action
            List<StorageAccountKey> storageAccountKeys = storageAccount.getKeys();

            // give sometime for the infrastructure to process the records and fit into time grain.
            // Note: Activity Log alerts could also be configured to route the logs to EventHubs through Monitor diagnostic Settings configuration
            // for near real time monitoring.
            SdkContext.sleep(6 * 60000);

            DateTime recordDateTime = DateTime.now();
            // get activity logs for the same period.
            PagedList<EventData> logs = azure.activityLogs().defineQuery()
                    .startingFrom(recordDateTime.minusDays(7))
                    .endsBefore(recordDateTime)
                    .withAllPropertiesInResponse()
                    .filterByResource(ala.id())
                    .execute();

            System.out.println("Activity logs for the Storage Account:");

            for (EventData event : logs) {
                if (!event.operationName().localizedValue().equalsIgnoreCase("List Storage Account Keys")) {
                    continue;
                }
                if (event.eventName() != null) {
                    System.out.println("\tEvent: " + event.eventName().localizedValue());
                }
                if (event.operationName() != null) {
                    System.out.println("\tOperation: " + event.operationName().localizedValue());
                }
                System.out.println("\tCaller: " + event.caller());
                System.out.println("\tCorrelationId: " + event.correlationId());
                System.out.println("\tSubscriptionId: " + event.subscriptionId());
            }

            return true;
        } catch (Exception f) {
            System.out.println(f.getMessage());
            f.printStackTrace();
        } finally {
            if (azure.resourceGroups().getByName(rgName) != null) {
                System.out.println("Deleting Resource Group: " + rgName);
                azure.resourceGroups().deleteByName(rgName);
                System.out.println("Deleted Resource Group: " + rgName);
            } else {
                System.out.println("Did not create any resources in Azure. No clean up is necessary");
            }
        }
        return false;
    }

    /**
     * Main entry point.
     * @param args the parameters
     */
    public static void main(String[] args) {
        try {

            final File credFile = new File(System.getenv("AZURE_AUTH_LOCATION"));

            Azure azure = Azure.configure()
                    .withLogLevel(LogLevel.NONE)
                    .authenticate(credFile)
                    .withDefaultSubscription();

            // Print selected subscription
            System.out.println("Selected subscription: " + azure.subscriptionId());

            runSample(azure);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
