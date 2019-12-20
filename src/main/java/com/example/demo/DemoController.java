package com.example.demo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {
	
	@RequestMapping(path="/", method=RequestMethod.GET)
	public @ResponseBody String getIps(HttpServletRequest request) {
		String result = "client: " + request.getRemoteAddr() + "\n"
			+ "server: " + request.getLocalAddr() + "\n";
		return result;
	}
}
