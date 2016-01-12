package com.cn.bsnt.service.impl;

import java.sql.SQLException;
import java.util.List;

import com.cn.bsnt.dao.impl.GoodsTeaDAOImpl;
import com.cn.bsnt.model.GoodsTea;
import com.cn.bsnt.service.GoodsTeaService;

public class GoodsTeaServiceImpl implements GoodsTeaService {
       GoodsTeaDAOImpl   gtai=new GoodsTeaDAOImpl();
	public List<GoodsTea> selectAll() throws SQLException {
	       return gtai.selectAll();
	}

}
