package kr.co.tje.service;

import java.util.List;
import java.util.Map;

import kr.co.tje.dao.LectureDAO;
import kr.co.tje.dao.UserDAO;

public interface LmService {

	public List<LectureDAO> getAllLectures();
	
	public List<UserDAO> getStudentsByLecture(Map<String, Object> map);
	
	
}
