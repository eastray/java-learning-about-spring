package spring.practice.formData;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@RequestMapping("/join/form")
	public String join(@RequestParam("name") String name, @RequestParam("id") String id, 
			@RequestParam("pw") String pw, @RequestParam("email") String email, Model model) {
		
		Member member = new Member();
		member.setName(name);
		member.setId(id);
		member.setPw(pw);
		member.setEmail(email);
		
		System.out.println("member.getName: " + member.getName());
		System.out.println("member.getId: " + member.getId());
		System.out.println("member.getPw: " + member.getPw());
		System.out.println("member.getEmail: " + member.getEmail());
		
		model.addAttribute("member", member);
		
		return "join/formOk";
	}
	
	@RequestMapping("/join/form/{id}")
	public String getJoin(@PathVariable String id, Model model) {
		model.addAttribute("id", id);
		return "/join/formOk";
	}
	
}
