package com.sda.auction.controller;

import com.sda.auction.dto.ItemForm;
import com.sda.auction.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
@RequestMapping("admin")
public class AdminController {

	@Autowired
	private ItemService itemService;

	@RequestMapping(value = {"/home",}, method = RequestMethod.GET)
	public ModelAndView adminHome() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("admin/home");
		return modelAndView;
	}

	@RequestMapping(value = {"/newItem",}, method = RequestMethod.GET)
	public ModelAndView addItem() {
		ModelAndView modelAndView = new ModelAndView();

		modelAndView.addObject(new ItemForm());

		modelAndView.setViewName("admin/newItem");
		return modelAndView;
	}

	@RequestMapping(value = {"/newItem"}, method = RequestMethod.POST)
	public ModelAndView addItemPost(@Valid ItemForm itemForm, BindingResult bindingResult) {
		ModelAndView modelAndView = new ModelAndView();
		System.out.println(itemForm + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		if (bindingResult.hasErrors()) {

		} else {
			System.out.println("ok");
			itemService.saveItem(itemForm);
			modelAndView.addObject(new ItemForm());
			modelAndView.addObject("successMessage",
					"Item successfully added");
		}
		modelAndView.setViewName("/admin/newItem");
		return modelAndView;

	}
}
