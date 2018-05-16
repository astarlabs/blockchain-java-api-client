/*
 * Bitcoin API
 * Blockchain Facilities
 *
 * OpenAPI spec version: 2.0.0
 * Contact: contato@astarlabs.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package br.com.astarlabs.client.api;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.reflect.TypeToken;

import br.com.astarlabs.client.ApiCallback;
import br.com.astarlabs.client.ApiClient;
import br.com.astarlabs.client.ApiException;
import br.com.astarlabs.client.ApiResponse;
import br.com.astarlabs.client.Configuration;
import br.com.astarlabs.client.Pair;
import br.com.astarlabs.client.ProgressRequestBody;
import br.com.astarlabs.client.ProgressResponseBody;
import br.com.astarlabs.client.model.Transaction;

public class SearchApi {
    private ApiClient apiClient;

    public SearchApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SearchApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for searchByAPIID */
    private com.squareup.okhttp.Call searchByAPIIDCall(String token, Integer account, String user, String password, Integer id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/search/registered/id".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (token != null)
        localVarFormParams.put("token", token);
        if (account != null)
        localVarFormParams.put("account", account);
        if (user != null)
        localVarFormParams.put("user", user);
        if (password != null)
        localVarFormParams.put("pass", password);
        if (id != null)
        localVarFormParams.put("id", id);

        final String[] localVarAccepts = {
        	"application/x-www-form-urlencoded"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
        	"application/x-www-form-urlencoded"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    private com.squareup.okhttp.Call searchByAPIIDValidateBeforeCall(String token, Integer account, String user, String password, Integer id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'token' is set
        if (token == null) {
            throw new ApiException("Missing the required parameter 'token' when calling searchByAPIID(Async)");
        }
        
        // verify the required parameter 'account' is set
        if (account == null) {
            throw new ApiException("Missing the required parameter 'account' when calling searchByAPIID(Async)");
        }
        
        // verify the required parameter 'user' is set
        if (user == null) {
            throw new ApiException("Missing the required parameter 'user' when calling searchByAPIID(Async)");
        }
        
        // verify the required parameter 'password' is set
        if (password == null) {
            throw new ApiException("Missing the required parameter 'password' when calling searchByAPIID(Async)");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling searchByAPIID(Async)");
        }
        
        
        com.squareup.okhttp.Call call = searchByAPIIDCall(token, account, user, password, id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get transaction informations by API ID
     * Get transaction informations by API ID 
     * @param token a signed JWT token with the company privatekey. (required)
     * @param account API ID for Account where the coins must be spend. (required)
     * @param user API user name. (required)
     * @param password API user password. (required)
     * @param id API id for blockchain transaction (required)
     * @return Transaction
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Transaction searchByAPIID(String token, Integer account, String user, String password, Integer id) throws ApiException {
        ApiResponse<Transaction> resp = searchByAPIIDWithHttpInfo(token, account, user, password, id);
        return resp.getData();
    }

    /**
     * Get transaction informations by API ID
     * Get transaction informations by API ID 
     * @param token a signed JWT token with the company privatekey. (required)
     * @param account API ID for Account where the coins must be spend. (required)
     * @param user API user name. (required)
     * @param password API user password. (required)
     * @param id API id for blockchain transaction (required)
     * @return ApiResponse&lt;Transaction&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Transaction> searchByAPIIDWithHttpInfo(String token, Integer account, String user, String password, Integer id) throws ApiException {
        com.squareup.okhttp.Call call = searchByAPIIDValidateBeforeCall(token, account, user, password, id, null, null);
        Type localVarReturnType = new TypeToken<Transaction>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get transaction informations by API ID (asynchronously)
     * Get transaction informations by API ID 
     * @param token a signed JWT token with the company privatekey. (required)
     * @param account API ID for Account where the coins must be spend. (required)
     * @param user API user name. (required)
     * @param password API user password. (required)
     * @param id API id for blockchain transaction (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call searchByAPIIDAsync(String token, Integer account, String user, String password, Integer id, final ApiCallback<Transaction> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = searchByAPIIDValidateBeforeCall(token, account, user, password, id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Transaction>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for searchByContent */
    private com.squareup.okhttp.Call searchByContentCall(String token, Integer account, String user, String password, String content, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/search/registered/content".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (token != null)
        localVarFormParams.put("token", token);
        if (account != null)
        localVarFormParams.put("account", account);
        if (user != null)
        localVarFormParams.put("user", user);
        if (password != null)
        localVarFormParams.put("pass", password);
        if (content != null)
        localVarFormParams.put("content", content);

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    

    private com.squareup.okhttp.Call searchByContentValidateBeforeCall(String token, Integer account, String user, String password, String content, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'token' is set
        if (token == null) {
            throw new ApiException("Missing the required parameter 'token' when calling searchByContent(Async)");
        }
        
        // verify the required parameter 'account' is set
        if (account == null) {
            throw new ApiException("Missing the required parameter 'account' when calling searchByContent(Async)");
        }
        
        // verify the required parameter 'user' is set
        if (user == null) {
            throw new ApiException("Missing the required parameter 'user' when calling searchByContent(Async)");
        }
        
        // verify the required parameter 'password' is set
        if (password == null) {
            throw new ApiException("Missing the required parameter 'password' when calling searchByContent(Async)");
        }
        
        // verify the required parameter 'content' is set
        if (content == null) {
            throw new ApiException("Missing the required parameter 'content' when calling searchByContent(Async)");
        }
        
        
        com.squareup.okhttp.Call call = searchByContentCall(token, account, user, password, content, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get transaction informations by file or string content
     * Get transaction informations by file or string content 
     * @param token a signed JWT token with the company privatekey. (required)
     * @param account API ID for Account where the coins must be spend. (required)
     * @param user API user name. (required)
     * @param password API user password. (required)
     * @param content file or string content. (required)
     * @return Transaction
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Transaction> searchByContent(String token, Integer account, String user, String password, String content) throws ApiException {
        ApiResponse<List<Transaction>> resp = searchByContentWithHttpInfo(token, account, user, password, content);
        return resp.getData();
    }

    /**
     * Get transaction informations by file or string content
     * Get transaction informations by file or string content 
     * @param token a signed JWT token with the company privatekey. (required)
     * @param account API ID for Account where the coins must be spend. (required)
     * @param user API user name. (required)
     * @param password API user password. (required)
     * @param content file or string content. (required)
     * @return ApiResponse&lt;Transaction&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Transaction>> searchByContentWithHttpInfo(String token, Integer account, String user, String password, String content) throws ApiException {
        com.squareup.okhttp.Call call = searchByContentValidateBeforeCall(token, account, user, password, content, null, null);
        Type localVarReturnType = new TypeToken<List<Transaction>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get transaction informations by file or string content (asynchronously)
     * Get transaction informations by file or string content 
     * @param token a signed JWT token with the company privatekey. (required)
     * @param account API ID for Account where the coins must be spend. (required)
     * @param user API user name. (required)
     * @param password API user password. (required)
     * @param content file or string content. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call searchByContentAsync(String token, Integer account, String user, String password, String content, final ApiCallback<Transaction> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = searchByContentValidateBeforeCall(token, account, user, password, content, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Transaction>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for searchByHash */
    private com.squareup.okhttp.Call searchByHashCall(String token, Integer account, String user, String password, String hash, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/search/registered/hash".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (token != null)
        localVarFormParams.put("token", token);
        if (account != null)
        localVarFormParams.put("account", account);
        if (user != null)
        localVarFormParams.put("user", user);
        if (password != null)
        localVarFormParams.put("pass", password);
        if (hash != null)
        localVarFormParams.put("hash", hash);

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    private com.squareup.okhttp.Call searchByHashValidateBeforeCall(String token, Integer account, String user, String password, String hash, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'token' is set
        if (token == null) {
            throw new ApiException("Missing the required parameter 'token' when calling searchByHash(Async)");
        }
        
        // verify the required parameter 'account' is set
        if (account == null) {
            throw new ApiException("Missing the required parameter 'account' when calling searchByHash(Async)");
        }
        
        // verify the required parameter 'user' is set
        if (user == null) {
            throw new ApiException("Missing the required parameter 'user' when calling searchByHash(Async)");
        }
        
        // verify the required parameter 'password' is set
        if (password == null) {
            throw new ApiException("Missing the required parameter 'password' when calling searchByHash(Async)");
        }
        
        // verify the required parameter 'hash' is set
        if (hash == null) {
            throw new ApiException("Missing the required parameter 'hash' when calling searchByHash(Async)");
        }
        
        
        com.squareup.okhttp.Call call = searchByHashCall(token, account, user, password, hash, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get transaction informations by file or string hash
     * Get transaction informations by file or string hash 
     * @param token a signed JWT token with the company privatekey. (required)
     * @param account API ID for Account where the coins must be spend. (required)
     * @param user API user name. (required)
     * @param password API user password. (required)
     * @param hash hash of content. (required)
     * @return Transaction
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Transaction> searchByHash(String token, Integer account, String user, String password, String hash) throws ApiException {
        ApiResponse<List<Transaction>> resp = searchByHashWithHttpInfo(token, account, user, password, hash);
        return resp.getData();
    }

    /**
     * Get transaction informations by file or string hash
     * Get transaction informations by file or string hash 
     * @param token a signed JWT token with the company privatekey. (required)
     * @param account API ID for Account where the coins must be spend. (required)
     * @param user API user name. (required)
     * @param password API user password. (required)
     * @param hash hash of content. (required)
     * @return ApiResponse&lt;Transaction&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Transaction>> searchByHashWithHttpInfo(String token, Integer account, String user, String password, String hash) throws ApiException {
        com.squareup.okhttp.Call call = searchByHashValidateBeforeCall(token, account, user, password, hash, null, null);
        Type localVarReturnType = new TypeToken<List<Transaction>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get transaction informations by file or string hash (asynchronously)
     * Get transaction informations by file or string hash 
     * @param token a signed JWT token with the company privatekey. (required)
     * @param account API ID for Account where the coins must be spend. (required)
     * @param user API user name. (required)
     * @param password API user password. (required)
     * @param hash hash of content. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call searchByHashAsync(String token, Integer account, String user, String password, String hash, final ApiCallback<Transaction> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = searchByHashValidateBeforeCall(token, account, user, password, hash, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Transaction>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
