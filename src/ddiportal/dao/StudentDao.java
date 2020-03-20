package ddiportal.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import ddiportal.pojo.Student;
import ddiportal.utilities.ConnectionPool;

public class StudentDao {

	public StudentDao() {
		
	}
	public String getStudentName(String enrollment) {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		try {
			String sql = "select name from student where enrollment=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1,enrollment);
			java.sql.ResultSet rs = ps.executeQuery();
			if(rs.next())
				return rs.getString("name");
		}
			catch (SQLException sq) {
				System.out.println("Unable to fetch new row." + sq);
			}
		finally {
			pool.putConnection(conn);
		}
	return null; 
	}
	
	
	public int getBranchId(String enrollment) {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		try {
			String sql = "select branch from student where enrollment=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1,enrollment);
			java.sql.ResultSet rs = ps.executeQuery();
			if(rs.next())
				return rs.getInt("branch");
		}
			catch (SQLException sq) {
				System.out.println("Unable to fetch new row." + sq);
			}
		finally {
			pool.putConnection(conn);
		}
	return -1; 
	}
	
	public int updateStudent(Student std) {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		try {
			String sql = "update student set name=?,branch=?,fathername=?,mothername=?,caste=?,mobile=?,address=? where enrollment=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, std.getName());
			ps.setInt(2, std.getBranchId());
			ps.setString(3, std.getFather());
			ps.setString(4, std.getMother());
			ps.setString(5, std.getCaste());
			ps.setLong(6, std.getMobile());
			ps.setString(7, std.getAddress());
			ps.setString(8, std.getEnrollment());
			return ps.executeUpdate();
			} 
		
		catch (SQLException sq) {
			System.out.println("Unable to fetch new row." + sq);
		} finally {
			pool.putConnection(conn);
		}
	
		return -1;
	}
	
	public int deleteStudent(String enrollment) {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		try {
			String sql = "delete from student where enrollment=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			
			return ps.executeUpdate();
			} 
		
		catch (SQLException sq) {
			System.out.println("Unable to fetch new row." + sq);
		} finally {
			pool.putConnection(conn);
		}
	
		return -1;
	}
}

