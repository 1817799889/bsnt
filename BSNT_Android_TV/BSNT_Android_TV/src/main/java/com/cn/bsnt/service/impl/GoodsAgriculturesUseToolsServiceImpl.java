package com.cn.bsnt.service.impl;

import java.util.List;

import com.cn.bsnt.dao.impl.GoodsAgriculturesUseToolsDAOImpl;
import com.cn.bsnt.model.GoodsAgriculturesUseTools;
import com.cn.bsnt.service.GoodsAgriculturesUseToolsService;

public class GoodsAgriculturesUseToolsServiceImpl implements
		GoodsAgriculturesUseToolsService {

	GoodsAgriculturesUseToolsDAOImpl tools=new GoodsAgriculturesUseToolsDAOImpl();
	public List<GoodsAgriculturesUseTools> selectAll() {
		// TODO Auto-generated method stub
		return tools.selectAll();
	}

}
