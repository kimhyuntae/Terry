package kdata.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * DB ���� ���� �����ϴ� Ŭ����
 * Connection ����, ����
 * @author cse
 * 
 */

public class DBUtill {
   private static final String CON_URL = "jdbc:oracle:thin:@localhost:1521";
   private static final String USER_ID = "system";
   private static final String USER_PASSWORD = "1234";
   private static final String DRIVER_NAME = "oracle.jdbc.driver.OracleDriver";
   //�̷��� ���൵ �ȴ�. ���� Ŭ���� �̹Ƿ� DBUtill.������
   
   static{
      try {
         Class.forName(DRIVER_NAME);
      } catch (ClassNotFoundException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
   }// Ŭ���� �ε��Ҷ� �ѹ� ����Ҷ�.
   
   /**
    * �����ͺ��̽� ���� �����ϴ� �޼ҵ�
    * @RETURN Connection ������ ���̽� ���� ���� ��ü ��ȯ
    * @throws SQLException 
    */
   
   // static ��ü�� �������� �ʾƵ� �����Ҽ� �ִ�. ��ü�� ������ static ����Ͽ� �ѹ��� ȣ��
   // �ƹ��� Ŭ������ 1�� ��ȯ�� �޼ҵ� �̸� �ްԺ��� x ����ó��
   public static Connection getConnection() throws SQLException{
      //DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521", "test", "1234");
      
      return DriverManager.getConnection(CON_URL,USER_ID,USER_PASSWORD);//getConnection�� DriverManager���� 
   } 
   
   /**
    * ������ ���̽� ����� ����� �ڿ� ����
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