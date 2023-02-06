package com.jaewon.myweb.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping("/index")
	public String indexView() {
		
		return "index";
	}
	
	@RequestMapping("/notice_list")
	public String listView() {

		return "trip/notice_list";
	}

	@RequestMapping("/notice_modify")
	public String modifyView() {
		
		return "trip/notice_modify";
	}

	@RequestMapping("/notice_view")
	public String viewView() {
		
		return "trip/notice_view";
	}

	@RequestMapping("/notice_write")
	public String writeView() {
		
		return "trip/notice_write";
	}
	
}







