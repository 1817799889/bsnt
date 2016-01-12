package com.cn.bsnt.service.impl;

import java.util.List;

import com.cn.bsnt.dao.impl.GoodsMotherBabyFoodDAOImpl;
import com.cn.bsnt.model.GoodsMotherBabyFood;
import com.cn.bsnt.service.GoodsMotherBabyFoodService;

public class GoodsMotherBabyFoodServiceImpl implements GoodsMotherBabyFoodService{

	GoodsMotherBabyFoodDAOImpl gmbg=new GoodsMotherBabyFoodDAOImpl();
	public List<GoodsMotherBabyFood> selectAll() {
		// TODO Auto-generated method stub
		return gmbg.selectAll();
	}

}
