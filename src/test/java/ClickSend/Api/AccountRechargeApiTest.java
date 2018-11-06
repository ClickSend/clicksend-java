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
import ClickSend.Model.CreditCard;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AccountRechargeApi
 */
@Ignore
public class AccountRechargeApiTest {

    private final AccountRechargeApi api = new AccountRechargeApi();

    
    /**
     * Get Credit Card info
     *
     * Get Credit Card info
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void rechargeCreditCardGetTest() throws ApiException {
        String response = api.rechargeCreditCardGet();

        // TODO: test validations
    }
    
    /**
     * Update credit card info
     *
     * Update credit card info
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void rechargeCreditCardPutTest() throws ApiException {
        CreditCard creditCard = null;
        String response = api.rechargeCreditCardPut(creditCard);

        // TODO: test validations
    }
    
    /**
     * Get list of all packages
     *
     * Get list of all packages
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void rechargePackagesGetTest() throws ApiException {
        String country = null;
        String response = api.rechargePackagesGet(country);

        // TODO: test validations
    }
    
    /**
     * Purchase a package
     *
     * Purchase a package
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void rechargePurchaseByPackageIdPutTest() throws ApiException {
        Integer packageId = null;
        String response = api.rechargePurchaseByPackageIdPut(packageId);

        // TODO: test validations
    }
    
    /**
     * Get specific Transaction
     *
     * Get specific Transaction
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void rechargeTransactionsByTransactionIdGetTest() throws ApiException {
        String transactionId = null;
        String response = api.rechargeTransactionsByTransactionIdGet(transactionId);

        // TODO: test validations
    }
    
    /**
     * Purchase a package
     *
     * Get all transactions
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void rechargeTransactionsGetTest() throws ApiException {
        Integer page = null;
        Integer limit = null;
        String response = api.rechargeTransactionsGet(page, limit);

        // TODO: test validations
    }
    
}
