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
			
			 // 2.DB ó�� -- dao ȣ��			
			User user=new User(id, pw, name, profile);			 
			int result = 0;		  
			
			UserDAO dao = UserDAO.getInstance(); 
			try{
				result=dao.insert(user); 
			}catch (SQLException e) 
			{		  
			e.printStackTrace(); 
			} //UserDAO.getIntstance().insert(); //����¥��
			
			
			NextPage nextPage = new NextPage();		

			  // ȸ������ ����
			  if(result !=0){
			         nextPage.setPageName("./user/login.jsp");
			         nextPage.setRedirect(true);
			      }
			  
			  // ȸ������ ����
		      else{
		         request.setAttribute("errorMsg", "ȸ�����Կ� �����߽��ϴ�.");
		         nextPage.setPageName("./errors/error.jsp");
		         nextPage.setRedirect(false);
		      }
		      return nextPage;

		/*
		 * //1. ��û �Ķ���� ó�� String id= request.getParameter("id"); String pw=
		 * request.getParameter("pw"); String name=
		 * request.getParameter("name");
		 * 
		 * //2. DB ��� ó�� //DAO method ó�� 
		 * 
		 * User user=new User(id, pw, name);
		 * 
		 * int result = 0;
		 * 
		 * UserDAO dao = UserDAO.getInstance(); try { result=dao.insert(user); }
		 * catch (SQLException e) {
		 * 
		 * e.printStackTrace(); } //UserDAO.getIntstance().insert(); //����¥��
		 * 
		 * 
		 * 
		 * //3. DB ��� ó��
		 * 
		 * 
		 * //4. �̵��� ���������� ó�� //����,���� NextPage nextPage = new NextPage();
		 * if(result != 0){ nextPage.setPageName("./user/login.jsp");
		 * nextPage.setRedirect(true); } else{ //ȸ������ ���н�
		 * request.setAttribute("errorMsg","ȸ�����Կ� ����");
		 * nextPage.setPageName("./errors/error.jsp");
		 * nextPage.setRedirect(false);
		 * 
		 * return nextPage; }
		 */

	}

}
