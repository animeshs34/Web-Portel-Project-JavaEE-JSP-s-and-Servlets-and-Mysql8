package ddiportal.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import ddiportal.utilities.ConnectionPool;

public class BranchDao {

	public BranchDao() {
		// TODO Auto-generated constructor stub
	}

	public String getBranch(int bid) {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		try {
			String sql = "select bname from branch where bid=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1,bid);
			java.sql.ResultSet rs = ps.executeQuery();
			if(rs.next())
				return rs.getString("bname");
		} catch (SQLException sq) {
			System.out.println("Unable to fetch new row." + sq);
		} finally {
			pool.putConnection(conn);
		}
		return null;
	}
	public int editBranch(int bid,String bname) {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		try {
			String sql = "update branch set bname=? where bid=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(2,bid);
			ps.setString(1, bname);
			return	ps.executeUpdate();
			
		} catch (SQLException sq) {
			System.out.println("Unable to fetch new row." + sq);
		} finally {
			pool.putConnection(conn);
		}
		return -1;
	}
	
	
}
