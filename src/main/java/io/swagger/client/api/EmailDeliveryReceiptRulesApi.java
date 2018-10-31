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


package io.swagger.client.api;

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.swagger.client.model.DeliveryReceiptRule;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmailDeliveryReceiptRulesApi {
    private ApiClient apiClient;

    public EmailDeliveryReceiptRulesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public EmailDeliveryReceiptRulesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for emailDeliveryReceiptAutomationDelete
     * @param receiptRuleId Receipt rule id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call emailDeliveryReceiptAutomationDeleteCall(Integer receiptRuleId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/automations/email/receipts/{receipt_rule_id}"
            .replaceAll("\\{" + "receipt_rule_id" + "\\}", apiClient.escapeString(receiptRuleId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "BasicAuth" };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call emailDeliveryReceiptAutomationDeleteValidateBeforeCall(Integer receiptRuleId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'receiptRuleId' is set
        if (receiptRuleId == null) {
            throw new ApiException("Missing the required parameter 'receiptRuleId' when calling emailDeliveryReceiptAutomationDelete(Async)");
        }
        

        com.squareup.okhttp.Call call = emailDeliveryReceiptAutomationDeleteCall(receiptRuleId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Delete email delivery receipt automation
     * Delete email delivery receipt automation
     * @param receiptRuleId Receipt rule id (required)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String emailDeliveryReceiptAutomationDelete(Integer receiptRuleId) throws ApiException {
        ApiResponse<String> resp = emailDeliveryReceiptAutomationDeleteWithHttpInfo(receiptRuleId);
        return resp.getData();
    }

    /**
     * Delete email delivery receipt automation
     * Delete email delivery receipt automation
     * @param receiptRuleId Receipt rule id (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> emailDeliveryReceiptAutomationDeleteWithHttpInfo(Integer receiptRuleId) throws ApiException {
        com.squareup.okhttp.Call call = emailDeliveryReceiptAutomationDeleteValidateBeforeCall(receiptRuleId, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Delete email delivery receipt automation (asynchronously)
     * Delete email delivery receipt automation
     * @param receiptRuleId Receipt rule id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call emailDeliveryReceiptAutomationDeleteAsync(Integer receiptRuleId, final ApiCallback<String> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = emailDeliveryReceiptAutomationDeleteValidateBeforeCall(receiptRuleId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for emailDeliveryReceiptAutomationGet
     * @param receiptRuleId Receipt rule id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call emailDeliveryReceiptAutomationGetCall(Integer receiptRuleId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/automations/email/receipts/{receipt_rule_id}"
            .replaceAll("\\{" + "receipt_rule_id" + "\\}", apiClient.escapeString(receiptRuleId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "BasicAuth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call emailDeliveryReceiptAutomationGetValidateBeforeCall(Integer receiptRuleId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'receiptRuleId' is set
        if (receiptRuleId == null) {
            throw new ApiException("Missing the required parameter 'receiptRuleId' when calling emailDeliveryReceiptAutomationGet(Async)");
        }
        

        com.squareup.okhttp.Call call = emailDeliveryReceiptAutomationGetCall(receiptRuleId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get specific email delivery receipt automation
     * Get specific email delivery receipt automation
     * @param receiptRuleId Receipt rule id (required)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String emailDeliveryReceiptAutomationGet(Integer receiptRuleId) throws ApiException {
        ApiResponse<String> resp = emailDeliveryReceiptAutomationGetWithHttpInfo(receiptRuleId);
        return resp.getData();
    }

    /**
     * Get specific email delivery receipt automation
     * Get specific email delivery receipt automation
     * @param receiptRuleId Receipt rule id (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> emailDeliveryReceiptAutomationGetWithHttpInfo(Integer receiptRuleId) throws ApiException {
        com.squareup.okhttp.Call call = emailDeliveryReceiptAutomationGetValidateBeforeCall(receiptRuleId, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get specific email delivery receipt automation (asynchronously)
     * Get specific email delivery receipt automation
     * @param receiptRuleId Receipt rule id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call emailDeliveryReceiptAutomationGetAsync(Integer receiptRuleId, final ApiCallback<String> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = emailDeliveryReceiptAutomationGetValidateBeforeCall(receiptRuleId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for emailDeliveryReceiptAutomationPost
     * @param deliveryReceiptRule Email delivery receipt rule model (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call emailDeliveryReceiptAutomationPostCall(DeliveryReceiptRule deliveryReceiptRule, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = deliveryReceiptRule;

        // create path and map variables
        String localVarPath = "/automations/email/receipts";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "BasicAuth" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call emailDeliveryReceiptAutomationPostValidateBeforeCall(DeliveryReceiptRule deliveryReceiptRule, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'deliveryReceiptRule' is set
        if (deliveryReceiptRule == null) {
            throw new ApiException("Missing the required parameter 'deliveryReceiptRule' when calling emailDeliveryReceiptAutomationPost(Async)");
        }
        

        com.squareup.okhttp.Call call = emailDeliveryReceiptAutomationPostCall(deliveryReceiptRule, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Create email delivery receipt automations
     * Create email delivery receipt automations
     * @param deliveryReceiptRule Email delivery receipt rule model (required)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String emailDeliveryReceiptAutomationPost(DeliveryReceiptRule deliveryReceiptRule) throws ApiException {
        ApiResponse<String> resp = emailDeliveryReceiptAutomationPostWithHttpInfo(deliveryReceiptRule);
        return resp.getData();
    }

    /**
     * Create email delivery receipt automations
     * Create email delivery receipt automations
     * @param deliveryReceiptRule Email delivery receipt rule model (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> emailDeliveryReceiptAutomationPostWithHttpInfo(DeliveryReceiptRule deliveryReceiptRule) throws ApiException {
        com.squareup.okhttp.Call call = emailDeliveryReceiptAutomationPostValidateBeforeCall(deliveryReceiptRule, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create email delivery receipt automations (asynchronously)
     * Create email delivery receipt automations
     * @param deliveryReceiptRule Email delivery receipt rule model (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call emailDeliveryReceiptAutomationPostAsync(DeliveryReceiptRule deliveryReceiptRule, final ApiCallback<String> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = emailDeliveryReceiptAutomationPostValidateBeforeCall(deliveryReceiptRule, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for emailDeliveryReceiptAutomationPut
     * @param receiptRuleId Receipt rule id (required)
     * @param deliveryReceiptRule Delivery receipt rule model (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call emailDeliveryReceiptAutomationPutCall(Integer receiptRuleId, DeliveryReceiptRule deliveryReceiptRule, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = deliveryReceiptRule;

        // create path and map variables
        String localVarPath = "/automations/email/receipts/{receipt_rule_id}"
            .replaceAll("\\{" + "receipt_rule_id" + "\\}", apiClient.escapeString(receiptRuleId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "BasicAuth" };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call emailDeliveryReceiptAutomationPutValidateBeforeCall(Integer receiptRuleId, DeliveryReceiptRule deliveryReceiptRule, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'receiptRuleId' is set
        if (receiptRuleId == null) {
            throw new ApiException("Missing the required parameter 'receiptRuleId' when calling emailDeliveryReceiptAutomationPut(Async)");
        }
        
        // verify the required parameter 'deliveryReceiptRule' is set
        if (deliveryReceiptRule == null) {
            throw new ApiException("Missing the required parameter 'deliveryReceiptRule' when calling emailDeliveryReceiptAutomationPut(Async)");
        }
        

        com.squareup.okhttp.Call call = emailDeliveryReceiptAutomationPutCall(receiptRuleId, deliveryReceiptRule, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Update email delivery receipt automation
     * Update email delivery receipt automation
     * @param receiptRuleId Receipt rule id (required)
     * @param deliveryReceiptRule Delivery receipt rule model (required)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String emailDeliveryReceiptAutomationPut(Integer receiptRuleId, DeliveryReceiptRule deliveryReceiptRule) throws ApiException {
        ApiResponse<String> resp = emailDeliveryReceiptAutomationPutWithHttpInfo(receiptRuleId, deliveryReceiptRule);
        return resp.getData();
    }

    /**
     * Update email delivery receipt automation
     * Update email delivery receipt automation
     * @param receiptRuleId Receipt rule id (required)
     * @param deliveryReceiptRule Delivery receipt rule model (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> emailDeliveryReceiptAutomationPutWithHttpInfo(Integer receiptRuleId, DeliveryReceiptRule deliveryReceiptRule) throws ApiException {
        com.squareup.okhttp.Call call = emailDeliveryReceiptAutomationPutValidateBeforeCall(receiptRuleId, deliveryReceiptRule, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update email delivery receipt automation (asynchronously)
     * Update email delivery receipt automation
     * @param receiptRuleId Receipt rule id (required)
     * @param deliveryReceiptRule Delivery receipt rule model (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call emailDeliveryReceiptAutomationPutAsync(Integer receiptRuleId, DeliveryReceiptRule deliveryReceiptRule, final ApiCallback<String> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = emailDeliveryReceiptAutomationPutValidateBeforeCall(receiptRuleId, deliveryReceiptRule, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for emailDeliveryReceiptAutomationsGet
     * @param page Page number (optional, default to 1)
     * @param limit Number of records per page (optional, default to 10)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call emailDeliveryReceiptAutomationsGetCall(Integer page, Integer limit, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/automations/email/receipts";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (page != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("page", page));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "BasicAuth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call emailDeliveryReceiptAutomationsGetValidateBeforeCall(Integer page, Integer limit, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = emailDeliveryReceiptAutomationsGetCall(page, limit, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get all email delivery receipt automations
     * Get all email delivery receipt automations
     * @param page Page number (optional, default to 1)
     * @param limit Number of records per page (optional, default to 10)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String emailDeliveryReceiptAutomationsGet(Integer page, Integer limit) throws ApiException {
        ApiResponse<String> resp = emailDeliveryReceiptAutomationsGetWithHttpInfo(page, limit);
        return resp.getData();
    }

    /**
     * Get all email delivery receipt automations
     * Get all email delivery receipt automations
     * @param page Page number (optional, default to 1)
     * @param limit Number of records per page (optional, default to 10)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> emailDeliveryReceiptAutomationsGetWithHttpInfo(Integer page, Integer limit) throws ApiException {
        com.squareup.okhttp.Call call = emailDeliveryReceiptAutomationsGetValidateBeforeCall(page, limit, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get all email delivery receipt automations (asynchronously)
     * Get all email delivery receipt automations
     * @param page Page number (optional, default to 1)
     * @param limit Number of records per page (optional, default to 10)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call emailDeliveryReceiptAutomationsGetAsync(Integer page, Integer limit, final ApiCallback<String> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = emailDeliveryReceiptAutomationsGetValidateBeforeCall(page, limit, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
