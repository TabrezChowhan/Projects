package com.niit.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.shoppingcartbackend.dao.CategoryDAO;
import com.niit.shoppingcartbackend.domain.Category;

@Controller
public class HomeController {
	
	@Autowired
	HttpSession session;

	@Autowired
	Category category;
	@Autowired
	CategoryDAO categoryDAO;
	
	@RequestMapping("/")
	public ModelAndView goToHome(){
		
		ModelAndView mv=new ModelAndView("Home");
		
		mv.addObject("message", "Welcome to Shopping Cart");
		List<Category> categoryList = categoryDAO.list();	

		// attach to session
		session.setAttribute("categoryList", categoryList);
		session.setAttribute("category", category);
		 
		 return mv;
		 
	}
	
	@RequestMapping("/LoginPage")
	public String loginPage(Model model)
	{
		model.addAttribute("isUserClickedLogin", "true");
	
		return "Home";
	}
	
	@RequestMapping("/RegistrationPage")
	public String registrationPage(Model model)
	{
		model.addAttribute("isUserClickedRegister", "true");
		
		return "Home";
	}

}
