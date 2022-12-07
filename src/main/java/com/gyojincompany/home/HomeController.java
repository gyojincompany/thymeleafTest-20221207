package com.gyojincompany.home;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping(value = "hello")
	public String hello(Model model) {
		
		model.addAttribute("data", "안녕 헬로월드!!");
		
		return "HelloWorld";
	}
	
	@RequestMapping(value = "member")
	public String member(Model model) {
		
		MemberDto memberDto = new MemberDto();
		memberDto.setId("tiger");
		memberDto.setName("홍길동");
		memberDto.setEmail("abc@abc.com");
		memberDto.setAge(27);
		
		model.addAttribute("memberDto", memberDto);
		
		return "member/member";
	}
	
	@RequestMapping(value = "members")
	public String members(Model model) {
		
		List<MemberDto> memberDtos = new ArrayList<MemberDto>();
		
		for(int i=1;i<11;i++) {
			
			MemberDto memberDto = new MemberDto();
			memberDto.setId("tiger"+i);
			memberDto.setName("홍길동");
			memberDto.setEmail("abc@abc.com");
			memberDto.setAge(27);
			
			memberDtos.add(memberDto);
		}
		
		model.addAttribute("memberDtos", memberDtos);
		
		return "member/eachTest";
	}
	
	@RequestMapping(value = "memberif")
	public String memberif(Model model) {
		
		List<MemberDto> memberDtos = new ArrayList<MemberDto>();
		
		for(int i=1;i<11;i++) {
			
			MemberDto memberDto = new MemberDto();
			memberDto.setId("tiger"+i);
			memberDto.setName("홍길동");
			memberDto.setEmail("abc@abc.com");
			memberDto.setAge(27);
			
			memberDtos.add(memberDto);
		}
		
		model.addAttribute("memberDtos", memberDtos);
		
		return "member/ifTest";
	}

}
