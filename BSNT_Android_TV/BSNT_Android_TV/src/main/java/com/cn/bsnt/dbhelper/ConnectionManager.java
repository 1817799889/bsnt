package com.cn.bsnt.dbhelper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
	/**
	 * 得到数据库连接
	 */
	public static Connection getConnection(){
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost/bsnt";
		String username = "root";
		String password = "root";
		Connection con = null;
		//得到数据库连接
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url,username,password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}

}
