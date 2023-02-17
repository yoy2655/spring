package co.jw.sol.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.session.RowBounds;

import co.jw.sol.beans.Content;

public interface BoardMapper {

	// SelectKey는 시퀀스를 뽑아 content_idx에 넣고 insert 전에(before=true) int 타입으로 실행해줄떄 사용하는
	// 작업을 한다
	// SelectKey는 자동생성키와 같다(객체에 바로바로 넣는것이다)
	@SelectKey(statement = "select content_seq.nextval from dual", keyProperty = "content_idx", before = true, resultType = int.class)

	@Insert("insert into content_table(content_idx, content_subject, content_text, "
			+ "content_writer_idx, content_board_idx, content_date) "
			+ "values(#{content_idx}, #{content_subject}, #{content_text}, #{content_writer_idx},#{content_board_idx},sysdate)")
	void addContent(Content writeBean);

	@Select("select board_info_name from board_info_table where board_info_idx=#{board_info_idx}")
	String getBoard(int board_info_idx);

	@Select("select A1.content_idx, A1.content_subject, A2.user_name as content_writer_name, "
			+ "       to_char(A1.content_date, 'YYYY-MM-DD') as content_date " + "from content_table A1, user_table A2 "
			+ "where A1.content_writer_idx = A2.user_idx " + "      and A1.content_board_idx =#{board_info_idx} "
			+ "order by A1.content_idx desc")
	List<Content> getContent(int board_info_idx, RowBounds row);

	@Select("select A2.user_name as content_writer_name, "
			+ "  to_char(A1.content_date, 'YYYY-MM-DD') as content_date, "
			+ "  A1.content_subject, A1.content_text, A1.content_writer_idx "
			+ "  from content_table A1, user_table A2 " + " where A1.content_writer_idx=A2.user_idx "
			+ " and content_idx = #{content_idx}")
	Content ContentInfo(int content_idx);

	@Update("update content_table set content_subject=#{content_subject}, content_text=#{content_text} where content_idx=#{content_idx}")
	void modifyContent(Content modifyBean);

	@Delete("delete from content_table where content_idx=#{content_idx}")
	void deleteContent(int content_idx);

	// 전체글의 개수 알아내는 쿼릐
	@Select("select count(*) from content_table where content_board_idx=#{content_board_idx}")
	int getCnt(int content_board_idx);
}