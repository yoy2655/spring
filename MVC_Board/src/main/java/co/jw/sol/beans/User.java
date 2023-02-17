package co.jw.sol.beans;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class User {
	private int user_idx;

	@Size(min = 3, max = 5)
	@Pattern(regexp = "[가-힣]*")
	private String user_name;

	@Size(min = 5, max = 10)
	@Pattern(regexp = "[a-zA-Z0-9]*")
	private String user_id;

	@Size(min = 5, max = 10)
	@Pattern(regexp = "[a-zA-Z0-9]*")
	private String user_pw;

	@Size(min = 5, max = 10)
	@Pattern(regexp = "[a-zA-Z0-9]*")
	private String user_pw2;

	private boolean idExist;
	private boolean userLogin;

	public User() {
		this.idExist = false; // 디폴트_false(중복확인 안되어있음)
		this.userLogin = false;	//디폴트_false(로그인 안되어있음)
	}
	
	public boolean isUserLogin() {
		return userLogin;
	}

	public void setUserLogin(boolean userLogin) {
		this.userLogin = userLogin;
	}

	public boolean isIdExist() {
		return idExist;
	}

	public void setIdExist(boolean idExist) {
		this.idExist = idExist;
	}

	public int getUser_idx() {
		return user_idx;
	}

	public void setUser_idx(int user_idx) {
		this.user_idx = user_idx;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getUser_pw() {
		return user_pw;
	}

	public void setUser_pw(String user_pw) {
		this.user_pw = user_pw;
	}

	public String getUser_pw2() {
		return user_pw2;
	}

	public void setUser_pw2(String user_pw2) {
		this.user_pw2 = user_pw2;
	}
}
