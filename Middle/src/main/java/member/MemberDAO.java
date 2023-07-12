package member;

import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.google.gson.Gson;

@Repository
public class MemberDAO {
	@Autowired @Qualifier("hanul") SqlSession sql;
	public MemberVO login(HashMap<String, String> params) {
		//1. VO내부에는 키값(변수 이름)을 가지고 값을 여러개 할당해 놓을 수 있음.
		//파라미터가 여러개면 VO구조로 묶어서 sql.selectOne파라미터로 전송함
		//2. 해시맵: key와 value를 가지는 가장 vo에 가까운 객체
		//파라미터로 보낼 정보가 VO타입과 맞지 않다면 해시맵 이용
		
		MemberVO vo = sql.selectOne("member.info", params);
		return vo;
	}
}
