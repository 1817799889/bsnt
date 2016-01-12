package com.cn.bsnt.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.omg.Dynamic.Parameter;

import com.cn.bsnt.dao.BaseDAO;
import com.cn.bsnt.dbhelper.ConnectionManager;
import com.cn.bsnt.model.User;

public class UserDAOImpl implements BaseDAO<User>{
	private Connection  conn = null;
	private PreparedStatement para=null;
	private ResultSet rs = null;
	private String sql;

	public int insert(User user) throws SQLException {
		conn = ConnectionManager.getConnection();
		sql = "insert into user(username,password) values(?,?)";
		para = conn.prepareStatement(sql);
		para.setString(1, user.getUsername());
		para.setString(2, user.getPassword());
		int i = para.executeUpdate();
		
		return i;
	}

	public int delete(int id) throws SQLException  {
		int i = 0;
		try {
			conn = ConnectionManager.getConnection();
			sql = "delete from user where id=?";
			para = conn.prepareStatement(sql);
			para.setInt(1, id);
			 i= para.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			para.close();
			conn.close();
		}
		return i;
	}

	public int update(User user) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public User select(int id) throws SQLException {
		conn= ConnectionManager.getConnection();
		sql = "select * from user where id=?";
		para = conn.prepareStatement(sql);
		para.setInt(1, id);
		 rs = para.executeQuery();
		 User user = new User();
		 while(rs.next()){
			 
			 user.setId(rs.getInt("id"));
			 user.setUsername(rs.getString("username"));
			 user.setPassword(rs.getString("password"));
		 }
		return user;
	}

	public List<User> selectList(Parameter p) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
