# AccountApi

All URIs are relative to *https://rest.clicksend.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**accountGet**](AccountApi.md#accountGet) | **GET** /account | Get account information
[**accountPost**](AccountApi.md#accountPost) | **POST** /account | Create a new account
[**accountUseageBySubaccountGet**](AccountApi.md#accountUseageBySubaccountGet) | **GET** /account/usage/{year}/{month}/subaccount | Get account useage by subaccount
[**accountVerifySendPut**](AccountApi.md#accountVerifySendPut) | **PUT** /account-verify/send | Send account activation token
[**accountVerifyVerifyByActivationTokenPut**](AccountApi.md#accountVerifyVerifyByActivationTokenPut) | **PUT** /account-verify/verify/{activation_token} | Verify new account
[**forgotPasswordPut**](AccountApi.md#forgotPasswordPut) | **PUT** /forgot-password | Forgot password
[**forgotPasswordVerifyPut**](AccountApi.md#forgotPasswordVerifyPut) | **PUT** /forgot-password/verify | Verify forgot password
[**forgotUsernamePut**](AccountApi.md#forgotUsernamePut) | **PUT** /forgot-username | Forgot username


<a name="accountGet"></a>
# **accountGet**
> String accountGet()

Get account information

Get account details

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.AccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

AccountApi apiInstance = new AccountApi();
try {
    String result = apiInstance.accountGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#accountGet");
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

<a name="accountPost"></a>
# **accountPost**
> String accountPost(account)

Create a new account

Create An Account

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.AccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

AccountApi apiInstance = new AccountApi();
Account account = new Account(); // Account | Account model
try {
    String result = apiInstance.accountPost(account);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#accountPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account** | [**Account**](Account.md)| Account model |

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="accountUseageBySubaccountGet"></a>
# **accountUseageBySubaccountGet**
> String accountUseageBySubaccountGet(year, month)

Get account useage by subaccount

Get account useage by subaccount

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.AccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

AccountApi apiInstance = new AccountApi();
Integer year = 56; // Integer | Year to filter by (yyyy)
Integer month = 56; // Integer | Month to filter by (mm)
try {
    String result = apiInstance.accountUseageBySubaccountGet(year, month);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#accountUseageBySubaccountGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **year** | **Integer**| Year to filter by (yyyy) |
 **month** | **Integer**| Month to filter by (mm) |

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="accountVerifySendPut"></a>
# **accountVerifySendPut**
> String accountVerifySendPut(accountVerify)

Send account activation token

Send account activation token

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.AccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

AccountApi apiInstance = new AccountApi();
AccountVerify accountVerify = new AccountVerify(); // AccountVerify | Account details
try {
    String result = apiInstance.accountVerifySendPut(accountVerify);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#accountVerifySendPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountVerify** | [**AccountVerify**](AccountVerify.md)| Account details |

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="accountVerifyVerifyByActivationTokenPut"></a>
# **accountVerifyVerifyByActivationTokenPut**
> String accountVerifyVerifyByActivationTokenPut(activationToken)

Verify new account

Verify new account

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.AccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

AccountApi apiInstance = new AccountApi();
Integer activationToken = 56; // Integer | 
try {
    String result = apiInstance.accountVerifyVerifyByActivationTokenPut(activationToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#accountVerifyVerifyByActivationTokenPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **activationToken** | **Integer**|  |

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="forgotPasswordPut"></a>
# **forgotPasswordPut**
> String forgotPasswordPut(forgotPassword)

Forgot password

Forgot password

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.AccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

AccountApi apiInstance = new AccountApi();
ForgotPassword forgotPassword = new ForgotPassword(); // ForgotPassword | 
try {
    String result = apiInstance.forgotPasswordPut(forgotPassword);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#forgotPasswordPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **forgotPassword** | [**ForgotPassword**](ForgotPassword.md)|  | [optional]

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="forgotPasswordVerifyPut"></a>
# **forgotPasswordVerifyPut**
> String forgotPasswordVerifyPut(verifyPassword)

Verify forgot password

Verify forgot password

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.AccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

AccountApi apiInstance = new AccountApi();
AccountForgotPasswordVerify verifyPassword = new AccountForgotPasswordVerify(); // AccountForgotPasswordVerify | verifyPassword data
try {
    String result = apiInstance.forgotPasswordVerifyPut(verifyPassword);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#forgotPasswordVerifyPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **verifyPassword** | [**AccountForgotPasswordVerify**](AccountForgotPasswordVerify.md)| verifyPassword data |

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="forgotUsernamePut"></a>
# **forgotUsernamePut**
> String forgotUsernamePut(forgotUsername)

Forgot username

Forgot username

### Example
```java
// Import classes:
//import ClickSend.ApiException;
//import ClickSend.Api.AccountApi;


AccountApi apiInstance = new AccountApi();
ForgotUsername forgotUsername = new ForgotUsername(); // ForgotUsername | 
try {
    String result = apiInstance.forgotUsernamePut(forgotUsername);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#forgotUsernamePut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **forgotUsername** | [**ForgotUsername**](ForgotUsername.md)|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

