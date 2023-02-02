package com.simple.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.simple.command.ScoreVO;
import com.simple.score.service.ScoreService;
import com.simple.score.service.ScoreServiceImpl;

@Controller
@RequestMapping("/service")
public class ServiceController {

	//1st
	//ScoreServiceImpl service = new ScoreServiceImpl();
	//service.regist(vo);
	
	//2nd - service�� bean���� ���� - ������ü �ڵ�����
	
	//3rd - Service�� @Service�� ������ �����ϰ�, ������ü �ڵ�����
	@Autowired
	@Qualifier("xxx")
	private ScoreService service;
	
	
	//ȭ��
	@RequestMapping("/scoreRegist")
	public String registView() {
		
		return "service/scoreRegist";
	}
	
	//����û
	@RequestMapping(value = "/regist", method = RequestMethod.POST)
	public String regist(ScoreVO vo) {

		service.regist(vo);
		
		return "service/scoreResult";
	}
	
	//���ȭ��
	@RequestMapping("/scoreList")
	public String scoreList(Model model) {
		
		//data��ȸ
		ArrayList<ScoreVO> list = service.getList();
		model.addAttribute("list", list);
		
		return "service/scoreList";
	}
	
	//������û
	@RequestMapping("/delete")
	public String delete(@RequestParam("num") int num) {
		
		service.delete(num);
		
		return "redirect:/service/scoreList";//���� �� �������
	}
	
}














