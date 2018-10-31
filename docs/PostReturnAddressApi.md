# PostReturnAddressApi

All URIs are relative to *https://rest.clicksend.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**postReturnAddressesByReturnAddressIdDelete**](PostReturnAddressApi.md#postReturnAddressesByReturnAddressIdDelete) | **DELETE** /post/return-addresses/{return_address_id} | Delete specific post return address
[**postReturnAddressesByReturnAddressIdGet**](PostReturnAddressApi.md#postReturnAddressesByReturnAddressIdGet) | **GET** /post/return-addresses/{return_address_id} | Get specific post return address
[**postReturnAddressesByReturnAddressIdPut**](PostReturnAddressApi.md#postReturnAddressesByReturnAddressIdPut) | **PUT** /post/return-addresses/{return_address_id} | Update post return address
[**postReturnAddressesGet**](PostReturnAddressApi.md#postReturnAddressesGet) | **GET** /post/return-addresses | Get list of post return addresses
[**postReturnAddressesPost**](PostReturnAddressApi.md#postReturnAddressesPost) | **POST** /post/return-addresses | Create post return address


<a name="postReturnAddressesByReturnAddressIdDelete"></a>
# **postReturnAddressesByReturnAddressIdDelete**
> String postReturnAddressesByReturnAddressIdDelete(returnAddressId)

Delete specific post return address

Delete specific post return address

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PostReturnAddressApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

PostReturnAddressApi apiInstance = new PostReturnAddressApi();
Integer returnAddressId = 56; // Integer | Return address ID
try {
    String result = apiInstance.postReturnAddressesByReturnAddressIdDelete(returnAddressId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PostReturnAddressApi#postReturnAddressesByReturnAddressIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **returnAddressId** | **Integer**| Return address ID |

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postReturnAddressesByReturnAddressIdGet"></a>
# **postReturnAddressesByReturnAddressIdGet**
> String postReturnAddressesByReturnAddressIdGet(returnAddressId)

Get specific post return address

Get specific post return address

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PostReturnAddressApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

PostReturnAddressApi apiInstance = new PostReturnAddressApi();
Integer returnAddressId = 56; // Integer | Return address ID
try {
    String result = apiInstance.postReturnAddressesByReturnAddressIdGet(returnAddressId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PostReturnAddressApi#postReturnAddressesByReturnAddressIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **returnAddressId** | **Integer**| Return address ID |

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postReturnAddressesByReturnAddressIdPut"></a>
# **postReturnAddressesByReturnAddressIdPut**
> String postReturnAddressesByReturnAddressIdPut(returnAddressId, returnAddress)

Update post return address

Update post return address

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PostReturnAddressApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

PostReturnAddressApi apiInstance = new PostReturnAddressApi();
Integer returnAddressId = 56; // Integer | Return address ID
Address returnAddress = new Address(); // Address | Address model
try {
    String result = apiInstance.postReturnAddressesByReturnAddressIdPut(returnAddressId, returnAddress);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PostReturnAddressApi#postReturnAddressesByReturnAddressIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **returnAddressId** | **Integer**| Return address ID |
 **returnAddress** | [**Address**](Address.md)| Address model |

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postReturnAddressesGet"></a>
# **postReturnAddressesGet**
> String postReturnAddressesGet(page, limit)

Get list of post return addresses

Get list of post return addresses

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PostReturnAddressApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

PostReturnAddressApi apiInstance = new PostReturnAddressApi();
Integer page = 1; // Integer | Page number
Integer limit = 10; // Integer | Number of records per page
try {
    String result = apiInstance.postReturnAddressesGet(page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PostReturnAddressApi#postReturnAddressesGet");
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

<a name="postReturnAddressesPost"></a>
# **postReturnAddressesPost**
> String postReturnAddressesPost(returnAddress)

Create post return address

Create post return address

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PostReturnAddressApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

PostReturnAddressApi apiInstance = new PostReturnAddressApi();
Address returnAddress = new Address(); // Address | Address model
try {
    String result = apiInstance.postReturnAddressesPost(returnAddress);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PostReturnAddressApi#postReturnAddressesPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **returnAddress** | [**Address**](Address.md)| Address model |

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

