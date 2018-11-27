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
import ClickSend.Model.Email;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TransactionalEmailApi
 */
@Ignore
public class TransactionalEmailApiTest {

    private final TransactionalEmailApi api = new TransactionalEmailApi();

    
    /**
     * Export all Transactional Email history
     *
     * Export all Transactional Email history
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void emailHistoryExportGetTest() throws ApiException {
        String filename = null;
        Integer dateFrom = null;
        Integer dateTo = null;
        String response = api.emailHistoryExportGet(filename, dateFrom, dateTo);

        // TODO: test validations
    }
    
    /**
     * Get all transactional email history
     *
     * Get all transactional email history
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void emailHistoryGetTest() throws ApiException {
        Integer dateFrom = null;
        Integer dateTo = null;
        Integer page = null;
        Integer limit = null;
        String response = api.emailHistoryGet(dateFrom, dateTo, page, limit);

        // TODO: test validations
    }
    
    /**
     * Get transactional email price
     *
     * Get transactional email price
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void emailPricePostTest() throws ApiException {
        Email email = null;
        String response = api.emailPricePost(email);

        // TODO: test validations
    }
    
    /**
     * Send transactional email
     *
     * Send transactional email
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void emailSendPostTest() throws ApiException {
        Email email = null;
        String response = api.emailSendPost(email);

        // TODO: test validations
    }
    
}
