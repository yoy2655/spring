package co.jw.sol.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.jw.sol.beans.User;
import co.jw.sol.mapper.UserMapper;

@Repository
public class UserDao {
	@Autowired
	private UserMapper userMapper;

	public String checkIdExist(String user_id) {
		return userMapper.checkIdExist(user_id);
	}

	public void addUser(User joinBean) {
		userMapper.addUser(joinBean);
	}

	public User getLoginUser(User tmpLoginBean) {
		return userMapper.getLoginUser(tmpLoginBean);
	}

	public User getModify(int user_idx) {
		return userMapper.getModify(user_idx);
	}

	public void modifyUser(User modifyBean) {
		userMapper.modifyUser(modifyBean);
	}
}
