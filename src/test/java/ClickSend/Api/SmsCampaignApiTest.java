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
import ClickSend.Model.SmsCampaign;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SmsCampaignApi
 */
@Ignore
public class SmsCampaignApiTest {

    private final SmsCampaignApi api = new SmsCampaignApi();

    
    /**
     * Get specific sms campaign
     *
     * Get specific sms campaign
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void smsCampaignBySmsCampaignIdGetTest() throws ApiException {
        Integer smsCampaignId = null;
        String response = api.smsCampaignBySmsCampaignIdGet(smsCampaignId);

        // TODO: test validations
    }
    
    /**
     * Update sms campaign
     *
     * Update sms campaign
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void smsCampaignsBySmsCampaignIdPutTest() throws ApiException {
        Integer smsCampaignId = null;
        SmsCampaign campaign = null;
        String response = api.smsCampaignsBySmsCampaignIdPut(smsCampaignId, campaign);

        // TODO: test validations
    }
    
    /**
     * Cancel sms campaign
     *
     * Cancel sms campaign
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void smsCampaignsCancelBySmsCampaignIdPutTest() throws ApiException {
        Integer smsCampaignId = null;
        String response = api.smsCampaignsCancelBySmsCampaignIdPut(smsCampaignId);

        // TODO: test validations
    }
    
    /**
     * Get list of sms campaigns
     *
     * Get list of sms campaigns
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void smsCampaignsGetTest() throws ApiException {
        Integer page = null;
        Integer limit = null;
        String response = api.smsCampaignsGet(page, limit);

        // TODO: test validations
    }
    
    /**
     * Calculate price for sms campaign
     *
     * Calculate price for sms campaign
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void smsCampaignsPricePostTest() throws ApiException {
        SmsCampaign campaign = null;
        String response = api.smsCampaignsPricePost(campaign);

        // TODO: test validations
    }
    
    /**
     * Create sms campaign
     *
     * Create sms campaign
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void smsCampaignsSendPostTest() throws ApiException {
        SmsCampaign campaign = null;
        String response = api.smsCampaignsSendPost(campaign);

        // TODO: test validations
    }
    
}
