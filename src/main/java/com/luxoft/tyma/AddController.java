package com.luxoft.tyma;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController {
	
	@RequestMapping("add")
	public ModelAndView add(@RequestParam("t1") int num1, @RequestParam("t2") int num2) {
		
		ModelAndView mv = new ModelAndView();
		int result = num1 + num2;
		
		mv.addObject("result", result);
		mv.addObject("param1", num1);
		mv.addObject("param2", num2);
		
		mv.setViewName("result.jsp");
		
		return mv;
	}
}
