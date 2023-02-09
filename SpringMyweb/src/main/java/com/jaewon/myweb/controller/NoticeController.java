package com.jaewon.myweb.controller;

import java.util.ArrayList;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.jaewon.myweb.command.TripVO;
import com.jaewon.myweb.trip.service.TripService;
import com.jaewon.myweb.util.Criteria;
import com.jaewon.myweb.util.PageVO;

@Controller
@RequestMapping("/trip")
public class NoticeController {
	
	@Autowired
	@Qualifier("tripService")
	private TripService tripService;
	
	@RequestMapping("/notice_list")
	public String notice_list(Criteria cri, Model model) {
		
		/*
		 * service, mapper������ getList �Լ��� �����ϰ�
		 * ��Ϲ�ȣ �������� �����͸� ��ȸ�ؼ� ������ ���´�.
		 * model�� ��Ƽ�
		 * ȭ�鿡���� �ݺ������� ó�� 
		 */
//		ArrayList<TripVO> list =  tripService.getList(cri);
//		model.addAttribute("list", list);
		
		//���������̼�
//		int total = tripService.getTotal();
//		PageVO pageVO = new PageVO(cri, total);
//		System.out.println(pageVO.toString());
		
		//������ �˻�ó��
		/*
		 * 1. ȭ�鿡���� page, amount, searchType, searchName�� �ѱ��.
		 * 2. criteria���� �˻����� �޴´�.
		 * 3. sql�� �ٲ۴�. (��������)
		 * 4. total sql�� �ٲ۴� (��������)
		 * 5. ������ a�±� Ŭ���� searchType, searchName�� ������Ʈ������ �ѱ��.
		 * 6. ������ �˻��ߴ��� ǥ��
		 */
		System.out.println(cri.toString());
		
		ArrayList<TripVO> list =  tripService.getList(cri);
		
		int total = tripService.getTotal(cri);
		PageVO pageVO = new PageVO(cri, total);
		
		model.addAttribute("list", list);
		model.addAttribute("pageVO", pageVO);

		return "trip/notice_list";
	}

	@RequestMapping("/notice_modify")
	public String notice_modify(@RequestParam("tno") int tno, Model model) {
		
		TripVO vo = tripService.getContent(tno);
		model.addAttribute("vo", vo);
		
		return "trip/notice_modify";
	}

	@RequestMapping("/notice_view")
	public String notice_view(@RequestParam("tno") int tno, 
							  Model model,
							  HttpServletResponse response,
							  HttpServletRequest request) {
		
		//Ŭ���� �� ��ȣ�� ����
		TripVO vo = tripService.getContent(tno);
		model.addAttribute("vo", vo);
		
		//��ȸ �� ����
		tripService.upHit(tno);
		
		//������, ������
		ArrayList<TripVO> list = tripService.getPrevNext(tno);
		model.addAttribute("list", list);
		
//		Cookie cookie = new Cookie("key", "1");
//		cookie.setMaxAge(30);
//		response.addCookie(cookie);
		
		return "trip/notice_view";
	}
	
//	//�ڵ尡 ������ �����ϴٸ�
//	@RequestMapping({"notice_view", "notice_modify"})
//	public void notice_test(@RequestParam("tno") int tno, Model model) {
//		
//		TripVO vo = tripService.getContent(tno);
//		model.addAttribute("vo", vo);
//		
//	}

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
	
	//�ۼ���
	@RequestMapping(value = "/modifyForm", method = RequestMethod.POST)
	public String modifyForm(TripVO vo, RedirectAttributes ra) {
		
		//������Ʈ�۾� - ȭ�鿡���� tno�� �ʿ��ϱ� ������ hidden�±׸� �̿��� �Ѱ��ش�.
		int result = tripService.noticeModify(vo);
		String msg = result == 1 ? "���ǻ����� ���� �����Ǿ����ϴ�." : "���� ��� ������ ���� �߽��ϴ�.";
		ra.addFlashAttribute("msg", msg);
		
		return "redirect:/trip/notice_list";
		//return "redirect:/trip/notice_view?tno=" + vo.getTno();
	}
	
	@RequestMapping(value = "/deleteForm", method = RequestMethod.POST)
	public String deleteForm(@RequestParam("tno") int tno, RedirectAttributes ra) {
		
		int result = tripService.deleteForm(tno);
		String msg = result == 1 ? "���� �Ϸ�Ǿ����ϴ�." : "���� �����߽��ϴ�.";
		ra.addFlashAttribute("msg", msg);
		
		return "redirect:/trip/notice_list";
	}

}

















