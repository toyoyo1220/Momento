package project.momento.login.controller;

import java.io.IOException;
import java.sql.ResultSet;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import project.momento.login.dto.LoginDto;
import project.momento.login.service.LoginService;

@Controller
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	/*
	 * 로그인 페이지 이동
	 * param
	 * return contents/login
	 */
	@RequestMapping(value="/login.com", produces="application/text;charset=utf-8") /* value주소 이름*/
	public String gologinMain( Model model) {
	    return "content/login";
	}
	/*
	 * 로그인 페이지 ->회원가입 페이지 이동 
	 *           ->메인 페이지 이동
	 * param loginUp
	 * return contents/loginUp
	 */
	
	@RequestMapping(value="/loginUp.com", produces="application/text;charset=utf-8") /* value주소 이름*/
	public String goSignMain( Model model, LoginDto loginDto, HttpServletRequest request) {  // 입력값(id,pwd)를 loginDto에 넣기

		HttpSession session = request.getSession(); 
		LoginDto loginCheck = new LoginDto(); //loginDto 를 체크에넣기
		loginCheck = loginService.checkLogin(loginDto);
		if(loginCheck == null) { //loginCheck안에있는 id, pwd에 값이 없으면
			return "content/login";   //로그인화면
		}else {
				session.setAttribute("loginCheck", loginCheck);  // 아이디 세션에 저장
//				session.setAttribute("login", "yes");  //로그인상태 세션에저장s
//				session.setAttribute("saveok", cbsave);  // 아이디 저장 여부
				
			return "content/main";   //있으면 메인화면
		}
	}
	@RequestMapping(value="/logout.com", produces="application/text;charset=utf-8") 
	public String logout(HttpSession session, HttpServletRequest request)throws Exception {
		
		session.invalidate();
		return "content/login";
	}
	
//	@RequestMapping(value = "/loginUser.com", produces="application/text;charset=utf-8")
//	public String upLogin(String id, String pwd, LoginDto loginCheckBox) {
//		LoginDto loginBox = new LoginDto();
//		loginCheckBox = loginService.loginCheckBox(loginBox);
//		
//		return "content/main";
//	}
//	//로그인
//	@PostMapping("content/login")
//	public String loginProc(@RequestParam String id,
//			@RequestParam String pwd,
//			@RequestParam (required = false) String cbsave,
//			HttpSession session) {
////		아이디 비밀번호 일치하는지 확인하는 메서드 호출
//		int check=Service.getIDPassCheck(id, pwd);
//		//참일경우 세션에 저장
//		if(check==1) {
//			session.setAttribute("myid", id);  // 아이디 세션에 저장
//			session.setAttribute("login", "yes");  //로그인상태 세션에저장
//			session.setAttribute("saveok", cbsave);  // 아이디 저장 여부
//			return "redirect:main";
//		}else {
//			return "content/logoutfrom";   //로그인 실패시 실패를 알리는 jsp이동 --지금은그냥 로그인페이지
//			}
//	}
	
//	//로그아웃 메서드
//	@GetMapping("contnet/login")
//	public String logout(HttpSession session) {
//		session.removeAttribute("loginok");	
//		return "content/login";
//	}
//	//로그인 시 아이디 저장해 남길 수있도록 하는메섣
//	@GetMapping("content/login")
//	public String form(HttpSession session, Model model) {
//		//로그인 상태인지 아닌지
//		String loginok=(String)session.getAttribute("loginik");
//		// 아이디 얻어오기?
//		String myid=(String)session.getAttribute("myid");
//		
//		if(loginok==null)
//			return "content/login";
//		else {
//			// 로그인중에 로그인한 이름 저장
//			String name=Service.getName(myid);
//			//request저장
//			model.addAttribute("name", name);
//			return "content/login";
//			}
//		}
}


