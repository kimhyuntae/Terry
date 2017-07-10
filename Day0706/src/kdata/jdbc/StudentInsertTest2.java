package kdata.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class StudentInsertTest2 {

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
		Scanner sc = new Scanner(System.in);

	//3. Statement 객체 생성 
			//이전과 달리 자동 컴파일됨 + 보안이 더 좋음
				
		//String sql="insert into student values('"+snum+"', '"+sname+"', '"+sgender+"')";
		//입력받을 부분을 ?로 표시함
        String sql="insert into student values(?,?,?)";

		PreparedStatement pstmt=null;
		try {
			pstmt = con.prepareStatement(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	//4. SQL문 전송
				
		try {
			//매칭 시켜줌 , 물음표가3개 잇으면 3번 매칭해줌, 순서도 기억해야함
			
			 System.out.println("학번을 입력하세요");
			String snum = sc.next();
	        System.out.println("이름을 입력하세요");
	 		String sname = sc.next();
	        System.out.println("성별을 입력하세요");
	 		String sgender = sc.next();
	         
			pstmt.setString(1, snum);
			pstmt.setString(2, sname);
			pstmt.setString(3, sgender);
			
			int result= pstmt.executeUpdate();
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
			pstmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			pstmt.close();
		} catch (SQLException e) {
		// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
				
				
				
				
				
				
	}

}
