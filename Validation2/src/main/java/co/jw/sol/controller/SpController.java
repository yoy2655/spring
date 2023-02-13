package co.jw.sol.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import co.jw.sol.bean.SpringBean;

@Controller
public class SpController {
	@GetMapping("/t1")
	public String t1(SpringBean sbean) {
		//SpringBean sbean이 필요하지 않지만 여기서 적어줘야 한다.
		//그래야 t1으로 가서 public String check에서 
		//@Valid SpringBean sbean으로 유효성검사를할떄 사용할 수 있다. 
		return "t1";
	}

	@PostMapping("/check")
	public String check(@Valid SpringBean sbean, BindingResult result) {
		if (result.hasErrors()) {
			return "t1";	
			//에러가 나면 t1.jsp로 이동한다.보낸 값은 <formLerrors path="d1"/>에서 받는다.
			//소스보기에서 보면 d1.errors라고 뜨는데 
			//여기에서 error객체로 들어가서 에러가 났는지 유효성검사하고 해당 에러메시지를 찾는다 
		}
		return "t2";
		//그렇지 않으면 성공이 되어서 t2.jsp로 가서 정상적인 값을 띄어준다!!
	}
}
