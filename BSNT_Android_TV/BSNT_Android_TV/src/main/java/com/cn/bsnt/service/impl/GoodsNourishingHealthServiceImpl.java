package com.cn.bsnt.service.impl;

import java.sql.SQLException;
import java.util.List;



import com.cn.bsnt.dao.impl.GoodsNourishingHealthDAOImpl;
import com.cn.bsnt.model.GoodsNourishingHealth;
import com.cn.bsnt.service.GoodsNourishingHealthService;

public class GoodsNourishingHealthServiceImpl implements GoodsNourishingHealthService{
	GoodsNourishingHealthDAOImpl gnhd=new GoodsNourishingHealthDAOImpl();
	public List<GoodsNourishingHealth> selectAll() throws SQLException {
		return gnhd.selectAll();
	}

}
