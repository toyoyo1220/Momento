package project.momento.mypage.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import project.momento.chart.dto.ChartDto;

@Controller
public class MypageController {
	
	/*
	 * @Autowired private SignService SignService;
	 */
	
//	@Autowired
//	private ChartService ChartService;

	/*
	 * 사이트에서 이동
	 */
	@RequestMapping(value="/mypage.com", produces="application/text;charset=utf-8") /* value주소 이름*/
	public String mypage( Model model) {
	    return "content/mypage";
	}
	
	/*
	 * chart에서 값가져오기
	 */
	@GetMapping(value = "/mypage.com",produces="application/text;charset=utf-8")
	private String getchart(HttpServletRequest request) {
		HttpSession session = request.getSession();
		ChartDto chartCheck = new ChartDto();
		System.out.println(chartCheck);
		return "content/mypage";
	}
}
