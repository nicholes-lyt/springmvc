package com.ly.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/demo")
public class DemoController{
	
	Logger log = LoggerFactory.getLogger(DemoController.class);
	private static final String INDEX_PATH = "demo/";
	
	@RequestMapping(value = "/index")
	public ModelAndView demoIndex(){
		log.info("跟踪index！");
		return new ModelAndView(INDEX_PATH + "/demoIndex");
	}
	
}
