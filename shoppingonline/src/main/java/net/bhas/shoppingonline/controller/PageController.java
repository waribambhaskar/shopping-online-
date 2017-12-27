package net.bhas.shoppingonline.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class PageController {
	
	@RequestMapping(value = {"/", "/home", "/index"})
	public ModelAndView index() {
		
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting","Welcome to Spring Wev MVC");
		return mv;
	}
	//@RequestMapping("/test")
	//public ModelAndView test(@RequestParam(value="greeting", required=false)String greeting) {
	//	if(greeting==null){
	//		greeting="Help There";
	//	}
	//	ModelAndView mv = new ModelAndView("page");
	//	mv.addObject("greeting",greeting);
	//	return mv;
	//}
	
	//@RequestMapping(value="/test/{greeting}")
	//public ModelAndView test(@PathVariable("greeting")String greeting) {
	//	if(greeting==null){
	//		greeting="Help There";
	//	}
	//	ModelAndView mv = new ModelAndView("page");
	//	mv.addObject("greeting",greeting);
	//	return mv;
	//}

}
