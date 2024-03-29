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

import ClickSend.Model.Subaccount;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SubaccountApi
 */
@Ignore
public class SubaccountApiTest {

    private final SubaccountApi api = new SubaccountApi();

    
    /**
     * Delete a subaccount
     *
     * Delete a subaccount
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void subaccountsBySubaccountIdDeleteTest() throws Exception {
        Integer subaccountId = null;
        String response = api.subaccountsBySubaccountIdDelete(subaccountId);

        // TODO: test validations
    }
    
    /**
     * Get specific subaccount
     *
     * Get specific subaccount
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void subaccountsBySubaccountIdGetTest() throws Exception {
        Integer subaccountId = null;
        String response = api.subaccountsBySubaccountIdGet(subaccountId);

        // TODO: test validations
    }
    
    /**
     * Update subaccount
     *
     * Update subaccount
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void subaccountsBySubaccountIdPutTest() throws Exception {
        Integer subaccountId = null;
        Subaccount subaccount = null;
        String response = api.subaccountsBySubaccountIdPut(subaccountId, subaccount);

        // TODO: test validations
    }
    
    /**
     * Get all subaccounts
     *
     * Get all subaccounts
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void subaccountsGetTest() throws Exception {
        Integer page = null;
        Integer limit = null;
        String response = api.subaccountsGet(page, limit);

        // TODO: test validations
    }
    
    /**
     * Create new subaccount
     *
     * Create new subaccount
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void subaccountsPostTest() throws Exception {
        Subaccount subaccount = null;
        String response = api.subaccountsPost(subaccount);

        // TODO: test validations
    }
    
    /**
     * Regenerate an API Key
     *
     * Regenerate an API Key
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void subaccountsRegenApiKeyBySubaccountIdPutTest() throws Exception {
        Integer subaccountId = null;
        String response = api.subaccountsRegenApiKeyBySubaccountIdPut(subaccountId);

        // TODO: test validations
    }
    
}
