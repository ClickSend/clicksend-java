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

import ClickSend.Model.EmailSMSAddress;
import ClickSend.Model.StrippedString;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EmailToSmsApi
 */
@Ignore
public class EmailToSmsApiTest {

    private final EmailToSmsApi api = new EmailToSmsApi();

    
    /**
     * Get list of email to sms allowed addresses
     *
     * Get list of email to sms allowed addresses
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void smsEmailSmsGetTest() throws Exception {
        Integer page = null;
        Integer limit = null;
        String response = api.smsEmailSmsGet(page, limit);

        // TODO: test validations
    }
    
    /**
     * Create email to sms allowed address
     *
     * Create email to sms allowed address
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void smsEmailSmsPostTest() throws Exception {
        EmailSMSAddress emailSmsAddress = null;
        String response = api.smsEmailSmsPost(emailSmsAddress);

        // TODO: test validations
    }
    
    /**
     * Delete email to sms stripped string rule
     *
     * Delete email to sms stripped string rule
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void smsEmailSmsStrippedStringDeleteTest() throws Exception {
        Integer ruleId = null;
        String response = api.smsEmailSmsStrippedStringDelete(ruleId);

        // TODO: test validations
    }
    
    /**
     * Get email to sms stripped string rule
     *
     * Get email to sms stripped string rule
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void smsEmailSmsStrippedStringGetTest() throws Exception {
        Integer ruleId = null;
        String response = api.smsEmailSmsStrippedStringGet(ruleId);

        // TODO: test validations
    }
    
    /**
     * Create email to sms stripped string rule
     *
     * Create email to sms stripped string rules
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void smsEmailSmsStrippedStringPostTest() throws Exception {
        StrippedString strippedString = null;
        String response = api.smsEmailSmsStrippedStringPost(strippedString);

        // TODO: test validations
    }
    
    /**
     * Update email to sms stripped string rule
     *
     * Update email to sms stripped string rule
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void smsEmailSmsStrippedStringPutTest() throws Exception {
        StrippedString strippedString = null;
        Integer ruleId = null;
        String response = api.smsEmailSmsStrippedStringPut(strippedString, ruleId);

        // TODO: test validations
    }
    
    /**
     * Get list of email to sms stripped string rules
     *
     * Get list of email to sms stripped string rules
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void smsEmailSmsStrippedStringsGetTest() throws Exception {
        Integer page = null;
        Integer limit = null;
        String response = api.smsEmailSmsStrippedStringsGet(page, limit);

        // TODO: test validations
    }
    
}
