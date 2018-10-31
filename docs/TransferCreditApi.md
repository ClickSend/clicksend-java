# TransferCreditApi

All URIs are relative to *https://rest.clicksend.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**resellerTransferCreditPut**](TransferCreditApi.md#resellerTransferCreditPut) | **PUT** /reseller/transfer-credit | Transfer Credit


<a name="resellerTransferCreditPut"></a>
# **resellerTransferCreditPut**
> String resellerTransferCreditPut(resellerAccountTransferCredit)

Transfer Credit

Transfer Credit

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TransferCreditApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

TransferCreditApi apiInstance = new TransferCreditApi();
ResellerAccountTransferCredit resellerAccountTransferCredit = new ResellerAccountTransferCredit(); // ResellerAccountTransferCredit | ResellerAccountTransferCredit model
try {
    String result = apiInstance.resellerTransferCreditPut(resellerAccountTransferCredit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransferCreditApi#resellerTransferCreditPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resellerAccountTransferCredit** | [**ResellerAccountTransferCredit**](ResellerAccountTransferCredit.md)| ResellerAccountTransferCredit model |

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

