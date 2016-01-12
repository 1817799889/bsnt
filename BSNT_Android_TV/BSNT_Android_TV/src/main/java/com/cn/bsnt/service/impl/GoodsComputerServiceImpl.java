package com.cn.bsnt.service.impl;

import java.util.List;

import com.cn.bsnt.dao.impl.GoodsComputerjDAOImpl;
import com.cn.bsnt.model.GoodsComputer;
import com.cn.bsnt.service.GoodsComputerService;

public class GoodsComputerServiceImpl implements GoodsComputerService{

	GoodsComputerjDAOImpl gcdi=new GoodsComputerjDAOImpl();
	public List<GoodsComputer> selectAll() {
		// TODO Auto-generated method stub
		return gcdi.selectAll();
	}

}
