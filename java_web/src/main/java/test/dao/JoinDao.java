package test.dao;

import test.domain.RequestJoinDTO;

public class JoinDao {
	
	
	public JoinDao() {
		
	}
	
	public String joinRow(RequestJoinDTO params) {
			System.out.println("입력 데이터" + params.toString());
			String Msg = "회원가입이 완료되었습니다.";
			return Msg ;

	}
}
 