package com.cn.bsnt.service.impl;

import java.sql.SQLException;
import java.util.List;

import com.cn.bsnt.dao.impl.GoodsTeaWineDAOImpl;
import com.cn.bsnt.model.GoodsTeaWine;
import com.cn.bsnt.service.GoodsTeaWineService;
   
public class GoodsTeaWineServiceImpl implements GoodsTeaWineService{
	 GoodsTeaWineDAOImpl gtwd=new GoodsTeaWineDAOImpl();
	public List<GoodsTeaWine> selectAll() throws SQLException {
		return gtwd.selectAll();
	}

}
