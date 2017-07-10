package kdata.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Sugang {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		  Connection con = null;
	      PreparedStatement pstmt = null;
	      int result=0;
	      DateFormat sdFormat = new SimpleDateFormat("yyyyMMdd");
	      Date nowDate = new Date();
	      String tempDate = sdFormat.format(nowDate);
	 	      
	      
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("jdbc ����̹� �ε� ����");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521", "test", "1234");
			System.out.println("�����ͺ��̽� ���� ���� ����");
			String sql="insert into sugang values(?,?,?,default)";
			
	        pstmt = con.prepareStatement(sql);

			System.out.println("�й��� �Է��ϼ���");
			String snum = sc.next();
		    System.out.println("�����ڵ带 �Է��ϼ���");
		 	String scode = sc.next();
		    System.out.println("������ �Է��ϼ���");
		 	int grade = sc.nextInt();
		 	
		 	

		    pstmt.setString(1, snum);
			pstmt.setString(2, scode);
			pstmt.setInt(3, grade);			
			
			result= pstmt.executeUpdate();
					
		 } catch (ClassNotFoundException e) {
	         e.printStackTrace();
	         System.out.println("JDBC ����̹� �ε� ����");
	      } catch (SQLException a) {
	         // TODO Auto-generated catch block

	         a.printStackTrace();
	         System.out.println("�����ͺ��̽� ���� ���� ����");
	      } finally {
	         try {
	        	 if(pstmt != null)
	        		pstmt.close();
	        	 
	        	 if(con != null)
	        		con.close();
	            
	         } catch (SQLException e) {
	            e.printStackTrace();

				
	         
				
	}

}
	}
}