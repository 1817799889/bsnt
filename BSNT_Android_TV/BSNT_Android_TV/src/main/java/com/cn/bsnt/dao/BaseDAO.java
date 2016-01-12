package com.cn.bsnt.dao;

import java.sql.SQLException;
import java.util.List;

import org.omg.Dynamic.Parameter;

import com.cn.bsnt.model.User;

public interface BaseDAO<T> {
	//增加一条记录
	public int insert(T t) throws SQLException ;
	//删除一条记录
	public int delete(int id) throws SQLException;
	//修改一条记录
	public int update(T t) throws SQLException ;
	//查询一条记录
	public User select(int id) throws SQLException ;
	//查询多条记录
	public List<User> selectList(Parameter p) throws SQLException ;
	

}
