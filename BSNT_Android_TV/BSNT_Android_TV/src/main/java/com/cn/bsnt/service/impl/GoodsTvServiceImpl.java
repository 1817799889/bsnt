package com.cn.bsnt.service.impl;

import java.sql.SQLException;
import java.util.List;

import com.cn.bsnt.dao.impl.GoodsTvDAOImpl;
import com.cn.bsnt.model.GoodsTv;
import com.cn.bsnt.service.GoodsTvService;

public class GoodsTvServiceImpl implements GoodsTvService{
	GoodsTvDAOImpl gtdi = new GoodsTvDAOImpl();

	public List<GoodsTv> selectAll() throws SQLException {
		
		return gtdi.selectAll();
	}

}
