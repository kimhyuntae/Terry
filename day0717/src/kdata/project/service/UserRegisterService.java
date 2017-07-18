package kdata.project.service;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kdata.project.dao.UserDAO;
import kdata.project.dto.User;

public class UserRegisterService implements UserService {

	@Override
	public NextPage execute(HttpServletRequest request, HttpServletResponse response) {
		
		//1. ��û �Ķ���� ó��
		String id= request.getParameter("id");
		String pw= request.getParameter("pw");
		String name= request.getParameter("name");
				
		//2. DB ��� ó��	//DAO method ó��
		User user=new User(id, pw, name);
		
		int result = 0;
		
		UserDAO dao = UserDAO.getInstance();
		try {
			result=dao.insert(user);
		} catch (SQLException e) {

			e.printStackTrace();
		}		
		//UserDAO.getIntstance().insert(); //����¥��
		
		
				
		//3. DB ��� ó��
		
		
		//4. �̵��� ���������� ó��	//����,����
		NextPage nextPage = new NextPage();
		if(result != 0){
			nextPage.setPageName("./user/login.jsp");
			nextPage.setRedirect(true);
		}
		else{		//ȸ������ ���н�
			request.setAttribute("errorMsg","ȸ�����Կ� ����");
			nextPage.setPageName("./errors/error.jsp");
			nextPage.setRedirect(false);
			
		}
		
		return nextPage;
	}
	
}
