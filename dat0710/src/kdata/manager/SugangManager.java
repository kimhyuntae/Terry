package kdata.manager;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import kdata.manager.Sugang;

public class SugangManager {

	public static void insert(Sugang sg) throws SQLException {
		//1
		Connection con= null;
		PreparedStatement pstmt = null;
		String sql="";
				
		try{
		
		//2
		con = DBUtill.getConnection();
		
		//3.4
        sql = "insert into sugang values(?,?,?,default)";
		pstmt = con.prepareStatement(sql);		 		
		pstmt.setString(1, sg.getSnum());
		pstmt.setString(2, sg.getSubcode());
		pstmt.setString(3, null);
		//pstmt.setDate(4, (Date) sg.getDate());
        pstmt.executeUpdate();
		
		//5
		
		}finally{
		DBUtill.close(con, pstmt);
		}
		return;

	}
	
	public List<Sugang> selectAll() throws SQLException {
	      Connection con = null;
	      PreparedStatement pst = null;
	      ResultSet rs = null;
	      String sql = "";
	      List list = new ArrayList();
	      try {
			con= DBUtill.getConnection();
	         sql = "select sugang.snum,student.sname,subject.subname from student,sugang,subject where subject.subcode=sugang.subcode and student.snum=sugang.snum  ";
	         pst = con.prepareStatement(sql);
	         rs = pst.executeQuery();
	         while (rs.next()) {
	            Sugang s = new Sugang(rs.getString("snum"), rs.getString("sname"), rs.getString("subname"));
	            list.add(s);

	         }

	      }

	      finally {
	         DBUtill.close(rs, pst, con);

	      }
	      return list;

	   }

	public static void delete(String snum) throws SQLException{
		Connection con =null;
		PreparedStatement pstmt=null;
		String sql="";
		
		try{
			con= DBUtill.getConnection();
			sql = "delete from sugang where snum=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, snum);			
		}
		finally{
			DBUtill.close(con, pstmt);
		}
	}
	
	
	public static void grade(int grade, String snum, String subcode) throws SQLException{
		Connection con= null;
		PreparedStatement pstmt=null;
		String sql="";
		
		try{
			con=DBUtill.getConnection();
			sql="update sugang set grade=? where snum=? and subcode=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, grade);
			pstmt.setString(2, snum);
			pstmt.setString(3, subcode);
			pstmt.executeUpdate();
		}
		finally{
			DBUtill.close(con, pstmt);
		}		
	}//grade
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
