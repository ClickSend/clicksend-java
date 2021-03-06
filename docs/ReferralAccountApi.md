# ReferralAccountApi

All URIs are relative to *https://rest.clicksend.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**referralAccountsGet**](ReferralAccountApi.md#referralAccountsGet) | **GET** /referral/accounts | Get all referral accounts


<a name="referralAccountsGet"></a>
# **referralAccountsGet**
> String referralAccountsGet(page, limit)

Get all referral accounts

Get all referral accounts

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.ReferralAccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ReferralAccountApi apiInstance = new ReferralAccountApi();
Integer page = 1; // Integer | Page number
Integer limit = 10; // Integer | Number of records per page
try {
    String result = apiInstance.referralAccountsGet(page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReferralAccountApi#referralAccountsGet");
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

