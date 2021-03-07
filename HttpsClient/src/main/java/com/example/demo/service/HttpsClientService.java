package com.example.demo.service;

import org.springframework.web.client.RestTemplate;

public class HttpsClientService {

	public String getClientData() {
		final String uri = "https://localhost:8086/secured";
		RestTemplate restTemplate = new RestTemplate();
		String result = restTemplate.getForObject(uri, String.class);
		System.out.println("Result is " + result);
		return result;
	}
}
