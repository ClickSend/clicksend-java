# FaxApi

All URIs are relative to *https://rest.clicksend.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**faxHistoryGet**](FaxApi.md#faxHistoryGet) | **GET** /fax/history | Get a list of Fax History.
[**faxPricePost**](FaxApi.md#faxPricePost) | **POST** /fax/price | Calculate Total Price for Fax Messages sent
[**faxReceiptsByMessageIdGet**](FaxApi.md#faxReceiptsByMessageIdGet) | **GET** /fax/receipts/{message_id} | Get a single fax receipt based on message id.
[**faxReceiptsGet**](FaxApi.md#faxReceiptsGet) | **GET** /fax/receipts | Get List of Fax Receipts
[**faxSendPost**](FaxApi.md#faxSendPost) | **POST** /fax/send | Send a fax using supplied supported file-types.


<a name="faxHistoryGet"></a>
# **faxHistoryGet**
> String faxHistoryGet(dateFrom, dateTo, q, order, page, limit)

Get a list of Fax History.

Get a list of Fax History.

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.FaxApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

FaxApi apiInstance = new FaxApi();
Integer dateFrom = 56; // Integer | Customize result by setting from date (timestsamp) Example: 1457572619.
Integer dateTo = 56; // Integer | Customize result by setting to date (timestamp) Example: 1457573000.
String q = "q_example"; // String | Custom query Example: status:Sent,status_code:201.
String order = "order_example"; // String | Order result by Example: date_added:desc,list_id:desc.
Integer page = 1; // Integer | Page number
Integer limit = 10; // Integer | Number of records per page
try {
    String result = apiInstance.faxHistoryGet(dateFrom, dateTo, q, order, page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FaxApi#faxHistoryGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dateFrom** | **Integer**| Customize result by setting from date (timestsamp) Example: 1457572619. | [optional]
 **dateTo** | **Integer**| Customize result by setting to date (timestamp) Example: 1457573000. | [optional]
 **q** | **String**| Custom query Example: status:Sent,status_code:201. | [optional]
 **order** | **String**| Order result by Example: date_added:desc,list_id:desc. | [optional]
 **page** | **Integer**| Page number | [optional] [default to 1]
 **limit** | **Integer**| Number of records per page | [optional] [default to 10]

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="faxPricePost"></a>
# **faxPricePost**
> String faxPricePost(faxMessage)

Calculate Total Price for Fax Messages sent

Calculate Total Price for Fax Messages sent

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.FaxApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

FaxApi apiInstance = new FaxApi();
FaxMessageCollection faxMessage = new FaxMessageCollection(); // FaxMessageCollection | FaxMessageCollection model
try {
    String result = apiInstance.faxPricePost(faxMessage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FaxApi#faxPricePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **faxMessage** | [**FaxMessageCollection**](FaxMessageCollection.md)| FaxMessageCollection model |

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="faxReceiptsByMessageIdGet"></a>
# **faxReceiptsByMessageIdGet**
> String faxReceiptsByMessageIdGet(messageId)

Get a single fax receipt based on message id.

Get a single fax receipt based on message id.

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.FaxApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

FaxApi apiInstance = new FaxApi();
String messageId = "messageId_example"; // String | ID of the message receipt to retrieve
try {
    String result = apiInstance.faxReceiptsByMessageIdGet(messageId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FaxApi#faxReceiptsByMessageIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **messageId** | **String**| ID of the message receipt to retrieve |

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="faxReceiptsGet"></a>
# **faxReceiptsGet**
> String faxReceiptsGet(q, page, limit)

Get List of Fax Receipts

Get List of Fax Receipts

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.FaxApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

FaxApi apiInstance = new FaxApi();
String q = "q_example"; // String | Your keyword or query.
Integer page = 1; // Integer | Page number
Integer limit = 10; // Integer | Number of records per page
try {
    String result = apiInstance.faxReceiptsGet(q, page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FaxApi#faxReceiptsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q** | **String**| Your keyword or query. |
 **page** | **Integer**| Page number | [optional] [default to 1]
 **limit** | **Integer**| Number of records per page | [optional] [default to 10]

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="faxSendPost"></a>
# **faxSendPost**
> String faxSendPost(faxMessage)

Send a fax using supplied supported file-types.

Send a fax using supplied supported file-types.

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.FaxApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

FaxApi apiInstance = new FaxApi();
FaxMessageCollection faxMessage = new FaxMessageCollection(); // FaxMessageCollection | FaxMessageCollection model
try {
    String result = apiInstance.faxSendPost(faxMessage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FaxApi#faxSendPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **faxMessage** | [**FaxMessageCollection**](FaxMessageCollection.md)| FaxMessageCollection model |

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

