package co.jw.sol.dao;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.jw.sol.beans.Content;
import co.jw.sol.beans.User;
import co.jw.sol.mapper.BoardMapper;

@Repository
public class BoardDao {

	@Autowired
	private BoardMapper boardMapper;

	@Resource(name = "loginBean")
	private User loginBean;

	public void addContent(Content writeBean) {
		writeBean.setContent_writer_idx(loginBean.getUser_idx());
		for(int i=0; i<525; i++) {	//페이징처리 해준다
			boardMapper.addContent(writeBean);
		}
	}

	public String getBoard(int board_info_idx) {
		return boardMapper.getBoard(board_info_idx);
	}

	public List<Content> getContent(int board_info_idx, RowBounds row) {
		return boardMapper.getContent(board_info_idx, row);
	}

	public Content ContentInfo(int content_idx) {
		return boardMapper.ContentInfo(content_idx);
	}

	public void modifyContent(Content modifyBean) {
		boardMapper.modifyContent(modifyBean);
	}

	public void deleteContent(int content_idx) {
		boardMapper.deleteContent(content_idx);
	}
	
	public int getCnt(int content_board_idx) {
		return boardMapper.getCnt(content_board_idx);
	}
}
