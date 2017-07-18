package kdata.project.service;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kdata.project.dao.UserDAO;
import kdata.project.dto.User;

public class UserDetailService implements UserService {

	@Override
	public NextPage execute(HttpServletRequest request, HttpServletResponse response) {

		// 1. 夸没 颇扼固磐 贸府
		String id = request.getParameter("id");
		
		
		// 2. DB 贸府
		User user=null;
		
		 try {
	         user = UserDAO.getInstance().selectById(id);
	      } catch (SQLException e) {
	         // TODO Auto-generated catch block
	         e.printStackTrace();
	      }
		 		
		request.setAttribute("user", user);
				
		NextPage nextPage = new NextPage();
		nextPage.setPageName("./user/detail.jsp");
		nextPage.setRedirect(false);
				
		return nextPage;
		
		
	}

}
