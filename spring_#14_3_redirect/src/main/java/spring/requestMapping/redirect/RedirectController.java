package spring.requestMapping.redirect;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RedirectController {
	
	@RequestMapping("/index")
	public String index() {
		return "index";
	}

	@RequestMapping("/studentConfirm")
	public String studentRedirect(HttpServletRequest httpServletRequest, Model model) {
		
		String id = httpServletRequest.getParameter("id");
		if(id.equals("dhkim")){
			return "redirect:studentOk";
		}
		
		return "redirect:studentNg";
	}
	
	@RequestMapping("/studentOk")
	public String studentOk(Model model) {
		
		return "student/studentOk";
	}
	
	@RequestMapping("/studentNg")
	public String studentNg(Model model) {
		
		return "student/studentNg";
	}
	
	@RequestMapping("/studentURL1")
	public String studentURL1(Model model) {
		
		return "redirect:http://localhost:8181/redirect/studentURL1.jsp";
	}
	
	@RequestMapping("/studentURL2")
	public String studentURL2(Model model) {
		
		return "redirect:student/studentURL2";
	}
	
	@RequestMapping("/student/studentURL2")
	public String studentURL22(Model model){
		
		return "redirect:http://localhost:8181/redirect/studentURL2.jsp";
	}
}
