package co.jw.sol.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import co.jw.sol.beans.BoardInfo;
import co.jw.sol.beans.Content;
import co.jw.sol.service.MainService;
import co.jw.sol.service.TopmenuService;

@Controller
public class MainController {

	@Autowired
	private MainService mainService;
	
	@Autowired
	private TopmenuService topmenuService;

	@GetMapping("/main")
	public String main(Model mo) {
		ArrayList<List<Content>> li = new ArrayList<List<Content>>();
		// List<Content>가 반환형이니까 List<Content>가 전체적으로 클래스형태로 들어가는 형태이다.

		for (int i = 1; i <= 4; i++) {
			List<Content> con = mainService.getMain(i);
			li.add(con);
		}

		mo.addAttribute("li", li);
		
		List<BoardInfo> board_list=topmenuService.getTopmenuList();
		mo.addAttribute("board_list", board_list);
		
		return "main";
	}
}
