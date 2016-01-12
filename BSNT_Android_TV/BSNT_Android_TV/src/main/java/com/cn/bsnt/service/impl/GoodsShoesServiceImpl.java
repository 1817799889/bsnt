package com.cn.bsnt.service.impl;

import java.util.List;

import com.cn.bsnt.dao.impl.GoodsShoesDAOImpl;
import com.cn.bsnt.model.GoodsShoes;
import com.cn.bsnt.service.GoodsShoesService;

public class GoodsShoesServiceImpl implements GoodsShoesService {

	GoodsShoesDAOImpl gsdi=new GoodsShoesDAOImpl();
	public List<GoodsShoes> selectAll(String type) {
		// TODO Auto-generated method stub
		return gsdi.selectAll(type);
	}

}
