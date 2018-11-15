# PostPostcardApi

All URIs are relative to *https://rest.clicksend.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**postPostcardsHistoryExportGet**](PostPostcardApi.md#postPostcardsHistoryExportGet) | **GET** /post/postcards/history/export | Export postcard history to a CSV file
[**postPostcardsHistoryGet**](PostPostcardApi.md#postPostcardsHistoryGet) | **GET** /post/postcards/history | Retrieve the history of postcards sent or scheduled
[**postPostcardsPricePost**](PostPostcardApi.md#postPostcardsPricePost) | **POST** /post/postcards/price | Calculate price for sending one or more postcards
[**postPostcardsSendPost**](PostPostcardApi.md#postPostcardsSendPost) | **POST** /post/postcards/send | Send one or more postcards


<a name="postPostcardsHistoryExportGet"></a>
# **postPostcardsHistoryExportGet**
> String postPostcardsHistoryExportGet(filename)

Export postcard history to a CSV file

Export postcard history to a CSV file

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.PostPostcardApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

PostPostcardApi apiInstance = new PostPostcardApi();
String filename = "filename_example"; // String | Filename to export to
try {
    String result = apiInstance.postPostcardsHistoryExportGet(filename);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PostPostcardApi#postPostcardsHistoryExportGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filename** | **String**| Filename to export to |

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postPostcardsHistoryGet"></a>
# **postPostcardsHistoryGet**
> String postPostcardsHistoryGet(page, limit)

Retrieve the history of postcards sent or scheduled

Retrieve the history of postcards sent or scheduled

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.PostPostcardApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

PostPostcardApi apiInstance = new PostPostcardApi();
Integer page = 1; // Integer | Page number
Integer limit = 10; // Integer | Number of records per page
try {
    String result = apiInstance.postPostcardsHistoryGet(page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PostPostcardApi#postPostcardsHistoryGet");
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

<a name="postPostcardsPricePost"></a>
# **postPostcardsPricePost**
> String postPostcardsPricePost(postPostcards)

Calculate price for sending one or more postcards

Calculate price for sending one or more postcards

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.PostPostcardApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

PostPostcardApi apiInstance = new PostPostcardApi();
PostPostcard postPostcards = new PostPostcard(); // PostPostcard | PostPostcard model
try {
    String result = apiInstance.postPostcardsPricePost(postPostcards);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PostPostcardApi#postPostcardsPricePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **postPostcards** | [**PostPostcard**](PostPostcard.md)| PostPostcard model |

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postPostcardsSendPost"></a>
# **postPostcardsSendPost**
> String postPostcardsSendPost(postPostcards)

Send one or more postcards

Send one or more postcards

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.PostPostcardApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

PostPostcardApi apiInstance = new PostPostcardApi();
PostPostcard postPostcards = new PostPostcard(); // PostPostcard | PostPostcard model
try {
    String result = apiInstance.postPostcardsSendPost(postPostcards);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PostPostcardApi#postPostcardsSendPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **postPostcards** | [**PostPostcard**](PostPostcard.md)| PostPostcard model |

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

