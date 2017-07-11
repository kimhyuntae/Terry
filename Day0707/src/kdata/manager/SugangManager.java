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
	
	public List<Sugang> selectAll() throws SQLException{
		Connection con= null;
		PreparedStatement pstmt = null;		
	    ResultSet rs = null;
	    
	    List<Sugang> list = new ArrayList<>();
		try{
			con=DBUtill.getConnection();		
			String sql=" select * from sugang ";
			pstmt=con.prepareStatement(sql);
			rs=pstmt.executeQuery();		
			
	    while(rs.next()){
			Sugang sg = new Sugang(rs.getString("snum"),
					rs.getString("subcode"), rs.getInt("grade"),
					rs.getDate("subdate"));
			list.add(sg);
		}			
	}finally{
	DBUtill.close(rs, pstmt, con);
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
