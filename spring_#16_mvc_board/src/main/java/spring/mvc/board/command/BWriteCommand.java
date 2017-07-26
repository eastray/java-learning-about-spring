package spring.mvc.board.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import spring.mvc.board.dao.BDao;

public class BWriteCommand implements BCommand {

	@Override
	public void execute(Model model) {
		// TODO Auto-generated method stub

		Map<String, Object> map = model.asMap();
		HttpServletRequest requset = (HttpServletRequest)map.get("request");
	
		String bName = requset.getParameter("bName");	
		String bTitle = requset.getParameter("bTitle");
		String bContent = requset.getParameter("bContent");
		
		BDao dao = new BDao();
		dao.write(bName, bTitle, bContent);
	}

}
