package kdata.project.service;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kdata.project.dao.UserDAO;
import kdata.project.dto.User;

public class UserListService implements UserService {

	@Override
	public NextPage execute(HttpServletRequest request, HttpServletResponse response) {
		// 2. DB ��� ó�� //DAO method ó��

		
		//UserDAO dao = UserDAO.getInstance();
		List<User> list=null;
		
		 try {
	         list = UserDAO.getInstance().selectAll();
	      } catch (SQLException e) {
	         // TODO Auto-generated catch block
	         e.printStackTrace();
	      }
		 		 
		// 3. DB ��� ó��
		
		request.setAttribute("list", list);
		//System.out.println(list.size());
		
		// 4. �̵��� ���������� ó�� //����,���н�
		NextPage nextPage = new NextPage();
		nextPage.setPageName("./user/list.jsp");
		nextPage.setRedirect(false);
				
		return nextPage;
	}

}
