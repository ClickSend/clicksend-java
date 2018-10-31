# ResellerAccountApi

All URIs are relative to *https://rest.clicksend.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**resellerAccountsByClientUserIdGet**](ResellerAccountApi.md#resellerAccountsByClientUserIdGet) | **GET** /reseller/accounts/{client_user_id} | Get Reseller clients Account
[**resellerAccountsByClientUserIdPut**](ResellerAccountApi.md#resellerAccountsByClientUserIdPut) | **PUT** /reseller/accounts/{client_user_id} | Update Reseller clients Account
[**resellerAccountsGet**](ResellerAccountApi.md#resellerAccountsGet) | **GET** /reseller/accounts | Get list of reseller accounts
[**resellerAccountsPost**](ResellerAccountApi.md#resellerAccountsPost) | **POST** /reseller/accounts | Create reseller account


<a name="resellerAccountsByClientUserIdGet"></a>
# **resellerAccountsByClientUserIdGet**
> String resellerAccountsByClientUserIdGet(clientUserId)

Get Reseller clients Account

Get Reseller clients Account

### Example
```java
// Import classes:
//import ClickSend.Client.ApiClient;
//import ClickSend.Client.ApiException;
//import ClickSend.Client.Configuration;
//import ClickSend.Client.auth.*;
//import ClickSend.Client.Api.ResellerAccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ResellerAccountApi apiInstance = new ResellerAccountApi();
Integer clientUserId = 56; // Integer | User ID of client
try {
    String result = apiInstance.resellerAccountsByClientUserIdGet(clientUserId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResellerAccountApi#resellerAccountsByClientUserIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientUserId** | **Integer**| User ID of client |

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="resellerAccountsByClientUserIdPut"></a>
# **resellerAccountsByClientUserIdPut**
> String resellerAccountsByClientUserIdPut(clientUserId, resellerAccount)

Update Reseller clients Account

Update Reseller clients Account

### Example
```java
// Import classes:
//import ClickSend.Client.ApiClient;
//import ClickSend.Client.ApiException;
//import ClickSend.Client.Configuration;
//import ClickSend.Client.auth.*;
//import ClickSend.Client.Api.ResellerAccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ResellerAccountApi apiInstance = new ResellerAccountApi();
Integer clientUserId = 56; // Integer | User ID of client
ResellerAccount resellerAccount = new ResellerAccount(); // ResellerAccount | ResellerAccount model
try {
    String result = apiInstance.resellerAccountsByClientUserIdPut(clientUserId, resellerAccount);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResellerAccountApi#resellerAccountsByClientUserIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientUserId** | **Integer**| User ID of client |
 **resellerAccount** | [**ResellerAccount**](ResellerAccount.md)| ResellerAccount model |

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="resellerAccountsGet"></a>
# **resellerAccountsGet**
> String resellerAccountsGet(page, limit)

Get list of reseller accounts

Get list of reseller accounts

### Example
```java
// Import classes:
//import ClickSend.Client.ApiClient;
//import ClickSend.Client.ApiException;
//import ClickSend.Client.Configuration;
//import ClickSend.Client.auth.*;
//import ClickSend.Client.Api.ResellerAccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ResellerAccountApi apiInstance = new ResellerAccountApi();
Integer page = 1; // Integer | Page number
Integer limit = 10; // Integer | Number of records per page
try {
    String result = apiInstance.resellerAccountsGet(page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResellerAccountApi#resellerAccountsGet");
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

<a name="resellerAccountsPost"></a>
# **resellerAccountsPost**
> String resellerAccountsPost(resellerAccount)

Create reseller account

Create reseller account

### Example
```java
// Import classes:
//import ClickSend.Client.ApiClient;
//import ClickSend.Client.ApiException;
//import ClickSend.Client.Configuration;
//import ClickSend.Client.auth.*;
//import ClickSend.Client.Api.ResellerAccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ResellerAccountApi apiInstance = new ResellerAccountApi();
ResellerAccount resellerAccount = new ResellerAccount(); // ResellerAccount | ResellerAccount model
try {
    String result = apiInstance.resellerAccountsPost(resellerAccount);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResellerAccountApi#resellerAccountsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resellerAccount** | [**ResellerAccount**](ResellerAccount.md)| ResellerAccount model |

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

