package project.momento.imgup.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.multipart.MultipartFile;

import project.momento.imgup.dto.ImgupDto;
import project.momento.imgup.service.ImgupService;

@Controller
public class ImgupController {
	
//	 @Autowired
//	 private ImgupService imgupService;
	

	/*
	 * 이미지 페이지 이동
	 * param
	 */
	@RequestMapping(value="/imgup.com", produces="application/text;charset=utf-8") /* value주소 이름*/
	public String imgupMain( Model model) {
	    return "content/imgup";
	}
	
	/*
	 * 이미지 저장
	 * param 
	 * return  
	 */
	@PostMapping(value = "/imgupdate.com",produces="application/text;charset=utf-8") /* value주소 이름*/
	public String imgupdate(ImgupDto imgupDto) {
		System.out.println(imgupDto.getImgFile());
		MultipartFile uploadFile = imgupDto.getImgFile();
		System.out.println(uploadFile.getOriginalFilename());
//		ImgupService.imgupFile(imgupDto);
		return "content/imgup";
	}
}