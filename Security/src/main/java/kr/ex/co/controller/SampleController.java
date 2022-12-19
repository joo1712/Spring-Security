package kr.ex.co.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sample")
public class SampleController {

	private static final Logger logger = LoggerFactory.getLogger(SampleController.class);
	
	@RequestMapping("/all")
	public String doAll(Model model) {
		logger.info("do all can access everybody");
		return "/sample/all";
	}
	
	@RequestMapping("/member")
	public String doMember(Model model) {
		logger.info("logined member");
		return "/sample/member";
	}
	
	@RequestMapping("/admin")
	public String doAdmin(Model model) {
		logger.info("admin only");
		return "/sample/admin";
	}
}
