package com.cn.bsnt.service.impl;

import java.sql.SQLException;
import java.util.List;

import com.cn.bsnt.dao.impl.GoodsOutdoorGoodsDAOImpl;
import com.cn.bsnt.model.GoodsOutdoorGoods;
import com.cn.bsnt.service.GoodsOutdoorGoodsService;

public class GoodsOutdoorGoodsServiceImpl implements GoodsOutdoorGoodsService{
	GoodsOutdoorGoodsDAOImpl gogd=new GoodsOutdoorGoodsDAOImpl();
	public List<GoodsOutdoorGoods> selectAll() throws SQLException {
	  return gogd.selectAll();
	
	
	}
}
