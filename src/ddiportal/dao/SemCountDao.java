package ddiportal.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import ddiportal.utilities.ConnectionPool;

public class SemCountDao {

	public SemCountDao() {
		// TODO Auto-generated constructor stub
	}

	public int getSem(String enrollment) {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		try {
			String sql = "select sem from semcount where enrollment=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1,enrollment);
			java.sql.ResultSet rs = ps.executeQuery();
			if(rs.next())
				return rs.getInt("sem");
		}
			catch (SQLException sq) {
				System.out.println("Unable to fetch new row." + sq);
			}
		finally {
			pool.putConnection(conn);
		}
	return -1; 
		
	}
	public int updateSession() {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		try {
			String sql = "update semcount set sem=sem+1";
			PreparedStatement ps = conn.prepareStatement(sql);
			
			return ps.executeUpdate();
		}
			catch (SQLException sq) {
				System.out.println("Unable to fetch new row." + sq);
			}
		finally {
			pool.putConnection(conn);
		}
	return -1; 
	}
	
	public int updateYear() {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		try {
			String sql = "update semcount set year=year+1";
			PreparedStatement ps = conn.prepareStatement(sql);
			
			return ps.executeUpdate();
		}
			catch (SQLException sq) {
				System.out.println("Unable to fetch new row." + sq);
			}
		finally {
			pool.putConnection(conn);
		}
	return -1; 
	}
}
