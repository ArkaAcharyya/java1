package com.springboot1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
public class Demo {
	
	@RequestMapping("/")
	public String show() {
		return "Hey Arka";
	}
}
