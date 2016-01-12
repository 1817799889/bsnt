package com.cn.bsnt.service.impl;

import java.sql.SQLException;
import java.util.List;

import com.cn.bsnt.dao.impl.GoodsSportGoodsDAOImpl;
import com.cn.bsnt.model.GoodsSportGoods;
import com.cn.bsnt.service.GoodsSportGoodsService;

public class GoodsSportGoodsServiceImpl implements GoodsSportGoodsService {
	GoodsSportGoodsDAOImpl gsgd=new GoodsSportGoodsDAOImpl();
	public List<GoodsSportGoods> selectAll() throws SQLException {
	     return gsgd.selectAll();
	}
 
}
