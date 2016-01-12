package com.cn.bsnt.service.impl;

import java.sql.SQLException;
import java.util.List;

import com.cn.bsnt.dao.impl.GoodsMicrowaveOvenDAOImpl;
import com.cn.bsnt.model.GoodsMicrowaveOven;
import com.cn.bsnt.service.GoodsMicrowaveOvenService;

public class GoodsMicrowaveOvenServiceImpl implements GoodsMicrowaveOvenService {
        GoodsMicrowaveOvenDAOImpl gmo=new GoodsMicrowaveOvenDAOImpl();
	public List<GoodsMicrowaveOven> selectAll() throws SQLException {
		
		return gmo.SelectAll();
	}

}
