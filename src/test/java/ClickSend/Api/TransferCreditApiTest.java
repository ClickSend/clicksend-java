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
import ClickSend.Model.ResellerAccountTransferCredit;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TransferCreditApi
 */
@Ignore
public class TransferCreditApiTest {

    private final TransferCreditApi api = new TransferCreditApi();

    
    /**
     * Transfer Credit
     *
     * Transfer Credit
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void resellerTransferCreditPutTest() throws ApiException {
        ResellerAccountTransferCredit resellerAccountTransferCredit = null;
        String response = api.resellerTransferCreditPut(resellerAccountTransferCredit);

        // TODO: test validations
    }
    
}
