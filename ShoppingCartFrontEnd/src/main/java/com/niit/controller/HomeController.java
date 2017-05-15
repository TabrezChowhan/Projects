package com.niit.controller;

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
	
	
	//Whenever the user open our website, it should navigate to home page
	//http://localhost:8080/ShoppingCart/

	
	//Whenever the user open our website, it should navigate to home page
	//http://localhost:8080/ShoppingCart/
	
	@Autowired
	HttpSession session;

	@Autowired
	Category category;
	@Autowired
	CategoryDAO categoryDAO;


	@RequestMapping("/")
	public ModelAndView goToHome() {
		System.out.println("Going Home...");
		ModelAndView mv = new ModelAndView("Home");
		mv.addObject("message", "Thank you for visiting Shopping Cart! <br>");
		// model.addAttribute("message", "Thank you for visiting Shopping Cart!
		// <br>");

		/*List<Category> categoryList = categoryDAO.list();	

		// attach to session
		session.setAttribute("categoryList", categoryList);
		session.setAttribute("category", category);
		 */
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
