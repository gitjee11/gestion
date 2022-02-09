package fr.formation.inti.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import fr.formation.inti.entity.User;
import fr.formation.inti.service.IUserService;

@Controller
@SessionAttributes("user")
public class EmployeeController {

	@Autowired
	private IUserService userService;

	@RequestMapping("/eee")
	public String index(Model model) {
		return "login";
	}
	@RequestMapping(value = "/userInfo", method = RequestMethod.GET)
	public String getUserInfo(Model mode) {
		
		return "app-profile";
	}

	@RequestMapping(value = "/userInfo", method = RequestMethod.POST)
	public String userInfo(Model model, @RequestParam("login") String login, @RequestParam("password") String password,
			HttpServletRequest request) {
		model.addAttribute("url", request.getRequestURL());
		// After user login successfully.

		System.out.println("User Name: " + login + "  " + password);
		User user = userService.findByLoginAndPassword(login, password);
		if (user != null) {
			model.addAttribute("user", user);
		}
		return "app-profile";
	}
}
