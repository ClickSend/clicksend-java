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
import ClickSend.Model.PostLetter;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PostLetterApi
 */
@Ignore
public class PostLetterApiTest {

    private final PostLetterApi api = new PostLetterApi();

    
    /**
     * export post letter history
     *
     * export post letter history
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postLettersExportGetTest() throws ApiException {
        String filename = null;
        String response = api.postLettersExportGet(filename);

        // TODO: test validations
    }
    
    /**
     * Get all post letter history
     *
     * Get all post letter history
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postLettersHistoryGetTest() throws ApiException {
        Integer page = null;
        Integer limit = null;
        String response = api.postLettersHistoryGet(page, limit);

        // TODO: test validations
    }
    
    /**
     * Calculate post letter price
     *
     * Calculate post letter price
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postLettersPricePostTest() throws ApiException {
        PostLetter postLetter = null;
        String response = api.postLettersPricePost(postLetter);

        // TODO: test validations
    }
    
    /**
     * Send post letter
     *
     * Send post letter
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postLettersSendPostTest() throws ApiException {
        PostLetter postLetter = null;
        String response = api.postLettersSendPost(postLetter);

        // TODO: test validations
    }
    
}
