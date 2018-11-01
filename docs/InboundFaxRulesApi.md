# InboundFaxRulesApi

All URIs are relative to *https://rest.clicksend.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**faxInboundAutomationDelete**](InboundFaxRulesApi.md#faxInboundAutomationDelete) | **DELETE** /automations/fax/inbound/{inbound_rule_id} | Delete inbound fax automation
[**faxInboundAutomationGet**](InboundFaxRulesApi.md#faxInboundAutomationGet) | **GET** /automations/fax/inbound/{inbound_rule_id} | Get specific inbound fax automation
[**faxInboundAutomationPost**](InboundFaxRulesApi.md#faxInboundAutomationPost) | **POST** /automations/fax/inbound | Create new inbound fax automation
[**faxInboundAutomationPut**](InboundFaxRulesApi.md#faxInboundAutomationPut) | **PUT** /automations/fax/inbound/{inbound_rule_id} | Update inbound fax automation
[**faxInboundAutomationsGet**](InboundFaxRulesApi.md#faxInboundAutomationsGet) | **GET** /automations/fax/inbound | Get all inbound fax automations


<a name="faxInboundAutomationDelete"></a>
# **faxInboundAutomationDelete**
> String faxInboundAutomationDelete(inboundRuleId)

Delete inbound fax automation

Delete inbound fax automation

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.InboundFaxRulesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

InboundFaxRulesApi apiInstance = new InboundFaxRulesApi();
Integer inboundRuleId = 56; // Integer | Inbound rule id
try {
    String result = apiInstance.faxInboundAutomationDelete(inboundRuleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InboundFaxRulesApi#faxInboundAutomationDelete");
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

<a name="faxInboundAutomationGet"></a>
# **faxInboundAutomationGet**
> String faxInboundAutomationGet(inboundRuleId)

Get specific inbound fax automation

Get specific inbound fax automation

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.InboundFaxRulesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

InboundFaxRulesApi apiInstance = new InboundFaxRulesApi();
Integer inboundRuleId = 56; // Integer | Inbound rule id
try {
    String result = apiInstance.faxInboundAutomationGet(inboundRuleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InboundFaxRulesApi#faxInboundAutomationGet");
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

<a name="faxInboundAutomationPost"></a>
# **faxInboundAutomationPost**
> String faxInboundAutomationPost(inboundFaxRule)

Create new inbound fax automation

Create new inbound fax automation

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.InboundFaxRulesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

InboundFaxRulesApi apiInstance = new InboundFaxRulesApi();
InboundFAXRule inboundFaxRule = new InboundFAXRule(); // InboundFAXRule | Inbound fax rule model
try {
    String result = apiInstance.faxInboundAutomationPost(inboundFaxRule);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InboundFaxRulesApi#faxInboundAutomationPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inboundFaxRule** | [**InboundFAXRule**](InboundFAXRule.md)| Inbound fax rule model |

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="faxInboundAutomationPut"></a>
# **faxInboundAutomationPut**
> String faxInboundAutomationPut(inboundRuleId, inboundFaxRule)

Update inbound fax automation

Update inbound fax automation

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.InboundFaxRulesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

InboundFaxRulesApi apiInstance = new InboundFaxRulesApi();
Integer inboundRuleId = 56; // Integer | Inbound rule id
InboundFAXRule inboundFaxRule = new InboundFAXRule(); // InboundFAXRule | Inbound fax rule model
try {
    String result = apiInstance.faxInboundAutomationPut(inboundRuleId, inboundFaxRule);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InboundFaxRulesApi#faxInboundAutomationPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inboundRuleId** | **Integer**| Inbound rule id |
 **inboundFaxRule** | [**InboundFAXRule**](InboundFAXRule.md)| Inbound fax rule model |

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="faxInboundAutomationsGet"></a>
# **faxInboundAutomationsGet**
> String faxInboundAutomationsGet(page, limit)

Get all inbound fax automations

Get all inbound fax automations

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.InboundFaxRulesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

InboundFaxRulesApi apiInstance = new InboundFaxRulesApi();
Integer page = 1; // Integer | Page number
Integer limit = 10; // Integer | Number of records per page
try {
    String result = apiInstance.faxInboundAutomationsGet(page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InboundFaxRulesApi#faxInboundAutomationsGet");
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

