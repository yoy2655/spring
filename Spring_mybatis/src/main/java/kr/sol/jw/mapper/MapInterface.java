package kr.sol.jw.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import kr.sol.jw.beans.JBean;

public interface MapInterface {
	@Select("select num1,str1 from spr_table")
	List<JBean> sel();
	
	@Insert("insert into spr_table(num1,str1) values(#{num1},#{str1})")
	void in(JBean bean);
	
	@Update("update spr_table set str1=#{str1} where num1=#{num1}")
	void up(JBean bean);
	
	@Delete("delete from spr_table where num1=#{num1}")
	void de(int num1);
}
