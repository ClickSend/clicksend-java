# DetectAddressApi

All URIs are relative to *https://rest.clicksend.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**detectAddressPost**](DetectAddressApi.md#detectAddressPost) | **POST** /post/letters/detect-address | Detects address in uploaded file.


<a name="detectAddressPost"></a>
# **detectAddressPost**
> String detectAddressPost(content)

Detects address in uploaded file.

Detects address in uploaded file.

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.DetectAddressApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

DetectAddressApi apiInstance = new DetectAddressApi();
Content content = new Content(); // Content | Your file to be uploaded
try {
    String result = apiInstance.detectAddressPost(content);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DetectAddressApi#detectAddressPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **content** | [**Content**](Content.md)| Your file to be uploaded |

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

