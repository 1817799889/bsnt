package com.cn.bsnt.service.impl;

import java.util.List;

import com.cn.bsnt.dao.impl.GoodsAgriculturesMachineryDAOImpl;
import com.cn.bsnt.model.GoodsAgriculturesMachinery;
import com.cn.bsnt.service.GoodsAgriculturesMachineryService;

public class GoodsAgriculturesMachineryServiceImpl implements
		GoodsAgriculturesMachineryService {

	GoodsAgriculturesMachineryDAOImpl machinery=new GoodsAgriculturesMachineryDAOImpl();

	public List<GoodsAgriculturesMachinery> selectAll() {
		// TODO Auto-generated method stub
		return machinery.selectAll();
	}
	
}
