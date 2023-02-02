package com.simple.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.simple.command.ReqVO;

@Controller
@RequestMapping("/response")
public class ResponseController {

	@RequestMapping("/ex01")
	public String ex01() {
		
		return "/response/ex01";
	}
	
	//result01 요청
	@RequestMapping("/result01")
	public String result01(Model model) {
		
		model.addAttribute("data", "홍길동"); //키, 값
		model.addAttribute("serverTime", new Date());
		
		return "/response/result01";
	}
	
	//result02 요청 - ModelAndView객체
	@RequestMapping("/result02")
	public ModelAndView result02() {
		
		//뷰의 정보, data정보를 함꼐 저장 할 수 있는 객체
		ModelAndView mv = new ModelAndView();
		mv.addObject("data", "홍길동");
		mv.addObject("name", "이순신");
		mv.setViewName("/response/result02");
		
		return mv; 
	}
	
	//ModelAttribute - request + model 형태
	@RequestMapping("/result03")
	public String result03(@ModelAttribute("num") String str) {
		
		System.out.println("화면에서 받은 값: " + str);
		
		return "response/result03";
	}
	
	@RequestMapping("/result04")
	public String result04(@ModelAttribute("article") ReqVO vo) {
		
		System.out.println("화면에서 받은 값: " + vo.toString());
		
		return "response/result04";
	}
	
	//redirect 이동과 RedirectAttribute
	//스프링에서 redirect는 다시 컨트롤러에 태우는 요청.
	//redirectAttribute는 redirect시에 1회성 데이터를 저장 할 수 있다.
	
	//화면요청
	@RequestMapping("/redirect_login")
	public String LoginView() {
		
		return "response/redirect_login";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(@RequestParam("id") String id, 
						@RequestParam("pw") String pw,
						RedirectAttributes ra) {
	
		//id와 pw가 같을 경우 로그인 성공이라고 가정. -> home화면으로
		if(id.equals(pw)) {
			
			ra.addFlashAttribute("msg", "어서와"); //1회성 데이터
			
			return "redirect:/"; //다시 설정했던 HomeController에 태워서 home 페이지로 전달. - model을 사용 할 수는 없다.
			
		//로그인 실패
		}else {
			
			ra.addFlashAttribute("msg", "틀렸는데요?"); //1회성 데이터
			
			return "redirect:/response/redirect_login"; //절대경로
		}
		
	}
	
}





















