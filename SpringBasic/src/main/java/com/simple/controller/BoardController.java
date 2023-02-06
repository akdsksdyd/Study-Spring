package com.simple.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.simple.command.BoardVO;
import com.simple.score.service.BoardService;

@Controller
@RequestMapping("/service")
public class BoardController {
	
	@Autowired
	private BoardService service;
	
	@RequestMapping("/boardRegister")
	public String register() {
		
		return "service/boardRegister";
	}
	
	@RequestMapping(value = "/boardResister", method = RequestMethod.POST)
	public String boardRegister(BoardVO vo) {
		service.regist(vo);
		return "service/boardResult";
	}
	
	@RequestMapping("/boardList")
	public String boardList(Model model) {
		
		ArrayList<BoardVO> list = service.getList();
		model.addAttribute("list", list);
		
		return "service/boardList";
	}
	
	@RequestMapping("/boardResult")
	public String result() {
		
		return "service/boardResult";
	}
	
	@RequestMapping("/boardDelete")
	public String delete(@RequestParam("num") int num) {
		service.delete(num);
		return "redirect:/service/boardList";
	}
	
}
