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

import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for StatisticsApi
 */
@Ignore
public class StatisticsApiTest {

    private final StatisticsApi api = new StatisticsApi();

    
    /**
     * Get sms statistics
     *
     * Get sms statistics
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void statisticsSmsGetTest() throws Exception {
        String response = api.statisticsSmsGet();

        // TODO: test validations
    }
    
    /**
     * Get voice statistics
     *
     * Get voice statistics
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void statisticsVoiceGetTest() throws Exception {
        String response = api.statisticsVoiceGet();

        // TODO: test validations
    }
    
}
