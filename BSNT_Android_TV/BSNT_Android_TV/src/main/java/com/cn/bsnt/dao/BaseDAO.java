package com.cn.bsnt.dao;

import java.sql.SQLException;
import java.util.List;

import org.omg.Dynamic.Parameter;

import com.cn.bsnt.model.User;

public interface BaseDAO<T> {
	//����һ����¼
	public int insert(T t) throws SQLException ;
	//ɾ��һ����¼
	public int delete(int id) throws SQLException;
	//�޸�һ����¼
	public int update(T t) throws SQLException ;
	//��ѯһ����¼
	public User select(int id) throws SQLException ;
	//��ѯ������¼
	public List<User> selectList(Parameter p) throws SQLException ;
	

}
