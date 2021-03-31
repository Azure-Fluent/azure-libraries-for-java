/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerinstance.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceFuture;
import com.microsoft.azure.CloudException;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.management.containerinstance.CachedImages;
import com.microsoft.azure.management.containerinstance.Capabilities;
import com.microsoft.azure.Page;
import com.microsoft.azure.PagedList;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.Url;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Locations.
 */
public class LocationsInner {
    /** The Retrofit service to perform REST calls. */
    private LocationsService service;
    /** The service client containing this operation class. */
    private ContainerInstanceManagementClientImpl client;

    /**
     * Initializes an instance of LocationsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public LocationsInner(Retrofit retrofit, ContainerInstanceManagementClientImpl client) {
        this.service = retrofit.create(LocationsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Locations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface LocationsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.containerinstance.Locations listUsage" })
        @GET("subscriptions/{subscriptionId}/providers/Microsoft.ContainerInstance/locations/{location}/usages")
        Observable<Response<ResponseBody>> listUsage(@Path("subscriptionId") String subscriptionId, @Path("location") String location, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.containerinstance.Locations listCachedImages" })
        @GET("subscriptions/{subscriptionId}/providers/Microsoft.ContainerInstance/locations/{location}/cachedImages")
        Observable<Response<ResponseBody>> listCachedImages(@Path("subscriptionId") String subscriptionId, @Path("location") String location, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.containerinstance.Locations listCapabilities" })
        @GET("subscriptions/{subscriptionId}/providers/Microsoft.ContainerInstance/locations/{location}/capabilities")
        Observable<Response<ResponseBody>> listCapabilities(@Path("subscriptionId") String subscriptionId, @Path("location") String location, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.containerinstance.Locations listCachedImagesNext" })
        @GET
        Observable<Response<ResponseBody>> listCachedImagesNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.containerinstance.Locations listCapabilitiesNext" })
        @GET
        Observable<Response<ResponseBody>> listCapabilitiesNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Get the usage for a subscription.
     *
     * @param location The identifier for the physical azure location.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;UsageInner&gt; object if successful.
     */
    public List<UsageInner> listUsage(String location) {
        return listUsageWithServiceResponseAsync(location).toBlocking().single().body();
    }

    /**
     * Get the usage for a subscription.
     *
     * @param location The identifier for the physical azure location.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<UsageInner>> listUsageAsync(String location, final ServiceCallback<List<UsageInner>> serviceCallback) {
        return ServiceFuture.fromResponse(listUsageWithServiceResponseAsync(location), serviceCallback);
    }

    /**
     * Get the usage for a subscription.
     *
     * @param location The identifier for the physical azure location.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;UsageInner&gt; object
     */
    public Observable<List<UsageInner>> listUsageAsync(String location) {
        return listUsageWithServiceResponseAsync(location).map(new Func1<ServiceResponse<List<UsageInner>>, List<UsageInner>>() {
            @Override
            public List<UsageInner> call(ServiceResponse<List<UsageInner>> response) {
                return response.body();
            }
        });
    }

