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
