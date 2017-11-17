package kr.co.tje.mappers;

import java.util.List;

import kr.co.tje.dao.LectureDAO;

public interface LmMapper {
	
	public List<LectureDAO> select_all_lectures();

}
