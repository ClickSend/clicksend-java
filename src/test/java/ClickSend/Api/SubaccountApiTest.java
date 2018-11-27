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
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void subaccountsBySubaccountIdDeleteTest() throws ApiException {
        Integer subaccountId = null;
        String response = api.subaccountsBySubaccountIdDelete(subaccountId);

        // TODO: test validations
    }
    
    /**
     * Get specific subaccount
     *
     * Get specific subaccount
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void subaccountsBySubaccountIdGetTest() throws ApiException {
        Integer subaccountId = null;
        String response = api.subaccountsBySubaccountIdGet(subaccountId);

        // TODO: test validations
    }
    
    /**
     * Update subaccount
     *
     * Update subaccount
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void subaccountsBySubaccountIdPutTest() throws ApiException {
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
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void subaccountsGetTest() throws ApiException {
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
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void subaccountsPostTest() throws ApiException {
        Subaccount subaccount = null;
        String response = api.subaccountsPost(subaccount);

        // TODO: test validations
    }
    
    /**
     * Regenerate an API Key
     *
     * Regenerate an API Key
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void subaccountsRegenApiKeyBySubaccountIdPutTest() throws ApiException {
        Integer subaccountId = null;
        String response = api.subaccountsRegenApiKeyBySubaccountIdPut(subaccountId);

        // TODO: test validations
    }
    
}
