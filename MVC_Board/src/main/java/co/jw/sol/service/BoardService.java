package co.jw.sol.service;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

import co.jw.sol.beans.Content;
import co.jw.sol.beans.Page;
import co.jw.sol.beans.User;
import co.jw.sol.dao.BoardDao;

@Service
@PropertySource("/WEB-INF/properties/option.properties")
public class BoardService {

	@Value("${page.listcount}")
	private int page_listcount;

	@Value("${page.pa}")
	private int page_pa;

	@Autowired
	private BoardDao boardDao;

	@Resource(name = "loginBean")
	private User loginBean;

	public void addContent(Content writeBean) {
		writeBean.setContent_writer_idx(loginBean.getUser_idx());
		boardDao.addContent(writeBean);
	}

	public String getBoard(int board_info_idx) {
		return boardDao.getBoard(board_info_idx);
	}

	public List<Content> getContent(int board_info_idx, int page) {

		// 1->0 0->0
		// 2->10 1->10
		// 3->20 2->20

		// 페이지가 1일때는 0
		// 페이지가 2일때는 10
		// 페이지가 3일때는 20
		// 0일때는 0
		// 1일때는 10까지
		// 2일때는 11부터 까지

		int start = (page - 1) * page_listcount; // 0부터 시작하겠다
		RowBounds row = new RowBounds(start, page_listcount);
		// RowBounds():어디부터 어디까지 구하고 싶을때 행만 나오게하는 메서드

		return boardDao.getContent(board_info_idx, row);
	}

	public Content ContentInfo(int content_idx) {
		return boardDao.ContentInfo(content_idx);
	}

	public void modifyContent(Content modifyBean) {
		boardDao.modifyContent(modifyBean);
	}

	public void deleteContent(int content_idx) {
		boardDao.deleteContent(content_idx);
	}

	public Page getCnt(int content_board_idx, int currentPage) {
		int cnt = boardDao.getCnt(content_board_idx);
		Page pg = new Page(cnt, currentPage, page_listcount, page_pa);
		return pg;

	}
}
