package project.momento.mypage.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MypageController {
	
	/*
	 * @Autowired private SignService SignService;
	 */
	
//	@Autowired
//	private ChartService ChartService;

	/*
	 * chart사이트로 이동
	 */
	@RequestMapping(value="/mypage.com", produces="application/text;charset=utf-8") /* value주소 이름*/
	public String mypage( Model model) {
	    return "content/mypage";
	}
	
}
