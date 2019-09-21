package com.sda.auction.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("account")
public class AccountController {

	@RequestMapping(value = {"/home",}, method = RequestMethod.GET)
	public ModelAndView accountHome() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("account/home");
		return modelAndView;
	}

}
