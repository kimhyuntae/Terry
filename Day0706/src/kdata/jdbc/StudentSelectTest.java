package kdata.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class StudentSelectTest {

   public static void main(String[] args) throws SQLException {
      // TODO Auto-generated method stub
      Connection con = null;
      PreparedStatement st = null;

      /*
       * snum s subcode s grade n subdate date
       */
      ResultSet rs = null;
      Scanner input = new Scanner(System.in);
      try {
         Class.forName("oracle.jdbc.driver.OracleDriver");
         System.out.println("JDBC 드라이버 로드 성공");
         con = DriverManager.getConnection(""
         		+ "jdbc:oracle:thin:@localhost:1521", "test", "1234");
         System.out.println("데이터베이스 서버 연결 성공");
         String sql = "select * from student";

         st = con.prepareStatement(sql);
         rs = st.executeQuery();

         while (rs.next())
            System.out.println(
                  rs.getString("snum") + ","
            + rs.getString("sname") + "," + rs.getString("sgender") + "\t");

      } catch (ClassNotFoundException e) {
         e.printStackTrace();
         System.out.println("JDBC 드라이버 로드 실패");
      } catch (SQLException a) {
         // TODO Auto-generated catch block

         a.printStackTrace();
         System.out.println("데이터베이스 서버 연결 실패");
      } finally {
         if (rs != null)
            con.close();
         if (st != null)
            con.close();
         if (con != null)
            con.close();

      }
   }
}

