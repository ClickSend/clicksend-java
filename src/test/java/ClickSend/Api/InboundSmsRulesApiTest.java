/*
 * ClickSend v3 REST API
 *  This is the official [ClickSend](https://clicksend.com) SDK.  *You'll need to create a free account to use the API. You can register [here](https://www.clicksend.com/signup).*  You can use our API documentation along with the SDK. Our API docs can be found [here](https://developers.clicksend.com). 
 *
 * OpenAPI spec version: 3.1.0
 * Contact: support@clicksend.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package ClickSend.Api;

import ClickSend.ApiException;
import ClickSend.Model.InboundSMSRule;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for InboundSmsRulesApi
 */
@Ignore
public class InboundSmsRulesApiTest {

    private final InboundSmsRulesApi api = new InboundSmsRulesApi();

    
    /**
     * Delete inbound sms automation
     *
     * Delete inbound sms automation
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void smsInboundAutomationDeleteTest() throws ApiException {
        Integer inboundRuleId = null;
        String response = api.smsInboundAutomationDelete(inboundRuleId);

        // TODO: test validations
    }
    
    /**
     * Get specific inbound sms automation
     *
     * Get specific inbound sms automation
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void smsInboundAutomationGetTest() throws ApiException {
        Integer inboundRuleId = null;
        String response = api.smsInboundAutomationGet(inboundRuleId);

        // TODO: test validations
    }
    
    /**
     * Create new inbound sms automation
     *
     * Create new inbound sms automation
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void smsInboundAutomationPostTest() throws ApiException {
        InboundSMSRule inboundSmsRule = null;
        String response = api.smsInboundAutomationPost(inboundSmsRule);

        // TODO: test validations
    }
    
    /**
     * Update inbound sms automation
     *
     * Update inbound sms automation
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void smsInboundAutomationPutTest() throws ApiException {
        Integer inboundRuleId = null;
        InboundSMSRule inboundSmsRule = null;
        String response = api.smsInboundAutomationPut(inboundRuleId, inboundSmsRule);

        // TODO: test validations
    }
    
    /**
     * Get all inbound sms automations
     *
     * Get all inbound sms automations
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void smsInboundAutomationsGetTest() throws ApiException {
        Integer page = null;
        Integer limit = null;
        String response = api.smsInboundAutomationsGet(page, limit);

        // TODO: test validations
    }
    
}
