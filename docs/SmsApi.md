# SmsApi

All URIs are relative to *https://rest.clicksend.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**smsCancelAllPut**](SmsApi.md#smsCancelAllPut) | **PUT** /sms/cancel-all | Update all scheduled message as cancelled
[**smsCancelByMessageIdPut**](SmsApi.md#smsCancelByMessageIdPut) | **PUT** /sms/{message_id}/cancel | Update scheduled message as cancelled
[**smsHistoryExportGet**](SmsApi.md#smsHistoryExportGet) | **GET** /sms/history/export | Export all sms history
[**smsHistoryGet**](SmsApi.md#smsHistoryGet) | **GET** /sms/history | Get all sms history
[**smsInboundGet**](SmsApi.md#smsInboundGet) | **GET** /sms/inbound | Get all inbound sms
[**smsInboundPost**](SmsApi.md#smsInboundPost) | **POST** /sms/inbound | Create inbound sms
[**smsInboundReadPut**](SmsApi.md#smsInboundReadPut) | **PUT** /sms/inbound-read | Mark inbound SMS as read
[**smsPricePost**](SmsApi.md#smsPricePost) | **POST** /sms/price | Calculate sms price
[**smsReceiptsByMessageIdGet**](SmsApi.md#smsReceiptsByMessageIdGet) | **GET** /sms/receipts/{message_id} | Get a Specific Delivery Receipt
[**smsReceiptsGet**](SmsApi.md#smsReceiptsGet) | **GET** /sms/receipts | Get all delivery receipts
[**smsReceiptsPost**](SmsApi.md#smsReceiptsPost) | **POST** /sms/receipts | Add a delivery receipt
[**smsReceiptsReadPut**](SmsApi.md#smsReceiptsReadPut) | **PUT** /sms/receipts-read | Mark delivery receipts as read
[**smsSendPost**](SmsApi.md#smsSendPost) | **POST** /sms/send | Send sms message(s)
[**smsTemplatesByTemplateIdDelete**](SmsApi.md#smsTemplatesByTemplateIdDelete) | **DELETE** /sms/templates/{template_id} | Delete sms template
[**smsTemplatesByTemplateIdPut**](SmsApi.md#smsTemplatesByTemplateIdPut) | **PUT** /sms/templates/{template_id} | Update sms template
[**smsTemplatesGet**](SmsApi.md#smsTemplatesGet) | **GET** /sms/templates | Get lists of all sms templates
[**smsTemplatesPost**](SmsApi.md#smsTemplatesPost) | **POST** /sms/templates | Create sms template


<a name="smsCancelAllPut"></a>
# **smsCancelAllPut**
> String smsCancelAllPut()

Update all scheduled message as cancelled

Update all scheduled message as cancelled

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.SmsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

SmsApi apiInstance = new SmsApi();
try {
    String result = apiInstance.smsCancelAllPut();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SmsApi#smsCancelAllPut");
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

<a name="smsCancelByMessageIdPut"></a>
# **smsCancelByMessageIdPut**
> String smsCancelByMessageIdPut(messageId)

Update scheduled message as cancelled

Update scheduled message as cancelled

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.SmsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

SmsApi apiInstance = new SmsApi();
String messageId = "messageId_example"; // String | The message ID you want to cancel
try {
    String result = apiInstance.smsCancelByMessageIdPut(messageId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SmsApi#smsCancelByMessageIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **messageId** | **String**| The message ID you want to cancel |

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="smsHistoryExportGet"></a>
# **smsHistoryExportGet**
> String smsHistoryExportGet(filename)

Export all sms history

Export all sms history

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.SmsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

SmsApi apiInstance = new SmsApi();
String filename = "filename_example"; // String | Filename to download history as
try {
    String result = apiInstance.smsHistoryExportGet(filename);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SmsApi#smsHistoryExportGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filename** | **String**| Filename to download history as |

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="smsHistoryGet"></a>
# **smsHistoryGet**
> String smsHistoryGet(dateFrom, dateTo, page, limit)

Get all sms history

Get all sms history

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.SmsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

SmsApi apiInstance = new SmsApi();
Integer dateFrom = 56; // Integer | Start date
Integer dateTo = 56; // Integer | End date
Integer page = 1; // Integer | Page number
Integer limit = 10; // Integer | Number of records per page
try {
    String result = apiInstance.smsHistoryGet(dateFrom, dateTo, page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SmsApi#smsHistoryGet");
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

<a name="smsInboundGet"></a>
# **smsInboundGet**
> String smsInboundGet(page, limit)

Get all inbound sms

Get all inbound sms

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.SmsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

SmsApi apiInstance = new SmsApi();
Integer page = 1; // Integer | Page number
Integer limit = 10; // Integer | Number of records per page
try {
    String result = apiInstance.smsInboundGet(page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SmsApi#smsInboundGet");
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

<a name="smsInboundPost"></a>
# **smsInboundPost**
> String smsInboundPost(url)

Create inbound sms

Create inbound sms

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.SmsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

SmsApi apiInstance = new SmsApi();
String url = "url_example"; // String | Your url
try {
    String result = apiInstance.smsInboundPost(url);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SmsApi#smsInboundPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **url** | **String**| Your url |

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="smsInboundReadPut"></a>
# **smsInboundReadPut**
> String smsInboundReadPut(dateBefore)

Mark inbound SMS as read

Mark all inbound SMS as read optionally before a certain date

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.SmsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

SmsApi apiInstance = new SmsApi();
String dateBefore = "dateBefore_example"; // String | An optional timestamp - mark all as read before this timestamp. If not given, all messages will be marked as read.
try {
    String result = apiInstance.smsInboundReadPut(dateBefore);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SmsApi#smsInboundReadPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dateBefore** | **String**| An optional timestamp - mark all as read before this timestamp. If not given, all messages will be marked as read. | [optional]

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="smsPricePost"></a>
# **smsPricePost**
> String smsPricePost(smsMessages)

Calculate sms price

Calculate sms price

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.SmsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

SmsApi apiInstance = new SmsApi();
SmsMessageCollection smsMessages = new SmsMessageCollection(); // SmsMessageCollection | SmsMessageCollection model
try {
    String result = apiInstance.smsPricePost(smsMessages);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SmsApi#smsPricePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **smsMessages** | [**SmsMessageCollection**](SmsMessageCollection.md)| SmsMessageCollection model |

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="smsReceiptsByMessageIdGet"></a>
# **smsReceiptsByMessageIdGet**
> String smsReceiptsByMessageIdGet(messageId)

Get a Specific Delivery Receipt

Get a Specific Delivery Receipt

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.SmsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

SmsApi apiInstance = new SmsApi();
String messageId = "messageId_example"; // String | Message ID
try {
    String result = apiInstance.smsReceiptsByMessageIdGet(messageId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SmsApi#smsReceiptsByMessageIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **messageId** | **String**| Message ID |

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="smsReceiptsGet"></a>
# **smsReceiptsGet**
> String smsReceiptsGet(page, limit)

Get all delivery receipts

Get all delivery receipts

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.SmsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

SmsApi apiInstance = new SmsApi();
Integer page = 1; // Integer | Page number
Integer limit = 10; // Integer | Number of records per page
try {
    String result = apiInstance.smsReceiptsGet(page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SmsApi#smsReceiptsGet");
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

<a name="smsReceiptsPost"></a>
# **smsReceiptsPost**
> String smsReceiptsPost(url)

Add a delivery receipt

Add a delivery receipt

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.SmsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

SmsApi apiInstance = new SmsApi();
String url = "url_example"; // String | Your url
try {
    String result = apiInstance.smsReceiptsPost(url);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SmsApi#smsReceiptsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **url** | **String**| Your url |

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="smsReceiptsReadPut"></a>
# **smsReceiptsReadPut**
> String smsReceiptsReadPut(dateBefore)

Mark delivery receipts as read

Mark delivery receipts as read

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.SmsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

SmsApi apiInstance = new SmsApi();
String dateBefore = "dateBefore_example"; // String | Mark all as read before this timestamp
try {
    String result = apiInstance.smsReceiptsReadPut(dateBefore);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SmsApi#smsReceiptsReadPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dateBefore** | **String**| Mark all as read before this timestamp | [optional]

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="smsSendPost"></a>
# **smsSendPost**
> String smsSendPost(smsMessages)

Send sms message(s)

 # Send one or more SMS messages  You can post up to 1000 messages with each API call. You can send to a mix of contacts and contact lists, as long as the total number of recipients is up to 1000.  The response contains status and details for each recipient.  *Refer to [Application Status Codes](https://dashboard.clicksend.com/#/signup/step1/) for the possible response message status strings.* 

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.SmsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

SmsApi apiInstance = new SmsApi();
SmsMessageCollection smsMessages = new SmsMessageCollection(); // SmsMessageCollection | SmsMessageCollection model
try {
    String result = apiInstance.smsSendPost(smsMessages);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SmsApi#smsSendPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **smsMessages** | [**SmsMessageCollection**](SmsMessageCollection.md)| SmsMessageCollection model |

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="smsTemplatesByTemplateIdDelete"></a>
# **smsTemplatesByTemplateIdDelete**
> String smsTemplatesByTemplateIdDelete(templateId)

Delete sms template

Delete sms template

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.SmsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

SmsApi apiInstance = new SmsApi();
Integer templateId = 56; // Integer | Template id
try {
    String result = apiInstance.smsTemplatesByTemplateIdDelete(templateId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SmsApi#smsTemplatesByTemplateIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templateId** | **Integer**| Template id |

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="smsTemplatesByTemplateIdPut"></a>
# **smsTemplatesByTemplateIdPut**
> String smsTemplatesByTemplateIdPut(templateId, smsTemplate)

Update sms template

Update sms template

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.SmsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

SmsApi apiInstance = new SmsApi();
Integer templateId = 56; // Integer | Template id
SmsTemplate smsTemplate = new SmsTemplate(); // SmsTemplate | Template item
try {
    String result = apiInstance.smsTemplatesByTemplateIdPut(templateId, smsTemplate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SmsApi#smsTemplatesByTemplateIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templateId** | **Integer**| Template id |
 **smsTemplate** | [**SmsTemplate**](SmsTemplate.md)| Template item |

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="smsTemplatesGet"></a>
# **smsTemplatesGet**
> String smsTemplatesGet(page, limit)

Get lists of all sms templates

Get lists of all sms templates

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.SmsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

SmsApi apiInstance = new SmsApi();
Integer page = 1; // Integer | Page number
Integer limit = 10; // Integer | Number of records per page
try {
    String result = apiInstance.smsTemplatesGet(page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SmsApi#smsTemplatesGet");
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

<a name="smsTemplatesPost"></a>
# **smsTemplatesPost**
> String smsTemplatesPost(smsTemplate)

Create sms template

Create sms template

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.SmsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

SmsApi apiInstance = new SmsApi();
SmsTemplate smsTemplate = new SmsTemplate(); // SmsTemplate | SmsTemplate model
try {
    String result = apiInstance.smsTemplatesPost(smsTemplate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SmsApi#smsTemplatesPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **smsTemplate** | [**SmsTemplate**](SmsTemplate.md)| SmsTemplate model |

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

