package co.jw.sol.controller;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import co.jw.sol.beans.User;
import co.jw.sol.service.UserService;
import co.jw.sol.validator.UserValidator;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;

	@Resource(name = "loginBean")
	private User loginBean;

	@GetMapping("/login")
	public String login(@ModelAttribute("tmpLoginBean") User tmpLoginBean,
			@RequestParam(value = "fail", defaultValue = "false") boolean fail, Model model) {
		// defaultValue : 기본값(처음페이지)는 false(실패)했다고 뜬다. booelan fail 변수에 값이 들어가 있다.
		model.addAttribute("fail", fail);
		return "user/login";
		// model에 fail값을 담아서 user/login으로 넘긴다
	}

	@PostMapping("/login_pro")
	public String login_pro(@Valid @ModelAttribute("tmpLoginBean") User tmpLoginBean, BindingResult result) {
		if (result.hasErrors()) {
			return "user/login";
		}

		userService.getLoginUser(tmpLoginBean);

		if (loginBean.isUserLogin() == true) {
			return "user/login_success";
		} else {
			return "user/login_fail";
		}
	}

	@GetMapping("/join")
	public String join(@ModelAttribute("joinBean") User joinBean) {
		return "user/join";
	}

	@PostMapping("/join_pro")
	public String join_pro(@Valid @ModelAttribute("joinBean") User joinBean, BindingResult result) { // 유효성검사
		if (result.hasErrors()) {
			return "user/join"; // error가 나면 join으로 간다
		}
		userService.addUser(joinBean); // 사용자 요청사항이
		return "user/join_success"; // 성공하면 join_success로 간다
	}

	@GetMapping("/modify")
	public String modify(@ModelAttribute("modifyBean") User modifyBean) {
		userService.getModify(modifyBean); // 정보수정 페이지에서 이름, 아이디를 세팅해줌
		return "user/modify";
	}

	@PostMapping("/modify_pro")
	public String modify_pro(@Valid @ModelAttribute("modifyBean") User modifyBean, BindingResult result) {

		if (result.hasErrors()) {
			return "user/modify";
		}
		
		userService.modifyUser(modifyBean);
		return "user/modify_success";
	}

	@GetMapping("/logout")
	public String logout() {

		loginBean.setUserLogin(false);
		return "user/logout";
	}

	@GetMapping("/notlogin")
	public String notlogin() {
		return "user/notlogin";
	}

	@InitBinder
	public void initBinder(WebDataBinder binder) {

		UserValidator val = new UserValidator();
		binder.addValidators(val);
	}

}
