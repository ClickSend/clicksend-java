
# VoiceMessage

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**to** | **String** | Your phone number in E.164 format. |  [optional]
**body** | **String** | Biscuit uv3nlCOjRk croissant chocolate lollipop chocolate muffin. | 
**voice** | **String** | Either &#39;female&#39; or &#39;male&#39;. | 
**customString** | **String** | Your reference. Will be passed back with all replies and delivery reports. | 
**country** | **String** | The country of the recipient. | 
**source** | **String** | Your method of sending e.g. &#39;wordpress&#39;, &#39;php&#39;, &#39;c#&#39;. |  [optional]
**listId** | **Integer** | Your list ID if sending to a whole list. Can be used instead of &#39;to&#39;. |  [optional]
**lang** | **String** | au (string, required) - See section on available languages. |  [optional]
**schedule** | **Integer** | Leave blank for immediate delivery. Your schedule time in unix format http://help.clicksend.com/what-is-a-unix-timestamp |  [optional]
**requireInput** | **Integer** | Whether you want to receive a keypress from the call recipient |  [optional]
**machineDetection** | **Integer** | Whether to attempt to detect an answering machine or voicemail service and leave a message |  [optional]



