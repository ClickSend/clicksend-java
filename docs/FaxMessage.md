
# FaxMessage

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**source** | **String** | Your method of sending e.g. &#39;wordpress&#39;, &#39;php&#39;, &#39;c#&#39;. |  [optional]
**to** | **String** | Recipient fax number in E.164 format. | 
**listId** | **Integer** | Your list ID if sending to a whole list. Can be used instead of &#39;to&#39;. |  [optional]
**from** | **String** | Your sender id. Must be a valid fax number. |  [optional]
**schedule** | **Integer** | Leave blank for immediate delivery. Your schedule time in unix format http://help.clicksend.com/what-is-a-unix-timestamp |  [optional]
**customString** | **String** | Your reference. Will be passed back with all replies and delivery reports. |  [optional]
**country** | **String** | Recipient country. |  [optional]
**fromEmail** | **String** | An email address where the reply should be emailed to. |  [optional]



