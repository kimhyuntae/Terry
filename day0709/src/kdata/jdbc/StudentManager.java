package kdata.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentManager {
	
	List list= new ArrayList();	

	public static void insert(Student s) throws SQLException{
		Connection con = null;
		PreparedStatement pstmt = null;
		String sql="";
		
		try{
			con =DBUtill.getConnection();
			sql="insert into sugang values(?,?,?)";
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, s.getSnum());
			pstmt.setString(2, s.getSname());
			pstmt.setString(3, s.getSgender());
		}
		finally{
			DBUtill.close(con, pstmt);			
		}			
	} //insert student
	
	

	public List<Student> selectAll() throws SQLException{
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		String sql="";
				
		try{
			con=DBUtill.getConnection();
			sql = "select * from student";
			pstmt=con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()){
				System.out.println("wh");
			Student s = new Student(rs.getString("snum"), rs.getString("sname"),
						rs.getString("sgender"));
			}
			
		}finally{
			DBUtill.close(rs, pstmt, con);
		}
		return list;	

	}	//selectAll

	
	
	public List<Student> selectByName(String sname) throws SQLException {
		
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		String sql="";
		
		
		try{
			con=DBUtill.getConnection();
			sql = "select * from student where sname=?";
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, sname);
			rs = pstmt.executeQuery();
			
			while(rs.next()){
				Student s = new Student(rs.getString("snum"), rs.getString("sname"),
						rs.getString("sgender"));
			}
			
		}finally{
			DBUtill.close(rs, pstmt, con);
		}
		return list;			
	}
	
	
	
	
	

}













