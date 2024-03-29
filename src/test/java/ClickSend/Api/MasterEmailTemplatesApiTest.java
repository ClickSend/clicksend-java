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
 * API tests for MasterEmailTemplatesApi
 */
@Ignore
public class MasterEmailTemplatesApiTest {

    private final MasterEmailTemplatesApi api = new MasterEmailTemplatesApi();

    
    /**
     * Get all master email template categories
     *
     * Get all master email template categories
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void masterEmailTemplateCategoriesGetTest() throws Exception {
        Integer page = null;
        Integer limit = null;
        String response = api.masterEmailTemplateCategoriesGet(page, limit);

        // TODO: test validations
    }
    
    /**
     * Get specific master email template category
     *
     * Get specific master email template category
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void masterEmailTemplateCategoryGetTest() throws Exception {
        Integer categoryId = null;
        String response = api.masterEmailTemplateCategoryGet(categoryId);

        // TODO: test validations
    }
    
    /**
     * Get specific master email template
     *
     * Get specific master email template
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void masterEmailTemplateGetTest() throws Exception {
        Integer templateId = null;
        String response = api.masterEmailTemplateGet(templateId);

        // TODO: test validations
    }
    
    /**
     * Get all master email templates
     *
     * Get all master email templates
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void masterEmailTemplatesGetTest() throws Exception {
        Integer page = null;
        Integer limit = null;
        String response = api.masterEmailTemplatesGet(page, limit);

        // TODO: test validations
    }
    
    /**
     * Get all master email templates in a category
     *
     * Get all master email templates in a category
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void masterEmailTemplatesInCategoryGetTest() throws Exception {
        Integer categoryId = null;
        Integer page = null;
        Integer limit = null;
        String response = api.masterEmailTemplatesInCategoryGet(categoryId, page, limit);

        // TODO: test validations
    }
    
}
