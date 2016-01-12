package com.cn.bsnt.service.impl;

import java.util.List;

import com.cn.bsnt.dao.impl.GoodsCleaningDAOImpl;
import com.cn.bsnt.model.GoodsCleaning;
import com.cn.bsnt.service.GoodsCleaningService;

public class GoodsCleaningServiceImpl implements GoodsCleaningService{
	GoodsCleaningDAOImpl gcdi = new GoodsCleaningDAOImpl();

	public List<GoodsCleaning> selectAll(String type) throws Exception {
		// TODO Auto-generated method stub
		return gcdi.selectAll(type);
	}

}
