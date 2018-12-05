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
import ClickSend.Model.VoiceMessageCollection;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for VoiceApi
 */
@Ignore
public class VoiceApiTest {

    private final VoiceApi api = new VoiceApi();

    
    /**
     * Update all voice messages as cancelled
     *
     * Update all voice messages as cancelled
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void voiceCancelAllPutTest() throws ApiException {
        String response = api.voiceCancelAllPut();

        // TODO: test validations
    }
    
    /**
     * Update voice message status as cancelled
     *
     * Update voice message status as cancelled
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void voiceCancelByMessageIdPutTest() throws ApiException {
        String messageId = null;
        String response = api.voiceCancelByMessageIdPut(messageId);

        // TODO: test validations
    }
    
    /**
     * Export voice history
     *
     * Export voice history
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void voiceHistoryExportGetTest() throws ApiException {
        String filename = null;
        String response = api.voiceHistoryExportGet(filename);

        // TODO: test validations
    }
    
    /**
     * Get all voice history
     *
     * Get all voice history
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void voiceHistoryGetTest() throws ApiException {
        Integer dateFrom = null;
        Integer dateTo = null;
        Integer page = null;
        Integer limit = null;
        String response = api.voiceHistoryGet(dateFrom, dateTo, page, limit);

        // TODO: test validations
    }
    
    /**
     * Get all voice languages
     *
     * Get all voice languages
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void voiceLangGetTest() throws ApiException {
        String response = api.voiceLangGet();

        // TODO: test validations
    }
    
    /**
     * Calculate voice price
     *
     * Calculate voice price
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void voicePricePostTest() throws ApiException {
        VoiceMessageCollection voiceMessages = null;
        String response = api.voicePricePost(voiceMessages);

        // TODO: test validations
    }
    
    /**
     * Get all voice receipts
     *
     * Get all voice receipts
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void voiceReceiptsGetTest() throws ApiException {
        String q = null;
        Integer page = null;
        Integer limit = null;
        String response = api.voiceReceiptsGet(q, page, limit);

        // TODO: test validations
    }
    
    /**
     * Send voice message(s)
     *
     * Send a voice call
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void voiceSendPostTest() throws ApiException {
        VoiceMessageCollection voiceMessages = null;
        String response = api.voiceSendPost(voiceMessages);

        // TODO: test validations
    }
    
}
