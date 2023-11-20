# GlobalSendingApi

All URIs are relative to *https://rest.clicksend.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listCountriesGet**](GlobalSendingApi.md#listCountriesGet) | **GET** /country-list | List of countries
[**userCountriesAgreePost**](GlobalSendingApi.md#userCountriesAgreePost) | **POST** /user-countries/agree | Agree to rules and regulation
[**userCountriesGet**](GlobalSendingApi.md#userCountriesGet) | **GET** /user-countries | Get Countries for Global Sending
[**userCountriesPost**](GlobalSendingApi.md#userCountriesPost) | **POST** /user-countries | Select Countries for Global Sending


<a name="listCountriesGet"></a>
# **listCountriesGet**
> String listCountriesGet()

List of countries

List of countries with IDs that can be used in selecting countries for Global sending.

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.GlobalSendingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

GlobalSendingApi apiInstance = new GlobalSendingApi();
try {
    String result = apiInstance.listCountriesGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GlobalSendingApi#listCountriesGet");
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

<a name="userCountriesAgreePost"></a>
# **userCountriesAgreePost**
> String userCountriesAgreePost()

Agree to rules and regulation

To agree on rules and regulations of selected countries and confirm selection.

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.GlobalSendingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

GlobalSendingApi apiInstance = new GlobalSendingApi();
try {
    String result = apiInstance.userCountriesAgreePost();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GlobalSendingApi#userCountriesAgreePost");
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

<a name="userCountriesGet"></a>
# **userCountriesGet**
> String userCountriesGet()

Get Countries for Global Sending

Get the list of selected countries.

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.GlobalSendingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

GlobalSendingApi apiInstance = new GlobalSendingApi();
try {
    String result = apiInstance.userCountriesGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GlobalSendingApi#userCountriesGet");
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

<a name="userCountriesPost"></a>
# **userCountriesPost**
> String userCountriesPost(countryListIds)

Select Countries for Global Sending

Use this endpoint to select countries that you intend to send sms / mms to. To remove / unselect a country, just remove the country id from the array in the payload.

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.GlobalSendingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

GlobalSendingApi apiInstance = new GlobalSendingApi();
CountryListIds countryListIds = new CountryListIds(); // CountryListIds | Id of countr(ies) you want to select, you can get them from GET /country-list response
try {
    String result = apiInstance.userCountriesPost(countryListIds);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GlobalSendingApi#userCountriesPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **countryListIds** | [**CountryListIds**](CountryListIds.md)| Id of countr(ies) you want to select, you can get them from GET /country-list response |

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

