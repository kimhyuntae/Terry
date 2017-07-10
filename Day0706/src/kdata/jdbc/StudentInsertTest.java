package kdata.jdbc;

import java.util.*;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class StudentInsertTest {

	public static void main(String[] args) {
		
		//1. jdbc 드라이버 로드		 
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("jdbc 드라이버 로드 성공");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("jdbc 드라이버 로드 실패");
		}
		
		//2. 데이터베이스 서버 연결
		Connection con = null;		//객체 초기화

		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521", "test", "1234");
			System.out.println("데이터베이스 서버 연결 성공");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("데이터베이스 서버 연결 실패");
		}
		
		//3. statement 객체 생성
		
		Statement st=null;

		try {			
			st=con.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		//4. SQL문 전송
		int result=0;
		Scanner sc = new Scanner(System.in);
		String snum = sc.next();
		String sname = sc.next();
		String sgender = sc.next();
		
		System.out.println("학번, 이름, 성 입력 :");

		try{
			//String sql="insert into student values('26563', '루니', '남')";
			String sql="insert into student values('"+snum+"', '"+sname+"', '"+sgender+"')";
			result=st.executeUpdate(sql);
			
			System.out.println(result);
			//st.executeQuery(sql);
		} catch(SQLException e){
			e.printStackTrace();
		}
		
		
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
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}


