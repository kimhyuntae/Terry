package kdata.project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import kdata.project.dto.User;
import kdata.project.util.DBUtill;

//	DB�� ���õȰ� ���⿡ 
public class UserDAO {
	
	//�̱��� ���ϤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�
	private static UserDAO dao = new UserDAO();
	
	private UserDAO(){}
	
	public static UserDAO getInstance(){
		
		return dao;
	}
	
	
	//�̱��� ���ϤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�
	
	
	//ȸ������
	public int insert(User user) throws SQLException{
		System.out.println("3.userDAO insert()");
		
		Connection con= null;
		PreparedStatement pstmt = null;
		int result = 0;		

		try{		
		
		con = DBUtill.getConnection();
		
		//3.4
        String sql = "insert into users values(?,?,?,?, default)";
		pstmt = con.prepareStatement(sql);		
	 		
		pstmt.setString(1, user.getId());
		pstmt.setString(2, user.getPw());
		pstmt.setString(3, user.getName());
		pstmt.setString(4, null);

		//5
		result = pstmt.executeUpdate();
		
		}finally{
		
		//6
		DBUtill.close(con, pstmt);
		}		
		
		return result;
	}
	
	
	//ȸ�� ����Ʈ
	public List<User> selectAll() throws SQLException{
		System.out.println("3.userDAO selectAll()");
		
		Connection con= null;
		PreparedStatement pstmt = null;		
	    ResultSet rs = null;
		
	    List<User> list = new ArrayList<>();
		try{
			con=DBUtill.getConnection();		
			String sql=" select * from users order by id";
			pstmt=con.prepareStatement(sql);
			rs=pstmt.executeQuery();		
			
			while(rs.next()){		//rs.�� table�� �մ°� ����
				//User user = new User(rs.getString("id"), rs.getString("pw"), rs.getString("name"));
				User user= new User();
				user.setId(rs.getString("id"));				
				user.setName(rs.getString("name"));
				user.setProfile(rs.getString("profile"));
				//user.setReg_date(rs.getString("reg_date"));
				
				list.add(user);
			}			
		}finally{
		DBUtill.close(rs, pstmt, con);
	}		
		return list;		
		
	}
	
	
	//ȸ�� ������
	public User selectById(String id) throws SQLException{
		Connection con= null;
		PreparedStatement pstmt = null;		
	    ResultSet rs = null;
	    User user =null;
	    
		try{
			con=DBUtill.getConnection();
			String sql=" select * from users where id= ? ";
			
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, id);
			rs=pstmt.executeQuery();
			
			if(rs.next()){
				user= new User();
				user.setId(rs.getString("id"));				
				user.setName(rs.getString("name"));
				user.setProfile(rs.getString("profile"));
				System.out.println(user.toString());
			}	

			
		}finally{
			DBUtill.close(rs,  pstmt, con);
			
		}
		return user;	
		
	}	
	
	
	//�α���
	public void login(){
		
	}
	
	
	//ȸ������ ����
	public void delete(){
		
	}
	
	
	
}
