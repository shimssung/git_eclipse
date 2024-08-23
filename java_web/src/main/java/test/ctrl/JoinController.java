package test.ctrl;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import test.domain.RequestJoinDTO;
import test.service.JoinService;

@WebServlet("/joinUser")
public class JoinController extends HttpServlet {
	private JoinService service ;
	
	// 객체 생성시
	public void init() {
		System.out.println("인스턴스 생성시 딱 한번 호출되는 콜백함수입니다.");
		service = new JoinService();
	}
	
	public void destroy() {
		System.out.println("메모리상에서 allocation 될 때 딱 한번 호출되는 콜백함수입니다.");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
		throws ServletException, IOException {
		process (request, response);
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
		throws ServletException, IOException {
		process (request, response);
		
	}
	
	protected void process(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
				String uri = request.getRequestURI();
				System.out.println("debug >>> client path : " + uri);
				System.out.println("debug >>> client request method : " + request.getMethod());
				
				// 사용자 입력 값 받기
				String id 	  = request.getParameter("id");
				String pwd 	  = request.getParameter("pwd");
				String name   = request.getParameter("name");
				String gender = request.getParameter("gender");
				RequestJoinDTO params = new RequestJoinDTO();
				params.setId(id); params.setPwd(pwd); params.setName(name); params.setGender(gender);
				
				String result = service.join(params);
				
				// 반환받은 response 조건처리 & 데이터 쉐어
				// 데이터를 쉐어하기 위해서 세션 객체를 만들고 데이터를 심는다.
				HttpSession session = request.getSession();
				session.setAttribute("Msg", result);
				response.sendRedirect("JoinOk.jsp");
				
			}
}