package co.jw.sol.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.jw.sol.beans.BoardInfo;
import co.jw.sol.mapper.TopmenuMapper;

@Repository
public class TopmenuDao {
	@Autowired
	private TopmenuMapper topmenuMapper;

	public List<BoardInfo> getTopmenuList() { // 추상메서드니까 오버라이딩 해준다
		List<BoardInfo> topmenuList = topmenuMapper.getTopmenuList();
		return topmenuList;
	}
}
