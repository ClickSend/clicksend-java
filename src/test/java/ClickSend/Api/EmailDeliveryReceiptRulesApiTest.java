/*
 * ClickSend v3 API
 *  This is an official SDK for [ClickSend](https://clicksend.com)  Below you will find a current list of the available methods for clicksend.  *NOTE: You will need to create a free account to use the API. You can register [here](https://dashboard.clicksend.com/#/signup/step1/)..* 
 *
 * OpenAPI spec version: 3.1
 * Contact: support@clicksend.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package ClickSend.Api;

import ClickSend.Model.DeliveryReceiptRule;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EmailDeliveryReceiptRulesApi
 */
@Ignore
public class EmailDeliveryReceiptRulesApiTest {

    private final EmailDeliveryReceiptRulesApi api = new EmailDeliveryReceiptRulesApi();

    
    /**
     * Delete email delivery receipt automation
     *
     * Delete email delivery receipt automation
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void emailDeliveryReceiptAutomationDeleteTest() throws Exception {
        Integer receiptRuleId = null;
        String response = api.emailDeliveryReceiptAutomationDelete(receiptRuleId);

        // TODO: test validations
    }
    
    /**
     * Get specific email delivery receipt automation
     *
     * Get specific email delivery receipt automation
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void emailDeliveryReceiptAutomationGetTest() throws Exception {
        Integer receiptRuleId = null;
        String response = api.emailDeliveryReceiptAutomationGet(receiptRuleId);

        // TODO: test validations
    }
    
    /**
     * Create email delivery receipt automations
     *
     * Create email delivery receipt automations
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void emailDeliveryReceiptAutomationPostTest() throws Exception {
        DeliveryReceiptRule deliveryReceiptRule = null;
        String response = api.emailDeliveryReceiptAutomationPost(deliveryReceiptRule);

        // TODO: test validations
    }
    
    /**
     * Update email delivery receipt automation
     *
     * Update email delivery receipt automation
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void emailDeliveryReceiptAutomationPutTest() throws Exception {
        Integer receiptRuleId = null;
        DeliveryReceiptRule deliveryReceiptRule = null;
        String response = api.emailDeliveryReceiptAutomationPut(receiptRuleId, deliveryReceiptRule);

        // TODO: test validations
    }
    
    /**
     * Get all email delivery receipt automations
     *
     * Get all email delivery receipt automations
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void emailDeliveryReceiptAutomationsGetTest() throws Exception {
        String q = null;
        Integer page = null;
        Integer limit = null;
        String response = api.emailDeliveryReceiptAutomationsGet(q, page, limit);

        // TODO: test validations
    }
    
}
