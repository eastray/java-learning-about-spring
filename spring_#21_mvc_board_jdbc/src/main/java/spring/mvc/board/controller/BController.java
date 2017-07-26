package spring.mvc.board.controller;

import javax.servlet.http.HttpServletRequest;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import spring.mvc.board.command.BCommand;
import spring.mvc.board.command.BContentCommand;
import spring.mvc.board.command.BDeleteCommand;
import spring.mvc.board.command.BListCommand;
import spring.mvc.board.command.BModifyCommand;
import spring.mvc.board.command.BReplyCommand;
import spring.mvc.board.command.BReplyViewCommand;
import spring.mvc.board.command.BWriteCommand;
import spring.mvc.board.util.Constant;

@Controller
public class BController {

	BCommand command;
	

	public JdbcTemplate template;
	
	
	@Autowired
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
		Constant.template = this.template;
	}

	@RequestMapping("/list")
	public String list(Model model) {

		System.out.println("list()");

		command = new BListCommand();
		command.execute(model);

		return "list";
	}

	@RequestMapping("/write_view")
	public String write_view(Model model) {

		System.out.println("write_view()");

		return "write_view";
	}

	@RequestMapping("/write")
	public String write(HttpServletRequest request, Model model) {
		System.out.println("write()");

		model.addAttribute("request", request);
		command = new BWriteCommand();
		command.execute(model);

		return "redirect:list";
	}

	@RequestMapping("/content_view")
	public String content_view(HttpServletRequest request, Model model) {
		System.out.println("content_view()");

		model.addAttribute("request", request);
		command = new BContentCommand();
		command.execute(model);

		return "content_view";
	}

	@RequestMapping(method = RequestMethod.POST, value = "/modify")
	public String modify(HttpServletRequest request, Model model) {
		System.out.println("modify()");
		
		model.addAttribute("request", request);
		command = new BModifyCommand();
		command.execute(model);

		return "redirect:list";
	}
	
	@RequestMapping("/delete")
	public String delete(HttpServletRequest request, Model model) {
		System.out.println("delete()");

		model.addAttribute("request", request);
		command = new BDeleteCommand();
		command.execute(model);

		return "redirect:list";
	}

	@RequestMapping("/reply_view")
	public String reply_view(HttpServletRequest request, Model model) {
		System.out.println("reply_view()");

		model.addAttribute("request", request);
		command = new BReplyViewCommand();
		command.execute(model);

		return "reply_view";
	}

	@RequestMapping("/reply")
	public String reply(HttpServletRequest request, Model model) {
		System.out.println("reply()");

		model.addAttribute("request", request);
		command = new BReplyCommand();
		command.execute(model);

		return "redirect:list";
	}

	

}
