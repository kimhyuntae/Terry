package kdata.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class StudentInsertTest2 {

	public static void main(String[] args) {

	//1. jdbc ����̹� �ε�		 
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("jdbc ����̹� �ε� ����");
			} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("jdbc ����̹� �ε� ����");
			}
				
	//2. �����ͺ��̽� ���� ����
		Connection con = null;		//��ü �ʱ�ȭ
		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521", "test", "1234");
			System.out.println("�����ͺ��̽� ���� ���� ����");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("�����ͺ��̽� ���� ���� ����");
		}
		Scanner sc = new Scanner(System.in);

	//3. Statement ��ü ���� 
			//������ �޸� �ڵ� �����ϵ� + ������ �� ����
				
		//String sql="insert into student values('"+snum+"', '"+sname+"', '"+sgender+"')";
		//�Է¹��� �κ��� ?�� ǥ����
        String sql="insert into student values(?,?,?)";

		PreparedStatement pstmt=null;
		try {
			pstmt = con.prepareStatement(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	//4. SQL�� ����
				
		try {
			//��Ī ������ , ����ǥ��3�� ������ 3�� ��Ī����, ������ ����ؾ���
			
			 System.out.println("�й��� �Է��ϼ���");
			String snum = sc.next();
	        System.out.println("�̸��� �Է��ϼ���");
	 		String sname = sc.next();
	        System.out.println("������ �Է��ϼ���");
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
		//5. ��� ó��
		if(result == 0)
			System.out.println("����");
		else
			System.out.println("����");
				
		//6. �����ͺ��̽� ���� ���� ����*/		
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
