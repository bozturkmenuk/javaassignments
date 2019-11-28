package com.fractal.client.services;

import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;
@Service
public interface AuthenticationService {
	/** 
     * Apply authentication settings to header and / or query parameters.
     * @param queryParams The query parameters for the request 
     * @param headerParams The header parameters for the request
     */
    public void validateAuth(String apiKey, String partnerId);
    public void applyToParams(MultiValueMap<String, String> queryParams, HttpHeaders headerParams);
    public String getApiKey();
    public String getPartnerId();
    public String getBearerToken();
}
