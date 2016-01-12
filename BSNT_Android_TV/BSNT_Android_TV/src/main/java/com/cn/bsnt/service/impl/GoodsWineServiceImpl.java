package com.cn.bsnt.service.impl;

import java.sql.SQLException;
import java.util.List;

import com.cn.bsnt.dao.impl.GoodsWineDAOImpl;
import com.cn.bsnt.model.GoodsWine;
import com.cn.bsnt.service.GoodsWineService;

public class GoodsWineServiceImpl implements GoodsWineService{
       GoodsWineDAOImpl gwda=new GoodsWineDAOImpl();
	public List<GoodsWine> selectAll() throws SQLException {
		return gwda.selectAll();
	}

}
