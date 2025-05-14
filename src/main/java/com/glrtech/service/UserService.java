package com.glrtech.service;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.glrtech.config.RestTemplateFactory;
import com.glrtech.dto.UserDTO;

@Service
public class UserService {
	private static final Logger logger = LoggerFactory.getLogger(UserService.class);
	private static final String BASE_URL = "https://fakestoreapi.com";
	private final RestTemplate restTemplate = RestTemplateFactory.createWithTimeout();

	public List<UserDTO> getUsers() {
		try {
			UserDTO[] users = restTemplate.getForObject(BASE_URL + "/users", UserDTO[].class);
			return Arrays.asList(users);
		} catch (Exception e) {
			logger.error("Erro ao buscar os usuários da FakeStore", e);
			return Collections.emptyList();
		}
	}
}