    /**
     * Get the usage for a subscription.
     *
     * @param location The identifier for the physical azure location.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;UsageInner&gt; object
     */
    public Observable<ServiceResponse<List<UsageInner>>> listUsageWithServiceResponseAsync(String location) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (location == null) {
            throw new IllegalArgumentException("Parameter location is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.listUsage(this.client.subscriptionId(), location, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<UsageInner>>>>() {
                @Override
                public Observable<ServiceResponse<List<UsageInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl1<UsageInner>> result = listUsageDelegate(response);
                        List<UsageInner> items = null;
                        if (result.body() != null) {
                            items = result.body().items();
                        }
                        ServiceResponse<List<UsageInner>> clientResponse = new ServiceResponse<List<UsageInner>>(items, result.response());
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl1<UsageInner>> listUsageDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl1<UsageInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl1<UsageInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Get the list of cached images.
     * Get the list of cached images on specific OS type for a subscription in a region.
     *
     * @param location The identifier for the physical azure location.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;CachedImages&gt; object if successful.
     */
    public PagedList<CachedImages> listCachedImages(final String location) {
        ServiceResponse<Page<CachedImages>> response = listCachedImagesSinglePageAsync(location).toBlocking().single();
        return new PagedList<CachedImages>(response.body()) {
            @Override
            public Page<CachedImages> nextPage(String nextPageLink) {
                return listCachedImagesNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Get the list of cached images.
     * Get the list of cached images on specific OS type for a subscription in a region.
     *
     * @param location The identifier for the physical azure location.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<CachedImages>> listCachedImagesAsync(final String location, final ListOperationCallback<CachedImages> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listCachedImagesSinglePageAsync(location),
            new Func1<String, Observable<ServiceResponse<Page<CachedImages>>>>() {
                @Override
                public Observable<ServiceResponse<Page<CachedImages>>> call(String nextPageLink) {
                    return listCachedImagesNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Get the list of cached images.
     * Get the list of cached images on specific OS type for a subscription in a region.
     *
     * @param location The identifier for the physical azure location.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;CachedImages&gt; object
     */
    public Observable<Page<CachedImages>> listCachedImagesAsync(final String location) {
        return listCachedImagesWithServiceResponseAsync(location)
            .map(new Func1<ServiceResponse<Page<CachedImages>>, Page<CachedImages>>() {
                @Override
                public Page<CachedImages> call(ServiceResponse<Page<CachedImages>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Get the list of cached images.
     * Get the list of cached images on specific OS type for a subscription in a region.
     *
     * @param location The identifier for the physical azure location.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;CachedImages&gt; object
     */
    public Observable<ServiceResponse<Page<CachedImages>>> listCachedImagesWithServiceResponseAsync(final String location) {
        return listCachedImagesSinglePageAsync(location)
            .concatMap(new Func1<ServiceResponse<Page<CachedImages>>, Observable<ServiceResponse<Page<CachedImages>>>>() {
                @Override
                public Observable<ServiceResponse<Page<CachedImages>>> call(ServiceResponse<Page<CachedImages>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listCachedImagesNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Get the list of cached images.
     * Get the list of cached images on specific OS type for a subscription in a region.
     *
    ServiceResponse<PageImpl<CachedImages>> * @param location The identifier for the physical azure location.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;CachedImages&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<CachedImages>>> listCachedImagesSinglePageAsync(final String location) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (location == null) {
            throw new IllegalArgumentException("Parameter location is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.listCachedImages(this.client.subscriptionId(), location, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<CachedImages>>>>() {
                @Override
                public Observable<ServiceResponse<Page<CachedImages>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<CachedImages>> result = listCachedImagesDelegate(response);
                        return Observable.just(new ServiceResponse<Page<CachedImages>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<CachedImages>> listCachedImagesDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<CachedImages>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<CachedImages>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Get the list of capabilities of the location.
     * Get the list of CPU/memory/GPU capabilities of a region.
     *
     * @param location The identifier for the physical azure location.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;Capabilities&gt; object if successful.
     */
    public PagedList<Capabilities> listCapabilities(final String location) {
        ServiceResponse<Page<Capabilities>> response = listCapabilitiesSinglePageAsync(location).toBlocking().single();
        return new PagedList<Capabilities>(response.body()) {
            @Override
            public Page<Capabilities> nextPage(String nextPageLink) {
                return listCapabilitiesNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Get the list of capabilities of the location.
     * Get the list of CPU/memory/GPU capabilities of a region.
     *
     * @param location The identifier for the physical azure location.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<Capabilities>> listCapabilitiesAsync(final String location, final ListOperationCallback<Capabilities> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listCapabilitiesSinglePageAsync(location),
            new Func1<String, Observable<ServiceResponse<Page<Capabilities>>>>() {
                @Override
                public Observable<ServiceResponse<Page<Capabilities>>> call(String nextPageLink) {
                    return listCapabilitiesNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Get the list of capabilities of the location.
     * Get the list of CPU/memory/GPU capabilities of a region.
     *
     * @param location The identifier for the physical azure location.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;Capabilities&gt; object
     */
    public Observable<Page<Capabilities>> listCapabilitiesAsync(final String location) {
        return listCapabilitiesWithServiceResponseAsync(location)
            .map(new Func1<ServiceResponse<Page<Capabilities>>, Page<Capabilities>>() {
                @Override
                public Page<Capabilities> call(ServiceResponse<Page<Capabilities>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Get the list of capabilities of the location.
     * Get the list of CPU/memory/GPU capabilities of a region.
     *
     * @param location The identifier for the physical azure location.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;Capabilities&gt; object
     */
    public Observable<ServiceResponse<Page<Capabilities>>> listCapabilitiesWithServiceResponseAsync(final String location) {
        return listCapabilitiesSinglePageAsync(location)
            .concatMap(new Func1<ServiceResponse<Page<Capabilities>>, Observable<ServiceResponse<Page<Capabilities>>>>() {
                @Override
                public Observable<ServiceResponse<Page<Capabilities>>> call(ServiceResponse<Page<Capabilities>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listCapabilitiesNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Get the list of capabilities of the location.
     * Get the list of CPU/memory/GPU capabilities of a region.
     *
    ServiceResponse<PageImpl<Capabilities>> * @param location The identifier for the physical azure location.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;Capabilities&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<Capabilities>>> listCapabilitiesSinglePageAsync(final String location) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (location == null) {
            throw new IllegalArgumentException("Parameter location is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.listCapabilities(this.client.subscriptionId(), location, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<Capabilities>>>>() {
                @Override
                public Observable<ServiceResponse<Page<Capabilities>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<Capabilities>> result = listCapabilitiesDelegate(response);
                        return Observable.just(new ServiceResponse<Page<Capabilities>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<Capabilities>> listCapabilitiesDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<Capabilities>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<Capabilities>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Get the list of cached images.
     * Get the list of cached images on specific OS type for a subscription in a region.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;CachedImages&gt; object if successful.
     */
    public PagedList<CachedImages> listCachedImagesNext(final String nextPageLink) {
        ServiceResponse<Page<CachedImages>> response = listCachedImagesNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<CachedImages>(response.body()) {
            @Override
            public Page<CachedImages> nextPage(String nextPageLink) {
                return listCachedImagesNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Get the list of cached images.
     * Get the list of cached images on specific OS type for a subscription in a region.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<CachedImages>> listCachedImagesNextAsync(final String nextPageLink, final ServiceFuture<List<CachedImages>> serviceFuture, final ListOperationCallback<CachedImages> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listCachedImagesNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<CachedImages>>>>() {
                @Override
                public Observable<ServiceResponse<Page<CachedImages>>> call(String nextPageLink) {
                    return listCachedImagesNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Get the list of cached images.
     * Get the list of cached images on specific OS type for a subscription in a region.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;CachedImages&gt; object
     */
    public Observable<Page<CachedImages>> listCachedImagesNextAsync(final String nextPageLink) {
        return listCachedImagesNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<CachedImages>>, Page<CachedImages>>() {
                @Override
                public Page<CachedImages> call(ServiceResponse<Page<CachedImages>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Get the list of cached images.
     * Get the list of cached images on specific OS type for a subscription in a region.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;CachedImages&gt; object
     */
    public Observable<ServiceResponse<Page<CachedImages>>> listCachedImagesNextWithServiceResponseAsync(final String nextPageLink) {
        return listCachedImagesNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<CachedImages>>, Observable<ServiceResponse<Page<CachedImages>>>>() {
                @Override
                public Observable<ServiceResponse<Page<CachedImages>>> call(ServiceResponse<Page<CachedImages>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listCachedImagesNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Get the list of cached images.
     * Get the list of cached images on specific OS type for a subscription in a region.
     *
    ServiceResponse<PageImpl<CachedImages>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;CachedImages&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<CachedImages>>> listCachedImagesNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listCachedImagesNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<CachedImages>>>>() {
                @Override
                public Observable<ServiceResponse<Page<CachedImages>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<CachedImages>> result = listCachedImagesNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<CachedImages>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<CachedImages>> listCachedImagesNextDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<CachedImages>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<CachedImages>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Get the list of capabilities of the location.
     * Get the list of CPU/memory/GPU capabilities of a region.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;Capabilities&gt; object if successful.
     */
    public PagedList<Capabilities> listCapabilitiesNext(final String nextPageLink) {
        ServiceResponse<Page<Capabilities>> response = listCapabilitiesNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<Capabilities>(response.body()) {
            @Override
            public Page<Capabilities> nextPage(String nextPageLink) {
                return listCapabilitiesNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Get the list of capabilities of the location.
     * Get the list of CPU/memory/GPU capabilities of a region.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<Capabilities>> listCapabilitiesNextAsync(final String nextPageLink, final ServiceFuture<List<Capabilities>> serviceFuture, final ListOperationCallback<Capabilities> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listCapabilitiesNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<Capabilities>>>>() {
                @Override
                public Observable<ServiceResponse<Page<Capabilities>>> call(String nextPageLink) {
                    return listCapabilitiesNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Get the list of capabilities of the location.
     * Get the list of CPU/memory/GPU capabilities of a region.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;Capabilities&gt; object
     */
    public Observable<Page<Capabilities>> listCapabilitiesNextAsync(final String nextPageLink) {
        return listCapabilitiesNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<Capabilities>>, Page<Capabilities>>() {
                @Override
                public Page<Capabilities> call(ServiceResponse<Page<Capabilities>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Get the list of capabilities of the location.
     * Get the list of CPU/memory/GPU capabilities of a region.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;Capabilities&gt; object
     */
    public Observable<ServiceResponse<Page<Capabilities>>> listCapabilitiesNextWithServiceResponseAsync(final String nextPageLink) {
        return listCapabilitiesNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<Capabilities>>, Observable<ServiceResponse<Page<Capabilities>>>>() {
                @Override
                public Observable<ServiceResponse<Page<Capabilities>>> call(ServiceResponse<Page<Capabilities>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listCapabilitiesNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Get the list of capabilities of the location.
     * Get the list of CPU/memory/GPU capabilities of a region.
     *
    ServiceResponse<PageImpl<Capabilities>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;Capabilities&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<Capabilities>>> listCapabilitiesNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listCapabilitiesNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<Capabilities>>>>() {
                @Override
                public Observable<ServiceResponse<Page<Capabilities>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<Capabilities>> result = listCapabilitiesNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<Capabilities>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<Capabilities>> listCapabilitiesNextDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<Capabilities>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<Capabilities>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}