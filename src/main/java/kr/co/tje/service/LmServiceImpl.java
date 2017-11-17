package kr.co.tje.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.tje.dao.LectureDAO;
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

}
