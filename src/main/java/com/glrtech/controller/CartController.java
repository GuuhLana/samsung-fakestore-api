package com.glrtech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.glrtech.dto.CartDTO;
import com.glrtech.service.CartService;

@RestController
@RequestMapping("/api/carts")
@CrossOrigin(origins = "*")
public class CartController {

	@Autowired
	private CartService service;

	@GetMapping()
	public List<CartDTO> getCarts() {
		return service.getCarts();
	}
}
