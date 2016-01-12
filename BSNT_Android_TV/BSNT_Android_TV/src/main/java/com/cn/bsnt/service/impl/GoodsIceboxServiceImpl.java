package com.cn.bsnt.service.impl;

import java.sql.SQLException;
import java.util.List;

import com.cn.bsnt.dao.impl.GoodsIceboxDAOImpl;
import com.cn.bsnt.model.GoodsIcebox;
import com.cn.bsnt.service.GoodsIceboxService;
      
     
public class GoodsIceboxServiceImpl implements GoodsIceboxService{
      
	  GoodsIceboxDAOImpl gixp=new GoodsIceboxDAOImpl();
	public List<GoodsIcebox> selectAll() throws SQLException {
	     
		  return gixp.selectAll();
	}

}
