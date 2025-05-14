package com.glrtech.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.glrtech.dto.CartDTO;
import com.glrtech.dto.ProductDTO;
import com.glrtech.dto.UserDTO;

@Service
public class FakeStoreService {

	private final RestTemplate restTemplate = new RestTemplate();

	private static final String BASE_URL = "https://fakestoreapi.com";

	public List<UserDTO> getUsers() {
		UserDTO[] users = restTemplate.getForObject(BASE_URL + "/users", UserDTO[].class);
		return Arrays.asList(users);
	}

	public List<ProductDTO> getProducts() {
		ProductDTO[] products = restTemplate.getForObject(BASE_URL + "/products", ProductDTO[].class);
		return Arrays.asList(products);
	}

	public List<CartDTO> getCarts() {
		CartDTO[] carts = restTemplate.getForObject(BASE_URL + "/carts", CartDTO[].class);
		return Arrays.asList(carts);
	}
}
