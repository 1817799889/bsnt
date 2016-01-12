package com.cn.bsnt.service.impl;

import java.util.List;

import com.cn.bsnt.dao.impl.GoodsMedicacareDAOImpl;
import com.cn.bsnt.model.GoodsMedicacare;
import com.cn.bsnt.service.GoodsMedicacareService;

public class GoodsMedicacareServiceImpl implements GoodsMedicacareService{

	GoodsMedicacareDAOImpl medica=new GoodsMedicacareDAOImpl();

	public List<GoodsMedicacare> selectAll(String type) {
		// TODO Auto-generated method stub
		return medica.selectAll(type);
	}
	
}
