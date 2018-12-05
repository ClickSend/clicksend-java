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

import ClickSend.ApiCallback;
import ClickSend.ApiClient;
import ClickSend.ApiException;
import ClickSend.ApiResponse;
import ClickSend.Configuration;
import ClickSend.Pair;
import ClickSend.ProgressRequestBody;
import ClickSend.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import ClickSend.Model.DeliveryReceiptRule;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FaxDeliveryReceiptRulesApi {
    private ApiClient apiClient;

    public FaxDeliveryReceiptRulesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public FaxDeliveryReceiptRulesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for faxDeliveryReceiptAutomationDelete
     * @param receiptRuleId Receipt rule id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call faxDeliveryReceiptAutomationDeleteCall(Integer receiptRuleId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/automations/fax/receipts/{receipt_rule_id}"
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
    private com.squareup.okhttp.Call faxDeliveryReceiptAutomationDeleteValidateBeforeCall(Integer receiptRuleId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'receiptRuleId' is set
        if (receiptRuleId == null) {
            throw new ApiException("Missing the required parameter 'receiptRuleId' when calling faxDeliveryReceiptAutomationDelete(Async)");
        }
        

        com.squareup.okhttp.Call call = faxDeliveryReceiptAutomationDeleteCall(receiptRuleId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Delete fax delivery receipt automation
     * Delete fax delivery receipt automation
     * @param receiptRuleId Receipt rule id (required)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String faxDeliveryReceiptAutomationDelete(Integer receiptRuleId) throws ApiException {
        ApiResponse<String> resp = faxDeliveryReceiptAutomationDeleteWithHttpInfo(receiptRuleId);
        return resp.getData();
    }

    /**
     * Delete fax delivery receipt automation
     * Delete fax delivery receipt automation
     * @param receiptRuleId Receipt rule id (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> faxDeliveryReceiptAutomationDeleteWithHttpInfo(Integer receiptRuleId) throws ApiException {
        com.squareup.okhttp.Call call = faxDeliveryReceiptAutomationDeleteValidateBeforeCall(receiptRuleId, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Delete fax delivery receipt automation (asynchronously)
     * Delete fax delivery receipt automation
     * @param receiptRuleId Receipt rule id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call faxDeliveryReceiptAutomationDeleteAsync(Integer receiptRuleId, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = faxDeliveryReceiptAutomationDeleteValidateBeforeCall(receiptRuleId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for faxDeliveryReceiptAutomationGet
     * @param receiptRuleId Receipt rule id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call faxDeliveryReceiptAutomationGetCall(Integer receiptRuleId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/automations/fax/receipts/{receipt_rule_id}"
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
    private com.squareup.okhttp.Call faxDeliveryReceiptAutomationGetValidateBeforeCall(Integer receiptRuleId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'receiptRuleId' is set
        if (receiptRuleId == null) {
            throw new ApiException("Missing the required parameter 'receiptRuleId' when calling faxDeliveryReceiptAutomationGet(Async)");
        }
        

        com.squareup.okhttp.Call call = faxDeliveryReceiptAutomationGetCall(receiptRuleId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get specific fax delivery receipt automation
     * Get specific fax delivery receipt automation
     * @param receiptRuleId Receipt rule id (required)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String faxDeliveryReceiptAutomationGet(Integer receiptRuleId) throws ApiException {
        ApiResponse<String> resp = faxDeliveryReceiptAutomationGetWithHttpInfo(receiptRuleId);
        return resp.getData();
    }

    /**
     * Get specific fax delivery receipt automation
     * Get specific fax delivery receipt automation
     * @param receiptRuleId Receipt rule id (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> faxDeliveryReceiptAutomationGetWithHttpInfo(Integer receiptRuleId) throws ApiException {
        com.squareup.okhttp.Call call = faxDeliveryReceiptAutomationGetValidateBeforeCall(receiptRuleId, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get specific fax delivery receipt automation (asynchronously)
     * Get specific fax delivery receipt automation
     * @param receiptRuleId Receipt rule id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call faxDeliveryReceiptAutomationGetAsync(Integer receiptRuleId, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = faxDeliveryReceiptAutomationGetValidateBeforeCall(receiptRuleId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for faxDeliveryReceiptAutomationPost
     * @param deliveryReceiptRule fax delivery receipt rule model (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call faxDeliveryReceiptAutomationPostCall(DeliveryReceiptRule deliveryReceiptRule, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = deliveryReceiptRule;

        // create path and map variables
        String localVarPath = "/automations/fax/receipts";

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
    private com.squareup.okhttp.Call faxDeliveryReceiptAutomationPostValidateBeforeCall(DeliveryReceiptRule deliveryReceiptRule, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'deliveryReceiptRule' is set
        if (deliveryReceiptRule == null) {
            throw new ApiException("Missing the required parameter 'deliveryReceiptRule' when calling faxDeliveryReceiptAutomationPost(Async)");
        }
        

        com.squareup.okhttp.Call call = faxDeliveryReceiptAutomationPostCall(deliveryReceiptRule, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Create fax delivery receipt automations
     * Create fax delivery receipt automations
     * @param deliveryReceiptRule fax delivery receipt rule model (required)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String faxDeliveryReceiptAutomationPost(DeliveryReceiptRule deliveryReceiptRule) throws ApiException {
        ApiResponse<String> resp = faxDeliveryReceiptAutomationPostWithHttpInfo(deliveryReceiptRule);
        return resp.getData();
    }

    /**
     * Create fax delivery receipt automations
     * Create fax delivery receipt automations
     * @param deliveryReceiptRule fax delivery receipt rule model (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> faxDeliveryReceiptAutomationPostWithHttpInfo(DeliveryReceiptRule deliveryReceiptRule) throws ApiException {
        com.squareup.okhttp.Call call = faxDeliveryReceiptAutomationPostValidateBeforeCall(deliveryReceiptRule, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create fax delivery receipt automations (asynchronously)
     * Create fax delivery receipt automations
     * @param deliveryReceiptRule fax delivery receipt rule model (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call faxDeliveryReceiptAutomationPostAsync(DeliveryReceiptRule deliveryReceiptRule, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = faxDeliveryReceiptAutomationPostValidateBeforeCall(deliveryReceiptRule, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for faxDeliveryReceiptAutomationPut
     * @param receiptRuleId Receipt rule id (required)
     * @param deliveryReceiptRule Delivery receipt rule model (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call faxDeliveryReceiptAutomationPutCall(Integer receiptRuleId, DeliveryReceiptRule deliveryReceiptRule, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = deliveryReceiptRule;

        // create path and map variables
        String localVarPath = "/automations/fax/receipts/{receipt_rule_id}"
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
    private com.squareup.okhttp.Call faxDeliveryReceiptAutomationPutValidateBeforeCall(Integer receiptRuleId, DeliveryReceiptRule deliveryReceiptRule, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'receiptRuleId' is set
        if (receiptRuleId == null) {
            throw new ApiException("Missing the required parameter 'receiptRuleId' when calling faxDeliveryReceiptAutomationPut(Async)");
        }
        
        // verify the required parameter 'deliveryReceiptRule' is set
        if (deliveryReceiptRule == null) {
            throw new ApiException("Missing the required parameter 'deliveryReceiptRule' when calling faxDeliveryReceiptAutomationPut(Async)");
        }
        

        com.squareup.okhttp.Call call = faxDeliveryReceiptAutomationPutCall(receiptRuleId, deliveryReceiptRule, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Update fax delivery receipt automation
     * Update fax delivery receipt automation
     * @param receiptRuleId Receipt rule id (required)
     * @param deliveryReceiptRule Delivery receipt rule model (required)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String faxDeliveryReceiptAutomationPut(Integer receiptRuleId, DeliveryReceiptRule deliveryReceiptRule) throws ApiException {
        ApiResponse<String> resp = faxDeliveryReceiptAutomationPutWithHttpInfo(receiptRuleId, deliveryReceiptRule);
        return resp.getData();
    }

    /**
     * Update fax delivery receipt automation
     * Update fax delivery receipt automation
     * @param receiptRuleId Receipt rule id (required)
     * @param deliveryReceiptRule Delivery receipt rule model (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> faxDeliveryReceiptAutomationPutWithHttpInfo(Integer receiptRuleId, DeliveryReceiptRule deliveryReceiptRule) throws ApiException {
        com.squareup.okhttp.Call call = faxDeliveryReceiptAutomationPutValidateBeforeCall(receiptRuleId, deliveryReceiptRule, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update fax delivery receipt automation (asynchronously)
     * Update fax delivery receipt automation
     * @param receiptRuleId Receipt rule id (required)
     * @param deliveryReceiptRule Delivery receipt rule model (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call faxDeliveryReceiptAutomationPutAsync(Integer receiptRuleId, DeliveryReceiptRule deliveryReceiptRule, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = faxDeliveryReceiptAutomationPutValidateBeforeCall(receiptRuleId, deliveryReceiptRule, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for faxDeliveryReceiptAutomationsGet
     * @param q Your keyword or query. (optional)
     * @param page Page number (optional, default to 1)
     * @param limit Number of records per page (optional, default to 10)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call faxDeliveryReceiptAutomationsGetCall(String q, Integer page, Integer limit, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/automations/fax/receipts";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (q != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("q", q));
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
    private com.squareup.okhttp.Call faxDeliveryReceiptAutomationsGetValidateBeforeCall(String q, Integer page, Integer limit, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = faxDeliveryReceiptAutomationsGetCall(q, page, limit, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get all fax delivery receipt automations
     * Get all fax delivery receipt automations
     * @param q Your keyword or query. (optional)
     * @param page Page number (optional, default to 1)
     * @param limit Number of records per page (optional, default to 10)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String faxDeliveryReceiptAutomationsGet(String q, Integer page, Integer limit) throws ApiException {
        ApiResponse<String> resp = faxDeliveryReceiptAutomationsGetWithHttpInfo(q, page, limit);
        return resp.getData();
    }

    /**
     * Get all fax delivery receipt automations
     * Get all fax delivery receipt automations
     * @param q Your keyword or query. (optional)
     * @param page Page number (optional, default to 1)
     * @param limit Number of records per page (optional, default to 10)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> faxDeliveryReceiptAutomationsGetWithHttpInfo(String q, Integer page, Integer limit) throws ApiException {
        com.squareup.okhttp.Call call = faxDeliveryReceiptAutomationsGetValidateBeforeCall(q, page, limit, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get all fax delivery receipt automations (asynchronously)
     * Get all fax delivery receipt automations
     * @param q Your keyword or query. (optional)
     * @param page Page number (optional, default to 1)
     * @param limit Number of records per page (optional, default to 10)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call faxDeliveryReceiptAutomationsGetAsync(String q, Integer page, Integer limit, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = faxDeliveryReceiptAutomationsGetValidateBeforeCall(q, page, limit, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
