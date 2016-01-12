package com.cn.bsnt.service.impl;

import java.util.List;

import com.cn.bsnt.dao.impl.GoodsDigiyalAccessoriesDAOImpl;
import com.cn.bsnt.model.GoodsDigiyalAccessories;
import com.cn.bsnt.service.GoodsDigiyalAccessoriesService;

public class GoodsDigiyalAccessoriesServiceImpl implements GoodsDigiyalAccessoriesService{

	GoodsDigiyalAccessoriesDAOImpl digiyaAccess=new GoodsDigiyalAccessoriesDAOImpl();

	public List<GoodsDigiyalAccessories> selectAll(String type) {
		// TODO Auto-generated method stub
		return digiyaAccess.selectAll(type);
	}
	

}
