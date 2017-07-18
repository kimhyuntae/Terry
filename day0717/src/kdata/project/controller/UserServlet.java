package kdata.project.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kdata.project.service.NextPage;
import kdata.project.service.UserDetailService;
import kdata.project.service.UserListService;
import kdata.project.service.UserRegisterService;
import kdata.project.service.UserService;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet("*.kdata")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("User Servlet");
		
		String url = request.getRequestURI();
		String path= request.getContextPath();		
				
		String cmd = url.substring(path.length()+1);
		
		/*System.out.println(url);
		System.out.println(path);	//day0717만 나옴, 이것을 자르는 작업을 하려함
		System.out.println(path.length());*/
		
		//페이지 이동 어떻게 할지 생각
		
		System.out.println(cmd);
		
		UserService service = null;
		NextPage nextPage = null;
				
		//회원가입
		if(cmd.equals("register.kdata")){
			System.out.println("회원가입");
			service = new UserRegisterService();
			nextPage = service.execute(request,  response);	//interface 사용
		}
		//회원 리스트
		else if(cmd.equals("list.kdata")){
			System.out.println("회원 리스트");
			service = new UserListService();
			nextPage = service.execute(request,  response);
			//System.out.println(nextPage);

		}
		//회원 상세페이지
		else if(cmd.equals("detail.kdata")){
			System.out.println("회원 상세페이지");
			service = new UserDetailService();
			nextPage = service.execute(request, response);
		}
		//회원 정보 삭제
		else if(cmd.equals("delete.kdata")){
			System.out.println("회원 정보 삭제");
		}
		//로그인
		else if(cmd.equals("login.kdata")){
			System.out.println("로그인");
		}
		
		
		//로그아웃
		else if(cmd.equals("logout.kdata")){
			System.out.println("로그아웃");
		}
		
		//2.다음페이지 이동
		
		if(nextPage==null){
			System.out.println("널을 반환햇구나..");
		}		
		else {			
			if(nextPage.isRedirect()){			
				response.sendRedirect(nextPage.getPageName());
		}else{
			request.getRequestDispatcher(nextPage.getPageName()).forward(request,response);
		}
			
		}
		}
	
		

	
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		doGet(request, response);
	}

}






