# NumberApi

All URIs are relative to *https://rest.clicksend.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**numbersBuyByDedicatedNumberPost**](NumberApi.md#numbersBuyByDedicatedNumberPost) | **POST** /numbers/buy/{dedicated_number} | Buy dedicated number
[**numbersGet**](NumberApi.md#numbersGet) | **GET** /numbers | Get all availible dedicated numbers
[**numbersSearchByCountryGet**](NumberApi.md#numbersSearchByCountryGet) | **GET** /numbers/search/{country} | Get all dedicated numbers by country


<a name="numbersBuyByDedicatedNumberPost"></a>
# **numbersBuyByDedicatedNumberPost**
> String numbersBuyByDedicatedNumberPost(dedicatedNumber)

Buy dedicated number

Buy dedicated number

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NumberApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

NumberApi apiInstance = new NumberApi();
String dedicatedNumber = "dedicatedNumber_example"; // String | Phone number to purchase
try {
    String result = apiInstance.numbersBuyByDedicatedNumberPost(dedicatedNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NumberApi#numbersBuyByDedicatedNumberPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dedicatedNumber** | **String**| Phone number to purchase |

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="numbersGet"></a>
# **numbersGet**
> String numbersGet(page, limit)

Get all availible dedicated numbers

Get all availible dedicated numbers

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NumberApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

NumberApi apiInstance = new NumberApi();
Integer page = 1; // Integer | Page number
Integer limit = 10; // Integer | Number of records per page
try {
    String result = apiInstance.numbersGet(page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NumberApi#numbersGet");
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

<a name="numbersSearchByCountryGet"></a>
# **numbersSearchByCountryGet**
> String numbersSearchByCountryGet(country, search, searchType, page, limit)

Get all dedicated numbers by country

Get all dedicated numbers by country

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NumberApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

NumberApi apiInstance = new NumberApi();
String country = "country_example"; // String | Country code to search
String search = "search_example"; // String | Your search pattern or query.
Integer searchType = 56; // Integer | Your strategy for searching, 0 = starts with, 1 = anywhere, 2 = ends with.
Integer page = 1; // Integer | Page number
Integer limit = 10; // Integer | Number of records per page
try {
    String result = apiInstance.numbersSearchByCountryGet(country, search, searchType, page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NumberApi#numbersSearchByCountryGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **country** | **String**| Country code to search |
 **search** | **String**| Your search pattern or query. | [optional]
 **searchType** | **Integer**| Your strategy for searching, 0 &#x3D; starts with, 1 &#x3D; anywhere, 2 &#x3D; ends with. | [optional]
 **page** | **Integer**| Page number | [optional] [default to 1]
 **limit** | **Integer**| Number of records per page | [optional] [default to 10]

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

