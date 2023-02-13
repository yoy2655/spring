package co.jw.sol.bean;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component	//클래스를 통째로 빈을 등록을 해줌
@RequestScope
public class SpringBean3 {
	private String s5;
	private String s6;

	public String getS5() {
		return s5;
	}

	public void setS5(String s5) {
		this.s5 = s5;
	}

	public String getS6() {
		return s6;
	}

	public void setS6(String s6) {
		this.s6 = s6;
	}

}
