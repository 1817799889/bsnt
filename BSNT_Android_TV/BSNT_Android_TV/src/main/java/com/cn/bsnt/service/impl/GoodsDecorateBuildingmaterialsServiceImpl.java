package com.cn.bsnt.service.impl;

import java.util.List;

import com.cn.bsnt.dao.impl.GoodsDecorateBuildingmaterialsDAOImpl;
import com.cn.bsnt.model.GoodsDecorateBuildingmaterials;
import com.cn.bsnt.service.GoodsDecorateBuildingmaterialsService;

public class GoodsDecorateBuildingmaterialsServiceImpl implements GoodsDecorateBuildingmaterialsService{

	GoodsDecorateBuildingmaterialsDAOImpl gdb=new GoodsDecorateBuildingmaterialsDAOImpl();
	public List<GoodsDecorateBuildingmaterials> selectAll() {
		// TODO Auto-generated method stub
		return gdb.selectAll();
	}

}
