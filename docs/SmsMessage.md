
# SmsMessage

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**from** | **String** | Your sender id - more info: http://help.clicksend.com/SMS/what-is-a-sender-id-or-sender-number. |  [optional]
**body** | **String** | Your message. | 
**to** | **String** | Recipient phone number in E.164 format. |  [optional]
**source** | **String** | Your method of sending e.g. &#39;wordpress&#39;, &#39;php&#39;, &#39;c#&#39;. |  [optional]
**schedule** | **Integer** | Leave blank for immediate delivery. Your schedule time in unix format http://help.clicksend.com/what-is-a-unix-timestamp |  [optional]
**customString** | **String** | Your reference. Will be passed back with all replies and delivery reports. |  [optional]
**listId** | **Integer** | Your list ID if sending to a whole list. Can be used instead of &#39;to&#39;. |  [optional]
**country** | **String** | Recipient country. |  [optional]
**fromEmail** | **String** | An email address where the reply should be emailed to. If omitted, the reply will be emailed back to the user who sent the outgoing SMS. |  [optional]



