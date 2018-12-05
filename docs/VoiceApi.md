# VoiceApi

All URIs are relative to *https://rest.clicksend.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**voiceCancelAllPut**](VoiceApi.md#voiceCancelAllPut) | **PUT** /voice/cancel-all | Update all voice messages as cancelled
[**voiceCancelByMessageIdPut**](VoiceApi.md#voiceCancelByMessageIdPut) | **PUT** /voice/{message_id}/cancel | Update voice message status as cancelled
[**voiceHistoryExportGet**](VoiceApi.md#voiceHistoryExportGet) | **GET** /voice/history/export | Export voice history
[**voiceHistoryGet**](VoiceApi.md#voiceHistoryGet) | **GET** /voice/history | Get all voice history
[**voiceLangGet**](VoiceApi.md#voiceLangGet) | **GET** /voice/lang | Get all voice languages
[**voicePricePost**](VoiceApi.md#voicePricePost) | **POST** /voice/price | Calculate voice price
[**voiceReceiptsGet**](VoiceApi.md#voiceReceiptsGet) | **GET** /voice/receipts | Get all voice receipts
[**voiceSendPost**](VoiceApi.md#voiceSendPost) | **POST** /voice/send | Send voice message(s)


<a name="voiceCancelAllPut"></a>
# **voiceCancelAllPut**
> String voiceCancelAllPut()

Update all voice messages as cancelled

Update all voice messages as cancelled

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.VoiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

VoiceApi apiInstance = new VoiceApi();
try {
    String result = apiInstance.voiceCancelAllPut();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VoiceApi#voiceCancelAllPut");
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

<a name="voiceCancelByMessageIdPut"></a>
# **voiceCancelByMessageIdPut**
> String voiceCancelByMessageIdPut(messageId)

Update voice message status as cancelled

Update voice message status as cancelled

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.VoiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

VoiceApi apiInstance = new VoiceApi();
String messageId = "messageId_example"; // String | Your voice message id
try {
    String result = apiInstance.voiceCancelByMessageIdPut(messageId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VoiceApi#voiceCancelByMessageIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **messageId** | **String**| Your voice message id |

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="voiceHistoryExportGet"></a>
# **voiceHistoryExportGet**
> String voiceHistoryExportGet(filename)

Export voice history

Export voice history

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.VoiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

VoiceApi apiInstance = new VoiceApi();
String filename = "filename_example"; // String | Filename to export to
try {
    String result = apiInstance.voiceHistoryExportGet(filename);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VoiceApi#voiceHistoryExportGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filename** | **String**| Filename to export to |

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="voiceHistoryGet"></a>
# **voiceHistoryGet**
> String voiceHistoryGet(dateFrom, dateTo, page, limit)

Get all voice history

Get all voice history

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.VoiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

VoiceApi apiInstance = new VoiceApi();
Integer dateFrom = 56; // Integer | Timestamp (from) used to show records by date.
Integer dateTo = 56; // Integer | Timestamp (to) used to show records by date
Integer page = 1; // Integer | Page number
Integer limit = 10; // Integer | Number of records per page
try {
    String result = apiInstance.voiceHistoryGet(dateFrom, dateTo, page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VoiceApi#voiceHistoryGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dateFrom** | **Integer**| Timestamp (from) used to show records by date. | [optional]
 **dateTo** | **Integer**| Timestamp (to) used to show records by date | [optional]
 **page** | **Integer**| Page number | [optional] [default to 1]
 **limit** | **Integer**| Number of records per page | [optional] [default to 10]

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="voiceLangGet"></a>
# **voiceLangGet**
> String voiceLangGet()

Get all voice languages

Get all voice languages

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.VoiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

VoiceApi apiInstance = new VoiceApi();
try {
    String result = apiInstance.voiceLangGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VoiceApi#voiceLangGet");
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

<a name="voicePricePost"></a>
# **voicePricePost**
> String voicePricePost(voiceMessages)

Calculate voice price

Calculate voice price

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.VoiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

VoiceApi apiInstance = new VoiceApi();
VoiceMessageCollection voiceMessages = new VoiceMessageCollection(); // VoiceMessageCollection | VoiceMessageCollection model
try {
    String result = apiInstance.voicePricePost(voiceMessages);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VoiceApi#voicePricePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **voiceMessages** | [**VoiceMessageCollection**](VoiceMessageCollection.md)| VoiceMessageCollection model |

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="voiceReceiptsGet"></a>
# **voiceReceiptsGet**
> String voiceReceiptsGet(q, page, limit)

Get all voice receipts

Get all voice receipts

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.VoiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

VoiceApi apiInstance = new VoiceApi();
String q = "q_example"; // String | Your keyword or query.
Integer page = 1; // Integer | Page number
Integer limit = 10; // Integer | Number of records per page
try {
    String result = apiInstance.voiceReceiptsGet(q, page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VoiceApi#voiceReceiptsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q** | **String**| Your keyword or query. | [optional]
 **page** | **Integer**| Page number | [optional] [default to 1]
 **limit** | **Integer**| Number of records per page | [optional] [default to 10]

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="voiceSendPost"></a>
# **voiceSendPost**
> String voiceSendPost(voiceMessages)

Send voice message(s)

Send a voice call

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.VoiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

VoiceApi apiInstance = new VoiceApi();
VoiceMessageCollection voiceMessages = new VoiceMessageCollection(); // VoiceMessageCollection | VoiceMessageCollection model
try {
    String result = apiInstance.voiceSendPost(voiceMessages);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VoiceApi#voiceSendPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **voiceMessages** | [**VoiceMessageCollection**](VoiceMessageCollection.md)| VoiceMessageCollection model |

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

