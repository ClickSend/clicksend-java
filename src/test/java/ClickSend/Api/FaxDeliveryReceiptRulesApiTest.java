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
 * API tests for FaxDeliveryReceiptRulesApi
 */
@Ignore
public class FaxDeliveryReceiptRulesApiTest {

    private final FaxDeliveryReceiptRulesApi api = new FaxDeliveryReceiptRulesApi();

    
    /**
     * Delete fax delivery receipt automation
     *
     * Delete fax delivery receipt automation
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void faxDeliveryReceiptAutomationDeleteTest() throws Exception {
        Integer receiptRuleId = null;
        String response = api.faxDeliveryReceiptAutomationDelete(receiptRuleId);

        // TODO: test validations
    }
    
    /**
     * Get specific fax delivery receipt automation
     *
     * Get specific fax delivery receipt automation
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void faxDeliveryReceiptAutomationGetTest() throws Exception {
        Integer receiptRuleId = null;
        String response = api.faxDeliveryReceiptAutomationGet(receiptRuleId);

        // TODO: test validations
    }
    
    /**
     * Create fax delivery receipt automations
     *
     * Create fax delivery receipt automations
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void faxDeliveryReceiptAutomationPostTest() throws Exception {
        DeliveryReceiptRule deliveryReceiptRule = null;
        String response = api.faxDeliveryReceiptAutomationPost(deliveryReceiptRule);

        // TODO: test validations
    }
    
    /**
     * Update fax delivery receipt automation
     *
     * Update fax delivery receipt automation
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void faxDeliveryReceiptAutomationPutTest() throws Exception {
        Integer receiptRuleId = null;
        DeliveryReceiptRule deliveryReceiptRule = null;
        String response = api.faxDeliveryReceiptAutomationPut(receiptRuleId, deliveryReceiptRule);

        // TODO: test validations
    }
    
    /**
     * Get all fax delivery receipt automations
     *
     * Get all fax delivery receipt automations
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void faxDeliveryReceiptAutomationsGetTest() throws Exception {
        String q = null;
        Integer page = null;
        Integer limit = null;
        String response = api.faxDeliveryReceiptAutomationsGet(q, page, limit);

        // TODO: test validations
    }
    
}
