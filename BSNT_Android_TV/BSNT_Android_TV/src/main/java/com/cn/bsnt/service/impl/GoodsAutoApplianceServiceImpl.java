package com.cn.bsnt.service.impl;

import java.util.List;

import com.cn.bsnt.dao.impl.GoodsAutoApplianceDAOImpl;
import com.cn.bsnt.model.GoodsAutoAppliance;
import com.cn.bsnt.service.GoodsAutoApplianceService;

public class GoodsAutoApplianceServiceImpl implements GoodsAutoApplianceService{

	GoodsAutoApplianceDAOImpl gaadi = new GoodsAutoApplianceDAOImpl();
	
	public List<GoodsAutoAppliance> selectAll() throws Exception {
		// TODO Auto-generated method stub
		return gaadi.selectAll();
	}

}
