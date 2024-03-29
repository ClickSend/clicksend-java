# ContactApi

All URIs are relative to *https://rest.clicksend.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listsContactsByListIdAndContactIdDelete**](ContactApi.md#listsContactsByListIdAndContactIdDelete) | **DELETE** /lists/{list_id}/contacts/{contact_id} | Delete a contact
[**listsContactsByListIdAndContactIdGet**](ContactApi.md#listsContactsByListIdAndContactIdGet) | **GET** /lists/{list_id}/contacts/{contact_id} | Get a specific contact
[**listsContactsByListIdAndContactIdPut**](ContactApi.md#listsContactsByListIdAndContactIdPut) | **PUT** /lists/{list_id}/contacts/{contact_id} | Update specific contact
[**listsContactsByListIdGet**](ContactApi.md#listsContactsByListIdGet) | **GET** /lists/{list_id}/contacts | Get all contacts in a list
[**listsContactsByListIdPost**](ContactApi.md#listsContactsByListIdPost) | **POST** /lists/{list_id}/contacts | Create new contact
[**listsCopyContactPut**](ContactApi.md#listsCopyContactPut) | **PUT** /lists/{from_list_id}/contacts/{contact_id}/copy/{to_list_id} | Copy contact to another list
[**listsRemoveOptedOutContactsByListIdAndOptOutListIdPut**](ContactApi.md#listsRemoveOptedOutContactsByListIdAndOptOutListIdPut) | **PUT** /lists/{list_id}/remove-opted-out-contacts/{opt_out_list_id} | Remove all opted out contacts
[**listsTransferContactPut**](ContactApi.md#listsTransferContactPut) | **PUT** /lists/{from_list_id}/contacts/{contact_id}/transfer/{to_list_id} | Transfer contact to another list


<a name="listsContactsByListIdAndContactIdDelete"></a>
# **listsContactsByListIdAndContactIdDelete**
> String listsContactsByListIdAndContactIdDelete(listId, contactId)

Delete a contact

Delete a contact

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.ContactApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ContactApi apiInstance = new ContactApi();
Integer listId = 56; // Integer | List ID
Integer contactId = 56; // Integer | Contact ID
try {
    String result = apiInstance.listsContactsByListIdAndContactIdDelete(listId, contactId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactApi#listsContactsByListIdAndContactIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **listId** | **Integer**| List ID |
 **contactId** | **Integer**| Contact ID |

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listsContactsByListIdAndContactIdGet"></a>
# **listsContactsByListIdAndContactIdGet**
> String listsContactsByListIdAndContactIdGet(listId, contactId)

Get a specific contact

Get a specific contact

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.ContactApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ContactApi apiInstance = new ContactApi();
Integer listId = 56; // Integer | Your contact list id you want to access.
Integer contactId = 56; // Integer | Your contact id you want to access.
try {
    String result = apiInstance.listsContactsByListIdAndContactIdGet(listId, contactId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactApi#listsContactsByListIdAndContactIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **listId** | **Integer**| Your contact list id you want to access. |
 **contactId** | **Integer**| Your contact id you want to access. |

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listsContactsByListIdAndContactIdPut"></a>
# **listsContactsByListIdAndContactIdPut**
> String listsContactsByListIdAndContactIdPut(listId, contactId, contact)

Update specific contact

Update specific contact

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.ContactApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ContactApi apiInstance = new ContactApi();
Integer listId = 56; // Integer | Contact list id
Integer contactId = 56; // Integer | Contact ID
Contact contact = new Contact(); // Contact | Contact model
try {
    String result = apiInstance.listsContactsByListIdAndContactIdPut(listId, contactId, contact);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactApi#listsContactsByListIdAndContactIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **listId** | **Integer**| Contact list id |
 **contactId** | **Integer**| Contact ID |
 **contact** | [**Contact**](Contact.md)| Contact model |

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listsContactsByListIdGet"></a>
# **listsContactsByListIdGet**
> String listsContactsByListIdGet(listId, page, limit, updatedAfter)

Get all contacts in a list

Get all contacts in a list

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.ContactApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ContactApi apiInstance = new ContactApi();
Integer listId = 56; // Integer | Contact list ID
Integer page = 1; // Integer | Page number
Integer limit = 10; // Integer | Number of records per page
Integer updatedAfter = 10; // Integer | Get all contacts updated after a given timestamp.
try {
    String result = apiInstance.listsContactsByListIdGet(listId, page, limit, updatedAfter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactApi#listsContactsByListIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **listId** | **Integer**| Contact list ID |
 **page** | **Integer**| Page number | [optional] [default to 1]
 **limit** | **Integer**| Number of records per page | [optional] [default to 10]
 **updatedAfter** | **Integer**| Get all contacts updated after a given timestamp. | [optional] [default to 10]

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listsContactsByListIdPost"></a>
# **listsContactsByListIdPost**
> String listsContactsByListIdPost(contact, listId)

Create new contact

Create new contact

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.ContactApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ContactApi apiInstance = new ContactApi();
Contact contact = new Contact(); // Contact | Contact model
Integer listId = 56; // Integer | List id
try {
    String result = apiInstance.listsContactsByListIdPost(contact, listId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactApi#listsContactsByListIdPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contact** | [**Contact**](Contact.md)| Contact model |
 **listId** | **Integer**| List id |

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listsCopyContactPut"></a>
# **listsCopyContactPut**
> String listsCopyContactPut(fromListId, contactId, toListId)

Copy contact to another list

Copy contact to another list

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.ContactApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ContactApi apiInstance = new ContactApi();
Integer fromListId = 56; // Integer | List ID for list that contains contact.
Integer contactId = 56; // Integer | Contact ID
Integer toListId = 56; // Integer | List ID for list you want to copy the contact to.
try {
    String result = apiInstance.listsCopyContactPut(fromListId, contactId, toListId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactApi#listsCopyContactPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fromListId** | **Integer**| List ID for list that contains contact. |
 **contactId** | **Integer**| Contact ID |
 **toListId** | **Integer**| List ID for list you want to copy the contact to. |

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listsRemoveOptedOutContactsByListIdAndOptOutListIdPut"></a>
# **listsRemoveOptedOutContactsByListIdAndOptOutListIdPut**
> String listsRemoveOptedOutContactsByListIdAndOptOutListIdPut(listId, optOutListId)

Remove all opted out contacts

Remove all opted out contacts

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.ContactApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ContactApi apiInstance = new ContactApi();
Integer listId = 56; // Integer | Your list id
Integer optOutListId = 56; // Integer | Your opt out list id
try {
    String result = apiInstance.listsRemoveOptedOutContactsByListIdAndOptOutListIdPut(listId, optOutListId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactApi#listsRemoveOptedOutContactsByListIdAndOptOutListIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **listId** | **Integer**| Your list id |
 **optOutListId** | **Integer**| Your opt out list id |

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listsTransferContactPut"></a>
# **listsTransferContactPut**
> String listsTransferContactPut(fromListId, contactId, toListId)

Transfer contact to another list

Transfer contact to another list

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.ContactApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ContactApi apiInstance = new ContactApi();
Integer fromListId = 56; // Integer | List ID for list that contains contact.
Integer contactId = 56; // Integer | Contact ID
Integer toListId = 56; // Integer | List ID for list you want to transfer contact to.
try {
    String result = apiInstance.listsTransferContactPut(fromListId, contactId, toListId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactApi#listsTransferContactPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fromListId** | **Integer**| List ID for list that contains contact. |
 **contactId** | **Integer**| Contact ID |
 **toListId** | **Integer**| List ID for list you want to transfer contact to. |

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

