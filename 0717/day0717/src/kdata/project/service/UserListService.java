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
		// 2. DB 결과 처리 //DAO method 처리

		
		//UserDAO dao = UserDAO.getInstance();
		List<User> list=null;
		
		 try {
	         list = UserDAO.getInstance().selectAll();
	      } catch (SQLException e) {
	         // TODO Auto-generated catch block
	         e.printStackTrace();
	      }
		 		 
		// 3. DB 결과 처리
		
		request.setAttribute("list", list);
		//System.out.println(list.size());
		
		// 4. 이동할 다음페이지 처리 //성공,실패시
		NextPage nextPage = new NextPage();
		nextPage.setPageName("./user/list.jsp");
		nextPage.setRedirect(false);
				
		return nextPage;
	}

}
