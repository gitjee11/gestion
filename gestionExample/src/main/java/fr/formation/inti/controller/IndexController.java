package fr.formation.inti.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {
	
	
	@RequestMapping(value = {"/","/index"}, method = RequestMethod.GET)
	public String index(Model model,HttpServletRequest request) {
		model.addAttribute("message", "Hello Spring MVC");
		model.addAttribute("url", request.getRequestURL());
		return "login";
	}
	
	@RequestMapping(value = {"login"}, method = RequestMethod.GET)
	public String login(Model model,HttpServletRequest request) {
		model.addAttribute("message", "Hello Spring MVC");
		model.addAttribute("url", request.getRequestURL());
		return "app-profile";
	}
	
	@RequestMapping(value = {"logout"}, method = RequestMethod.GET)
	public String loginout(HttpSession session) {
		session.invalidate();
        return "redirect:/index";
	}

}
