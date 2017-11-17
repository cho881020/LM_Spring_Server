package kr.co.tje.mappers;

import java.util.List;
import java.util.Map;

import kr.co.tje.dao.LectureDAO;
import kr.co.tje.dao.UserDAO;

public interface LmMapper {
	
	public List<LectureDAO> select_all_lectures();
	public List<UserDAO> select_students_by_lecture_id(Map<String, Object> map);
	

}
