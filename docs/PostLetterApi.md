# PostLetterApi

All URIs are relative to *https://rest.clicksend.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**postLettersExportGet**](PostLetterApi.md#postLettersExportGet) | **GET** /post/letters/export | export post letter history
[**postLettersHistoryGet**](PostLetterApi.md#postLettersHistoryGet) | **GET** /post/letters/history | Get all post letter history
[**postLettersPricePost**](PostLetterApi.md#postLettersPricePost) | **POST** /post/letters/price | Calculate post letter price
[**postLettersSendPost**](PostLetterApi.md#postLettersSendPost) | **POST** /post/letters/send | Send post letter


<a name="postLettersExportGet"></a>
# **postLettersExportGet**
> File postLettersExportGet(filename)

export post letter history

export post letter history

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.PostLetterApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

PostLetterApi apiInstance = new PostLetterApi();
String filename = "filename_example"; // String | Filename to export to
try {
    File result = apiInstance.postLettersExportGet(filename);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PostLetterApi#postLettersExportGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filename** | **String**| Filename to export to |

### Return type

[**File**](File.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postLettersHistoryGet"></a>
# **postLettersHistoryGet**
> String postLettersHistoryGet(page, limit)

Get all post letter history

Get all post letter history

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.PostLetterApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

PostLetterApi apiInstance = new PostLetterApi();
Integer page = 1; // Integer | Page number
Integer limit = 10; // Integer | Number of records per page
try {
    String result = apiInstance.postLettersHistoryGet(page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PostLetterApi#postLettersHistoryGet");
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

<a name="postLettersPricePost"></a>
# **postLettersPricePost**
> String postLettersPricePost(postLetter)

Calculate post letter price

Calculate post letter price

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.PostLetterApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

PostLetterApi apiInstance = new PostLetterApi();
PostLetter postLetter = new PostLetter(); // PostLetter | PostLetter model
try {
    String result = apiInstance.postLettersPricePost(postLetter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PostLetterApi#postLettersPricePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **postLetter** | [**PostLetter**](PostLetter.md)| PostLetter model |

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postLettersSendPost"></a>
# **postLettersSendPost**
> String postLettersSendPost(postLetter)

Send post letter

Send post letter

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.PostLetterApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

PostLetterApi apiInstance = new PostLetterApi();
PostLetter postLetter = new PostLetter(); // PostLetter | PostLetter model
try {
    String result = apiInstance.postLettersSendPost(postLetter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PostLetterApi#postLettersSendPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **postLetter** | [**PostLetter**](PostLetter.md)| PostLetter model |

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

