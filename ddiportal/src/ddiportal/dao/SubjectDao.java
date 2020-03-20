package ddiportal.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import ddiportal.pojo.Subject;
import ddiportal.utilities.ConnectionPool;

public class SubjectDao {

	public SubjectDao() {
		// TODO Auto-generated constructor stub
	}

	public ArrayList<String> getSubjectId(int sem,int branch) {
		ArrayList<String> subjects = new ArrayList<String>();
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		try {
			String sql = "select subjectid from subject where sem=? and branch=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, sem);
			ps.setInt(2, branch);
			java.sql.ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				
					subjects.add(rs.getString("subjectid"));
				
				
			}
			} catch (SQLException sq) {
			System.out.println("Unable to fetch new row." + sq);
		} finally {
			pool.putConnection(conn);
		}
		return subjects;
	}
	

	public ArrayList<String> getSubjectName(int sem,int branch) {
		ArrayList<String> subjects = new ArrayList<String>();
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		try {
			String sql = "select sname from subject where sem=? and branch=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, sem);
			ps.setInt(2, branch);
			java.sql.ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				
					
					subjects.add(rs.getString("sname"));
				
				
			}
			} catch (SQLException sq) {
			System.out.println("Unable to fetch new row." + sq);
		} finally {
			pool.putConnection(conn);
		}
		return subjects;
	}
	public int editSubject(Subject s) {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		try {
			String sql = "update subject set bname=? , sem=? , branch=? where bid=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, s.getSname());
			ps.setInt(2, s.getBranch());
			return ps.executeUpdate();
			} 
		
		catch (SQLException sq) {
			System.out.println("Unable to fetch new row." + sq);
		} finally {
			pool.putConnection(conn);
		}
	
		return -1;
	}
	public int addSubject(Subject s) {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		try {
			String sql = "insert into subject values(?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, s.getSubjectid());
			ps.setString(2, s.getSname());
			ps.setInt(3, s.getSem());
			ps.setInt(4, s.getBranch());
			
			} 
		
		catch (SQLException sq) {
			System.out.println("Unable to fetch new row." + sq);
		} finally {
			pool.putConnection(conn);
		}
	
		return -1;
	}
	
	public int removeSubject(String subjectid) {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		try {
			String sql = "delete from subject where subjectid=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, subjectid);
			} 
		
		catch (SQLException sq) {
			System.out.println("Unable to fetch new row." + sq);
		} finally {
			pool.putConnection(conn);
		}
	
		return -1;
	}
}
