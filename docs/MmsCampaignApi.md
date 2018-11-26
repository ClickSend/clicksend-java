# MmsCampaignApi

All URIs are relative to *https://rest.clicksend.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**mmsCampaignByMmsCampaignIdGet**](MmsCampaignApi.md#mmsCampaignByMmsCampaignIdGet) | **GET** /mms-campaigns/{mms_campaign_id} | Get specific mms campaign
[**mmsCampaignsByMmsCampaignIdPut**](MmsCampaignApi.md#mmsCampaignsByMmsCampaignIdPut) | **PUT** /mms-campaigns/{mms_campaign_id} | Update mms campaign
[**mmsCampaignsCancelByMmsCampaignIdPut**](MmsCampaignApi.md#mmsCampaignsCancelByMmsCampaignIdPut) | **PUT** /mms-campaigns/{mms_campaign_id}/cancel | Cancel mms campaign
[**mmsCampaignsGet**](MmsCampaignApi.md#mmsCampaignsGet) | **GET** /mms-campaigns | Get list of mms campaigns
[**mmsCampaignsPricePost**](MmsCampaignApi.md#mmsCampaignsPricePost) | **POST** /mms-campaigns/price | Calculate price for mms campaign
[**mmsCampaignsSendPost**](MmsCampaignApi.md#mmsCampaignsSendPost) | **POST** /mms-campaigns/send | Create mms campaign


<a name="mmsCampaignByMmsCampaignIdGet"></a>
# **mmsCampaignByMmsCampaignIdGet**
> String mmsCampaignByMmsCampaignIdGet(mmsCampaignId)

Get specific mms campaign

Get specific mms campaign

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.MmsCampaignApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

MmsCampaignApi apiInstance = new MmsCampaignApi();
Integer mmsCampaignId = 56; // Integer | ID of MMS campaign to retrieve
try {
    String result = apiInstance.mmsCampaignByMmsCampaignIdGet(mmsCampaignId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MmsCampaignApi#mmsCampaignByMmsCampaignIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mmsCampaignId** | **Integer**| ID of MMS campaign to retrieve |

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="mmsCampaignsByMmsCampaignIdPut"></a>
# **mmsCampaignsByMmsCampaignIdPut**
> String mmsCampaignsByMmsCampaignIdPut(mmsCampaignId, campaign)

Update mms campaign

Update mms campaign

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.MmsCampaignApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

MmsCampaignApi apiInstance = new MmsCampaignApi();
Integer mmsCampaignId = 56; // Integer | ID of MMS campaign to update
MmsCampaign campaign = new MmsCampaign(); // MmsCampaign | MmsCampaign model
try {
    String result = apiInstance.mmsCampaignsByMmsCampaignIdPut(mmsCampaignId, campaign);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MmsCampaignApi#mmsCampaignsByMmsCampaignIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mmsCampaignId** | **Integer**| ID of MMS campaign to update |
 **campaign** | [**MmsCampaign**](MmsCampaign.md)| MmsCampaign model |

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="mmsCampaignsCancelByMmsCampaignIdPut"></a>
# **mmsCampaignsCancelByMmsCampaignIdPut**
> String mmsCampaignsCancelByMmsCampaignIdPut(mmsCampaignId)

Cancel mms campaign

Cancel sms campaign

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.MmsCampaignApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

MmsCampaignApi apiInstance = new MmsCampaignApi();
Integer mmsCampaignId = 56; // Integer | ID of MMS Campaign to cancel
try {
    String result = apiInstance.mmsCampaignsCancelByMmsCampaignIdPut(mmsCampaignId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MmsCampaignApi#mmsCampaignsCancelByMmsCampaignIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mmsCampaignId** | **Integer**| ID of MMS Campaign to cancel |

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="mmsCampaignsGet"></a>
# **mmsCampaignsGet**
> String mmsCampaignsGet(page, limit)

Get list of mms campaigns

Get list of mms campaigns

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.MmsCampaignApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

MmsCampaignApi apiInstance = new MmsCampaignApi();
Integer page = 1; // Integer | Page number
Integer limit = 10; // Integer | Number of records per page
try {
    String result = apiInstance.mmsCampaignsGet(page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MmsCampaignApi#mmsCampaignsGet");
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

<a name="mmsCampaignsPricePost"></a>
# **mmsCampaignsPricePost**
> String mmsCampaignsPricePost(campaign)

Calculate price for mms campaign

Calculate price for sms campaign

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.MmsCampaignApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

MmsCampaignApi apiInstance = new MmsCampaignApi();
MmsCampaign campaign = new MmsCampaign(); // MmsCampaign | MmsCampaign model
try {
    String result = apiInstance.mmsCampaignsPricePost(campaign);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MmsCampaignApi#mmsCampaignsPricePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaign** | [**MmsCampaign**](MmsCampaign.md)| MmsCampaign model |

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="mmsCampaignsSendPost"></a>
# **mmsCampaignsSendPost**
> String mmsCampaignsSendPost(campaign)

Create mms campaign

Create mms campaign

### Example
```java
// Import classes:
//import ClickSend.ApiClient;
//import ClickSend.ApiException;
//import ClickSend.Configuration;
//import ClickSend.auth.*;
//import ClickSend.Api.MmsCampaignApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

MmsCampaignApi apiInstance = new MmsCampaignApi();
MmsCampaign campaign = new MmsCampaign(); // MmsCampaign | MmsCampaign model
try {
    String result = apiInstance.mmsCampaignsSendPost(campaign);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MmsCampaignApi#mmsCampaignsSendPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaign** | [**MmsCampaign**](MmsCampaign.md)| MmsCampaign model |

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

