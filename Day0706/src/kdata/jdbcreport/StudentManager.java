package kdata.jdbcreport;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class StudentManager {
	
    Connection con = null;
    PreparedStatement st = null;
    ResultSet rs = null;


    public void StudentManager() {
    	try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("jdbc ����̹� �ε� ����");
			} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("jdbc ����̹� �ε� ����");
			}
    	//Connection con = null;		//��ü �ʱ�ȭ
		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521", "test", "1234");
			System.out.println("�����ͺ��̽� ���� ���� ����");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("�����ͺ��̽� ���� ���� ����");
		}
		Scanner sc = new Scanner(System.in);
		String sql="insert into student values(?,?,?)";
		
		try {
			st = con.prepareStatement(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	    	
    }
    
	public void insert() throws ClassNotFoundException{
		try {
			//��Ī ������ , ����ǥ��3�� ������ 3�� ��Ī����, ������ ����ؾ���
		      Scanner sc = new Scanner(System.in);

			 System.out.println("�й��� �Է��ϼ���");
			String snum = sc.next();
	        System.out.println("�̸��� �Է��ϼ���");
	 		String sname = sc.next();
	        System.out.println("������ �Է��ϼ���");
	 		String sgender = sc.next();
	         
			st.setString(1, snum);
			st.setString(2, sname);
			st.setString(3, sgender);
			
			int result= st.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//psmt.executeUpdate();
		int result=0;
		//5. ��� ó��
		if(result == 0)
			System.out.println("����");
		else
			System.out.println("����");
				
		//6. �����ͺ��̽� ���� ���� ����*/		
		try {
			st.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			st.close();
		} catch (SQLException e) {
		// TODO Auto-generated catch block
			e.printStackTrace();
		}	      	      
		
	}

	public void selectAll(){

		String sql = " select *"
         		+ " from student";
		
        try{
        	 
         st = con.prepareStatement(sql);
         rs = st.executeQuery();

         while(rs.next())
            System.out.println(
                  rs.getString("snum") + "," + rs.getString("sname") +
                  rs.getInt("sgender"));
        }catch(SQLException e) {
	         e.printStackTrace();
	}
	}

	
        
        
        
	public void selectByName(){
		String sql = " select *"
         		+ " from student"
         		+ " where name=?"
         		+ " order by sname";
		
        try{
         st = con.prepareStatement(sql);
         rs = st.executeQuery();

         while(rs.next())
            System.out.println(
                  rs.getString("snum") + "," + rs.getString("sname") +
                  rs.getInt("sgender"));
        }catch(SQLException e) {
	         e.printStackTrace();
	}
	
	
}
	
	
	
	
	
	
	}
