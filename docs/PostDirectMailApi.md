# PostDirectMailApi

All URIs are relative to *https://rest.clicksend.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**postDirectMailCampaignsGet**](PostDirectMailApi.md#postDirectMailCampaignsGet) | **GET** /post/direct-mail/campaigns | Get direct mail campaigns
[**postDirectMailCampaignsPricePost**](PostDirectMailApi.md#postDirectMailCampaignsPricePost) | **POST** /post/direct-mail/campaigns/price | Calculate direct mail campaign price
[**postDirectMailCampaignsSendPost**](PostDirectMailApi.md#postDirectMailCampaignsSendPost) | **POST** /post/direct-mail/campaigns/send | Send direct mail campaign
[**postDirectMailLocationsSearchByCountryGet**](PostDirectMailApi.md#postDirectMailLocationsSearchByCountryGet) | **GET** /post/direct-mail/locations/search/{country} | Search for a location


<a name="postDirectMailCampaignsGet"></a>
# **postDirectMailCampaignsGet**
> String postDirectMailCampaignsGet(page, limit)

Get direct mail campaigns

Get direct mail campaigns

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.PostDirectMailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

PostDirectMailApi apiInstance = new PostDirectMailApi();
Integer page = 1; // Integer | Page number
Integer limit = 10; // Integer | Number of records per page
try {
    String result = apiInstance.postDirectMailCampaignsGet(page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PostDirectMailApi#postDirectMailCampaignsGet");
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

<a name="postDirectMailCampaignsPricePost"></a>
# **postDirectMailCampaignsPricePost**
> String postDirectMailCampaignsPricePost(postDirectMail)

Calculate direct mail campaign price

Calculate direct mail campaign price

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.PostDirectMailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

PostDirectMailApi apiInstance = new PostDirectMailApi();
PostDirectMail postDirectMail = new PostDirectMail(); // PostDirectMail | PostDirectMail model
try {
    String result = apiInstance.postDirectMailCampaignsPricePost(postDirectMail);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PostDirectMailApi#postDirectMailCampaignsPricePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **postDirectMail** | [**PostDirectMail**](PostDirectMail.md)| PostDirectMail model |

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postDirectMailCampaignsSendPost"></a>
# **postDirectMailCampaignsSendPost**
> String postDirectMailCampaignsSendPost(postDirectMail)

Send direct mail campaign

Send direct mail campaign

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.PostDirectMailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

PostDirectMailApi apiInstance = new PostDirectMailApi();
PostDirectMail postDirectMail = new PostDirectMail(); // PostDirectMail | PostDirectMail model
try {
    String result = apiInstance.postDirectMailCampaignsSendPost(postDirectMail);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PostDirectMailApi#postDirectMailCampaignsSendPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **postDirectMail** | [**PostDirectMail**](PostDirectMail.md)| PostDirectMail model |

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postDirectMailLocationsSearchByCountryGet"></a>
# **postDirectMailLocationsSearchByCountryGet**
> String postDirectMailLocationsSearchByCountryGet(country, q, page, limit)

Search for a location

Search for a location

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.PostDirectMailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

PostDirectMailApi apiInstance = new PostDirectMailApi();
String country = "country_example"; // String | Country Code to search
String q = "q_example"; // String | Search term (e.g. post code, city name)
Integer page = 1; // Integer | Page number
Integer limit = 10; // Integer | Number of records per page
try {
    String result = apiInstance.postDirectMailLocationsSearchByCountryGet(country, q, page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PostDirectMailApi#postDirectMailLocationsSearchByCountryGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **country** | **String**| Country Code to search |
 **q** | **String**| Search term (e.g. post code, city name) |
 **page** | **Integer**| Page number | [optional] [default to 1]
 **limit** | **Integer**| Number of records per page | [optional] [default to 10]

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

