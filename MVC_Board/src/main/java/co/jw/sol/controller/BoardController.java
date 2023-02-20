package co.jw.sol.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import co.jw.sol.beans.Content;
import co.jw.sol.beans.Page;
import co.jw.sol.beans.User;
import co.jw.sol.service.BoardService;

@Controller
@RequestMapping("/board")
public class BoardController {

	@Autowired
	private BoardService boardService;

	@Resource(name = "loginBean")
	private User loginBean;

	// @RequestParam : aop
	// Model : spring
	@GetMapping("/main")
	public String main(@RequestParam("board_info_idx") int board_info_idx,
			@RequestParam(value = "page", defaultValue = "1") int page, Model mo) {
		mo.addAttribute("board_info_idx", board_info_idx);

		String name = boardService.getBoard(board_info_idx);
		mo.addAttribute("name", name);

		List<Content> conList = boardService.getContent(board_info_idx, page);
		mo.addAttribute("conList", conList);

		Page pg = boardService.getCnt(board_info_idx, page);
		mo.addAttribute("pg", pg);

		mo.addAttribute("page", page);
		return "board/main";
	}

	@GetMapping("/write")
	public String write(@ModelAttribute("writeBean") Content writeBean,
			@RequestParam("board_info_idx") int board_info_idx) {

		writeBean.setContent_board_idx(board_info_idx);
		return "board/write";
	}

	@PostMapping("/write_pro")
	public String write_pro(@Valid @ModelAttribute("writeBean") Content writeBean, BindingResult result) {
		if (result.hasErrors()) {
			return "board/write";
		}
		boardService.addContent(writeBean);
		return "board/write_success";
	}

	@GetMapping("/read")
	public String read(@RequestParam("board_info_idx") int board_info_idx, @RequestParam("content_idx") int content_idx,
			@RequestParam("page") int page, Model mo) {
		mo.addAttribute("board_info_idx", board_info_idx);
		mo.addAttribute("content_idx", content_idx);

		Content readBean = boardService.ContentInfo(content_idx);
		mo.addAttribute("readBean", readBean);

		mo.addAttribute("loginBean", loginBean);
		mo.addAttribute("page", page);

		return "board/read";
	}

	@GetMapping("modify")
	public String modify(@RequestParam("board_info_idx") int board_info_idx,
			@RequestParam("content_idx") int content_idx, @ModelAttribute("modifyBean") Content modifyBean,
			@RequestParam("page") int page, Model mo) {
		mo.addAttribute("board_info_idx", board_info_idx);
		mo.addAttribute("content_idx", content_idx);
		mo.addAttribute("page", page);

		Content con = boardService.ContentInfo(content_idx);
		modifyBean.setContent_writer_name(con.getContent_writer_name());
		modifyBean.setContent_date(con.getContent_date());
		modifyBean.setContent_subject(con.getContent_subject());
		modifyBean.setContent_text(con.getContent_text());
		modifyBean.setContent_writer_idx(con.getContent_writer_idx());
		modifyBean.setContent_board_idx(board_info_idx);
		modifyBean.setContent_idx(content_idx);

		return "board/modify";
	}

	@PostMapping("/modify_pro")
	public String modify_pro(@Valid @ModelAttribute("modifyBean") Content modifyBean, BindingResult result, Model mo, @RequestParam("page") int page) {

		mo.addAttribute("page", page);
		
		if (result.hasErrors()) {
			return "board/modify";
		}

		boardService.modifyContent(modifyBean);
		return "board/modify_success";
	}

	@GetMapping("/delete")
	public String delete(@RequestParam("board_info_idx") int board_info_idx,
			@RequestParam("content_idx") int content_idx, @ModelAttribute("modifyBean") Content modifyBean, Model mo) {

		boardService.deleteContent(content_idx);
		mo.addAttribute("board_info_idx", board_info_idx);
		return "board/delete";
	}

	@GetMapping("/not_write")
	public String not_write() {
		return "board/not_write";
	}
}

//~~/board/main