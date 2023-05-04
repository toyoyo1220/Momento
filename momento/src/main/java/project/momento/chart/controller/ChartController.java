package project.momento.chart.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import project.momento.chart.dto.ChartDto;
import project.momento.chart.service.ChartService;

@Controller
public class ChartController {
	
	/*
	 * @Autowired private SignService SignService;
	 */
	
//	@Autowired
//	private ChartService chartService;

	/*
	 * chart사이트로 이동
	 */
	@RequestMapping(value="/chart.com", produces="application/text;charset=utf-8") /* value주소 이름*/
	public String chartMain( Model model) {
	    return "content/chart";
	}
//	/*
//	 * 상품 클릭시 마이페이지로
//	 */
//	@PostMapping(value="/mypage.com", produces="application/text;charset=utf-8")
//	public String product( Model model,ChartDto chartDto) {
//		ChartService.userpage(chartDto);
//		return "content/mypage";
//	}
	
	/*
	 * 두피 검사 결과 확인버튼
	 */
//	@RequestMapping(value="/mypage.com", produces="application/text;charset=utf-8")
//	public String marksChart( Model gramp) {		
//		return "content/mypage"; 
//	}
	
}