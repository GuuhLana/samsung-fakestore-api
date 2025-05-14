package com.glrtech.service;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.glrtech.config.RestTemplateFactory;
import com.glrtech.dto.ProductDTO;

@Service
public class ProductService {
    private static final Logger logger = LoggerFactory.getLogger(ProductService.class);
    private static final String BASE_URL = "https://fakestoreapi.com";
    private final RestTemplate restTemplate = RestTemplateFactory.createWithTimeout();

    public List<ProductDTO> getProducts() {
        try {
            ProductDTO[] products = restTemplate.getForObject(BASE_URL + "/products", ProductDTO[].class);
            return Arrays.asList(products);
        } catch (Exception e) {
            logger.error("Erro ao buscar os produtos da FakeStore", e);
            return Collections.emptyList();
        }
    }
}
