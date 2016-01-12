package com.cn.bsnt.service.impl;

import java.util.List;

import com.cn.bsnt.dao.impl.GoodsMilkDrinkDAOImpl;
import com.cn.bsnt.model.GoodsMilkDrink;
import com.cn.bsnt.service.GoodsMilkDrinkService;

public class GoodsMilkDrinkServiceImpl implements GoodsMilkDrinkService{

	GoodsMilkDrinkDAOImpl gmd=new GoodsMilkDrinkDAOImpl();
	public List<GoodsMilkDrink> selectAll() {
		// TODO Auto-generated method stub
		return gmd.selectAll();
	}

}
