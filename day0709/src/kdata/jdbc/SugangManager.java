package kdata.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SugangManager {

	List<Sugang> list= new ArrayList();
	
	public static void insert(Sugang sg) throws SQLException{
		Connection con = null;
		PreparedStatement pstmt = null;
		String sql="";
		
		
	try{
		con =DBUtill.getConnection();
		sql="insert into sugang values(?,?,?,?)";
		pstmt=con.prepareStatement(sql);
		pstmt.setString(1, sg.getSnum());
		pstmt.setString(2, sg.getSubcode());
		pstmt.setString(3, null);
		pstmt.setDate(4, sg.getDate());		
	}
	finally{
		DBUtill.close(con, pstmt);
		
	}		
	}	//insert
	
	public List<Sugang> selectAll() throws SQLException{
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		String sql="";
		
		try{
			con=DBUtill.getConnection();
			sql = " select * from sugang ";
			pstmt=con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()){
				Sugang sg = new Sugang(rs.getString("snum"), rs.getString("subcode"),
						rs.getInt("grade"), rs.getDate("date"));
				list.add(sg);
			}
			
		}finally{
			DBUtill.close(rs, pstmt, con);
		}
		return list;		
	}//selectAll()
	
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
