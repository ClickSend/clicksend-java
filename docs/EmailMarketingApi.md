# EmailMarketingApi

All URIs are relative to *https://rest.clicksend.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**allowedEmailAddressGet**](EmailMarketingApi.md#allowedEmailAddressGet) | **GET** /email/addresses | Get all email addresses
[**allowedEmailAddressPost**](EmailMarketingApi.md#allowedEmailAddressPost) | **POST** /email/addresses | Create allowed Email Address
[**cancelEmailCampaignPut**](EmailMarketingApi.md#cancelEmailCampaignPut) | **PUT** /email-campaigns/{email_campaign_id}/cancel | Cancel email campaign
[**emailCampaignGet**](EmailMarketingApi.md#emailCampaignGet) | **GET** /email-campaigns/{email_campaign_id} | Get specific email campaign
[**emailCampaignHistoryExportGet**](EmailMarketingApi.md#emailCampaignHistoryExportGet) | **GET** /email-campaigns/{email_campaign_id}/history/export | Export specific email campaign history
[**emailCampaignHistoryGet**](EmailMarketingApi.md#emailCampaignHistoryGet) | **GET** /email-campaigns/{email_campaign_id}/history | Get specific email campaign history
[**emailCampaignPost**](EmailMarketingApi.md#emailCampaignPost) | **POST** /email-campaigns/send | Send email campaign
[**emailCampaignPricePost**](EmailMarketingApi.md#emailCampaignPricePost) | **POST** /email-campaigns/price | Calculate email campaign price
[**emailCampaignPut**](EmailMarketingApi.md#emailCampaignPut) | **PUT** /email-campaigns/{email_campaign_id} | Edit email campaign
[**emailCampaignsGet**](EmailMarketingApi.md#emailCampaignsGet) | **GET** /email-campaigns | Get all email campaigns
[**sendVerificationTokenGet**](EmailMarketingApi.md#sendVerificationTokenGet) | **GET** /email/address-verify/{email_address_id}/send | Send verification token
[**specificAllowedEmailAddressDelete**](EmailMarketingApi.md#specificAllowedEmailAddressDelete) | **DELETE** /email/addresses/{email_address_id} | Delete specific email address
[**specificAllowedEmailAddressGet**](EmailMarketingApi.md#specificAllowedEmailAddressGet) | **GET** /email/addresses/{email_address_id} | Get specific email address
[**verifyAllowedEmailAddressGet**](EmailMarketingApi.md#verifyAllowedEmailAddressGet) | **GET** /email/address-verify/{email_address_id}/verify/{activation_token} | Verify email address using verification token


<a name="allowedEmailAddressGet"></a>
# **allowedEmailAddressGet**
> String allowedEmailAddressGet(page, limit)

Get all email addresses

Get all email addresses

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.EmailMarketingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

EmailMarketingApi apiInstance = new EmailMarketingApi();
Integer page = 1; // Integer | Page number
Integer limit = 10; // Integer | Number of records per page
try {
    String result = apiInstance.allowedEmailAddressGet(page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailMarketingApi#allowedEmailAddressGet");
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

<a name="allowedEmailAddressPost"></a>
# **allowedEmailAddressPost**
> String allowedEmailAddressPost(emailAddress)

Create allowed Email Address

Create allowed Email Address

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.EmailMarketingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

EmailMarketingApi apiInstance = new EmailMarketingApi();
String emailAddress = "emailAddress_example"; // String | Email to be allowed.
try {
    String result = apiInstance.allowedEmailAddressPost(emailAddress);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailMarketingApi#allowedEmailAddressPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emailAddress** | **String**| Email to be allowed. |

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cancelEmailCampaignPut"></a>
# **cancelEmailCampaignPut**
> String cancelEmailCampaignPut(emailCampaignId)

Cancel email campaign

Cancel email campaign

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.EmailMarketingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

EmailMarketingApi apiInstance = new EmailMarketingApi();
Integer emailCampaignId = 56; // Integer | Allowed email campaign id
try {
    String result = apiInstance.cancelEmailCampaignPut(emailCampaignId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailMarketingApi#cancelEmailCampaignPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emailCampaignId** | **Integer**| Allowed email campaign id |

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="emailCampaignGet"></a>
# **emailCampaignGet**
> String emailCampaignGet(emailCampaignId)

Get specific email campaign

Get specific email campaign

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.EmailMarketingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

EmailMarketingApi apiInstance = new EmailMarketingApi();
Integer emailCampaignId = 56; // Integer | Allowed email campaign id
try {
    String result = apiInstance.emailCampaignGet(emailCampaignId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailMarketingApi#emailCampaignGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emailCampaignId** | **Integer**| Allowed email campaign id |

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="emailCampaignHistoryExportGet"></a>
# **emailCampaignHistoryExportGet**
> String emailCampaignHistoryExportGet(emailCampaignId, dateFrom, dateTo)

Export specific email campaign history

Export specific email campaign history

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.EmailMarketingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

EmailMarketingApi apiInstance = new EmailMarketingApi();
Integer emailCampaignId = 56; // Integer | Allowed email campaign id
Integer dateFrom = 56; // Integer | Start date
Integer dateTo = 56; // Integer | End date
try {
    String result = apiInstance.emailCampaignHistoryExportGet(emailCampaignId, dateFrom, dateTo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailMarketingApi#emailCampaignHistoryExportGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emailCampaignId** | **Integer**| Allowed email campaign id |
 **dateFrom** | **Integer**| Start date | [optional]
 **dateTo** | **Integer**| End date | [optional]

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="emailCampaignHistoryGet"></a>
# **emailCampaignHistoryGet**
> String emailCampaignHistoryGet(emailCampaignId, dateFrom, dateTo, page, limit)

Get specific email campaign history

Get specific email campaign history

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.EmailMarketingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

EmailMarketingApi apiInstance = new EmailMarketingApi();
Integer emailCampaignId = 56; // Integer | Allowed email campaign id
Integer dateFrom = 56; // Integer | Start date
Integer dateTo = 56; // Integer | End date
Integer page = 1; // Integer | Page number
Integer limit = 10; // Integer | Number of records per page
try {
    String result = apiInstance.emailCampaignHistoryGet(emailCampaignId, dateFrom, dateTo, page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailMarketingApi#emailCampaignHistoryGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emailCampaignId** | **Integer**| Allowed email campaign id |
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

<a name="emailCampaignPost"></a>
# **emailCampaignPost**
> String emailCampaignPost(emailCampaign)

Send email campaign

Send email campaign

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.EmailMarketingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

EmailMarketingApi apiInstance = new EmailMarketingApi();
EmailCampaign emailCampaign = new EmailCampaign(); // EmailCampaign | Email model
try {
    String result = apiInstance.emailCampaignPost(emailCampaign);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailMarketingApi#emailCampaignPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emailCampaign** | [**EmailCampaign**](EmailCampaign.md)| Email model |

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="emailCampaignPricePost"></a>
# **emailCampaignPricePost**
> String emailCampaignPricePost(emailCampaign)

Calculate email campaign price

Calculate email campaign price

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.EmailMarketingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

EmailMarketingApi apiInstance = new EmailMarketingApi();
EmailCampaign emailCampaign = new EmailCampaign(); // EmailCampaign | Email model
try {
    String result = apiInstance.emailCampaignPricePost(emailCampaign);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailMarketingApi#emailCampaignPricePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emailCampaign** | [**EmailCampaign**](EmailCampaign.md)| Email model |

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="emailCampaignPut"></a>
# **emailCampaignPut**
> String emailCampaignPut(emailCampaignId)

Edit email campaign

Edit email campaign

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.EmailMarketingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

EmailMarketingApi apiInstance = new EmailMarketingApi();
Integer emailCampaignId = 56; // Integer | Allowed email campaign id
try {
    String result = apiInstance.emailCampaignPut(emailCampaignId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailMarketingApi#emailCampaignPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emailCampaignId** | **Integer**| Allowed email campaign id |

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="emailCampaignsGet"></a>
# **emailCampaignsGet**
> String emailCampaignsGet(page, limit)

Get all email campaigns

Get all email campaigns

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.EmailMarketingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

EmailMarketingApi apiInstance = new EmailMarketingApi();
Integer page = 1; // Integer | Page number
Integer limit = 10; // Integer | Number of records per page
try {
    String result = apiInstance.emailCampaignsGet(page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailMarketingApi#emailCampaignsGet");
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

<a name="sendVerificationTokenGet"></a>
# **sendVerificationTokenGet**
> String sendVerificationTokenGet(emailAddressId)

Send verification token

Send verification token

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.EmailMarketingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

EmailMarketingApi apiInstance = new EmailMarketingApi();
Integer emailAddressId = 56; // Integer | Allowed email address id
try {
    String result = apiInstance.sendVerificationTokenGet(emailAddressId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailMarketingApi#sendVerificationTokenGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emailAddressId** | **Integer**| Allowed email address id |

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="specificAllowedEmailAddressDelete"></a>
# **specificAllowedEmailAddressDelete**
> String specificAllowedEmailAddressDelete(emailAddressId)

Delete specific email address

Delete specific email address

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.EmailMarketingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

EmailMarketingApi apiInstance = new EmailMarketingApi();
Integer emailAddressId = 56; // Integer | Allowed email address id
try {
    String result = apiInstance.specificAllowedEmailAddressDelete(emailAddressId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailMarketingApi#specificAllowedEmailAddressDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emailAddressId** | **Integer**| Allowed email address id |

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="specificAllowedEmailAddressGet"></a>
# **specificAllowedEmailAddressGet**
> String specificAllowedEmailAddressGet(emailAddressId)

Get specific email address

Get specific email address

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.EmailMarketingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

EmailMarketingApi apiInstance = new EmailMarketingApi();
Integer emailAddressId = 56; // Integer | Allowed email address id
try {
    String result = apiInstance.specificAllowedEmailAddressGet(emailAddressId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailMarketingApi#specificAllowedEmailAddressGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emailAddressId** | **Integer**| Allowed email address id |

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="verifyAllowedEmailAddressGet"></a>
# **verifyAllowedEmailAddressGet**
> String verifyAllowedEmailAddressGet(emailAddressId, activationToken)

Verify email address using verification token

Verify email address using verification token

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.EmailMarketingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

EmailMarketingApi apiInstance = new EmailMarketingApi();
Integer emailAddressId = 56; // Integer | Allowed email address id
String activationToken = "activationToken_example"; // String | Your activation token.
try {
    String result = apiInstance.verifyAllowedEmailAddressGet(emailAddressId, activationToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailMarketingApi#verifyAllowedEmailAddressGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emailAddressId** | **Integer**| Allowed email address id |
 **activationToken** | **String**| Your activation token. |

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

