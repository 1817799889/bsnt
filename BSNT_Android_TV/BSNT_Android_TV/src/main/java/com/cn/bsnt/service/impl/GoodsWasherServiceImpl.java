package com.cn.bsnt.service.impl;

import java.sql.SQLException;
import java.util.List;

import com.cn.bsnt.dao.impl.GoodsWasherDAOImpl;
import com.cn.bsnt.model.GoodsWasher;
import com.cn.bsnt.service.GoodsWasherService;

public class GoodsWasherServiceImpl implements GoodsWasherService{
       
	      GoodsWasherDAOImpl gdwa=new GoodsWasherDAOImpl();
	public List<GoodsWasher> selectAll() throws SQLException {
		// TODO Auto-generated method stub
		return gdwa.selectAll();
	}

}
