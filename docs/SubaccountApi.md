# SubaccountApi

All URIs are relative to *https://rest.clicksend.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**subaccountsBySubaccountIdDelete**](SubaccountApi.md#subaccountsBySubaccountIdDelete) | **DELETE** /subaccounts/{subaccount_id} | Delete a subaccount
[**subaccountsBySubaccountIdGet**](SubaccountApi.md#subaccountsBySubaccountIdGet) | **GET** /subaccounts/{subaccount_id} | Get specific subaccount
[**subaccountsBySubaccountIdPut**](SubaccountApi.md#subaccountsBySubaccountIdPut) | **PUT** /subaccounts/{subaccount_id} | Update subaccount
[**subaccountsGet**](SubaccountApi.md#subaccountsGet) | **GET** /subaccounts | Get all subaccounts
[**subaccountsPost**](SubaccountApi.md#subaccountsPost) | **POST** /subaccounts | Create new subaccount
[**subaccountsRegenApiKeyBySubaccountIdPut**](SubaccountApi.md#subaccountsRegenApiKeyBySubaccountIdPut) | **PUT** /subaccounts/{subaccount_id}/regen-api-key | Regenerate an API Key


<a name="subaccountsBySubaccountIdDelete"></a>
# **subaccountsBySubaccountIdDelete**
> String subaccountsBySubaccountIdDelete(subaccountId)

Delete a subaccount

Delete a subaccount

### Example
```java
// Import classes:
//import ClickSend.Client.ApiClient;
//import ClickSend.Client.ApiException;
//import ClickSend.Client.Configuration;
//import ClickSend.Client.auth.*;
//import ClickSend.Client.Api.SubaccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

SubaccountApi apiInstance = new SubaccountApi();
Integer subaccountId = 56; // Integer | ID of subaccount to delete
try {
    String result = apiInstance.subaccountsBySubaccountIdDelete(subaccountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubaccountApi#subaccountsBySubaccountIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subaccountId** | **Integer**| ID of subaccount to delete |

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="subaccountsBySubaccountIdGet"></a>
# **subaccountsBySubaccountIdGet**
> String subaccountsBySubaccountIdGet(subaccountId)

Get specific subaccount

Get specific subaccount

### Example
```java
// Import classes:
//import ClickSend.Client.ApiClient;
//import ClickSend.Client.ApiException;
//import ClickSend.Client.Configuration;
//import ClickSend.Client.auth.*;
//import ClickSend.Client.Api.SubaccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

SubaccountApi apiInstance = new SubaccountApi();
Integer subaccountId = 56; // Integer | ID of subaccount to get
try {
    String result = apiInstance.subaccountsBySubaccountIdGet(subaccountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubaccountApi#subaccountsBySubaccountIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subaccountId** | **Integer**| ID of subaccount to get |

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="subaccountsBySubaccountIdPut"></a>
# **subaccountsBySubaccountIdPut**
> String subaccountsBySubaccountIdPut(subaccountId, subaccount)

Update subaccount

Update subaccount

### Example
```java
// Import classes:
//import ClickSend.Client.ApiClient;
//import ClickSend.Client.ApiException;
//import ClickSend.Client.Configuration;
//import ClickSend.Client.auth.*;
//import ClickSend.Client.Api.SubaccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

SubaccountApi apiInstance = new SubaccountApi();
Integer subaccountId = 56; // Integer | ID of subaccount to update
Subaccount subaccount = new Subaccount(); // Subaccount | Subaccount model
try {
    String result = apiInstance.subaccountsBySubaccountIdPut(subaccountId, subaccount);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubaccountApi#subaccountsBySubaccountIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subaccountId** | **Integer**| ID of subaccount to update |
 **subaccount** | [**Subaccount**](Subaccount.md)| Subaccount model |

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="subaccountsGet"></a>
# **subaccountsGet**
> String subaccountsGet(page, limit)

Get all subaccounts

Get all subaccounts

### Example
```java
// Import classes:
//import ClickSend.Client.ApiClient;
//import ClickSend.Client.ApiException;
//import ClickSend.Client.Configuration;
//import ClickSend.Client.auth.*;
//import ClickSend.Client.Api.SubaccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

SubaccountApi apiInstance = new SubaccountApi();
Integer page = 1; // Integer | Page number
Integer limit = 10; // Integer | Number of records per page
try {
    String result = apiInstance.subaccountsGet(page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubaccountApi#subaccountsGet");
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

<a name="subaccountsPost"></a>
# **subaccountsPost**
> String subaccountsPost(subaccount)

Create new subaccount

Create new subaccount

### Example
```java
// Import classes:
//import ClickSend.Client.ApiClient;
//import ClickSend.Client.ApiException;
//import ClickSend.Client.Configuration;
//import ClickSend.Client.auth.*;
//import ClickSend.Client.Api.SubaccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

SubaccountApi apiInstance = new SubaccountApi();
Subaccount subaccount = new Subaccount(); // Subaccount | Subaccount model
try {
    String result = apiInstance.subaccountsPost(subaccount);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubaccountApi#subaccountsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subaccount** | [**Subaccount**](Subaccount.md)| Subaccount model |

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="subaccountsRegenApiKeyBySubaccountIdPut"></a>
# **subaccountsRegenApiKeyBySubaccountIdPut**
> String subaccountsRegenApiKeyBySubaccountIdPut(subaccountId)

Regenerate an API Key

Regenerate an API Key

### Example
```java
// Import classes:
//import ClickSend.Client.ApiClient;
//import ClickSend.Client.ApiException;
//import ClickSend.Client.Configuration;
//import ClickSend.Client.auth.*;
//import ClickSend.Client.Api.SubaccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

SubaccountApi apiInstance = new SubaccountApi();
Integer subaccountId = 56; // Integer | ID of subaccount to regenerate API key for
try {
    String result = apiInstance.subaccountsRegenApiKeyBySubaccountIdPut(subaccountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubaccountApi#subaccountsRegenApiKeyBySubaccountIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subaccountId** | **Integer**| ID of subaccount to regenerate API key for |

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

