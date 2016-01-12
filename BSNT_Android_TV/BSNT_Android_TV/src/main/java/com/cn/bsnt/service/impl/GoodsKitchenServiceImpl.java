package com.cn.bsnt.service.impl;

import java.util.List;

import com.cn.bsnt.dao.impl.GoodsKitchenDAOImpl;
import com.cn.bsnt.model.GoodsKitchen;
import com.cn.bsnt.service.GoodsKitchenService;

public class GoodsKitchenServiceImpl implements GoodsKitchenService{
	GoodsKitchenDAOImpl gkdi = new GoodsKitchenDAOImpl();

	public List<GoodsKitchen> selectAll(String type) throws Exception {
		// TODO Auto-generated method stub
		return gkdi.selectAll(type);
	}

}
