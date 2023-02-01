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
@RequestMapping("/request") //�޼��� �տ� �������� ���� ��û���
public class RequestController {
	
//	String�޼��� - ��� ȭ���� ���� ����
	@RequestMapping("/ex01")//��û���
	public String ex01() {
		
		return "request/ex01";//��°��
	}
	
//	//void�޼��� - ��û ��ΰ� ��°�ΰ� ��.
//	@RequestMapping("ex01")
//	public void ex01() {
//		
//	}
	
	//get�� ���
	//@RequestMapping(value = "/basic1", method = RequestMethod.GET)
	@GetMapping("/basic1")
	public String basic1() {
		System.out.println("get�� ���");
		return null;
	}
	
	//post�� ���
	//@RequestMapping(value = "/basic2", method = RequestMethod.POST)
	@PostMapping("/basic2")
	public String basic2() {
		System.out.println("post�� ���");
		return null;
	}
	
	//get, post �� �� ���
	@RequestMapping("/basic3")
	public String basic3() {
		System.out.println("get, post");
		return null;
	}

	//ex02ȭ���û
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
//		//requestParam�� ����� null�����Ͱ� ���޵Ǹ� ��û�� �����ϰ� �ȴ�.
//		//�ʼ��� �ƴ� �Ķ���ʹ� required=false �Ӽ��� �����ϸ� �ȴ�.
//		//�ʼ��� �ƴ� �Ķ������ ��쿡�� null or ""�� �����ϰ� �Ǵµ� defaultValue�� �⺻���� �� �� �ִ�.
//		
//		System.out.println(name);
//		System.out.println(age);
//		System.out.println(list.toString());
//		
//		return "request/ex02_ok";
//	}

	//3rd - Ŀ�ǵ� ��ü�� ���ؼ� ���� (�Ѿ���� �������� name�� setter���� ���ƾ��Ѵ�.)
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















