package com.cn.bsnt.service.impl;

import java.sql.SQLException;
import java.util.List;

import com.cn.bsnt.dao.impl.GoodsSnackDAOImpl;
import com.cn.bsnt.model.GoodsSnack;
import com.cn.bsnt.service.GoodsSnackService;

public class GoodsSnackServiceImpl implements GoodsSnackService{
       GoodsSnackDAOImpl gskd=new GoodsSnackDAOImpl();
	public List<GoodsSnack> selectAll() throws SQLException {
	return gskd.selectAll();
	}

}
