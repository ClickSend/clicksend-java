# TransactionalEmailApi

All URIs are relative to *https://rest.clicksend.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**emailHistoryExportGet**](TransactionalEmailApi.md#emailHistoryExportGet) | **GET** /email/history/export | Export all Transactional Email history
[**emailHistoryGet**](TransactionalEmailApi.md#emailHistoryGet) | **GET** /email/history | Get all transactional email history
[**emailPricePost**](TransactionalEmailApi.md#emailPricePost) | **POST** /email/price | Get transactional email price
[**emailSendPost**](TransactionalEmailApi.md#emailSendPost) | **POST** /email/send | Send transactional email


<a name="emailHistoryExportGet"></a>
# **emailHistoryExportGet**
> File emailHistoryExportGet(filename, dateFrom, dateTo)

Export all Transactional Email history

Export all Transactional Email history

### Example
```java
// Import classes:
//import ClickSend.Client.ApiClient;
//import ClickSend.Client.ApiException;
//import ClickSend.Client.Configuration;
//import ClickSend.Client.auth.*;
//import ClickSend.Client.Api.TransactionalEmailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

TransactionalEmailApi apiInstance = new TransactionalEmailApi();
String filename = "filename_example"; // String | Filename to download history as
Integer dateFrom = 56; // Integer | Start date
Integer dateTo = 56; // Integer | End date
try {
    File result = apiInstance.emailHistoryExportGet(filename, dateFrom, dateTo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionalEmailApi#emailHistoryExportGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filename** | **String**| Filename to download history as |
 **dateFrom** | **Integer**| Start date | [optional]
 **dateTo** | **Integer**| End date | [optional]

### Return type

[**File**](File.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/csv

<a name="emailHistoryGet"></a>
# **emailHistoryGet**
> String emailHistoryGet(dateFrom, dateTo, page, limit)

Get all transactional email history

Get all transactional email history

### Example
```java
// Import classes:
//import ClickSend.Client.ApiClient;
//import ClickSend.Client.ApiException;
//import ClickSend.Client.Configuration;
//import ClickSend.Client.auth.*;
//import ClickSend.Client.Api.TransactionalEmailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

TransactionalEmailApi apiInstance = new TransactionalEmailApi();
Integer dateFrom = 56; // Integer | Start date
Integer dateTo = 56; // Integer | End date
Integer page = 1; // Integer | Page number
Integer limit = 10; // Integer | Number of records per page
try {
    String result = apiInstance.emailHistoryGet(dateFrom, dateTo, page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionalEmailApi#emailHistoryGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dateFrom** | **Integer**| Start date | [optional]
 **dateTo** | **Integer**| End date | [optional]
 **page** | **Integer**| Page number | [optional] [default to 1]
 **limit** | **Integer**| Number of records per page | [optional] [default to 10]

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="emailPricePost"></a>
# **emailPricePost**
> String emailPricePost(email)

Get transactional email price

Get transactional email price

### Example
```java
// Import classes:
//import ClickSend.Client.ApiClient;
//import ClickSend.Client.ApiException;
//import ClickSend.Client.Configuration;
//import ClickSend.Client.auth.*;
//import ClickSend.Client.Api.TransactionalEmailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

TransactionalEmailApi apiInstance = new TransactionalEmailApi();
Email email = new Email(); // Email | Email model
try {
    String result = apiInstance.emailPricePost(email);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionalEmailApi#emailPricePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | [**Email**](Email.md)| Email model |

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="emailSendPost"></a>
# **emailSendPost**
> String emailSendPost(email)

Send transactional email

Send transactional email

### Example
```java
// Import classes:
//import ClickSend.Client.ApiClient;
//import ClickSend.Client.ApiException;
//import ClickSend.Client.Configuration;
//import ClickSend.Client.auth.*;
//import ClickSend.Client.Api.TransactionalEmailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

TransactionalEmailApi apiInstance = new TransactionalEmailApi();
Email email = new Email(); // Email | Email model
try {
    String result = apiInstance.emailSendPost(email);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionalEmailApi#emailSendPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | [**Email**](Email.md)| Email model |

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

