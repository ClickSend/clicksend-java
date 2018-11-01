# StatisticsApi

All URIs are relative to *https://rest.clicksend.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**statisticsMmsGet**](StatisticsApi.md#statisticsMmsGet) | **GET** /statistics/mms | Get mms statistics
[**statisticsSmsGet**](StatisticsApi.md#statisticsSmsGet) | **GET** /statistics/sms | Get sms statistics
[**statisticsVoiceGet**](StatisticsApi.md#statisticsVoiceGet) | **GET** /statistics/voice | Get voice statistics


<a name="statisticsMmsGet"></a>
# **statisticsMmsGet**
> String statisticsMmsGet()

Get mms statistics

Get mms statistics

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.StatisticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

StatisticsApi apiInstance = new StatisticsApi();
try {
    String result = apiInstance.statisticsMmsGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StatisticsApi#statisticsMmsGet");
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

<a name="statisticsSmsGet"></a>
# **statisticsSmsGet**
> String statisticsSmsGet()

Get sms statistics

Get sms statistics

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.StatisticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

StatisticsApi apiInstance = new StatisticsApi();
try {
    String result = apiInstance.statisticsSmsGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StatisticsApi#statisticsSmsGet");
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

<a name="statisticsVoiceGet"></a>
# **statisticsVoiceGet**
> String statisticsVoiceGet()

Get voice statistics

Get voice statistics

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.StatisticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

StatisticsApi apiInstance = new StatisticsApi();
try {
    String result = apiInstance.statisticsVoiceGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StatisticsApi#statisticsVoiceGet");
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

