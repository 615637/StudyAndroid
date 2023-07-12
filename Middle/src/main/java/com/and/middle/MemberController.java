package com.and.middle;

import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

import member.MemberDAO;
import member.MemberVO;


@RestController @RequestMapping("/member")
public class MemberController {
	//1. 크롬창을 이용해서 url Get방식으로 login처리가 "Y" / "N"이 되는지 확인.
	//2. Android에서 되는지 확인 <- And00_Login 프로젝트 생성 후 개발환경 구축
	//3. Android에서 Edittext를 이용해서 되는지확인
	@Autowired MemberDAO dao;
	@RequestMapping(value = "/login" , produces = "text/html;charset=utf-8")
	public String login(String id, String pw) {
//		MemberDAO dao = new MemberDAO();
		HashMap<String, String> params = new HashMap<String, String>();
		params.put("id", id);
		params.put("pw", pw);
		MemberVO vo = dao.login(params);
		
		return new Gson().toJson(vo);
		
//		MemberVO info = sql.selectOne("member.info", vo);
//		return new Gson().toJson(info);
		
//		if(id.equals("admin") && pw.equals("admin1234")) {
//			System.out.println("Y");
//			return "Y";
//		}
//		return "N";
	}
	
	
	
}
