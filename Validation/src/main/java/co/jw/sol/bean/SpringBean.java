package co.jw.sol.bean;

import javax.validation.constraints.Max;
import javax.validation.constraints.Size;

public class SpringBean {
	@Max(50)
	private int d1;

	@Size(min = 3, max = 10)
	private String d2;

	public int getD1() {
		return d1;
	}

	public void setD1(int d1) {
		this.d1 = d1;
	}

	public String getD2() {
		return d2;
	}

	public void setD2(String d2) {
		this.d2 = d2;
	}
}
