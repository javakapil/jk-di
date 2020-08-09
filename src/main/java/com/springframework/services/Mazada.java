package com.springframework.services;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class Mazada implements Car{

	@Override
	public String getName() {
		return "Mazada";
	}

}
