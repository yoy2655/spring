package co.jw.sol.bean;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.ApplicationScope;
import org.springframework.web.context.annotation.SessionScope;

@Component(value = "sbean4")
@ApplicationScope
public class SpringBean4 {
	private String s5;

	public String getS5() {
		return s5;
	}

	public void setS5(String s5) {
		this.s5 = s5;
	}
}
