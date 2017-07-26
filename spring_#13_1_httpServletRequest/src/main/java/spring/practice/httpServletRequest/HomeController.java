package spring.practice.httpServletRequest;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping("/board/confirmId")	// http://localhost:8181/httpServletRequest/board/confirmId?id=dhkim&pw=1234
	public String confirmId(HttpServletRequest httpServletRequest, Model model) {
		System.out.println("httpServletRequest: "+ httpServletRequest);
		
		String id = httpServletRequest.getParameter("id");
		String pw = httpServletRequest.getParameter("pw");
		
		model.addAttribute("id", id);
		model.addAttribute("pw", pw);
		
		return "board/confirmId";
	}
	
	@RequestMapping("/member/memberView")
	public String viewMember(HttpServletRequest httpServletRequest, Model model){
		
		String id = httpServletRequest.getParameter("id");
		String pw = httpServletRequest.getParameter("pw");
		
		model.addAttribute("id", id);
		model.addAttribute("pw", pw);
		
		
		return "member/memberView";
	}
	
	@RequestMapping ("/member/memberconfirm")
	public String memberConfirm(@RequestParam("id") String id, @RequestParam String pw, Model model){
		
		model.addAttribute("identify", id);
		model.addAttribute("password", pw);
		
		return "member/memberconfirm";
		
	}
	
}
