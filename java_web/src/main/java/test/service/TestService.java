package test.service;

import test.dao.TestDao;
import test.domain.RequestTestDTO;
import test.domain.ResponseTestDTO;

public class TestService {
	
	private TestDao dao ;
	
	public TestService() {
		dao = new TestDao();
	}
	
	public ResponseTestDTO login(RequestTestDTO params) {
		System.out.println("debug >>> service login params = " + params);
		return dao.loginRow(params);
	}
}
 