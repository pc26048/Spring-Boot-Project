package com.example.springbootproject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class TestController{
	@RequestMapping("/test1")
	public String firstHandler() {
		return "Hello Welcome!!!";
	}
}
