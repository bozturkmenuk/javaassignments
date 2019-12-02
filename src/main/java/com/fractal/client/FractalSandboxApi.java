package com.fractal.client;

import com.fractal.client.model.TransactionsResponse;
import com.fractal.client.model.CategoriesPut;
import com.fractal.client.model.Categories;
import com.fractal.client.model.Companies;
import com.fractal.client.model.Company;
import com.fractal.client.model.CreateCompany;
import com.fractal.client.model.ErrorResponse;
import com.fractal.client.model.JWT;
import com.fractal.client.services.AuthenticationService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-11-25T13:59:04.199Z")
@Component("com.fractal.api.client.DefaultApi")
public class FractalSandboxApi {
	@Autowired
	private AuthenticationService authenticationService;
	
    private ApiClient apiClient;
    

    public FractalSandboxApi() {
        this(new ApiClient());
    }

    @Autowired
    public FractalSandboxApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * 
     * 
     * <p><b>200</b> - 200 response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    
    public Company getCompanyById(String xApiKey, String xPartnerId, String companyId, String authorization) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'xApiKey' is set
        if (xApiKey == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'xApiKey' when calling companyIdGet");
        }
        
        // verify the required parameter 'xPartnerId' is set
        if (xPartnerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'xPartnerId' when calling companyIdGet");
        }
        
        // verify the required parameter 'companyId' is set
        if (companyId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'companyId' when calling companyIdGet");
        }
        
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'authorization' when calling companyIdGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("companyId", companyId);
        String path = UriComponentsBuilder.fromPath("/{companyId}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        if (xApiKey != null)
        headerParams.add("X-Api-Key", apiClient.parameterToString(xApiKey));
        if (xPartnerId != null)
        headerParams.add("X-Partner-Id", apiClient.parameterToString(xPartnerId));
        if (authorization != null)
        headerParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json", "application/x-www-form-urlencoded"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key", "authorizer" };

        ParameterizedTypeReference<Company> returnType = new ParameterizedTypeReference<Company>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - 200 response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void OptionsCompanyId() throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/{companyId}").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.OPTIONS, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    
    public Categories rootGet(String xApiKey, String xPartnerId, String authorization) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'xApiKey' is set
        if (xApiKey == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'xApiKey' when calling rootGet");
        }
        
