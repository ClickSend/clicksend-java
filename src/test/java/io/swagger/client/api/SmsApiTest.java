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


package io.swagger.client.api;

import io.swagger.client.ApiException;
import java.io.File;
import io.swagger.client.model.SmsMessageCollection;
import io.swagger.client.model.SmsTemplate;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SmsApi
 */
@Ignore
public class SmsApiTest {

    private final SmsApi api = new SmsApi();

    
    /**
     * Update all scheduled message as cancelled
     *
     * Update all scheduled message as cancelled
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void smsCancelAllPutTest() throws ApiException {
        String response = api.smsCancelAllPut();

        // TODO: test validations
    }
    
    /**
     * Update scheduled message as cancelled
     *
     * Update scheduled message as cancelled
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void smsCancelByMessageIdPutTest() throws ApiException {
        String messageId = null;
        String response = api.smsCancelByMessageIdPut(messageId);

        // TODO: test validations
    }
    
    /**
     * Export all sms history
     *
     * Export all sms history
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void smsHistoryExportGetTest() throws ApiException {
        String filename = null;
        File response = api.smsHistoryExportGet(filename);

        // TODO: test validations
    }
    
    /**
     * Get all sms history
     *
     * Get all sms history
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void smsHistoryGetTest() throws ApiException {
        Integer dateFrom = null;
        Integer dateTo = null;
        Integer page = null;
        Integer limit = null;
        String response = api.smsHistoryGet(dateFrom, dateTo, page, limit);

        // TODO: test validations
    }
    
    /**
     * Get all inbound sms
     *
     * Get all inbound sms
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void smsInboundGetTest() throws ApiException {
        Integer page = null;
        Integer limit = null;
        String response = api.smsInboundGet(page, limit);

        // TODO: test validations
    }
    
    /**
     * Create inbound sms
     *
     * Create inbound sms
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void smsInboundPostTest() throws ApiException {
        String url = null;
        String response = api.smsInboundPost(url);

        // TODO: test validations
    }
    
    /**
     * Mark inbound SMS as read
     *
     * Mark all inbound SMS as read optionally before a certain date
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void smsInboundReadPutTest() throws ApiException {
        String dateBefore = null;
        String response = api.smsInboundReadPut(dateBefore);

        // TODO: test validations
    }
    
    /**
     * Calculate sms price
     *
     * Calculate sms price
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void smsPricePostTest() throws ApiException {
        SmsMessageCollection smsMessages = null;
        String response = api.smsPricePost(smsMessages);

        // TODO: test validations
    }
    
    /**
     * Get a Specific Delivery Receipt
     *
     * Get a Specific Delivery Receipt
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void smsReceiptsByMessageIdGetTest() throws ApiException {
        String messageId = null;
        String response = api.smsReceiptsByMessageIdGet(messageId);

        // TODO: test validations
    }
    
    /**
     * Get all delivery receipts
     *
     * Get all delivery receipts
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void smsReceiptsGetTest() throws ApiException {
        Integer page = null;
        Integer limit = null;
        String response = api.smsReceiptsGet(page, limit);

        // TODO: test validations
    }
    
    /**
     * Add a delivery receipt
     *
     * Add a delivery receipt
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void smsReceiptsPostTest() throws ApiException {
        String url = null;
        String response = api.smsReceiptsPost(url);

        // TODO: test validations
    }
    
    /**
     * Mark delivery receipts as read
     *
     * Mark delivery receipts as read
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void smsReceiptsReadPutTest() throws ApiException {
        String dateBefore = null;
        String response = api.smsReceiptsReadPut(dateBefore);

        // TODO: test validations
    }
    
    /**
     * Send sms message(s)
     *
     *  # Send one or more SMS messages  You can post up to 1000 messages with each API call. You can send to a mix of contacts and contact lists, as long as the total number of recipients is up to 1000.  The response contains status and details for each recipient.  *Refer to [Application Status Codes](https://dashboard.clicksend.com/#/signup/step1/) for the possible response message status strings.* 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void smsSendPostTest() throws ApiException {
        SmsMessageCollection smsMessages = null;
        String response = api.smsSendPost(smsMessages);

        // TODO: test validations
    }
    
    /**
     * Delete sms template
     *
     * Delete sms template
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void smsTemplatesByTemplateIdDeleteTest() throws ApiException {
        Integer templateId = null;
        String response = api.smsTemplatesByTemplateIdDelete(templateId);

        // TODO: test validations
    }
    
    /**
     * Update sms template
     *
     * Update sms template
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void smsTemplatesByTemplateIdPutTest() throws ApiException {
        Integer templateId = null;
        SmsTemplate smsTemplate = null;
        String response = api.smsTemplatesByTemplateIdPut(templateId, smsTemplate);

        // TODO: test validations
    }
    
    /**
     * Get lists of all sms templates
     *
     * Get lists of all sms templates
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void smsTemplatesGetTest() throws ApiException {
        Integer page = null;
        Integer limit = null;
        String response = api.smsTemplatesGet(page, limit);

        // TODO: test validations
    }
    
    /**
     * Create sms template
     *
     * Create sms template
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void smsTemplatesPostTest() throws ApiException {
        SmsTemplate smsTemplate = null;
        String response = api.smsTemplatesPost(smsTemplate);

        // TODO: test validations
    }
    
}
