# EmailDeliveryReceiptRulesApi

All URIs are relative to *https://rest.clicksend.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**emailDeliveryReceiptAutomationDelete**](EmailDeliveryReceiptRulesApi.md#emailDeliveryReceiptAutomationDelete) | **DELETE** /automations/email/receipts/{receipt_rule_id} | Delete email delivery receipt automation
[**emailDeliveryReceiptAutomationGet**](EmailDeliveryReceiptRulesApi.md#emailDeliveryReceiptAutomationGet) | **GET** /automations/email/receipts/{receipt_rule_id} | Get specific email delivery receipt automation
[**emailDeliveryReceiptAutomationPost**](EmailDeliveryReceiptRulesApi.md#emailDeliveryReceiptAutomationPost) | **POST** /automations/email/receipts | Create email delivery receipt automations
[**emailDeliveryReceiptAutomationPut**](EmailDeliveryReceiptRulesApi.md#emailDeliveryReceiptAutomationPut) | **PUT** /automations/email/receipts/{receipt_rule_id} | Update email delivery receipt automation
[**emailDeliveryReceiptAutomationsGet**](EmailDeliveryReceiptRulesApi.md#emailDeliveryReceiptAutomationsGet) | **GET** /automations/email/receipts | Get all email delivery receipt automations


<a name="emailDeliveryReceiptAutomationDelete"></a>
# **emailDeliveryReceiptAutomationDelete**
> String emailDeliveryReceiptAutomationDelete(receiptRuleId)

Delete email delivery receipt automation

Delete email delivery receipt automation

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.EmailDeliveryReceiptRulesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

EmailDeliveryReceiptRulesApi apiInstance = new EmailDeliveryReceiptRulesApi();
Integer receiptRuleId = 56; // Integer | Receipt rule id
try {
    String result = apiInstance.emailDeliveryReceiptAutomationDelete(receiptRuleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailDeliveryReceiptRulesApi#emailDeliveryReceiptAutomationDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **receiptRuleId** | **Integer**| Receipt rule id |

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="emailDeliveryReceiptAutomationGet"></a>
# **emailDeliveryReceiptAutomationGet**
> String emailDeliveryReceiptAutomationGet(receiptRuleId)

Get specific email delivery receipt automation

Get specific email delivery receipt automation

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.EmailDeliveryReceiptRulesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

EmailDeliveryReceiptRulesApi apiInstance = new EmailDeliveryReceiptRulesApi();
Integer receiptRuleId = 56; // Integer | Receipt rule id
try {
    String result = apiInstance.emailDeliveryReceiptAutomationGet(receiptRuleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailDeliveryReceiptRulesApi#emailDeliveryReceiptAutomationGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **receiptRuleId** | **Integer**| Receipt rule id |

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="emailDeliveryReceiptAutomationPost"></a>
# **emailDeliveryReceiptAutomationPost**
> String emailDeliveryReceiptAutomationPost(deliveryReceiptRule)

Create email delivery receipt automations

Create email delivery receipt automations

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.EmailDeliveryReceiptRulesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

EmailDeliveryReceiptRulesApi apiInstance = new EmailDeliveryReceiptRulesApi();
DeliveryReceiptRule deliveryReceiptRule = new DeliveryReceiptRule(); // DeliveryReceiptRule | Email delivery receipt rule model
try {
    String result = apiInstance.emailDeliveryReceiptAutomationPost(deliveryReceiptRule);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailDeliveryReceiptRulesApi#emailDeliveryReceiptAutomationPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deliveryReceiptRule** | [**DeliveryReceiptRule**](DeliveryReceiptRule.md)| Email delivery receipt rule model |

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="emailDeliveryReceiptAutomationPut"></a>
# **emailDeliveryReceiptAutomationPut**
> String emailDeliveryReceiptAutomationPut(receiptRuleId, deliveryReceiptRule)

Update email delivery receipt automation

Update email delivery receipt automation

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.EmailDeliveryReceiptRulesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

EmailDeliveryReceiptRulesApi apiInstance = new EmailDeliveryReceiptRulesApi();
Integer receiptRuleId = 56; // Integer | Receipt rule id
DeliveryReceiptRule deliveryReceiptRule = new DeliveryReceiptRule(); // DeliveryReceiptRule | Delivery receipt rule model
try {
    String result = apiInstance.emailDeliveryReceiptAutomationPut(receiptRuleId, deliveryReceiptRule);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailDeliveryReceiptRulesApi#emailDeliveryReceiptAutomationPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **receiptRuleId** | **Integer**| Receipt rule id |
 **deliveryReceiptRule** | [**DeliveryReceiptRule**](DeliveryReceiptRule.md)| Delivery receipt rule model |

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="emailDeliveryReceiptAutomationsGet"></a>
# **emailDeliveryReceiptAutomationsGet**
> String emailDeliveryReceiptAutomationsGet(page, limit)

Get all email delivery receipt automations

Get all email delivery receipt automations

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.EmailDeliveryReceiptRulesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

EmailDeliveryReceiptRulesApi apiInstance = new EmailDeliveryReceiptRulesApi();
Integer page = 1; // Integer | Page number
Integer limit = 10; // Integer | Number of records per page
try {
    String result = apiInstance.emailDeliveryReceiptAutomationsGet(page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailDeliveryReceiptRulesApi#emailDeliveryReceiptAutomationsGet");
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

