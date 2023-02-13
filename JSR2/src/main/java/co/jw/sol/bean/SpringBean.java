package co.jw.sol.bean;

import javax.validation.constraints.Email;
import javax.validation.constraints.Negative;
import javax.validation.constraints.NegativeOrZero;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Positive;
import javax.validation.constraints.PositiveOrZero;

public class SpringBean {
	@NotBlank
	private String d1;
	// 공백을 제거하고 길이가 0이면 오류 발생(공백이면 안된다)

	@NotEmpty
	private String d2;
	// 값의 길이가 0이면 오류 발생=>공백도 글자로 인식함(공백이면 안된다)

	@Positive
	private int d3;
	// 양수 아니면 오류 발생

	@PositiveOrZero
	private int d4;
	// 양수 아니면 오류발생(양수또는0이여야한다)

	@Negative
	private int d5;
	// 음수아니면 오류발생(음수여야한다)

	@NegativeOrZero
	private int d6;
	// 음수아니면 오류발생(음수또는0이여야한다)

	@Email
	private String d7;
	// @골뱅이 없으면 오류 발생

	public SpringBean() {

		this.d1 = "ab";
		this.d2 = "ab";
		this.d3 = 44;
		this.d4 = 44;
		this.d5 = -55;
		this.d6 = -55;
	}

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

	public int getD3() {
		return d3;
	}

	public void setD3(int d3) {
		this.d3 = d3;
	}

	public int getD4() {
		return d4;
	}

	public void setD4(int d4) {
		this.d4 = d4;
	}

	public int getD5() {
		return d5;
	}

	public void setD5(int d5) {
		this.d5 = d5;
	}

	public int getD6() {
		return d6;
	}

	public void setD6(int d6) {
		this.d6 = d6;
	}

	public String getD7() {
		return d7;
	}

	public void setD7(String d7) {
		this.d7 = d7;
	}
}
