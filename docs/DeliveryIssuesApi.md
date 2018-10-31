# DeliveryIssuesApi

All URIs are relative to *https://rest.clicksend.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deliveryIssuesGet**](DeliveryIssuesApi.md#deliveryIssuesGet) | **GET** /delivery-issues | Get all delivery issues
[**deliveryIssuesPost**](DeliveryIssuesApi.md#deliveryIssuesPost) | **POST** /delivery-issues | Create delivery Issue


<a name="deliveryIssuesGet"></a>
# **deliveryIssuesGet**
> String deliveryIssuesGet(page, limit)

Get all delivery issues

Get all delivery issues

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DeliveryIssuesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

DeliveryIssuesApi apiInstance = new DeliveryIssuesApi();
Integer page = 1; // Integer | Page number
Integer limit = 10; // Integer | Number of records per page
try {
    String result = apiInstance.deliveryIssuesGet(page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeliveryIssuesApi#deliveryIssuesGet");
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

<a name="deliveryIssuesPost"></a>
# **deliveryIssuesPost**
> String deliveryIssuesPost(deliveryIssue)

Create delivery Issue

Create delivery Issue

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DeliveryIssuesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

DeliveryIssuesApi apiInstance = new DeliveryIssuesApi();
DeliveryIssue deliveryIssue = new DeliveryIssue(); // DeliveryIssue | DeliveryIssue model
try {
    String result = apiInstance.deliveryIssuesPost(deliveryIssue);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeliveryIssuesApi#deliveryIssuesPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deliveryIssue** | [**DeliveryIssue**](DeliveryIssue.md)| DeliveryIssue model |

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

