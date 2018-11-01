# EmailToSmsApi

All URIs are relative to *https://rest.clicksend.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**smsEmailSmsGet**](EmailToSmsApi.md#smsEmailSmsGet) | **GET** /sms/email-sms | Get list of email to sms allowed addresses
[**smsEmailSmsPost**](EmailToSmsApi.md#smsEmailSmsPost) | **POST** /sms/email-sms | Create email to sms allowed address
[**smsEmailSmsStrippedStringDelete**](EmailToSmsApi.md#smsEmailSmsStrippedStringDelete) | **DELETE** /sms/email-sms-stripped-strings/{rule_id} | Delete email to sms stripped string rule
[**smsEmailSmsStrippedStringGet**](EmailToSmsApi.md#smsEmailSmsStrippedStringGet) | **GET** /sms/email-sms-stripped-strings/{rule_id} | Get email to sms stripped string rule
[**smsEmailSmsStrippedStringPost**](EmailToSmsApi.md#smsEmailSmsStrippedStringPost) | **POST** /sms/email-sms-stripped-strings | Create email to sms stripped string rule
[**smsEmailSmsStrippedStringPut**](EmailToSmsApi.md#smsEmailSmsStrippedStringPut) | **PUT** /sms/email-sms-stripped-strings/{rule_id} | Update email to sms stripped string rule
[**smsEmailSmsStrippedStringsGet**](EmailToSmsApi.md#smsEmailSmsStrippedStringsGet) | **GET** /sms/email-sms-stripped-strings | Get list of email to sms stripped string rules


<a name="smsEmailSmsGet"></a>
# **smsEmailSmsGet**
> String smsEmailSmsGet(page, limit)

Get list of email to sms allowed addresses

Get list of email to sms allowed addresses

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.EmailToSmsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

EmailToSmsApi apiInstance = new EmailToSmsApi();
Integer page = 1; // Integer | Page number
Integer limit = 10; // Integer | Number of records per page
try {
    String result = apiInstance.smsEmailSmsGet(page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailToSmsApi#smsEmailSmsGet");
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

<a name="smsEmailSmsPost"></a>
# **smsEmailSmsPost**
> String smsEmailSmsPost(emailSmsAddress)

Create email to sms allowed address

Create email to sms allowed address

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.EmailToSmsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

EmailToSmsApi apiInstance = new EmailToSmsApi();
EmailSMSAddress emailSmsAddress = new EmailSMSAddress(); // EmailSMSAddress | EmailSMSAddress model
try {
    String result = apiInstance.smsEmailSmsPost(emailSmsAddress);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailToSmsApi#smsEmailSmsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emailSmsAddress** | [**EmailSMSAddress**](EmailSMSAddress.md)| EmailSMSAddress model |

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="smsEmailSmsStrippedStringDelete"></a>
# **smsEmailSmsStrippedStringDelete**
> String smsEmailSmsStrippedStringDelete(ruleId)

Delete email to sms stripped string rule

Delete email to sms stripped string rule

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.EmailToSmsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

EmailToSmsApi apiInstance = new EmailToSmsApi();
Integer ruleId = 56; // Integer | Your rule id
try {
    String result = apiInstance.smsEmailSmsStrippedStringDelete(ruleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailToSmsApi#smsEmailSmsStrippedStringDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ruleId** | **Integer**| Your rule id |

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="smsEmailSmsStrippedStringGet"></a>
# **smsEmailSmsStrippedStringGet**
> String smsEmailSmsStrippedStringGet(ruleId)

Get email to sms stripped string rule

Get email to sms stripped string rule

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.EmailToSmsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

EmailToSmsApi apiInstance = new EmailToSmsApi();
Integer ruleId = 56; // Integer | Your rule id
try {
    String result = apiInstance.smsEmailSmsStrippedStringGet(ruleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailToSmsApi#smsEmailSmsStrippedStringGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ruleId** | **Integer**| Your rule id |

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="smsEmailSmsStrippedStringPost"></a>
# **smsEmailSmsStrippedStringPost**
> String smsEmailSmsStrippedStringPost(strippedString)

Create email to sms stripped string rule

Create email to sms stripped string rules

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.EmailToSmsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

EmailToSmsApi apiInstance = new EmailToSmsApi();
String strippedString = "strippedString_example"; // String | String to be stripped.
try {
    String result = apiInstance.smsEmailSmsStrippedStringPost(strippedString);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailToSmsApi#smsEmailSmsStrippedStringPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **strippedString** | **String**| String to be stripped. |

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="smsEmailSmsStrippedStringPut"></a>
# **smsEmailSmsStrippedStringPut**
> String smsEmailSmsStrippedStringPut(ruleId, strippedString)

Update email to sms stripped string rule

Update email to sms stripped string rule

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.EmailToSmsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

EmailToSmsApi apiInstance = new EmailToSmsApi();
Integer ruleId = 56; // Integer | Your rule id
String strippedString = "strippedString_example"; // String | String to be stripped.
try {
    String result = apiInstance.smsEmailSmsStrippedStringPut(ruleId, strippedString);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailToSmsApi#smsEmailSmsStrippedStringPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ruleId** | **Integer**| Your rule id |
 **strippedString** | **String**| String to be stripped. |

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="smsEmailSmsStrippedStringsGet"></a>
# **smsEmailSmsStrippedStringsGet**
> String smsEmailSmsStrippedStringsGet(page, limit)

Get list of email to sms stripped string rules

Get list of email to sms stripped string rules

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.EmailToSmsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

EmailToSmsApi apiInstance = new EmailToSmsApi();
Integer page = 1; // Integer | Page number
Integer limit = 10; // Integer | Number of records per page
try {
    String result = apiInstance.smsEmailSmsStrippedStringsGet(page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailToSmsApi#smsEmailSmsStrippedStringsGet");
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

