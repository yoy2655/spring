package co.jw.sol.bean;

import javax.validation.constraints.Size;

public class SpringBean {
	@Size(min = 3, max = 5)
	private String d1;
	//d2,d3에 개발자가 validator를 직접 만들어서 유효성검사를 추가해보려고 함
	private String d2;
	private String d3;
	
	public String getD1() {
		return d1;
	}
	public void setD1(String d1) {
		this.d1 = d1;
	}
	public String getD2() {
		return d2;
	}
	public void setD2(String d2) {
		this.d2 = d2;
	}
	public String getD3() {
		return d3;
	}
	public void setD3(String d3) {
		this.d3 = d3;
	}
}
