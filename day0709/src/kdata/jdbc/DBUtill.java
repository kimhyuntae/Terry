package kdata.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * DB 서버 연결 관리하는 클래스
 * Connection 생성, 종료
 * @author cse
 * 
 */

public class DBUtill {
   private static final String CON_URL = "jdbc:oracle:thin:@localhost:1521";
   private static final String USER_ID = "system";
   private static final String USER_PASSWORD = "1234";
   private static final String DRIVER_NAME = "oracle.jdbc.driver.OracleDriver";
   //이렇게 해줘도 된다. 같은 클래스 이므로 DBUtill.빼도됨
   
   static{
      try {
         Class.forName(DRIVER_NAME);
      } catch (ClassNotFoundException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
   }// 클래스 로드할때 한번 사용할때.
   
   /**
    * 데이터베이스 서버 연결하는 메소드
    * @RETURN Connection 데이터 베이스 연결 정보 객체 반환
    * @throws SQLException 
    */
   
   // static 객체를 생성하지 않아도 접근할수 있다. 객체가 없으면 static 사용하여 한번에 호출
   // 아무나 클래스당 1개 반환형 메소드 이름 메게변수 x 예외처리
   public static Connection getConnection() throws SQLException{
      //DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521", "test", "1234");
      
      return DriverManager.getConnection(CON_URL,USER_ID,USER_PASSWORD);//getConnection은 DriverManager꺼다 
   } 
   
   /**
    * 데이터 베이스 연결시 사용한 자원 해제
    * @param
    * @return
    * 
    */

   public static void close(Connection con, PreparedStatement pstmt){
      if(con !=null)
         try {
            con.close();
         } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
         }
      
      if(pstmt !=null)
         try {
            pstmt.close();
         } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
         }
   }
   public static void close(ResultSet rs,PreparedStatement pstmt,Connection con){
	  if(rs !=null)
	   try {
         rs.close();
      } catch (SQLException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
	  if(pstmt !=null)
      try {
         pstmt.close();
      } catch (SQLException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
	  if(con !=null)
      try {
         con.close();
      } catch (SQLException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
   }
}