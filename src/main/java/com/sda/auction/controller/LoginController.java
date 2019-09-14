package com.sda.auction.controller;


import com.sda.auction.dto.UserForm;
import com.sda.auction.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = {"/", "/login",}, method = RequestMethod.GET)
	public ModelAndView login() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("login");
		return modelAndView;
	}

	@RequestMapping(value = {"/registration",}, method = RequestMethod.GET)
	public ModelAndView register() {
		ModelAndView modelAndView = new ModelAndView();

		modelAndView.addObject(new UserForm());

		modelAndView.setViewName("registration");
		return modelAndView;
	}

	@RequestMapping(value = {"/registration",}, method = RequestMethod.POST)
	public ModelAndView registerPost(UserForm userForm) {
		ModelAndView modelAndView = new ModelAndView();

		System.out.println("Ce am primit: " + userForm);
		userService.saveUser(userForm);

		modelAndView.setViewName("registration");
		return modelAndView;
	}
}
