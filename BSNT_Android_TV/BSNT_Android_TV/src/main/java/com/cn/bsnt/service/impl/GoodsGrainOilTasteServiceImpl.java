package com.cn.bsnt.service.impl;

import java.sql.SQLException;
import java.util.List;

import com.cn.bsnt.dao.impl.GoodsGrainOilTasteDAOImpl;
import com.cn.bsnt.model.GoodsGrainOilTaste;
import com.cn.bsnt.service.GoodsGrainOilTasteService;

public class GoodsGrainOilTasteServiceImpl implements GoodsGrainOilTasteService{
	GoodsGrainOilTasteDAOImpl ggotd=new GoodsGrainOilTasteDAOImpl();
	public List<GoodsGrainOilTaste> selectAll() throws SQLException {
		return ggotd.selectAll();
	}

}
