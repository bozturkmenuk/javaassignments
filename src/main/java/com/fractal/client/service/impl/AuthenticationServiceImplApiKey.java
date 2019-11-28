package com.fractal.client.service.impl;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestClientException;
import org.springframework.web.util.UriComponentsBuilder;

import com.fractal.client.ApiClient;
import com.fractal.client.model.JWT;
import com.fractal.client.services.AuthenticationService;

import lombok.Data;
@Data
@Component
@Scope("singleton")
public class AuthenticationServiceImplApiKey implements AuthenticationService {
    private final String location;
    private final String paramName;

    private String apiKey = "SGP2ktEFEs45LY9x5T1WU8hgPOxYQfqy1fgcptfE";
    private String partnerId = "5111acc7-c9b3-4d2a-9418-16e97b74b1e6";
    @Autowired
    private ApiClient apiClient;
    private String bearerToken;
    
    public AuthenticationServiceImplApiKey() {
    	this.location = "header";
    	this.paramName = "api-key";
    }
    
    public AuthenticationServiceImplApiKey(String location, String paramName) {
		this.location = location;
		this.paramName = paramName;
	}

    @Override
    public void applyToParams(MultiValueMap<String, String> queryParams, HttpHeaders headerParams) {
        if (apiKey == null) {
            return;
        }
        String value = apiKey;
        if (location.equals("query")) {
            queryParams.add(paramName, value);
        } else if (location.equals("header")) {
            headerParams.add(paramName, value);
       }
    }
    public void validateAuth(String apiKey,String partnerId) {
    	String token = this.JWTPost(apiKey, partnerId).getAccessToken();
    	System.out.println(token);
    	this.bearerToken = token;
    	
    }
    
    public JWT JWTPost(String xApiKey, String xPartnerId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'xApiKey' is set
        if (xApiKey == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'xApiKey' when calling rootPost");
        }
        
        // verify the required parameter 'xPartnerId' is set
        if (xPartnerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'xPartnerId' when calling rootPost");
        }
        
        String path = UriComponentsBuilder.fromPath("/token").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        if (xApiKey != null)
        headerParams.add("X-Api-Key", this.apiKey);
        if (xPartnerId != null)
        headerParams.add("X-Partner-Id", this.partnerId);

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json", "application/x-www-form-urlencoded"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key" };

        ParameterizedTypeReference<JWT> returnType = new ParameterizedTypeReference<JWT>() {};
       apiClient.setDebugging(true);
        return  apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

	


	
}
