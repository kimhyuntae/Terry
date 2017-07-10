package kdata.jdbc;

import java.util.*;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class StudentInsertTest {

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
		
		//3. statement ��ü ����
		
		Statement st=null;

		try {			
			st=con.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		//4. SQL�� ����
		int result=0;
		Scanner sc = new Scanner(System.in);
		String snum = sc.next();
		String sname = sc.next();
		String sgender = sc.next();
		
		System.out.println("�й�, �̸�, �� �Է� :");

		try{
			//String sql="insert into student values('26563', '���', '��')";
			String sql="insert into student values('"+snum+"', '"+sname+"', '"+sgender+"')";
			result=st.executeUpdate(sql);
			
			System.out.println(result);
			//st.executeQuery(sql);
		} catch(SQLException e){
			e.printStackTrace();
		}
		
		
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
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}


