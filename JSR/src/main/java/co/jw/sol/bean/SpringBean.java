package co.jw.sol.bean;

import javax.validation.constraints.AssertFalse;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class SpringBean {
	// JSR(Spring MVC 유효성 검사 라이브러리)
	// JSR-303: 입력값에 대해 어노테이션으로 지정하고
	// 조건에 맞지 않으면 오류가 있다고 정보를 전달한다
	// @AssertTrue: true가 아닌 값이면 오류
	// @AssertFalse: false가 아닌 값이면 오류
	// @Max(값) : 값보다 큰값이 들어오면 오류
	// @Min(값) : 값보다 작은값이 들어오면 오류
	// @Null : 값 들어오면 오류
	// @Size(min=글자수, max=글자수)
	// @NotNull : 값이 들어오지않으면 오류 발생
	// @Pattern(regexp=정규식):정규식에 위배되어지면 오류 발생
	// ->regularExpression:정규식이라는 뜻이다.

	@AssertFalse
	private boolean d1;

	@AssertTrue
	private boolean d2;
	
	@Null
	private String d3;
	
	@NotNull
	private String d4;
	
	@Max(50)
	@Min(10)
	private String d5;
	
	@Size(min=2, max=5)
	private String d6;
	
	@Pattern(regexp="[a-zA-Z]*")
	private String d7;
	
	@DecimalMax(value="50", inclusive=false)
	//inclusive=false로 설정하면 작거나만 되고 
	//같은은 포함시키지 않는다는 뜻이다(=50은 포함하지 않겠다, inclusive를 생략하면 true)
	@DecimalMin(value="10", inclusive=false)
	//inclusive=false로 설정하면 크거나만 되고 
	//같은은 포함시키지 않는다는 뜻이다(=10은 포함하지 않겠다, inclusive를 생략하면 true)
	private String d8;
	
	@Digits(integer=2, fraction=2)	
	//허용 범위내의 숫자(integer: 허용되는 최대 정수자릿수, fraction:허용되는 최대 소수자릿수(실수))
	private String d9;
	

	public SpringBean() {
		this.d1=false;
		this.d2=true;
		this.d3=null;
		this.d4="aa";
		this.d5="30";
		this.d6="abcd";
		this.d8="30";
		this.d9="11.11";
	}
	public boolean isD1() {
		return d1;
	}

	public void setD1(boolean d1) {
		this.d1 = d1;
	}

	public boolean isD2() {
		return d2;
	}

	public void setD2(boolean d2) {
		this.d2 = d2;
	}
	public String getD3() {
		return d3;
	}
	public void setD3(String d3) {
		this.d3 = d3;
	}
	public String getD4() {
		return d4;
	}
	public void setD4(String d4) {
		this.d4 = d4;
	}
	public String getD5() {
		return d5;
	}
	public void setD5(String d5) {
		this.d5 = d5;
	}
	public String getD6() {
		return d6;
	}
	public void setD6(String d6) {
		this.d6 = d6;
	}
	public String getD7() {
		return d7;
	}
	public void setD7(String d7) {
		this.d7 = d7;
	}
	public String getD8() {
		return d8;
	}
	public void setD8(String d8) {
		this.d8 = d8;
	}
	public String getD9() {
		return d9;
	}
	public void setD9(String d9) {
		this.d9 = d9;
	}
}
