package com.cn.bsnt.service.impl;

import java.sql.SQLException;
import java.util.List;

import com.cn.bsnt.dao.impl.GoodsRiceCookerDAOImpl;
import com.cn.bsnt.model.GoodsRiceCooker;
import com.cn.bsnt.service.GoodsRiceCookerService;

public class GoodsRiceCookerServiceImpl implements GoodsRiceCookerService{
     GoodsRiceCookerDAOImpl gric=new GoodsRiceCookerDAOImpl();
	public List<GoodsRiceCooker> selectAll() throws SQLException {
		
	   return gric.selectAll();
		   
	}

}
