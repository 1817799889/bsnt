package com.cn.bsnt.service.impl;

import java.sql.SQLException;
import java.util.List;

import com.cn.bsnt.dao.impl.GoodsWaterFountainDAOImpl;
import com.cn.bsnt.model.GoodsWaterFountain;
import com.cn.bsnt.service.GoodsWaterFountainService;

public class GoodsWaterFountainServiceImpl implements GoodsWaterFountainService {
          GoodsWaterFountainDAOImpl gwfd=new GoodsWaterFountainDAOImpl();
	public List<GoodsWaterFountain> selectAll() throws SQLException {
		
		return gwfd.selectAll();
	}

}
