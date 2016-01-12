package com.cn.bsnt.service.impl;

import java.util.List;

import com.cn.bsnt.dao.impl.GoodsBoxSpringSuiteDAOImpl;
import com.cn.bsnt.model.GoodsBoxSpringSuite;
import com.cn.bsnt.service.GoodsBoxSpringSuiteService;

public class GoodsBoxSpringSuiteServiceImpl implements GoodsBoxSpringSuiteService{

	GoodsBoxSpringSuiteDAOImpl gbssdi = new GoodsBoxSpringSuiteDAOImpl();
	
	public List<GoodsBoxSpringSuite> selectAll() throws Exception {
		// TODO Auto-generated method stub
		return gbssdi.selectAll();
	}

}
