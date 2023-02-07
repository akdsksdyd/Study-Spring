package com.jaewon.myweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

	//�� �������� ���ø��� �������� �ʰ� ����Ϸ��� Ÿ���� ������ ���� �߰�
	@RequestMapping("/login")
	public String login() {
		
		return "user/login";
	}
	
	@RequestMapping("/join")
	public String join() {
		
		return "user/join";
	}
	
}
