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
import ClickSend.Model.Account;
import ClickSend.Model.AccountForgotPasswordVerify;
import ClickSend.Model.AccountVerify;
import ClickSend.Model.ForgotPassword;
import ClickSend.Model.ForgotUsername;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AccountApi
 */
@Ignore
public class AccountApiTest {

    private final AccountApi api = new AccountApi();

    
    /**
     * Get account information
     *
     * Get account details
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void accountGetTest() throws ApiException {
        String response = api.accountGet();

        // TODO: test validations
    }
    
    /**
     * Create a new account
     *
     * Create An Account
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void accountPostTest() throws ApiException {
        Account account = null;
        String response = api.accountPost(account);

        // TODO: test validations
    }
    
    /**
     * Send account activation token
     *
     * Send account activation token
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void accountVerifySendPutTest() throws ApiException {
        AccountVerify accountVerify = null;
        String response = api.accountVerifySendPut(accountVerify);

        // TODO: test validations
    }
    
    /**
     * Verify new account
     *
     * Verify new account
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void accountVerifyVerifyByActivationTokenPutTest() throws ApiException {
        Integer activationToken = null;
        String response = api.accountVerifyVerifyByActivationTokenPut(activationToken);

        // TODO: test validations
    }
    
    /**
     * Forgot password
     *
     * Forgot password
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void forgotPasswordPutTest() throws ApiException {
        ForgotPassword forgotPassword = null;
        String response = api.forgotPasswordPut(forgotPassword);

        // TODO: test validations
    }
    
    /**
     * Verify forgot password
     *
     * Verify forgot password
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void forgotPasswordVerifyPutTest() throws ApiException {
        AccountForgotPasswordVerify verifyPassword = null;
        String response = api.forgotPasswordVerifyPut(verifyPassword);

        // TODO: test validations
    }
    
    /**
     * Forgot username
     *
     * Forgot username
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void forgotUsernamePutTest() throws ApiException {
        ForgotUsername forgotUsername = null;
        String response = api.forgotUsernamePut(forgotUsername);

        // TODO: test validations
    }
    
}
