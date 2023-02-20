package co.jw.sol.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.jw.sol.beans.BoardInfo;
import co.jw.sol.mapper.TopmenuMapper;

//서비스와 다오의 차이점은
//서비스는 비즈니스 로직을 읽어서 컨트롤러로 넘기는 작업이라는 것이고
//다오는 그것을 안한다는 점에서
//역할이 좀 다르다

@Repository
public class TopmenuDao {	//dao:단일데이터 접근 및 갱신만 처리, 사용자 요청사항을 dao에서는 처리를 안한다
							//service: 여러 dao를 호출하여 여러번의 데이터 접근 및 갱신을 한다.
							//		   데이터에 대한 비즈니스 로직 수행(서비스가 하나의 비즈니스를 처리하는 단위이다)
							//		   dao를 여러개 묶어 놓은것과 같다
	@Autowired
	private TopmenuMapper topmenuMapper;

	public List<BoardInfo> getTopmenuList() { // 추상메서드니까 오버라이딩 해준다
		List<BoardInfo> topmenuList = topmenuMapper.getTopmenuList();
		return topmenuList;
	}
}

//service: user가 요청한 작업을 처리하는 과정을 하나로 묶은 것
//dao: curd(데이터베이스 쿼리문)작업을 하나씩 분할해 놓은 것, 사용자 요청을 처리하는 작업이 사실은 dao는 아님