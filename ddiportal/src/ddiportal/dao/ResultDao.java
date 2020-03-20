package ddiportal.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import ddiportal.pojo.Result;
import ddiportal.utilities.ConnectionPool;

public class ResultDao {

	public ResultDao() {
		// TODO Auto-generated constructor stub
	}
	
	public Result generateResult(String enrollment,int sem) {
		Result res = new Result();
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		try {
			String sql = "select * from result where sem=? and enrollment=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, sem);
			ps.setString(2, enrollment);
			java.sql.ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				res.setEnrollment(enrollment);
				res.setSem(sem);
				res.setSub1(rs.getString("sub1"));
				res.setSub2(rs.getString("sub2"));
				res.setSub3(rs.getString("sub3"));
				res.setSub4(rs.getString("sub4"));
				res.setSub5(rs.getString("sub5"));
				res.setSub6(rs.getString("sub6"));
				res.setSub7(rs.getString("sub7"));
				res.setSub8(rs.getString("sub8"));
				res.setSub9(rs.getString("sub9"));
				res.setSub10(rs.getString("sub10"));
				res.setSub11(rs.getString("sub11"));
				res.setCgpa(rs.getDouble("cgpa"));
				res.setSgpa(rs.getDouble("sgpa"));
				return res;
			}
			} catch (SQLException sq) {
			System.out.println("Unable to fetch new row." + sq);
		} finally {
			pool.putConnection(conn);
		}
		return null;
	}
	
	public int updateRecord(Result r) {
		
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		try {
			String sql = "update result set sub1=?,sub2=?,sub3=?,sub4=?,sub5=?,sub6=?,sub7=?,sub8=?,sub9=?,sub10=?,sub11=? where sem=? and enrollment=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(12,r.getSem());
			ps.setString(1,r.getSub1());
			ps.setString(2,r.getSub2());
			ps.setString(3,r.getSub3());
			ps.setString(4,r.getSub4());
			ps.setString(5,r.getSub5());
			ps.setString(6,r.getSub6());
			ps.setString(7,r.getSub7());
			ps.setString(8,r.getSub8());
			ps.setString(9,r.getSub9());
			ps.setString(10,r.getSub10());
			ps.setString(11,r.getSub11());
			ps.setString(13,r.getEnrollment());
			return ps.executeUpdate();
			} 
		
		catch (SQLException sq) {
			System.out.println("Unable to fetch new row." + sq);
		} finally {
			pool.putConnection(conn);
		}
	
		return -1;
	}
	
	public int createRecord(Result r) {

		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		try {
			String sql = "insert into result values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(7,r.getSem());
			ps.setString(1,r.getSub1());
			ps.setString(2,r.getSub2());
			ps.setString(3,r.getSub3());
			ps.setString(4,r.getSub4());
			ps.setString(5,r.getSub5());
			ps.setString(6,r.getSub6());
			ps.setString(8,r.getSub7());
			ps.setString(9,r.getSub8());
			ps.setString(10,r.getSub9());
			ps.setString(11,r.getSub10());
			ps.setString(12,r.getSub11());
			ps.setString(13,r.getEnrollment());
			return ps.executeUpdate();
			} 
		
		catch (SQLException sq) {
			System.out.println("Unable to fetch new row." + sq);
		} finally {
			pool.putConnection(conn);
		}
	
		return -1;
		
	}
	
	public int deleteRecord(String enrollment) {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		try {
			String sql = "delete from result where enrollment=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1,enrollment);
			
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


