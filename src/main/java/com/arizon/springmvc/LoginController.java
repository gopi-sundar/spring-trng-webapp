package com.arizon.springmvc;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

	private static Logger logger = Logger.getLogger(LoginController.class);

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String showLoginPage() {

		logger.trace("Inside showLoginPage ");
		logger.debug("Inside showLoginPage ");
		logger.info("Inside showLoginPage ");
		logger.warn("Inside showLoginPage ");
		logger.error("Inside showLoginPage ");
		return "login";
	}
}