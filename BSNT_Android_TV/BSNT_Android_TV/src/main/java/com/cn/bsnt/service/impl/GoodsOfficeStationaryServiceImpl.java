package com.cn.bsnt.service.impl;

import java.util.List;

import com.cn.bsnt.dao.impl.GoodsOfficeStationaryDAOImpl;
import com.cn.bsnt.model.GoodsOfficeStationary;
import com.cn.bsnt.service.GoodsOfficeStationaryService;

public class GoodsOfficeStationaryServiceImpl implements GoodsOfficeStationaryService{

	GoodsOfficeStationaryDAOImpl officeImpl=new GoodsOfficeStationaryDAOImpl();
	public List<GoodsOfficeStationary> selectAll() {
		// TODO Auto-generated method stub
		return officeImpl.selectAll();
	}

}
