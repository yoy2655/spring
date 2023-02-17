package co.jw.sol.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import co.jw.sol.beans.User;

public interface UserMapper {
	@Select("select user_name from user_table where user_id=#{user_id}")
	String checkIdExist(String user_id);

	@Insert("insert into user_table (user_idx, user_name, user_id, user_pw) "
			+ "values (user_seq.nextval, #{user_name}, #{user_id}, #{user_pw})")
	void addUser(User joinBean);
	
	@Select("select user_idx, user_name "+
			"from user_table "+
			"where user_id=#{user_id} and user_pw=#{user_pw}")
	User getLoginUser(User tmpLoginBean);
	
	@Select("select user_id, user_name "+			
			"from user_table "
			+ "where user_idx=#{user_idx}")
	User getModify(int user_idx);
	
	@Update("update user_table set user_pw=#{user_pw} where user_idx=#{user_idx}")
	void modifyUser(User modifyBean);

}
