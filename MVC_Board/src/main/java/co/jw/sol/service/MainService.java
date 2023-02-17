package co.jw.sol.service;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.jw.sol.beans.Content;
import co.jw.sol.dao.BoardDao;

@Service
public class MainService {

	@Autowired
	private BoardDao boardDao;
	
	public List<Content> getMain(int board_info_idx){
		RowBounds row=new RowBounds(0,5);	//최대 5개(0~5개)가지고 오겠다
		return boardDao.getContent(board_info_idx, row);
	}
}
