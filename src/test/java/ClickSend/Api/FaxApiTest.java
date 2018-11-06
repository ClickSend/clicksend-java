/*
 * ClickSend v3 REST API
 *  This is the official [ClickSend](https://clicksend.com) SDK.  *You'll need to create a free account to use the API. You can register [here](https://www.clicksend.com/signup).*  You can use our API documentation along with the SDK. Our API docs can be found [here](https://developers.clicksend.com). 
 *
 * OpenAPI spec version: 3.1.0
 * Contact: support@clicksend.com
 *
 * NOTE: This class is auto generated by the clicksend code generator program.
 * https://github.com/clicksend-api/clicksend-codegen.git
 * Do not edit the class manually.
 */


package ClickSend.Api;

import ClickSend.ApiException;
import ClickSend.Model.FaxMessageCollection;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FaxApi
 */
@Ignore
public class FaxApiTest {

    private final FaxApi api = new FaxApi();

    
    /**
     * Get a list of Fax History.
     *
     * Get a list of Fax History.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void faxHistoryGetTest() throws ApiException {
        Integer dateFrom = null;
        Integer dateTo = null;
        String q = null;
        String order = null;
        Integer page = null;
        Integer limit = null;
        String response = api.faxHistoryGet(dateFrom, dateTo, q, order, page, limit);

        // TODO: test validations
    }
    
    /**
     * Calculate Total Price for Fax Messages sent
     *
     * Calculate Total Price for Fax Messages sent
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void faxPricePostTest() throws ApiException {
        FaxMessageCollection faxMessage = null;
        String response = api.faxPricePost(faxMessage);

        // TODO: test validations
    }
    
    /**
     * Get a single fax receipt based on message id.
     *
     * Get a single fax receipt based on message id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void faxReceiptsByMessageIdGetTest() throws ApiException {
        String messageId = null;
        String response = api.faxReceiptsByMessageIdGet(messageId);

        // TODO: test validations
    }
    
    /**
     * Get List of Fax Receipts
     *
     * Get List of Fax Receipts
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void faxReceiptsGetTest() throws ApiException {
        String response = api.faxReceiptsGet();

        // TODO: test validations
    }
    
    /**
     * Send a fax using supplied supported file-types.
     *
     * Send a fax using supplied supported file-types.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void faxSendPostTest() throws ApiException {
        FaxMessageCollection faxMessage = null;
        String response = api.faxSendPost(faxMessage);

        // TODO: test validations
    }
    
}
