package com.cn.bsnt.service.impl;

import java.util.List;

import com.cn.bsnt.dao.impl.GoodsAgriculturesUseArticlesDAOImpl;
import com.cn.bsnt.model.GoodsAgriculturesUseArticles;
import com.cn.bsnt.service.GoodsAgriculturesUseArticlesService;

public class GoodsAgriculturesUseArticlesServiceImpl implements
		GoodsAgriculturesUseArticlesService {

	GoodsAgriculturesUseArticlesDAOImpl gaua=new GoodsAgriculturesUseArticlesDAOImpl();
	public List<GoodsAgriculturesUseArticles> selectAll() {
		// TODO Auto-generated method stub
		return gaua.selectAll();
	}

}
