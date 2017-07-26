package spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
public class RequestMappintForPractice {
	
	@RequestMapping("/view")
	public String vice() {
		return "/board/view";
	}

}
