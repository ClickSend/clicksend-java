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
import io.swagger.client.model.MmsCampaign;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MmsCampaignApi
 */
@Ignore
public class MmsCampaignApiTest {

    private final MmsCampaignApi api = new MmsCampaignApi();

    
    /**
     * Get specific mms campaign
     *
     * Get specific mms campaign
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void mmsCampaignByMmsCampaignIdGetTest() throws ApiException {
        Integer mmsCampaignId = null;
        String response = api.mmsCampaignByMmsCampaignIdGet(mmsCampaignId);

        // TODO: test validations
    }
    
    /**
     * Update mms campaign
     *
     * Update mms campaign
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void mmsCampaignsByMmsCampaignIdPutTest() throws ApiException {
        Integer mmsCampaignId = null;
        MmsCampaign campaign = null;
        String response = api.mmsCampaignsByMmsCampaignIdPut(mmsCampaignId, campaign);

        // TODO: test validations
    }
    
    /**
     * Cancel mms campaign
     *
     * Cancel sms campaign
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void mmsCampaignsCancelByMmsCampaignIdPutTest() throws ApiException {
        Integer mmsCampaignId = null;
        String response = api.mmsCampaignsCancelByMmsCampaignIdPut(mmsCampaignId);

        // TODO: test validations
    }
    
    /**
     * Get list of mms campaigns
     *
     * Get list of mms campaigns
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void mmsCampaignsGetTest() throws ApiException {
        Integer page = null;
        Integer limit = null;
        String response = api.mmsCampaignsGet(page, limit);

        // TODO: test validations
    }
    
    /**
     * Calculate price for mms campaign
     *
     * Calculate price for sms campaign
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void mmsCampaignsPricePostTest() throws ApiException {
        MmsCampaign campaign = null;
        String response = api.mmsCampaignsPricePost(campaign);

        // TODO: test validations
    }
    
    /**
     * Create mms campaign
     *
     * Create mms campaign
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void mmsCampaignsSendPostTest() throws ApiException {
        MmsCampaign campaign = null;
        String response = api.mmsCampaignsSendPost(campaign);

        // TODO: test validations
    }
    
}
