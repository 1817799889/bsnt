package com.cn.bsnt.service.impl;

import java.util.List;

import com.cn.bsnt.dao.impl.GoodsEarlyEductionEnlightenmentDAOImpl;
import com.cn.bsnt.model.GoodsEarlyEductionEnlightenment;
import com.cn.bsnt.service.GoodsEarlyEductionEnlightenmentService;

public class GoodsEarlyEductionEnlightenmentServiceImpl implements GoodsEarlyEductionEnlightenmentService{

	GoodsEarlyEductionEnlightenmentDAOImpl geI=new GoodsEarlyEductionEnlightenmentDAOImpl();
	public List<GoodsEarlyEductionEnlightenment> selectAll() {
		// TODO Auto-generated method stub
		return geI.selecAll();
	}

}
