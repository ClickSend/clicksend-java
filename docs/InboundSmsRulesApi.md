# InboundSmsRulesApi

All URIs are relative to *https://rest.clicksend.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**smsInboundAutomationDelete**](InboundSmsRulesApi.md#smsInboundAutomationDelete) | **DELETE** /automations/sms/inbound/{inbound_rule_id} | Delete inbound sms automation
[**smsInboundAutomationGet**](InboundSmsRulesApi.md#smsInboundAutomationGet) | **GET** /automations/sms/inbound/{inbound_rule_id} | Get specific inbound sms automation
[**smsInboundAutomationPost**](InboundSmsRulesApi.md#smsInboundAutomationPost) | **POST** /automations/sms/inbound | Create new inbound sms automation
[**smsInboundAutomationPut**](InboundSmsRulesApi.md#smsInboundAutomationPut) | **PUT** /automations/sms/inbound/{inbound_rule_id} | Update inbound sms automation
[**smsInboundAutomationsGet**](InboundSmsRulesApi.md#smsInboundAutomationsGet) | **GET** /automations/sms/inbound | Get all inbound sms automations


<a name="smsInboundAutomationDelete"></a>
# **smsInboundAutomationDelete**
> String smsInboundAutomationDelete(inboundRuleId)

Delete inbound sms automation

Delete inbound sms automation

### Example
```java
// Import classes:
//import ClickSend.Client.ApiClient;
//import ClickSend.Client.ApiException;
//import ClickSend.Client.Configuration;
//import ClickSend.Client.auth.*;
//import ClickSend.Client.Api.InboundSmsRulesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

InboundSmsRulesApi apiInstance = new InboundSmsRulesApi();
Integer inboundRuleId = 56; // Integer | Inbound rule id
try {
    String result = apiInstance.smsInboundAutomationDelete(inboundRuleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InboundSmsRulesApi#smsInboundAutomationDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inboundRuleId** | **Integer**| Inbound rule id |

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="smsInboundAutomationGet"></a>
# **smsInboundAutomationGet**
> String smsInboundAutomationGet(inboundRuleId)

Get specific inbound sms automation

Get specific inbound sms automation

### Example
```java
// Import classes:
//import ClickSend.Client.ApiClient;
//import ClickSend.Client.ApiException;
//import ClickSend.Client.Configuration;
//import ClickSend.Client.auth.*;
//import ClickSend.Client.Api.InboundSmsRulesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

InboundSmsRulesApi apiInstance = new InboundSmsRulesApi();
Integer inboundRuleId = 56; // Integer | Inbound rule id
try {
    String result = apiInstance.smsInboundAutomationGet(inboundRuleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InboundSmsRulesApi#smsInboundAutomationGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inboundRuleId** | **Integer**| Inbound rule id |

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="smsInboundAutomationPost"></a>
# **smsInboundAutomationPost**
> String smsInboundAutomationPost(inboundSmsRule)

Create new inbound sms automation

Create new inbound sms automation

### Example
```java
// Import classes:
//import ClickSend.Client.ApiClient;
//import ClickSend.Client.ApiException;
//import ClickSend.Client.Configuration;
//import ClickSend.Client.auth.*;
//import ClickSend.Client.Api.InboundSmsRulesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

InboundSmsRulesApi apiInstance = new InboundSmsRulesApi();
InboundSMSRule inboundSmsRule = new InboundSMSRule(); // InboundSMSRule | Inbound sms rule model
try {
    String result = apiInstance.smsInboundAutomationPost(inboundSmsRule);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InboundSmsRulesApi#smsInboundAutomationPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inboundSmsRule** | [**InboundSMSRule**](InboundSMSRule.md)| Inbound sms rule model |

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="smsInboundAutomationPut"></a>
# **smsInboundAutomationPut**
> String smsInboundAutomationPut(inboundRuleId, inboundSmsRule)

Update inbound sms automation

Update inbound sms automation

### Example
```java
// Import classes:
//import ClickSend.Client.ApiClient;
//import ClickSend.Client.ApiException;
//import ClickSend.Client.Configuration;
//import ClickSend.Client.auth.*;
//import ClickSend.Client.Api.InboundSmsRulesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

InboundSmsRulesApi apiInstance = new InboundSmsRulesApi();
Integer inboundRuleId = 56; // Integer | Inbound rule id
InboundSMSRule inboundSmsRule = new InboundSMSRule(); // InboundSMSRule | Inbound sms rule model
try {
    String result = apiInstance.smsInboundAutomationPut(inboundRuleId, inboundSmsRule);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InboundSmsRulesApi#smsInboundAutomationPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inboundRuleId** | **Integer**| Inbound rule id |
 **inboundSmsRule** | [**InboundSMSRule**](InboundSMSRule.md)| Inbound sms rule model |

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="smsInboundAutomationsGet"></a>
# **smsInboundAutomationsGet**
> String smsInboundAutomationsGet(page, limit)

Get all inbound sms automations

Get all inbound sms automations

### Example
```java
// Import classes:
//import ClickSend.Client.ApiClient;
//import ClickSend.Client.ApiException;
//import ClickSend.Client.Configuration;
//import ClickSend.Client.auth.*;
//import ClickSend.Client.Api.InboundSmsRulesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

InboundSmsRulesApi apiInstance = new InboundSmsRulesApi();
Integer page = 1; // Integer | Page number
Integer limit = 10; // Integer | Number of records per page
try {
    String result = apiInstance.smsInboundAutomationsGet(page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InboundSmsRulesApi#smsInboundAutomationsGet");
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

