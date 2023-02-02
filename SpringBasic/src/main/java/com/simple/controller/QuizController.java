package com.simple.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.simple.command.Quiz01VO;
import com.simple.command.Quiz02VO;

@Controller
@RequestMapping("/quiz")
public class QuizController {

	@RequestMapping("/quiz01")
	public String quiz01() {
		
		return "/quiz/quiz01";
	}
	
	@RequestMapping("/quiz01_ok")
	public String quizO(){
		
		return "/quiz/quiz01_ok";
	}
	
	@RequestMapping("/sendBirth")
	public String sendBirth(@ModelAttribute("birth") Quiz01VO vo) {
		
		System.out.println(vo.toString());
		
		return "/quiz/quiz01_ok";
	}
	
	@RequestMapping("/quiz02")
	public String quiz02() {
		
		return "/quiz/quiz02";
	}
	
	@RequestMapping("/join")
	public String join(@ModelAttribute("join") Quiz02VO vo) {
		
		return "/quiz/quiz02_ok";
	}
	
	@RequestMapping("/quiz03")
	public String quiz03() {
		
		return "/quiz/quiz03";
	}
	
	@RequestMapping("/join2")
	public String join2(@ModelAttribute("join2") Quiz02VO vo,
						RedirectAttributes ra) {
		
		if(vo.getId().equals("")) {
			
			ra.addFlashAttribute("msg", "아이디를 입력하세요");
			return "redirect:/quiz/quiz03";
			
		}else if(!vo.getPw().equals(vo.getPw_check())) {
			
			ra.addFlashAttribute("msg", "비밀번호를 확인하세요");
			return "redirect:/quiz/quiz03";
			
		}else{
			
			return "/quiz/quiz03_ok";
			
		}
		
	}
	
}









