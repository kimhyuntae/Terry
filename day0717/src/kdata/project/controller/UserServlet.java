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
		System.out.println(path);	//day0717�� ����, �̰��� �ڸ��� �۾��� �Ϸ���
		System.out.println(path.length());*/
		
		//������ �̵� ��� ���� ����
		
		System.out.println(cmd);
		
		UserService service = null;
		NextPage nextPage = null;
				
		//ȸ������
		if(cmd.equals("register.kdata")){
			System.out.println("ȸ������");
			service = new UserRegisterService();
			nextPage = service.execute(request,  response);	//interface ���
		}
		//ȸ�� ����Ʈ
		else if(cmd.equals("list.kdata")){
			System.out.println("ȸ�� ����Ʈ");
			service = new UserListService();
			nextPage = service.execute(request,  response);
			//System.out.println(nextPage);

		}
		//ȸ�� ��������
		else if(cmd.equals("detail.kdata")){
			System.out.println("ȸ�� ��������");
			service = new UserDetailService();
			nextPage = service.execute(request, response);
		}
		//ȸ�� ���� ����
		else if(cmd.equals("delete.kdata")){
			System.out.println("ȸ�� ���� ����");
		}
		//�α���
		else if(cmd.equals("login.kdata")){
			System.out.println("�α���");
		}
		
		
		//�α׾ƿ�
		else if(cmd.equals("logout.kdata")){
			System.out.println("�α׾ƿ�");
		}
		
		//2.���������� �̵�
		
		if(nextPage==null){
			System.out.println("���� ��ȯ�ޱ���..");
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






