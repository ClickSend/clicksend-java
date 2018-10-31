# UserEmailTemplatesApi

All URIs are relative to *https://rest.clicksend.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**emailTemplateDelete**](UserEmailTemplatesApi.md#emailTemplateDelete) | **DELETE** /email/templates/{template_id} | Delete user email template
[**emailTemplateGet**](UserEmailTemplatesApi.md#emailTemplateGet) | **GET** /email/templates/{template_id} | Get specific user email template
[**emailTemplatePost**](UserEmailTemplatesApi.md#emailTemplatePost) | **POST** /email/templates | Create email template
[**emailTemplatePut**](UserEmailTemplatesApi.md#emailTemplatePut) | **POST** /email/templates/{template_id} | Update email template
[**emailTemplatesGet**](UserEmailTemplatesApi.md#emailTemplatesGet) | **GET** /email/templates | Get all user email templates


<a name="emailTemplateDelete"></a>
# **emailTemplateDelete**
> String emailTemplateDelete(templateId)

Delete user email template

Delete user email template

### Example
```java
// Import classes:
//import ClickSend.Client.ApiClient;
//import ClickSend.Client.ApiException;
//import ClickSend.Client.Configuration;
//import ClickSend.Client.auth.*;
//import ClickSend.Client.Api.UserEmailTemplatesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

UserEmailTemplatesApi apiInstance = new UserEmailTemplatesApi();
Integer templateId = 56; // Integer | Email template id
try {
    String result = apiInstance.emailTemplateDelete(templateId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserEmailTemplatesApi#emailTemplateDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templateId** | **Integer**| Email template id |

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="emailTemplateGet"></a>
# **emailTemplateGet**
> String emailTemplateGet(templateId)

Get specific user email template

Get specific user email templates

### Example
```java
// Import classes:
//import ClickSend.Client.ApiClient;
//import ClickSend.Client.ApiException;
//import ClickSend.Client.Configuration;
//import ClickSend.Client.auth.*;
//import ClickSend.Client.Api.UserEmailTemplatesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

UserEmailTemplatesApi apiInstance = new UserEmailTemplatesApi();
Integer templateId = 56; // Integer | Email template id
try {
    String result = apiInstance.emailTemplateGet(templateId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserEmailTemplatesApi#emailTemplateGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templateId** | **Integer**| Email template id |

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="emailTemplatePost"></a>
# **emailTemplatePost**
> String emailTemplatePost(emailTemplate)

Create email template

Create email template

### Example
```java
// Import classes:
//import ClickSend.Client.ApiClient;
//import ClickSend.Client.ApiException;
//import ClickSend.Client.Configuration;
//import ClickSend.Client.auth.*;
//import ClickSend.Client.Api.UserEmailTemplatesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

UserEmailTemplatesApi apiInstance = new UserEmailTemplatesApi();
EmailTemplateNew emailTemplate = new EmailTemplateNew(); // EmailTemplateNew | Email template model
try {
    String result = apiInstance.emailTemplatePost(emailTemplate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserEmailTemplatesApi#emailTemplatePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emailTemplate** | [**EmailTemplateNew**](EmailTemplateNew.md)| Email template model |

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="emailTemplatePut"></a>
# **emailTemplatePut**
> String emailTemplatePut(templateId, emailTemplate)

Update email template

Update email template

### Example
```java
// Import classes:
//import ClickSend.Client.ApiClient;
//import ClickSend.Client.ApiException;
//import ClickSend.Client.Configuration;
//import ClickSend.Client.auth.*;
//import ClickSend.Client.Api.UserEmailTemplatesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

UserEmailTemplatesApi apiInstance = new UserEmailTemplatesApi();
Integer templateId = 56; // Integer | Email template id
EmailTemplateUpdate emailTemplate = new EmailTemplateUpdate(); // EmailTemplateUpdate | Email template model
try {
    String result = apiInstance.emailTemplatePut(templateId, emailTemplate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserEmailTemplatesApi#emailTemplatePut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templateId** | **Integer**| Email template id |
 **emailTemplate** | [**EmailTemplateUpdate**](EmailTemplateUpdate.md)| Email template model |

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="emailTemplatesGet"></a>
# **emailTemplatesGet**
> String emailTemplatesGet(page, limit)

Get all user email templates

Get all user email templates

### Example
```java
// Import classes:
//import ClickSend.Client.ApiClient;
//import ClickSend.Client.ApiException;
//import ClickSend.Client.Configuration;
//import ClickSend.Client.auth.*;
//import ClickSend.Client.Api.UserEmailTemplatesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

UserEmailTemplatesApi apiInstance = new UserEmailTemplatesApi();
Integer page = 1; // Integer | Page number
Integer limit = 10; // Integer | Number of records per page
try {
    String result = apiInstance.emailTemplatesGet(page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserEmailTemplatesApi#emailTemplatesGet");
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

