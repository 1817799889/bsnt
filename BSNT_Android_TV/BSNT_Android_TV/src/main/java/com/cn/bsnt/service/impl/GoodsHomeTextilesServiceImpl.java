package com.cn.bsnt.service.impl;

import java.util.List;

import com.cn.bsnt.dao.impl.GoodsHomeTextilesDAOImpl;
import com.cn.bsnt.model.GoodsHomeTextiles;
import com.cn.bsnt.service.GoodsHomeTextilesService;

public class GoodsHomeTextilesServiceImpl implements GoodsHomeTextilesService{
	GoodsHomeTextilesDAOImpl ghtdi = new GoodsHomeTextilesDAOImpl();

	public List<GoodsHomeTextiles> selectAll(String type) throws Exception {
		// TODO Auto-generated method stub
		return ghtdi.selectAll(type);
	}

}
