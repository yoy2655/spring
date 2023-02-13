package co.jw.sol.bean;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;

public class SpringBean {
	@NotEmpty
	@Pattern(regexp ="[가-힣]*", message="이름은 한글만 가능")
	private String name;
	@NotEmpty
	@Pattern(regexp ="[0-9]{6}", message="주민번호 앞은 6글자")
	private String jumin1;
	@NotEmpty
	@Pattern(regexp ="[0-9]{7}", message="주민번호 뒤는 7글자")
	private String jumin2;
	@NotEmpty
	@Pattern(regexp = "[a-zA-Z]*", message="id는 영문만")
	@Length(min = 4)
	private String id;
	@NotEmpty
	@Pattern(regexp = "[a-zA-Z]*", message="pw1는 영문만")
	private String pwd1;
	@NotEmpty
	@Pattern(regexp = "[a-zA-Z]*", message="pw2는 영문만")
	private String pwd2;
	@NotEmpty
	@Pattern(regexp = "[a-zA-Z]{2,10}+@[a-zA-Z]{2,10}", message="이메일은 영문 10글자이내")
	private String email1;
	@NotEmpty
	private String zipcode;
	@NotEmpty
	@Pattern(regexp ="[가-힣]*", message="주소1은 한글만 가능")
	private String addr1;
	@NotEmpty
	@Pattern(regexp ="[가-힣]*", message="주소2는 한글만 가능")
	private String addr2;
	@NotEmpty
	// 폰번호는 -를 포함해야됨
	private String phone;
	@NotEmpty
	private String job;
	@NotEmpty
	private String no;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJumin1() {
		return jumin1;
	}

	public void setJumin1(String jumin1) {
		this.jumin1 = jumin1;
	}

	public String getJumin2() {
		return jumin2;
	}

	public void setJumin2(String jumin2) {
		this.jumin2 = jumin2;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd1() {
		return pwd1;
	}

	public void setPwd1(String pwd1) {
		this.pwd1 = pwd1;
	}

	public String getPwd2() {
		return pwd2;
	}

	public void setPwd2(String pwd2) {
		this.pwd2 = pwd2;
	}

	public String getEmail1() {
		return email1;
	}

	public void setEmail1(String email1) {
		this.email1 = email1;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getAddr1() {
		return addr1;
	}

	public void setAddr1(String addr1) {
		this.addr1 = addr1;
	}

	public String getAddr2() {
		return addr2;
	}

	public void setAddr2(String addr2) {
		this.addr2 = addr2;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}
}
