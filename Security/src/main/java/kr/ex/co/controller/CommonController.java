package kr.ex.co.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CommonController {

	private static final Logger logger = LoggerFactory.getLogger(CommonController.class);
	
	@RequestMapping("/accessError")
	public void accessDenied(Authentication auth, Model model) {
		logger.info("access Denied : " + auth);
		model.addAttribute("msg", "Access Denied");
	}
	
	@RequestMapping("/customLogin")
	public void customLogin(String error, String logout, Model model) {
		
		logger.info("error :" + error);
		logger.info("logout :" + logout);
		
		if (error != null)
			model.addAttribute("error", "Login Error Check Your Account");
		
		if (logout != null)
			model.addAttribute("logout","Logout !!!");
	}
	
	@RequestMapping("/customLogout")
	public void logoutGET() {
		logger.info("custom Logout");
	}
	
	@RequestMapping(value="/customLogout", method=RequestMethod.POST)
	public void logoutPost() {
		logger.info("post custom logout");
	}
}
