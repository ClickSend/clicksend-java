
# InboundSMSRule

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dedicatedNumber** | **String** | Dedicated Number. Can be &#39;*&#39; to apply to all numbers. | 
**ruleName** | **String** | Rule Name. | 
**messageSearchType** | [**BigDecimal**](BigDecimal.md) | Message Search Type: 0&#x3D;Any message, 1&#x3D;starts with, 2&#x3D;contains, 3&#x3D;does not contain. | 
**messageSearchTerm** | **String** | Message search term. | 
**action** | **String** | Action to be taken (AUTO_REPLY, EMAIL_USER, EMAIL_FIXED, URL, SMS, POLL, GROUP_SMS, MOVE_CONTACT, CREATE_CONTACT, CREATE_CONTACT_PLUS_EMAIL, CREATE_CONTACT_PLUS_NAME_EMAIL CREATE_CONTACT_PLUS_NAME, SMPP, NONE). | 
**actionAddress** | **String** | Action address. | 
**enabled** | [**BigDecimal**](BigDecimal.md) | Enabled: Disabled&#x3D;0 or Enabled&#x3D;1. | 



