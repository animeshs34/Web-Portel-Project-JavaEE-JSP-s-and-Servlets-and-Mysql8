package ddiportal.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.jdbc.ResultSet;

import ddiportal.pojo.Login;
import ddiportal.utilities.ConnectionPool;

public class LoginDao {

	public LoginDao() {
		
		
	}
	
	public boolean verify(Login l) {
		
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		try {
			String sql = "select * from login where enrollment=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, l.getEnrollment());
			java.sql.ResultSet rs = ps.executeQuery();
			if(rs.next())
				return rs.getString("password").equals(l.getPassword());
		} catch (SQLException sq) {
			System.out.println("Unable to fetch new row." + sq);
		} finally {
			pool.putConnection(conn);
		}
		
		return false;
		
	}
	public boolean register(String enrollment,String password) {
		
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		
		try {
			String sql = "select * from login where enrollment=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1,enrollment);
			java.sql.ResultSet rs = ps.executeQuery();
			if(rs.next())
				return false;
			else {
				sql = "insert into login values(?,?)";
				ps = conn.prepareStatement(sql);
				ps.setString(1,enrollment);
				ps.setString(2,password);
				return ps.executeUpdate()==1;
			}
		} catch (SQLException sq) {
			System.out.println("Unable to fetch new row." + sq);
		}
		finally {
			pool.putConnection(conn);
		}
		return false; 
		
	}
	
	public int changePassword(String enrollment,String password) {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		
		try {
			String sql = "update login set password=? where enrollment=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(2,enrollment);
			ps.setString(1, password);
			return ps.executeUpdate();
			
		} catch (SQLException sq) {
			System.out.println("Unable to fetch new row." + sq);
		}
		finally {
			pool.putConnection(conn);
		}
		return -1; 
	}
	public int removeMember(String enrollment) {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		
		try {
			String sql = "delete from login where enrollment=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1,enrollment);
			
			return ps.executeUpdate();
			
		} catch (SQLException sq) {
			System.out.println("Unable to fetch new row." + sq);
		}
		finally {
			pool.putConnection(conn);
		}
		return -1; 
	}

}
