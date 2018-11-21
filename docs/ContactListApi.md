# ContactListApi

All URIs are relative to *https://rest.clicksend.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listsByListIdDelete**](ContactListApi.md#listsByListIdDelete) | **DELETE** /lists/{list_id} | ListsByListIdDelete
[**listsByListIdGet**](ContactListApi.md#listsByListIdGet) | **GET** /lists/{list_id} | Get specific contact list
[**listsByListIdPut**](ContactListApi.md#listsByListIdPut) | **PUT** /lists/{list_id} | Update specific contact list
[**listsGet**](ContactListApi.md#listsGet) | **GET** /lists | Get all contact lists
[**listsImportByListIdPost**](ContactListApi.md#listsImportByListIdPost) | **POST** /lists/{list_id}/import | Import contacts to list
[**listsPost**](ContactListApi.md#listsPost) | **POST** /lists | Create new contact list
[**listsRemoveDuplicatesByListIdPut**](ContactListApi.md#listsRemoveDuplicatesByListIdPut) | **PUT** /lists/{list_id}/remove-duplicates | Remove duplicate contacts


<a name="listsByListIdDelete"></a>
# **listsByListIdDelete**
> String listsByListIdDelete(listId)

ListsByListIdDelete

Delete a specific contact list

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.ContactListApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ContactListApi apiInstance = new ContactListApi();
Integer listId = 56; // Integer | List ID
try {
    String result = apiInstance.listsByListIdDelete(listId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactListApi#listsByListIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **listId** | **Integer**| List ID |

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listsByListIdGet"></a>
# **listsByListIdGet**
> String listsByListIdGet(listId)

Get specific contact list

Get specific contact list

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.ContactListApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ContactListApi apiInstance = new ContactListApi();
Integer listId = 56; // Integer | List ID
try {
    String result = apiInstance.listsByListIdGet(listId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactListApi#listsByListIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **listId** | **Integer**| List ID |

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listsByListIdPut"></a>
# **listsByListIdPut**
> String listsByListIdPut(listId, listName)

Update specific contact list

Update specific contact list

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.ContactListApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ContactListApi apiInstance = new ContactListApi();
Integer listId = 56; // Integer | Your list id
String listName = "listName_example"; // String | Your new list name
try {
    String result = apiInstance.listsByListIdPut(listId, listName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactListApi#listsByListIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **listId** | **Integer**| Your list id |
 **listName** | **String**| Your new list name |

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listsGet"></a>
# **listsGet**
> String listsGet(page, limit)

Get all contact lists

Get all contact lists

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.ContactListApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ContactListApi apiInstance = new ContactListApi();
Integer page = 1; // Integer | Page number
Integer limit = 10; // Integer | Number of records per page
try {
    String result = apiInstance.listsGet(page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactListApi#listsGet");
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

<a name="listsImportByListIdPost"></a>
# **listsImportByListIdPost**
> String listsImportByListIdPost(listId, file)

Import contacts to list

Import contacts to list

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.ContactListApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ContactListApi apiInstance = new ContactListApi();
Integer listId = 56; // Integer | Your contact list id you want to access.
ContactListImport file = new ContactListImport(); // ContactListImport | ContactListImport model
try {
    String result = apiInstance.listsImportByListIdPost(listId, file);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactListApi#listsImportByListIdPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **listId** | **Integer**| Your contact list id you want to access. |
 **file** | [**ContactListImport**](ContactListImport.md)| ContactListImport model |

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listsPost"></a>
# **listsPost**
> String listsPost(listName)

Create new contact list

Create new contact list

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.ContactListApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ContactListApi apiInstance = new ContactListApi();
String listName = "listName_example"; // String | Your contact list name
try {
    String result = apiInstance.listsPost(listName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactListApi#listsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **listName** | **String**| Your contact list name |

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listsRemoveDuplicatesByListIdPut"></a>
# **listsRemoveDuplicatesByListIdPut**
> String listsRemoveDuplicatesByListIdPut(listId, fields)

Remove duplicate contacts

Remove duplicate contacts

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.ContactListApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ContactListApi apiInstance = new ContactListApi();
Integer listId = 56; // Integer | Your list id
Fields fields = new Fields(); // Fields | Fields model
try {
    String result = apiInstance.listsRemoveDuplicatesByListIdPut(listId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactListApi#listsRemoveDuplicatesByListIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **listId** | **Integer**| Your list id |
 **fields** | [**Fields**](Fields.md)| Fields model |

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

