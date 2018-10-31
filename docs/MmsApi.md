# MmsApi

All URIs are relative to *https://rest.clicksend.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**mmsPricePost**](MmsApi.md#mmsPricePost) | **POST** /mms/price | Get Price for MMS sent
[**mmsSendPost**](MmsApi.md#mmsSendPost) | **POST** /mms/send | Send MMS


<a name="mmsPricePost"></a>
# **mmsPricePost**
> String mmsPricePost(mmsMessages)

Get Price for MMS sent

Get Price for MMS sent

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MmsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

MmsApi apiInstance = new MmsApi();
MmsMessageCollection mmsMessages = new MmsMessageCollection(); // MmsMessageCollection | MmsMessageCollection model
try {
    String result = apiInstance.mmsPricePost(mmsMessages);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MmsApi#mmsPricePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mmsMessages** | [**MmsMessageCollection**](MmsMessageCollection.md)| MmsMessageCollection model |

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="mmsSendPost"></a>
# **mmsSendPost**
> String mmsSendPost(mmsMessages)

Send MMS

Send MMS

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MmsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

MmsApi apiInstance = new MmsApi();
MmsMessageCollection mmsMessages = new MmsMessageCollection(); // MmsMessageCollection | MmsMessageCollection model
try {
    String result = apiInstance.mmsSendPost(mmsMessages);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MmsApi#mmsSendPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mmsMessages** | [**MmsMessageCollection**](MmsMessageCollection.md)| MmsMessageCollection model |

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

