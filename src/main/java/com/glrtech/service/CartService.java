package com.glrtech.service;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.glrtech.config.RestTemplateFactory;
import com.glrtech.dto.CartDTO;

@Service
public class CartService {
    private static final Logger logger = LoggerFactory.getLogger(CartService.class);
    private static final String BASE_URL = "https://fakestoreapi.com";
    private final RestTemplate restTemplate = RestTemplateFactory.createWithTimeout();

    public List<CartDTO> getCarts() {
        try {
            CartDTO[] carts = restTemplate.getForObject(BASE_URL + "/carts", CartDTO[].class);
            return Arrays.asList(carts);
        } catch (Exception e) {
            logger.error("Erro ao buscar os carts da FakeStore", e);
            return Collections.emptyList();
        }
    }
}
