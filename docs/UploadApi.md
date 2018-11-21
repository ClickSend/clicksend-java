# UploadApi

All URIs are relative to *https://rest.clicksend.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**uploadsPost**](UploadApi.md#uploadsPost) | **POST** /uploads | Upload File


<a name="uploadsPost"></a>
# **uploadsPost**
> String uploadsPost(convert, uploadFile)

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
String convert = "convert_example"; // String | 
UploadFile uploadFile = new UploadFile(); // UploadFile | 
try {
    String result = apiInstance.uploadsPost(convert, uploadFile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UploadApi#uploadsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **convert** | **String**|  |
 **uploadFile** | [**UploadFile**](UploadFile.md)|  | [optional]

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

