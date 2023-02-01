package com.simple.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/response")
public class ResponseController {

	@RequestMapping("/ex01")
	public String ex01() {
		
		return "/response/ex01";
	}
	
	//result01 ��û
	@RequestMapping("/result01")
	public String result01(Model model) {
		
		model.addAttribute("data", "ȫ�浿"); //Ű, ��
		model.addAttribute("serverTime", new Date());
		
		return "/response/result01";
	}
	
	//result02 ��û - ModelAndView��ü
	@RequestMapping("/result02")
	public ModelAndView result02() {
		
		//���� ����, data������ �Բ� ���� �� �� �ִ� ��ü
		ModelAndView mv = new ModelAndView();
		mv.addObject("data", "ȫ�浿");
		mv.addObject("name", "�̼���");
		mv.setViewName("/response/result02");
		
		return mv; 
	}
	
}
