package kdata.project.service;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kdata.project.dao.UserDAO;
import kdata.project.dto.User;

public class UserIdCheckService implements UserService {

	@Override
	public NextPage execute(HttpServletRequest request, HttpServletResponse response) {

		System.out.println("UserIdCheckService");		
		String id = request.getParameter("id");
		System.out.println(id);
		
		int result=0;
		
		 try {
	         result = UserDAO.getInstance().idcheck(id);
	      } catch (SQLException e) {
	         e.printStackTrace();
	      }
		 	
		 System.out.println(result);		 
		 //id 잇으면 1 	없으면 0
		
		 PrintWriter out=null;
		 
		 try {
			out=response.getWriter();
			out.print(result);;
		} catch (IOException e) {
			e.printStackTrace();
		}
		 
		 		 
		 
		 return null;
	}

}








