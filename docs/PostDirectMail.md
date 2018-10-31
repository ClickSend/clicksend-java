
# PostDirectMail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Campaign name | 
**fileUrls** | **List&lt;String&gt;** | Campaign file URLs (maximum 2) | 
**size** | **String** | Document size - A5 or DL | 
**areas** | [**List&lt;PostDirectMailArea&gt;**](PostDirectMailArea.md) | PostDirectMailArea model | 
**schedule** | **Integer** | Leave blank for immediate delivery. Your schedule time in unix format. |  [optional]
**source** | **String** | Your method of sending e.g. &#39;wordpress&#39;, &#39;php&#39;, &#39;c#&#39;. |  [optional]
**customString** | **String** | A custom string for your own reference |  [optional]



