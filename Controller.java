package com.restapi.main.Controller;

import java.security.Provider.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.main.OrderDTO;
import com.restapi.main.OrderEntity;
import com.restapi.main.Service.ServiceLayer;

@RestController
public class Controller {
	@Autowired
	ServiceLayer service;

	@PostMapping(path = "/create")
	public String createUser(@RequestBody OrderDTO order) {
		System.out.println(order);
		String result = service.create(order);
		return result;
	}

	@GetMapping("/load")
	public List<OrderEntity> load() {
		System.out.println(service.load());
		return service.load();

	}

}
