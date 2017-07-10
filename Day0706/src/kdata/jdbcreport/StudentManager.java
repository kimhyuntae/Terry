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
			System.out.println("jdbc 드라이버 로드 성공");
			} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("jdbc 드라이버 로드 실패");
			}
    	//Connection con = null;		//객체 초기화
		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521", "test", "1234");
			System.out.println("데이터베이스 서버 연결 성공");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("데이터베이스 서버 연결 실패");
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
			//매칭 시켜줌 , 물음표가3개 잇으면 3번 매칭해줌, 순서도 기억해야함
		      Scanner sc = new Scanner(System.in);

			 System.out.println("학번을 입력하세요");
			String snum = sc.next();
	        System.out.println("이름을 입력하세요");
	 		String sname = sc.next();
	        System.out.println("성별을 입력하세요");
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
		//5. 결과 처리
		if(result == 0)
			System.out.println("성공");
		else
			System.out.println("실패");
				
		//6. 데이터베이스 서버 연결 해제*/		
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
