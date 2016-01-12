package com.cn.bsnt.service.impl;

import java.util.List;

import com.cn.bsnt.dao.impl.GoodsVideoPlayOrganDAOImpl;
import com.cn.bsnt.model.GoodsVideoPlayOrgan;
import com.cn.bsnt.service.GoodsVideoPlayOrganService;

public class GoodsVideoPlayOrganServiceImpl implements GoodsVideoPlayOrganService{

	GoodsVideoPlayOrganDAOImpl gvpo=new GoodsVideoPlayOrganDAOImpl();
	public List<GoodsVideoPlayOrgan> selectAll() {
		// TODO Auto-generated method stub
		return gvpo.selectAll();
	}

	
}
