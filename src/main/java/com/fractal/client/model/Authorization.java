package com.fractal.client.model;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
public class Authorization {

	private String apiKey;
	private String parnetId;
	private String bearerToken;
}
