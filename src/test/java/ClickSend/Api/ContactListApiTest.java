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
import ClickSend.Model.ContactListImport;
import ClickSend.Model.Fields;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ContactListApi
 */
@Ignore
public class ContactListApiTest {

    private final ContactListApi api = new ContactListApi();

    
    /**
     * ListsByListIdDelete
     *
     * Delete a specific contact list
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listsByListIdDeleteTest() throws ApiException {
        Integer listId = null;
        String response = api.listsByListIdDelete(listId);

        // TODO: test validations
    }
    
    /**
     * Get specific contact list
     *
     * Get specific contact list
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listsByListIdGetTest() throws ApiException {
        Integer listId = null;
        String response = api.listsByListIdGet(listId);

        // TODO: test validations
    }
    
    /**
     * Update specific contact list
     *
     * Update specific contact list
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listsByListIdPutTest() throws ApiException {
        Integer listId = null;
        List list = null;
        String response = api.listsByListIdPut(listId, list);

        // TODO: test validations
    }
    
    /**
     * Get all contact lists
     *
     * Get all contact lists
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listsGetTest() throws ApiException {
        Integer page = null;
        Integer limit = null;
        String response = api.listsGet(page, limit);

        // TODO: test validations
    }
    
    /**
     * Import contacts to list
     *
     * Import contacts to list
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listsImportByListIdPostTest() throws ApiException {
        Integer listId = null;
        ContactListImport file = null;
        String response = api.listsImportByListIdPost(listId, file);

        // TODO: test validations
    }
    
    /**
     * Create new contact list
     *
     * Create new contact list
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listsPostTest() throws ApiException {
        List list = null;
        String response = api.listsPost(list);

        // TODO: test validations
    }
    
    /**
     * Remove duplicate contacts
     *
     * Remove duplicate contacts
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listsRemoveDuplicatesByListIdPutTest() throws ApiException {
        Integer listId = null;
        Fields fields = null;
        String response = api.listsRemoveDuplicatesByListIdPut(listId, fields);

        // TODO: test validations
    }
    
}
