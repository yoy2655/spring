package co.jw.sol.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.jw.sol.beans.BoardInfo;
import co.jw.sol.dao.TopmenuDao;

@Service
public class TopmenuService {

	@Autowired
	private TopmenuDao topmenuDao;

	public List<BoardInfo> getTopmenuList() {
		List<BoardInfo> topmenuList = topmenuDao.getTopmenuList();
		return topmenuList;
	}
}
