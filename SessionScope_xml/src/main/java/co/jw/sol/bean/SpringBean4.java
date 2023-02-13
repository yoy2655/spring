package co.jw.sol.bean;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

//value로 이름을 지정해주면 Controller쪽에서 이름을 찾아주어야 함(이름일땐 Resource가 필요)
@Component(value="sbean4")	
@SessionScope
public class SpringBean4 {
	private String s7;
	private String s8;

	public String getS7() {
		return s7;
	}

	public void setS7(String s7) {
		this.s7 = s7;
	}

	public String getS8() {
		return s8;
	}

	public void setS8(String s8) {
		this.s8 = s8;
	}

}
