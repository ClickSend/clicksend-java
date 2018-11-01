# UploadApi

All URIs are relative to *https://rest.clicksend.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**uploadsPost**](UploadApi.md#uploadsPost) | **POST** /uploads | Upload File


<a name="uploadsPost"></a>
# **uploadsPost**
> String uploadsPost(content, convert)

Upload File

Upload File

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.UploadApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

UploadApi apiInstance = new UploadApi();
String content = "content_example"; // String | Base64-encoded file contents
String convert = "convert_example"; // String | 
try {
    String result = apiInstance.uploadsPost(content, convert);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UploadApi#uploadsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **content** | **String**| Base64-encoded file contents |
 **convert** | **String**|  |

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

