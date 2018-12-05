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

public class SmsDeliveryReceiptRulesApi {
    private ApiClient apiClient;

    public SmsDeliveryReceiptRulesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SmsDeliveryReceiptRulesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for smsDeliveryReceiptAutomationDelete
     * @param receiptRuleId Receipt rule id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call smsDeliveryReceiptAutomationDeleteCall(Integer receiptRuleId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/automations/sms/receipts/{receipt_rule_id}"
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
    private com.squareup.okhttp.Call smsDeliveryReceiptAutomationDeleteValidateBeforeCall(Integer receiptRuleId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'receiptRuleId' is set
        if (receiptRuleId == null) {
            throw new ApiException("Missing the required parameter 'receiptRuleId' when calling smsDeliveryReceiptAutomationDelete(Async)");
        }
        

        com.squareup.okhttp.Call call = smsDeliveryReceiptAutomationDeleteCall(receiptRuleId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Delete sms delivery receipt automation
     * Delete sms delivery receipt automation
     * @param receiptRuleId Receipt rule id (required)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String smsDeliveryReceiptAutomationDelete(Integer receiptRuleId) throws ApiException {
        ApiResponse<String> resp = smsDeliveryReceiptAutomationDeleteWithHttpInfo(receiptRuleId);
        return resp.getData();
    }

    /**
     * Delete sms delivery receipt automation
     * Delete sms delivery receipt automation
     * @param receiptRuleId Receipt rule id (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> smsDeliveryReceiptAutomationDeleteWithHttpInfo(Integer receiptRuleId) throws ApiException {
        com.squareup.okhttp.Call call = smsDeliveryReceiptAutomationDeleteValidateBeforeCall(receiptRuleId, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Delete sms delivery receipt automation (asynchronously)
     * Delete sms delivery receipt automation
     * @param receiptRuleId Receipt rule id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call smsDeliveryReceiptAutomationDeleteAsync(Integer receiptRuleId, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = smsDeliveryReceiptAutomationDeleteValidateBeforeCall(receiptRuleId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for smsDeliveryReceiptAutomationGet
     * @param receiptRuleId Receipt rule id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call smsDeliveryReceiptAutomationGetCall(Integer receiptRuleId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/automations/sms/receipts/{receipt_rule_id}"
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
    private com.squareup.okhttp.Call smsDeliveryReceiptAutomationGetValidateBeforeCall(Integer receiptRuleId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'receiptRuleId' is set
        if (receiptRuleId == null) {
            throw new ApiException("Missing the required parameter 'receiptRuleId' when calling smsDeliveryReceiptAutomationGet(Async)");
        }
        

        com.squareup.okhttp.Call call = smsDeliveryReceiptAutomationGetCall(receiptRuleId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get specific sms delivery receipt automation
     * Get specific sms delivery receipt automation
     * @param receiptRuleId Receipt rule id (required)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String smsDeliveryReceiptAutomationGet(Integer receiptRuleId) throws ApiException {
        ApiResponse<String> resp = smsDeliveryReceiptAutomationGetWithHttpInfo(receiptRuleId);
        return resp.getData();
    }

    /**
     * Get specific sms delivery receipt automation
     * Get specific sms delivery receipt automation
     * @param receiptRuleId Receipt rule id (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> smsDeliveryReceiptAutomationGetWithHttpInfo(Integer receiptRuleId) throws ApiException {
        com.squareup.okhttp.Call call = smsDeliveryReceiptAutomationGetValidateBeforeCall(receiptRuleId, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get specific sms delivery receipt automation (asynchronously)
     * Get specific sms delivery receipt automation
     * @param receiptRuleId Receipt rule id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call smsDeliveryReceiptAutomationGetAsync(Integer receiptRuleId, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = smsDeliveryReceiptAutomationGetValidateBeforeCall(receiptRuleId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for smsDeliveryReceiptAutomationPost
     * @param deliveryReceiptRule sms delivery receipt rule model (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call smsDeliveryReceiptAutomationPostCall(DeliveryReceiptRule deliveryReceiptRule, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = deliveryReceiptRule;

        // create path and map variables
        String localVarPath = "/automations/sms/receipts";

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
    private com.squareup.okhttp.Call smsDeliveryReceiptAutomationPostValidateBeforeCall(DeliveryReceiptRule deliveryReceiptRule, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'deliveryReceiptRule' is set
        if (deliveryReceiptRule == null) {
            throw new ApiException("Missing the required parameter 'deliveryReceiptRule' when calling smsDeliveryReceiptAutomationPost(Async)");
        }
        

        com.squareup.okhttp.Call call = smsDeliveryReceiptAutomationPostCall(deliveryReceiptRule, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Create sms delivery receipt automations
     * Create sms delivery receipt automations
     * @param deliveryReceiptRule sms delivery receipt rule model (required)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String smsDeliveryReceiptAutomationPost(DeliveryReceiptRule deliveryReceiptRule) throws ApiException {
        ApiResponse<String> resp = smsDeliveryReceiptAutomationPostWithHttpInfo(deliveryReceiptRule);
        return resp.getData();
    }

    /**
     * Create sms delivery receipt automations
     * Create sms delivery receipt automations
     * @param deliveryReceiptRule sms delivery receipt rule model (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> smsDeliveryReceiptAutomationPostWithHttpInfo(DeliveryReceiptRule deliveryReceiptRule) throws ApiException {
        com.squareup.okhttp.Call call = smsDeliveryReceiptAutomationPostValidateBeforeCall(deliveryReceiptRule, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create sms delivery receipt automations (asynchronously)
     * Create sms delivery receipt automations
     * @param deliveryReceiptRule sms delivery receipt rule model (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call smsDeliveryReceiptAutomationPostAsync(DeliveryReceiptRule deliveryReceiptRule, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = smsDeliveryReceiptAutomationPostValidateBeforeCall(deliveryReceiptRule, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for smsDeliveryReceiptAutomationPut
     * @param receiptRuleId Receipt rule id (required)
     * @param deliveryReceiptRule Delivery receipt rule model (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call smsDeliveryReceiptAutomationPutCall(Integer receiptRuleId, DeliveryReceiptRule deliveryReceiptRule, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = deliveryReceiptRule;

        // create path and map variables
        String localVarPath = "/automations/sms/receipts/{receipt_rule_id}"
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
    private com.squareup.okhttp.Call smsDeliveryReceiptAutomationPutValidateBeforeCall(Integer receiptRuleId, DeliveryReceiptRule deliveryReceiptRule, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'receiptRuleId' is set
        if (receiptRuleId == null) {
            throw new ApiException("Missing the required parameter 'receiptRuleId' when calling smsDeliveryReceiptAutomationPut(Async)");
        }
        
        // verify the required parameter 'deliveryReceiptRule' is set
        if (deliveryReceiptRule == null) {
            throw new ApiException("Missing the required parameter 'deliveryReceiptRule' when calling smsDeliveryReceiptAutomationPut(Async)");
        }
        

        com.squareup.okhttp.Call call = smsDeliveryReceiptAutomationPutCall(receiptRuleId, deliveryReceiptRule, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Update sms delivery receipt automation
     * Update sms delivery receipt automation
     * @param receiptRuleId Receipt rule id (required)
     * @param deliveryReceiptRule Delivery receipt rule model (required)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String smsDeliveryReceiptAutomationPut(Integer receiptRuleId, DeliveryReceiptRule deliveryReceiptRule) throws ApiException {
        ApiResponse<String> resp = smsDeliveryReceiptAutomationPutWithHttpInfo(receiptRuleId, deliveryReceiptRule);
        return resp.getData();
    }

    /**
     * Update sms delivery receipt automation
     * Update sms delivery receipt automation
     * @param receiptRuleId Receipt rule id (required)
     * @param deliveryReceiptRule Delivery receipt rule model (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> smsDeliveryReceiptAutomationPutWithHttpInfo(Integer receiptRuleId, DeliveryReceiptRule deliveryReceiptRule) throws ApiException {
        com.squareup.okhttp.Call call = smsDeliveryReceiptAutomationPutValidateBeforeCall(receiptRuleId, deliveryReceiptRule, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update sms delivery receipt automation (asynchronously)
     * Update sms delivery receipt automation
     * @param receiptRuleId Receipt rule id (required)
     * @param deliveryReceiptRule Delivery receipt rule model (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call smsDeliveryReceiptAutomationPutAsync(Integer receiptRuleId, DeliveryReceiptRule deliveryReceiptRule, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = smsDeliveryReceiptAutomationPutValidateBeforeCall(receiptRuleId, deliveryReceiptRule, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for smsDeliveryReceiptAutomationsGet
     * @param q Your keyword or query. (optional)
     * @param page Page number (optional, default to 1)
     * @param limit Number of records per page (optional, default to 10)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call smsDeliveryReceiptAutomationsGetCall(String q, Integer page, Integer limit, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/automations/sms/receipts";

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
    private com.squareup.okhttp.Call smsDeliveryReceiptAutomationsGetValidateBeforeCall(String q, Integer page, Integer limit, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = smsDeliveryReceiptAutomationsGetCall(q, page, limit, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get all sms delivery receipt automations
     * Get all sms delivery receipt automations
     * @param q Your keyword or query. (optional)
     * @param page Page number (optional, default to 1)
     * @param limit Number of records per page (optional, default to 10)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String smsDeliveryReceiptAutomationsGet(String q, Integer page, Integer limit) throws ApiException {
        ApiResponse<String> resp = smsDeliveryReceiptAutomationsGetWithHttpInfo(q, page, limit);
        return resp.getData();
    }

    /**
     * Get all sms delivery receipt automations
     * Get all sms delivery receipt automations
     * @param q Your keyword or query. (optional)
     * @param page Page number (optional, default to 1)
     * @param limit Number of records per page (optional, default to 10)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> smsDeliveryReceiptAutomationsGetWithHttpInfo(String q, Integer page, Integer limit) throws ApiException {
        com.squareup.okhttp.Call call = smsDeliveryReceiptAutomationsGetValidateBeforeCall(q, page, limit, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get all sms delivery receipt automations (asynchronously)
     * Get all sms delivery receipt automations
     * @param q Your keyword or query. (optional)
     * @param page Page number (optional, default to 1)
     * @param limit Number of records per page (optional, default to 10)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call smsDeliveryReceiptAutomationsGetAsync(String q, Integer page, Integer limit, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = smsDeliveryReceiptAutomationsGetValidateBeforeCall(q, page, limit, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
