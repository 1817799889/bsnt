package com.cn.bsnt.service.impl;

import java.util.List;

import com.cn.bsnt.dao.impl.GoodsAgriculturesUseTricycleDAOImpl;
import com.cn.bsnt.model.GoodsAgriculturesUseTricycle;
import com.cn.bsnt.service.GoodsAgriculturesUseTricycleService;

public class GoodsAgriculturesUseTricycleServiceImpl implements GoodsAgriculturesUseTricycleService{

	GoodsAgriculturesUseTricycleDAOImpl gaut=new GoodsAgriculturesUseTricycleDAOImpl();
	public List<GoodsAgriculturesUseTricycle> selectAll() {
		// TODO Auto-generated method stub
		return gaut.selectAll();
	}

}
