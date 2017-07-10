	package kdata.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class SugangSelectTest {

	public static void main(String[] args) throws SQLException {
		
		//�й�	�̸�	�����	����
		Connection con = null;
	    PreparedStatement st = null;
	      
	      ResultSet rs = null;
	      Scanner input = new Scanner(System.in);
	      try {
	         Class.forName("oracle.jdbc.driver.OracleDriver");
	         System.out.println("JDBC ����̹� �ε� ����");
	         con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521", "test", "1234");
	         System.out.println("�����ͺ��̽� ���� ���� ����");
	         String sql = "select *"
	         		+ " from student, subject, sugang "
	         		+ "where student.snum=sugang.snum and sugang.subcode=subject.subcode"
	         		+ "";

	         /*select sgender
	         from student join sugang on student.snum=sugang.snum
	        		 join subject on sugang.subcode=subject.subcode;*/
	         
	         st = con.prepareStatement(sql);
	         rs = st.executeQuery();

	         while (rs.next())
	            System.out.println(
	                  rs.getString("snum") + "," + rs.getString("sname") + ","
	            + rs.getString("subname") + ","+ rs.getInt("grade"));

	      } catch (ClassNotFoundException e) {
	         e.printStackTrace();
	         System.out.println("JDBC ����̹� �ε� ����");
	      } catch (SQLException a) {
	         // TODO Auto-generated catch block

	         a.printStackTrace();
	         System.out.println("�����ͺ��̽� ���� ���� ����");
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
