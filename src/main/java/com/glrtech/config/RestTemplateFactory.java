package com.glrtech.config;

import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

public class RestTemplateFactory {
	public static RestTemplate createWithTimeout() {
		HttpComponentsClientHttpRequestFactory factory = new HttpComponentsClientHttpRequestFactory();
		factory.setConnectTimeout(10000); // 10 segundos
		factory.setReadTimeout(5000);
		return new RestTemplate(factory);
	}
}
