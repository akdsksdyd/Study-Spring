package com.jaewon.myweb.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.jaewon.myweb.command.TripVO;
import com.jaewon.myweb.trip.service.TripService;

@Controller
@RequestMapping("/trip")
public class NoticeController {
	
	@Autowired
	@Qualifier("tripService")
	private TripService tripService;
	
	@RequestMapping("/notice_list")
	public String notice_list(Model model) {
		
		/*
		 * service, mapper������ getList �Լ��� �����ϰ�
		 * ��Ϲ�ȣ �������� �����͸� ��ȸ�ؼ� ������ ���´�.
		 * model�� ��Ƽ�
		 * ȭ�鿡���� �ݺ������� ó�� 
		 */
		ArrayList<TripVO> list =  tripService.getList();
		model.addAttribute("list", list);

		return "trip/notice_list";
	}

	@RequestMapping("/notice_modify")
	public String notice_modify() {
		
		return "trip/notice_modify";
	}

	@RequestMapping("/notice_view")
	public String notice_view() {
		
		return "trip/notice_view";
	}

	@RequestMapping("/notice_write")
	public String notice_write() {
		
		return "trip/notice_write";
	}
	
	//�۵��
	@RequestMapping(value = "/registForm", method = RequestMethod.POST)
	public String registForm(TripVO vo, RedirectAttributes ra) {
		
		int result = tripService.noticeRegist(vo);

		String msg = result == 1 ? "���ǻ����� ���� ��ϵǾ����ϴ�." : "���� ��Ͽ� ���� �߽��ϴ�.";
		ra.addFlashAttribute("msg", msg);
		
		return "redirect:/trip/notice_list";
	}

}










