package com.cn.bsnt.service.impl;

import java.util.List;

import com.cn.bsnt.dao.impl.GoodsLuggageDAOImpl;
import com.cn.bsnt.model.GoodsLuggage;
import com.cn.bsnt.service.GoodsLuggageService;

public class GoodsLuggageServiceImpl implements GoodsLuggageService {

	GoodsLuggageDAOImpl luggageImpl=new GoodsLuggageDAOImpl();
	public List<GoodsLuggage> selectAll(String type) {
		// TODO Auto-generated method stub
		return luggageImpl.selectAll(type);
	}

}
