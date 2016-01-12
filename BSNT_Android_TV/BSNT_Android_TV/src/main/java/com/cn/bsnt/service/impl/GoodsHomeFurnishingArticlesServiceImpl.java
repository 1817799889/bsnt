package com.cn.bsnt.service.impl;

import java.util.List;

import com.cn.bsnt.dao.impl.GoodsHomeFurnishingArticlesDAOImpl;
import com.cn.bsnt.model.GoodsHomeFurnishingArticles;
import com.cn.bsnt.service.GoodsHomeFurnishingArticlesService;

public class GoodsHomeFurnishingArticlesServiceImpl implements GoodsHomeFurnishingArticlesService{

	GoodsHomeFurnishingArticlesDAOImpl ghfadi = new GoodsHomeFurnishingArticlesDAOImpl();
	
	public List<GoodsHomeFurnishingArticles> selectAll() throws Exception {
		// TODO Auto-generated method stub
		return ghfadi.selectAll();
	}

}
