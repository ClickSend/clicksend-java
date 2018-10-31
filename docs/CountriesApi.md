# CountriesApi

All URIs are relative to *https://rest.clicksend.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**countriesGet**](CountriesApi.md#countriesGet) | **GET** /countries | Get all country codes


<a name="countriesGet"></a>
# **countriesGet**
> String countriesGet()

Get all country codes

Get all countries

### Example
```java
// Import classes:
//import ClickSend.Client.ApiException;
//import ClickSend.Client.Api.CountriesApi;


CountriesApi apiInstance = new CountriesApi();
try {
    String result = apiInstance.countriesGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CountriesApi#countriesGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

