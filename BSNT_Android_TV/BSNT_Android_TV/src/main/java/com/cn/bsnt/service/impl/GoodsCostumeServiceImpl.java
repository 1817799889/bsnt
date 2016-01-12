package com.cn.bsnt.service.impl;

import java.util.List;

import com.cn.bsnt.dao.impl.GoodsCostumeDAOImpl;
import com.cn.bsnt.model.GoodsCostume;
import com.cn.bsnt.service.GoodsCostumeService;

public class GoodsCostumeServiceImpl implements GoodsCostumeService{

	GoodsCostumeDAOImpl gcdi=new GoodsCostumeDAOImpl();

	public List<GoodsCostume> selectAll(String type) {
		// TODO Auto-generated method stub
		return gcdi.selectAll(type);
	}
	
}
