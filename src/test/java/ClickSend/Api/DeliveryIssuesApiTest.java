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

import ClickSend.Model.DeliveryIssue;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DeliveryIssuesApi
 */
@Ignore
public class DeliveryIssuesApiTest {

    private final DeliveryIssuesApi api = new DeliveryIssuesApi();

    
    /**
     * Get all delivery issues
     *
     * Get all delivery issues
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deliveryIssuesGetTest() throws Exception {
        Integer page = null;
        Integer limit = null;
        String response = api.deliveryIssuesGet(page, limit);

        // TODO: test validations
    }
    
    /**
     * Create delivery Issue
     *
     * Create delivery Issue
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deliveryIssuesPostTest() throws Exception {
        DeliveryIssue deliveryIssue = null;
        String response = api.deliveryIssuesPost(deliveryIssue);

        // TODO: test validations
    }
    
}
