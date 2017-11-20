package kr.co.tje.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.tje.dao.LectureDAO;
import kr.co.tje.dao.UserDAO;
import kr.co.tje.mappers.LmMapper;

@Service("kr.co.tje.service.LmServiceImpl")
public class LmServiceImpl implements LmService {
	
	@Autowired
	private LmMapper mapper;

	@Override
	public List<LectureDAO> getAllLectures() {
		
		List<LectureDAO> lectureList = mapper.select_all_lectures();
		
		return lectureList;
	}

	@Override
	public List<UserDAO> getStudentsByLecture(Map<String, Object> map) {

		List<UserDAO> users = mapper.select_students_by_lecture_id(map);
		
		return users;
	}

	@Override
	public UserDAO getTeacherFromLecture(Map<String, Object> map) {

		List<UserDAO> teacherList =  mapper.get_teacher_by_lecture_id(map);
		UserDAO teacher = teacherList.get(0);
		
		return teacher;
	}

	@Override
	public void insertUserInfo(Map<String, Object> map) {
		// TODO Auto-generated method stub
		mapper.insert_user(map);
		
	}

	@Override
	public void insertUserData(Map<String, Object> map) {
		
		mapper.insert_user2(map);
		
	}
	

}



