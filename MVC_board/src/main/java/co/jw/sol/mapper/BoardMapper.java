package co.jw.sol.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Select;
import co.jw.sol.beans.BoardInfo;

public interface BoardMapper {

	@Select("select board_info_idx, board_info_name" + 
			"from board_info_table" + 
			"order by board_info_idx;")
	List<BoardInfo> getTopmenuList();
}
