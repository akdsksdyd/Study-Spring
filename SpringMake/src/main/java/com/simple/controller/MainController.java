package com.simple.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

//�ڵ鷯 Ŭ������ ����� �Ƿ��� Ư�� ����� ������ �־�� �Ѵ�.
//MultiActionController ������ 3�������� ��Ʈ�ѷ��� ������ �� �� �ֵ��� �����Ǵ� Ŭ���� �� 1��
//��ӹް� handleRequestInternal �������̵� �ϸ� ����.
public class MainController extends MultiActionController{

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		String path = request.getContextPath();
		String uri = request.getRequestURI();
		
		String command = uri.substring(path.length());
		
		if(command.equals("/test/aaa")) {
			
			System.out.println("aaa����");
			//Ȯ��
			//model�� view������ ��� ��ü
			ModelAndView mv = new ModelAndView();
//			mv.setViewName("/WEB-INF/views/home.jsp"); //���� ����
			mv.setViewName("home");
			mv.addObject("data", "hello world"); //������ ����
			
			return mv;
			
		}else if(command.equals("/test/bbb")) {
			
			System.out.println("bbb����");
			
		}
		
		return super.handleRequestInternal(request, response);
	}
	
	

}
