package com.cn.bsnt.service.impl;

import java.util.List;

import com.cn.bsnt.dao.impl.GoodsCameraDAOImpl;
import com.cn.bsnt.model.GoodsCamera;
import com.cn.bsnt.service.GoodsCameraService;

public class GoodsCameraServiceImpl implements GoodsCameraService{

	GoodsCameraDAOImpl camrea=new GoodsCameraDAOImpl();
	public List<GoodsCamera> selectAll() {
		// TODO Auto-generated method stub
		return camrea.selectAll();
	}

}
