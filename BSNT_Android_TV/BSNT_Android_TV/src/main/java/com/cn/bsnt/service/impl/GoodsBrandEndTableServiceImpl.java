package com.cn.bsnt.service.impl;

import java.util.List;

import com.cn.bsnt.dao.impl.GoodsBrandEndTableDAOImpl;
import com.cn.bsnt.model.GoodsBrandEndTable;
import com.cn.bsnt.service.GoodsBrandEndTableService;

public class GoodsBrandEndTableServiceImpl implements GoodsBrandEndTableService{

	GoodsBrandEndTableDAOImpl gbet=new GoodsBrandEndTableDAOImpl();
	public List<GoodsBrandEndTable> selectAll() {
		// TODO Auto-generated method stub
		return gbet.selectAll();
	}

}
