package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.HttpsClientService;

@RestController
public class HttpsClientController {
	@RequestMapping(value = "/gethttps")
	public String  siteApiWithoutBfgId() {
		HttpsClientService clientService = new HttpsClientService();
		return clientService.getClientData();
	}
}