        // verify the required parameter 'xPartnerId' is set
        if (xPartnerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'xPartnerId' when calling rootGet");
        }
        
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'authorization' when calling rootGet");
        }
        
        String path = UriComponentsBuilder.fromPath("/").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        if (xApiKey != null)
        headerParams.add("X-Api-Key", apiClient.parameterToString(xApiKey));
        if (xPartnerId != null)
        headerParams.add("X-Partner-Id", apiClient.parameterToString(xPartnerId));
        if (authorization != null)
        headerParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json", "application/x-www-form-urlencoded"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key", "authorizer" };

        ParameterizedTypeReference<Categories> returnType = new ParameterizedTypeReference<Categories>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get companies
     * Get companies
     * <p><b>200</b> - 200 response
     * <p><b>400</b> - 400 response
     * @param xApiKey App API key
     * @param xPartnerId ID of partner requesting data
     * @param authorization Bearer auth token
     * @param pg Page number
     * @return Companies
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Companies getCompanies(Optional<Integer> pg) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/companies").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pg", pg));
        
        headerParams.add("X-Api-Key", apiClient.parameterToString(authenticationService.getApiKey()));
        headerParams.add("X-Partner-Id", apiClient.parameterToString(authenticationService.getPartnerId()));
        headerParams.add("Authorization", "Bearer " + apiClient.parameterToString(authenticationService.getBearerToken()));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json", "application/x-www-form-urlencoded"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key", "authorizer" };

        ParameterizedTypeReference<Companies> returnType = new ParameterizedTypeReference<Companies>() {};
        apiClient.setDebugging(true);
			return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
        
    }
    /**
     * 
     * 
     * <p><b>200</b> - 200 response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void options() throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.OPTIONS, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Create Company
     * Create Company
     * <p><b>201</b> - 201 response
     * <p><b>400</b> - 400 response
     * @param xApiKey App API key
     * @param authorization Bearer auth token
     * @param xPartnerId ID of partner requesting data
     * @param createCompany The createCompany parameter
     * @return Company
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Company companyPost(String xApiKey, String authorization, String xPartnerId, CreateCompany createCompany) throws RestClientException {
        Object postBody = createCompany;
        
        // verify the required parameter 'xApiKey' is set
        if (xApiKey == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'xApiKey' when calling rootPost");
        }
        
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'authorization' when calling rootPost");
        }
        
        // verify the required parameter 'xPartnerId' is set
        if (xPartnerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'xPartnerId' when calling rootPost");
        }
        
        // verify the required parameter 'createCompany' is set
        if (createCompany == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'createCompany' when calling rootPost");
        }
        
        String path = UriComponentsBuilder.fromPath("/").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        if (xApiKey != null)
        headerParams.add("X-Api-Key", apiClient.parameterToString(xApiKey));
        if (authorization != null)
        headerParams.add("Authorization", apiClient.parameterToString(authorization));
        if (xPartnerId != null)
        headerParams.add("X-Partner-Id", apiClient.parameterToString(xPartnerId));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json", "application/x-www-form-urlencoded"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key", "authorizer" };

        ParameterizedTypeReference<Company> returnType = new ParameterizedTypeReference<Company>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    
    public Categories getCategories() throws RestClientException {
    	Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/categories").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        headerParams.add("X-Api-Key", apiClient.parameterToString(authenticationService.getApiKey()));
        headerParams.add("X-Partner-Id", apiClient.parameterToString(authenticationService.getPartnerId()));
        headerParams.add("Authorization", "Bearer " + apiClient.parameterToString(authenticationService.getBearerToken()));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json", "application/x-www-form-urlencoded"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key", "authorizer" };

        ParameterizedTypeReference<Categories> returnType = new ParameterizedTypeReference<Categories>() {};
        apiClient.setDebugging(true);
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    
    public TransactionsResponse getBankTransactions(String bankId, String accountId, String companyId, String pg, String from, String to) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'bankId' is set
        if (bankId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'bankId' when calling bankIdAccountsAccountIdTransactionsGet");
        }

        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accountId' when calling bankIdAccountsAccountIdTransactionsGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("bankId", bankId);
        uriVariables.put("accountId", accountId);
        String path = UriComponentsBuilder.fromPath("banking/{bankId}/accounts/{accountId}/transactions").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "companyId", companyId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pg", pg));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "to", to));
        
        headerParams.add("X-Api-Key", apiClient.parameterToString(authenticationService.getApiKey()));
        headerParams.add("X-Partner-Id", apiClient.parameterToString(authenticationService.getPartnerId()));
        headerParams.add("Authorization", "Bearer " + apiClient.parameterToString(authenticationService.getBearerToken()));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json", "application/x-www-form-urlencoded"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key", "authorizer" };

        apiClient.setDebugging(true);
        ParameterizedTypeReference<TransactionsResponse> returnType = new ParameterizedTypeReference<TransactionsResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    
    public void updateTransactionCategory(CategoriesPut categoriesPut) throws RestClientException {
        Object postBody = categoriesPut;
        
        // verify the required parameter 'categoriesPut' is set
        if (categoriesPut == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'categoriesPut' when calling transactionsPut");
        }
        
        String path = UriComponentsBuilder.fromPath("/categories/transactions").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        headerParams.add("X-Api-Key", apiClient.parameterToString(authenticationService.getApiKey()));
        headerParams.add("X-Partner-Id", apiClient.parameterToString(authenticationService.getPartnerId()));
        headerParams.add("Authorization","Bearer " + apiClient.parameterToString(authenticationService.getBearerToken()));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json", "application/x-www-form-urlencoded"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key", "authorizer" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
