# AccountRechargeApi

All URIs are relative to *https://rest.clicksend.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**rechargeCreditCardGet**](AccountRechargeApi.md#rechargeCreditCardGet) | **GET** /recharge/credit-card | Get Credit Card info
[**rechargeCreditCardPut**](AccountRechargeApi.md#rechargeCreditCardPut) | **PUT** /recharge/credit-card | Update credit card info
[**rechargePackagesGet**](AccountRechargeApi.md#rechargePackagesGet) | **GET** /recharge/packages | Get list of all packages
[**rechargePurchaseByPackageIdPut**](AccountRechargeApi.md#rechargePurchaseByPackageIdPut) | **PUT** /recharge/purchase/{package_id} | Purchase a package
[**rechargeTransactionsByTransactionIdGet**](AccountRechargeApi.md#rechargeTransactionsByTransactionIdGet) | **GET** /recharge/transactions/{transaction_id} | Get specific Transaction
[**rechargeTransactionsGet**](AccountRechargeApi.md#rechargeTransactionsGet) | **GET** /recharge/transactions | Purchase a package


<a name="rechargeCreditCardGet"></a>
# **rechargeCreditCardGet**
> String rechargeCreditCardGet()

Get Credit Card info

Get Credit Card info

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.AccountRechargeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

AccountRechargeApi apiInstance = new AccountRechargeApi();
try {
    String result = apiInstance.rechargeCreditCardGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountRechargeApi#rechargeCreditCardGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="rechargeCreditCardPut"></a>
# **rechargeCreditCardPut**
> String rechargeCreditCardPut(creditCard)

Update credit card info

Update credit card info

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.AccountRechargeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

AccountRechargeApi apiInstance = new AccountRechargeApi();
CreditCard creditCard = new CreditCard(); // CreditCard | CreditCard model
try {
    String result = apiInstance.rechargeCreditCardPut(creditCard);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountRechargeApi#rechargeCreditCardPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **creditCard** | [**CreditCard**](CreditCard.md)| CreditCard model |

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="rechargePackagesGet"></a>
# **rechargePackagesGet**
> String rechargePackagesGet(country)

Get list of all packages

Get list of all packages

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.AccountRechargeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

AccountRechargeApi apiInstance = new AccountRechargeApi();
String country = "country_example"; // String | Country code
try {
    String result = apiInstance.rechargePackagesGet(country);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountRechargeApi#rechargePackagesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **country** | **String**| Country code | [optional]

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="rechargePurchaseByPackageIdPut"></a>
# **rechargePurchaseByPackageIdPut**
> String rechargePurchaseByPackageIdPut(packageId)

Purchase a package

Purchase a package

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.AccountRechargeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

AccountRechargeApi apiInstance = new AccountRechargeApi();
Integer packageId = 56; // Integer | ID of package to purchase
try {
    String result = apiInstance.rechargePurchaseByPackageIdPut(packageId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountRechargeApi#rechargePurchaseByPackageIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **packageId** | **Integer**| ID of package to purchase |

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="rechargeTransactionsByTransactionIdGet"></a>
# **rechargeTransactionsByTransactionIdGet**
> String rechargeTransactionsByTransactionIdGet(transactionId)

Get specific Transaction

Get specific Transaction

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.AccountRechargeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

AccountRechargeApi apiInstance = new AccountRechargeApi();
String transactionId = "transactionId_example"; // String | ID of transaction to retrieve
try {
    String result = apiInstance.rechargeTransactionsByTransactionIdGet(transactionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountRechargeApi#rechargeTransactionsByTransactionIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transactionId** | **String**| ID of transaction to retrieve |

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="rechargeTransactionsGet"></a>
# **rechargeTransactionsGet**
> String rechargeTransactionsGet(page, limit)

Purchase a package

Get all transactions

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.AccountRechargeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

AccountRechargeApi apiInstance = new AccountRechargeApi();
Integer page = 1; // Integer | Page number
Integer limit = 10; // Integer | Number of records per page
try {
    String result = apiInstance.rechargeTransactionsGet(page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountRechargeApi#rechargeTransactionsGet");
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

