# MmsApi

All URIs are relative to *https://rest.clicksend.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**mmsPricePost**](MmsApi.md#mmsPricePost) | **POST** /mms/price | Get Price for MMS sent
[**mmsReceiptsGet**](MmsApi.md#mmsReceiptsGet) | **GET** /mms/receipts | Get all delivery receipts
[**mmsReceiptsReadPut**](MmsApi.md#mmsReceiptsReadPut) | **PUT** /mms/receipts-read | Mark delivery receipts as read
[**mmsSendPost**](MmsApi.md#mmsSendPost) | **POST** /mms/send | Send MMS


<a name="mmsPricePost"></a>
# **mmsPricePost**
> String mmsPricePost(mmsMessages)

Get Price for MMS sent

Get Price for MMS sent

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.MmsApi;

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

<a name="mmsReceiptsGet"></a>
# **mmsReceiptsGet**
> String mmsReceiptsGet(page, limit)

Get all delivery receipts

Get all delivery receipts

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.MmsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

MmsApi apiInstance = new MmsApi();
Integer page = 1; // Integer | Page number
Integer limit = 10; // Integer | Number of records per page
try {
    String result = apiInstance.mmsReceiptsGet(page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MmsApi#mmsReceiptsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Page number | [optional] [default to 1]
 **limit** | **Integer**| Number of records per page | [optional] [default to 10]

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="mmsReceiptsReadPut"></a>
# **mmsReceiptsReadPut**
> String mmsReceiptsReadPut(dateBefore)

Mark delivery receipts as read

Mark delivery receipts as read

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.MmsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

MmsApi apiInstance = new MmsApi();
DateBefore dateBefore = new DateBefore(); // DateBefore | DateBefore model
try {
    String result = apiInstance.mmsReceiptsReadPut(dateBefore);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MmsApi#mmsReceiptsReadPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dateBefore** | [**DateBefore**](DateBefore.md)| DateBefore model | [optional]

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
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.MmsApi;

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

