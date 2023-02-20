package co.jw.sol.service;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.jw.sol.beans.User;
import co.jw.sol.dao.UserDao;

@Service
public class UserService {
	@Autowired
	private UserDao userDao;

	@Resource(name = "loginBean")
	private User loginBean;

	public boolean checkIdExist(String user_id) {
		String user_name = userDao.checkIdExist(user_id);

		if (user_name == null) {
			return true;
		} else {
			return false;
		}
	}

	public void addUser(User joinBean) {
		userDao.addUser(joinBean);
	}

	public void getLoginUser(User tmpLoginBean) {
		User tmp = userDao.getLoginUser(tmpLoginBean);

		if (tmp != null) {
			loginBean.setUser_idx(tmp.getUser_idx());
			loginBean.setUser_name(tmp.getUser_name());
			loginBean.setUserLogin(true);
		}
	}

	public void getModify(User modifyBean) {
		User tmp = userDao.getModify(loginBean.getUser_idx());
		modifyBean.setUser_id(tmp.getUser_id());
		modifyBean.setUser_name(tmp.getUser_name());
		modifyBean.setUser_idx(loginBean.getUser_idx());
	}

	public void modifyUser(User modifyBean) {
		modifyBean.setUser_idx(loginBean.getUser_idx());
		userDao.modifyUser(modifyBean);
	}
}
