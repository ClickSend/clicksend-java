# FaxDeliveryReceiptRulesApi

All URIs are relative to *https://rest.clicksend.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**faxDeliveryReceiptAutomationDelete**](FaxDeliveryReceiptRulesApi.md#faxDeliveryReceiptAutomationDelete) | **DELETE** /automations/fax/receipts/{receipt_rule_id} | Delete fax delivery receipt automation
[**faxDeliveryReceiptAutomationGet**](FaxDeliveryReceiptRulesApi.md#faxDeliveryReceiptAutomationGet) | **GET** /automations/fax/receipts/{receipt_rule_id} | Get specific fax delivery receipt automation
[**faxDeliveryReceiptAutomationPost**](FaxDeliveryReceiptRulesApi.md#faxDeliveryReceiptAutomationPost) | **POST** /automations/fax/receipts | Create fax delivery receipt automations
[**faxDeliveryReceiptAutomationPut**](FaxDeliveryReceiptRulesApi.md#faxDeliveryReceiptAutomationPut) | **PUT** /automations/fax/receipts/{receipt_rule_id} | Update fax delivery receipt automation
[**faxDeliveryReceiptAutomationsGet**](FaxDeliveryReceiptRulesApi.md#faxDeliveryReceiptAutomationsGet) | **GET** /automations/fax/receipts | Get all fax delivery receipt automations


<a name="faxDeliveryReceiptAutomationDelete"></a>
# **faxDeliveryReceiptAutomationDelete**
> String faxDeliveryReceiptAutomationDelete(receiptRuleId)

Delete fax delivery receipt automation

Delete fax delivery receipt automation

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FaxDeliveryReceiptRulesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

FaxDeliveryReceiptRulesApi apiInstance = new FaxDeliveryReceiptRulesApi();
Integer receiptRuleId = 56; // Integer | Receipt rule id
try {
    String result = apiInstance.faxDeliveryReceiptAutomationDelete(receiptRuleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FaxDeliveryReceiptRulesApi#faxDeliveryReceiptAutomationDelete");
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

<a name="faxDeliveryReceiptAutomationGet"></a>
# **faxDeliveryReceiptAutomationGet**
> String faxDeliveryReceiptAutomationGet(receiptRuleId)

Get specific fax delivery receipt automation

Get specific fax delivery receipt automation

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FaxDeliveryReceiptRulesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

FaxDeliveryReceiptRulesApi apiInstance = new FaxDeliveryReceiptRulesApi();
Integer receiptRuleId = 56; // Integer | Receipt rule id
try {
    String result = apiInstance.faxDeliveryReceiptAutomationGet(receiptRuleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FaxDeliveryReceiptRulesApi#faxDeliveryReceiptAutomationGet");
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

<a name="faxDeliveryReceiptAutomationPost"></a>
# **faxDeliveryReceiptAutomationPost**
> String faxDeliveryReceiptAutomationPost(deliveryReceiptRule)

Create fax delivery receipt automations

Create fax delivery receipt automations

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FaxDeliveryReceiptRulesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

FaxDeliveryReceiptRulesApi apiInstance = new FaxDeliveryReceiptRulesApi();
DeliveryReceiptRule deliveryReceiptRule = new DeliveryReceiptRule(); // DeliveryReceiptRule | fax delivery receipt rule model
try {
    String result = apiInstance.faxDeliveryReceiptAutomationPost(deliveryReceiptRule);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FaxDeliveryReceiptRulesApi#faxDeliveryReceiptAutomationPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deliveryReceiptRule** | [**DeliveryReceiptRule**](DeliveryReceiptRule.md)| fax delivery receipt rule model |

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="faxDeliveryReceiptAutomationPut"></a>
# **faxDeliveryReceiptAutomationPut**
> String faxDeliveryReceiptAutomationPut(receiptRuleId, deliveryReceiptRule)

Update fax delivery receipt automation

Update fax delivery receipt automation

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FaxDeliveryReceiptRulesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

FaxDeliveryReceiptRulesApi apiInstance = new FaxDeliveryReceiptRulesApi();
Integer receiptRuleId = 56; // Integer | Receipt rule id
DeliveryReceiptRule deliveryReceiptRule = new DeliveryReceiptRule(); // DeliveryReceiptRule | Delivery receipt rule model
try {
    String result = apiInstance.faxDeliveryReceiptAutomationPut(receiptRuleId, deliveryReceiptRule);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FaxDeliveryReceiptRulesApi#faxDeliveryReceiptAutomationPut");
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

<a name="faxDeliveryReceiptAutomationsGet"></a>
# **faxDeliveryReceiptAutomationsGet**
> String faxDeliveryReceiptAutomationsGet(page, limit)

Get all fax delivery receipt automations

Get all fax delivery receipt automations

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FaxDeliveryReceiptRulesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

FaxDeliveryReceiptRulesApi apiInstance = new FaxDeliveryReceiptRulesApi();
Integer page = 1; // Integer | Page number
Integer limit = 10; // Integer | Number of records per page
try {
    String result = apiInstance.faxDeliveryReceiptAutomationsGet(page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FaxDeliveryReceiptRulesApi#faxDeliveryReceiptAutomationsGet");
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

