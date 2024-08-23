package test.dao;

import test.domain.RequestTestDTO;
import test.domain.ResponseTestDTO;

public class TestDao {
	
	private ResponseTestDTO response ;
	
	public TestDao() {
		response = new ResponseTestDTO();
	}
	
	public ResponseTestDTO loginRow(RequestTestDTO params) {
		System.out.println("debug >>> dao loginRow params = " +params);
		if (params.getId().equals("jslim") && params.getPwd().equals("jslim")) {
			System.out.println(">>> 인증성공");
			response.setName("섭섭해");
			return response ;
		} else {
			System.out.println(">>> 인증실패");
			return null;
		}
	}
}
