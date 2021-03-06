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


import ClickSend.Model.SmsCampaign;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SmsCampaignApi {
    private ApiClient apiClient;

    public SmsCampaignApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SmsCampaignApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for smsCampaignBySmsCampaignIdGet
     * @param smsCampaignId ID of SMS campaign to retrieve (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call smsCampaignBySmsCampaignIdGetCall(Integer smsCampaignId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/sms-campaigns/{sms_campaign_id}"
            .replaceAll("\\{" + "sms_campaign_id" + "\\}", apiClient.escapeString(smsCampaignId.toString()));

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
    private com.squareup.okhttp.Call smsCampaignBySmsCampaignIdGetValidateBeforeCall(Integer smsCampaignId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'smsCampaignId' is set
        if (smsCampaignId == null) {
            throw new ApiException("Missing the required parameter 'smsCampaignId' when calling smsCampaignBySmsCampaignIdGet(Async)");
        }
        

        com.squareup.okhttp.Call call = smsCampaignBySmsCampaignIdGetCall(smsCampaignId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get specific sms campaign
     * Get specific sms campaign
     * @param smsCampaignId ID of SMS campaign to retrieve (required)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String smsCampaignBySmsCampaignIdGet(Integer smsCampaignId) throws ApiException {
        ApiResponse<String> resp = smsCampaignBySmsCampaignIdGetWithHttpInfo(smsCampaignId);
        return resp.getData();
    }

    /**
     * Get specific sms campaign
     * Get specific sms campaign
     * @param smsCampaignId ID of SMS campaign to retrieve (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> smsCampaignBySmsCampaignIdGetWithHttpInfo(Integer smsCampaignId) throws ApiException {
        com.squareup.okhttp.Call call = smsCampaignBySmsCampaignIdGetValidateBeforeCall(smsCampaignId, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get specific sms campaign (asynchronously)
     * Get specific sms campaign
     * @param smsCampaignId ID of SMS campaign to retrieve (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call smsCampaignBySmsCampaignIdGetAsync(Integer smsCampaignId, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = smsCampaignBySmsCampaignIdGetValidateBeforeCall(smsCampaignId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for smsCampaignsBySmsCampaignIdPut
     * @param smsCampaignId ID of SMS campaign to update (required)
     * @param campaign SmsCampaign model (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call smsCampaignsBySmsCampaignIdPutCall(Integer smsCampaignId, SmsCampaign campaign, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = campaign;

        // create path and map variables
        String localVarPath = "/sms-campaigns/{sms_campaign_id}"
            .replaceAll("\\{" + "sms_campaign_id" + "\\}", apiClient.escapeString(smsCampaignId.toString()));

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
    private com.squareup.okhttp.Call smsCampaignsBySmsCampaignIdPutValidateBeforeCall(Integer smsCampaignId, SmsCampaign campaign, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'smsCampaignId' is set
        if (smsCampaignId == null) {
            throw new ApiException("Missing the required parameter 'smsCampaignId' when calling smsCampaignsBySmsCampaignIdPut(Async)");
        }
        
        // verify the required parameter 'campaign' is set
        if (campaign == null) {
            throw new ApiException("Missing the required parameter 'campaign' when calling smsCampaignsBySmsCampaignIdPut(Async)");
        }
        

        com.squareup.okhttp.Call call = smsCampaignsBySmsCampaignIdPutCall(smsCampaignId, campaign, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Update sms campaign
     * Update sms campaign
     * @param smsCampaignId ID of SMS campaign to update (required)
     * @param campaign SmsCampaign model (required)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String smsCampaignsBySmsCampaignIdPut(Integer smsCampaignId, SmsCampaign campaign) throws ApiException {
        ApiResponse<String> resp = smsCampaignsBySmsCampaignIdPutWithHttpInfo(smsCampaignId, campaign);
        return resp.getData();
    }

    /**
     * Update sms campaign
     * Update sms campaign
     * @param smsCampaignId ID of SMS campaign to update (required)
     * @param campaign SmsCampaign model (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> smsCampaignsBySmsCampaignIdPutWithHttpInfo(Integer smsCampaignId, SmsCampaign campaign) throws ApiException {
        com.squareup.okhttp.Call call = smsCampaignsBySmsCampaignIdPutValidateBeforeCall(smsCampaignId, campaign, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update sms campaign (asynchronously)
     * Update sms campaign
     * @param smsCampaignId ID of SMS campaign to update (required)
     * @param campaign SmsCampaign model (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call smsCampaignsBySmsCampaignIdPutAsync(Integer smsCampaignId, SmsCampaign campaign, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = smsCampaignsBySmsCampaignIdPutValidateBeforeCall(smsCampaignId, campaign, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for smsCampaignsCancelBySmsCampaignIdPut
     * @param smsCampaignId ID of SMS Campaign to cancel (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call smsCampaignsCancelBySmsCampaignIdPutCall(Integer smsCampaignId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/sms-campaigns/{sms_campaign_id}/cancel"
            .replaceAll("\\{" + "sms_campaign_id" + "\\}", apiClient.escapeString(smsCampaignId.toString()));

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
    private com.squareup.okhttp.Call smsCampaignsCancelBySmsCampaignIdPutValidateBeforeCall(Integer smsCampaignId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'smsCampaignId' is set
        if (smsCampaignId == null) {
            throw new ApiException("Missing the required parameter 'smsCampaignId' when calling smsCampaignsCancelBySmsCampaignIdPut(Async)");
        }
        

        com.squareup.okhttp.Call call = smsCampaignsCancelBySmsCampaignIdPutCall(smsCampaignId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Cancel sms campaign
     * Cancel sms campaign
     * @param smsCampaignId ID of SMS Campaign to cancel (required)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String smsCampaignsCancelBySmsCampaignIdPut(Integer smsCampaignId) throws ApiException {
        ApiResponse<String> resp = smsCampaignsCancelBySmsCampaignIdPutWithHttpInfo(smsCampaignId);
        return resp.getData();
    }

    /**
     * Cancel sms campaign
     * Cancel sms campaign
     * @param smsCampaignId ID of SMS Campaign to cancel (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> smsCampaignsCancelBySmsCampaignIdPutWithHttpInfo(Integer smsCampaignId) throws ApiException {
        com.squareup.okhttp.Call call = smsCampaignsCancelBySmsCampaignIdPutValidateBeforeCall(smsCampaignId, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Cancel sms campaign (asynchronously)
     * Cancel sms campaign
     * @param smsCampaignId ID of SMS Campaign to cancel (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call smsCampaignsCancelBySmsCampaignIdPutAsync(Integer smsCampaignId, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = smsCampaignsCancelBySmsCampaignIdPutValidateBeforeCall(smsCampaignId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for smsCampaignsGet
     * @param page Page number (optional, default to 1)
     * @param limit Number of records per page (optional, default to 10)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call smsCampaignsGetCall(Integer page, Integer limit, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/sms-campaigns";

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
    private com.squareup.okhttp.Call smsCampaignsGetValidateBeforeCall(Integer page, Integer limit, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = smsCampaignsGetCall(page, limit, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get list of sms campaigns
     * Get list of sms campaigns
     * @param page Page number (optional, default to 1)
     * @param limit Number of records per page (optional, default to 10)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String smsCampaignsGet(Integer page, Integer limit) throws ApiException {
        ApiResponse<String> resp = smsCampaignsGetWithHttpInfo(page, limit);
        return resp.getData();
    }

    /**
     * Get list of sms campaigns
     * Get list of sms campaigns
     * @param page Page number (optional, default to 1)
     * @param limit Number of records per page (optional, default to 10)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> smsCampaignsGetWithHttpInfo(Integer page, Integer limit) throws ApiException {
        com.squareup.okhttp.Call call = smsCampaignsGetValidateBeforeCall(page, limit, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get list of sms campaigns (asynchronously)
     * Get list of sms campaigns
     * @param page Page number (optional, default to 1)
     * @param limit Number of records per page (optional, default to 10)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call smsCampaignsGetAsync(Integer page, Integer limit, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = smsCampaignsGetValidateBeforeCall(page, limit, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for smsCampaignsPricePost
     * @param campaign SmsCampaign model (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call smsCampaignsPricePostCall(SmsCampaign campaign, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = campaign;

        // create path and map variables
        String localVarPath = "/sms-campaigns/price";

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
    private com.squareup.okhttp.Call smsCampaignsPricePostValidateBeforeCall(SmsCampaign campaign, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'campaign' is set
        if (campaign == null) {
            throw new ApiException("Missing the required parameter 'campaign' when calling smsCampaignsPricePost(Async)");
        }
        

        com.squareup.okhttp.Call call = smsCampaignsPricePostCall(campaign, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Calculate price for sms campaign
     * Calculate price for sms campaign
     * @param campaign SmsCampaign model (required)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String smsCampaignsPricePost(SmsCampaign campaign) throws ApiException {
        ApiResponse<String> resp = smsCampaignsPricePostWithHttpInfo(campaign);
        return resp.getData();
    }

    /**
     * Calculate price for sms campaign
     * Calculate price for sms campaign
     * @param campaign SmsCampaign model (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> smsCampaignsPricePostWithHttpInfo(SmsCampaign campaign) throws ApiException {
        com.squareup.okhttp.Call call = smsCampaignsPricePostValidateBeforeCall(campaign, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Calculate price for sms campaign (asynchronously)
     * Calculate price for sms campaign
     * @param campaign SmsCampaign model (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call smsCampaignsPricePostAsync(SmsCampaign campaign, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = smsCampaignsPricePostValidateBeforeCall(campaign, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for smsCampaignsSendPost
     * @param campaign SmsCampaign model (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call smsCampaignsSendPostCall(SmsCampaign campaign, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = campaign;

        // create path and map variables
        String localVarPath = "/sms-campaigns/send";

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
    private com.squareup.okhttp.Call smsCampaignsSendPostValidateBeforeCall(SmsCampaign campaign, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'campaign' is set
        if (campaign == null) {
            throw new ApiException("Missing the required parameter 'campaign' when calling smsCampaignsSendPost(Async)");
        }
        

        com.squareup.okhttp.Call call = smsCampaignsSendPostCall(campaign, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Create sms campaign
     * Create sms campaign
     * @param campaign SmsCampaign model (required)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String smsCampaignsSendPost(SmsCampaign campaign) throws ApiException {
        ApiResponse<String> resp = smsCampaignsSendPostWithHttpInfo(campaign);
        return resp.getData();
    }

    /**
     * Create sms campaign
     * Create sms campaign
     * @param campaign SmsCampaign model (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> smsCampaignsSendPostWithHttpInfo(SmsCampaign campaign) throws ApiException {
        com.squareup.okhttp.Call call = smsCampaignsSendPostValidateBeforeCall(campaign, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create sms campaign (asynchronously)
     * Create sms campaign
     * @param campaign SmsCampaign model (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call smsCampaignsSendPostAsync(SmsCampaign campaign, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = smsCampaignsSendPostValidateBeforeCall(campaign, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
