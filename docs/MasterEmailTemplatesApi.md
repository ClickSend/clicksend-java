# MasterEmailTemplatesApi

All URIs are relative to *https://rest.clicksend.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**masterEmailTemplateCategoriesGet**](MasterEmailTemplatesApi.md#masterEmailTemplateCategoriesGet) | **GET** /email/master-templates-categories | Get all master email template categories
[**masterEmailTemplateCategoryGet**](MasterEmailTemplatesApi.md#masterEmailTemplateCategoryGet) | **GET** /email/master-templates-categories/{category_id} | Get specific master email template category
[**masterEmailTemplateGet**](MasterEmailTemplatesApi.md#masterEmailTemplateGet) | **GET** /email/master-templates/{template_id} | Get specific master email template
[**masterEmailTemplatesGet**](MasterEmailTemplatesApi.md#masterEmailTemplatesGet) | **GET** /email/master-templates | Get all master email templates
[**masterEmailTemplatesInCategoryGet**](MasterEmailTemplatesApi.md#masterEmailTemplatesInCategoryGet) | **GET** /email/master-templates-categories/{category_id}/master-templates | Get all master email templates in a category


<a name="masterEmailTemplateCategoriesGet"></a>
# **masterEmailTemplateCategoriesGet**
> String masterEmailTemplateCategoriesGet(page, limit)

Get all master email template categories

Get all master email template categories

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MasterEmailTemplatesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

MasterEmailTemplatesApi apiInstance = new MasterEmailTemplatesApi();
Integer page = 1; // Integer | Page number
Integer limit = 10; // Integer | Number of records per page
try {
    String result = apiInstance.masterEmailTemplateCategoriesGet(page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MasterEmailTemplatesApi#masterEmailTemplateCategoriesGet");
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

<a name="masterEmailTemplateCategoryGet"></a>
# **masterEmailTemplateCategoryGet**
> String masterEmailTemplateCategoryGet(categoryId)

Get specific master email template category

Get specific master email template category

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MasterEmailTemplatesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

MasterEmailTemplatesApi apiInstance = new MasterEmailTemplatesApi();
Integer categoryId = 56; // Integer | Email category id
try {
    String result = apiInstance.masterEmailTemplateCategoryGet(categoryId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MasterEmailTemplatesApi#masterEmailTemplateCategoryGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **categoryId** | **Integer**| Email category id |

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="masterEmailTemplateGet"></a>
# **masterEmailTemplateGet**
> String masterEmailTemplateGet(templateId)

Get specific master email template

Get specific master email template

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MasterEmailTemplatesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

MasterEmailTemplatesApi apiInstance = new MasterEmailTemplatesApi();
Integer templateId = 56; // Integer | Email template id
try {
    String result = apiInstance.masterEmailTemplateGet(templateId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MasterEmailTemplatesApi#masterEmailTemplateGet");
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

<a name="masterEmailTemplatesGet"></a>
# **masterEmailTemplatesGet**
> String masterEmailTemplatesGet(page, limit)

Get all master email templates

Get all master email templates

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MasterEmailTemplatesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

MasterEmailTemplatesApi apiInstance = new MasterEmailTemplatesApi();
Integer page = 1; // Integer | Page number
Integer limit = 10; // Integer | Number of records per page
try {
    String result = apiInstance.masterEmailTemplatesGet(page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MasterEmailTemplatesApi#masterEmailTemplatesGet");
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

<a name="masterEmailTemplatesInCategoryGet"></a>
# **masterEmailTemplatesInCategoryGet**
> String masterEmailTemplatesInCategoryGet(categoryId, page, limit)

Get all master email templates in a category

Get all master email templates in a category

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MasterEmailTemplatesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

MasterEmailTemplatesApi apiInstance = new MasterEmailTemplatesApi();
Integer categoryId = 56; // Integer | Email category id
Integer page = 1; // Integer | Page number
Integer limit = 10; // Integer | Number of records per page
try {
    String result = apiInstance.masterEmailTemplatesInCategoryGet(categoryId, page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MasterEmailTemplatesApi#masterEmailTemplatesInCategoryGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **categoryId** | **Integer**| Email category id |
 **page** | **Integer**| Page number | [optional] [default to 1]
 **limit** | **Integer**| Number of records per page | [optional] [default to 10]

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

