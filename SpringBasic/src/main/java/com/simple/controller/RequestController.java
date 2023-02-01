package com.simple.controller;

import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.simple.command.ReqVO;

@Controller
@RequestMapping("/request") //메서드 앞에 공통으로 들어가는 요청경로
public class RequestController {
	
//	String메서드 - 출력 화면을 직접 지정
	@RequestMapping("/ex01")//요청경로
	public String ex01() {
		
		return "request/ex01";//출력경로
	}
	
//	//void메서드 - 요청 경로가 출력경로가 됨.
//	@RequestMapping("ex01")
//	public void ex01() {
//		
//	}
	
	//get만 허용
	//@RequestMapping(value = "/basic1", method = RequestMethod.GET)
	@GetMapping("/basic1")
	public String basic1() {
		System.out.println("get만 허용");
		return null;
	}
	
	//post만 허용
	//@RequestMapping(value = "/basic2", method = RequestMethod.POST)
	@PostMapping("/basic2")
	public String basic2() {
		System.out.println("post만 허용");
		return null;
	}
	
	//get, post 둘 다 허용
	@RequestMapping("/basic3")
	public String basic3() {
		System.out.println("get, post");
		return null;
	}

	//ex02화면요청
	@RequestMapping("/ex02")
	public String ex02() {
		return "request/ex02";
	}
	
	//1st
//	@RequestMapping(value = "/doAction", method = RequestMethod.POST)
//	public String doAction(HttpServletRequest request) {
//		
//		//name
//		String name = request.getParameter("name");
//		//age
//		String age = request.getParameter("age");
//		//inter - checkbox
//		String[] inter = request.getParameterValues("inter");
//		
//		System.out.println(name);
//		System.out.println(age);
//		System.out.println(Arrays.toString(inter));
//		
//		return "request/ex02_ok";
//	}
	
	//2nd
//	@RequestMapping("/doAction")
//	public String doAction(@RequestParam(value = "name", required = false) String name, 
//			@RequestParam("age") int age,
//			@RequestParam(value = "inter", required = false, defaultValue = "") List<String> list) {
//		
//		//requestParam은 공백과 null데이터가 전달되면 요청을 거절하게 된다.
//		//필수가 아닌 파라미터는 required=false 속성을 지정하면 된다.
//		//필수가 아닌 파라미터인 경우에는 null or ""을 지정하게 되는데 defaultValue로 기본값을 줄 수 있다.
//		
//		System.out.println(name);
//		System.out.println(age);
//		System.out.println(list.toString());
//		
//		return "request/ex02_ok";
//	}

	//3rd - 커맨드 객체를 통해서 맵핑 (넘어오는 데이터의 name과 setter명이 같아야한다.)
	@RequestMapping("/doAction")
	public String doAction(ReqVO vo) {
		
		System.out.println(vo.toString());
		
		return "request/ex02_ok";
	}
	
	@RequestMapping("/req_quiz01")
	public String quiz01() {
		
		return "request/req_quiz01";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(ReqVO vo) {
		
		if(vo.getId().equals("abc123") && vo.getPw().equals("xxx123")) {
			
			return "request/req_quiz01_ok";
			
		}else {
			
			return "request/req_quiz01_no";
			
		}
		
	}
	
}















