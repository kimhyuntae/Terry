package kdata.project.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import kdata.project.dao.UserDAO;
import kdata.project.dto.User;

public class UserRegisterService implements UserService {

	@Override
	public NextPage execute(HttpServletRequest request, HttpServletResponse response) {

		System.out.println("2.userRegisterService ");
		String path = request.getServletContext().getRealPath("profile");
		System.out.println(path);
		MultipartRequest multi=null;
		try {
			multi = new MultipartRequest(request, path, 1024 * 1024 * 10, "UTF-8",
					new DefaultFileRenamePolicy());
		}

		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
			
			
			String id = multi.getParameter("id");
			String pw = multi.getParameter("pw");
			String name = multi.getParameter("name");
			String profile = multi.getParameter("profile");

			Enumeration em = multi.getFileNames();

			String fileSystemName = multi.getFilesystemName("file");
			//String originalFileName = multi.getOriginalFileName("file");

			System.out.println(fileSystemName);
			//System.out.println(originalFileName);
			
			 // 2.DB 처리 -- dao 호출			
			User user=new User(id, pw, name, profile);			 
			int result = 0;		  
			
			UserDAO dao = UserDAO.getInstance(); 
			try{
				result=dao.insert(user); 
			}catch (SQLException e) 
			{		  
			e.printStackTrace(); 
			} //UserDAO.getIntstance().insert(); //한줄짜리
			
			
			NextPage nextPage = new NextPage();		

			  // 회원가입 성공
			  if(result !=0){
			         nextPage.setPageName("./user/login.jsp");
			         nextPage.setRedirect(true);
			      }
			  
			  // 회원가입 실패
		      else{
		         request.setAttribute("errorMsg", "회원가입에 실패했습니다.");
		         nextPage.setPageName("./errors/error.jsp");
		         nextPage.setRedirect(false);
		      }
		      return nextPage;

		/*
		 * //1. 요청 파라미터 처리 String id= request.getParameter("id"); String pw=
		 * request.getParameter("pw"); String name=
		 * request.getParameter("name");
		 * 
		 * //2. DB 결과 처리 //DAO method 처리 
		 * 
		 * User user=new User(id, pw, name);
		 * 
		 * int result = 0;
		 * 
		 * UserDAO dao = UserDAO.getInstance(); try { result=dao.insert(user); }
		 * catch (SQLException e) {
		 * 
		 * e.printStackTrace(); } //UserDAO.getIntstance().insert(); //한줄짜리
		 * 
		 * 
		 * 
		 * //3. DB 결과 처리
		 * 
		 * 
		 * //4. 이동할 다음페이지 처리 //성공,실패 NextPage nextPage = new NextPage();
		 * if(result != 0){ nextPage.setPageName("./user/login.jsp");
		 * nextPage.setRedirect(true); } else{ //회원가입 실패시
		 * request.setAttribute("errorMsg","회원가입에 실패");
		 * nextPage.setPageName("./errors/error.jsp");
		 * nextPage.setRedirect(false);
		 * 
		 * return nextPage; }
		 */

	}

}
