package com.simple.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //������ ���� �� Ŭ����
public class HomeController {
	
	@RequestMapping("/test/aaa") //�ڵ鷯����
	public String home() {
		return "home";
	}
	
}
