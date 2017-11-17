package kr.co.tje.controllers;

import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.co.tje.dao.LectureDAO;
import kr.co.tje.service.LmService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	
	@Resource(name="kr.co.tje.service.LmServiceImpl")
	private LmService mService;
	
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping(value="/login")
	public String login() {
//		단순히 화면을 띄워주기 위한 임시 조치.
		return "temp";
	}
	
	@RequestMapping(value="/get_all_lectures")
	@ResponseBody
	public Map<String, Object> getAllLectures() {
		
		Map<String, Object> resultMap = new HashMap<String, Object>();
		
		resultMap.put("메세지", "모든 강의를 불러옵니다..");
		resultMap.put("result", true);
		
		List<LectureDAO> lectureList = mService.getAllLectures();
		
		resultMap.put("lectures", lectureList);
		
		
		return resultMap;
		
	}
	
}








