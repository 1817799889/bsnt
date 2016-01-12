package com.cn.bsnt.service.impl;

import java.util.List;

import com.cn.bsnt.dao.impl.GoodsDoorWindowsDAOImpl;
import com.cn.bsnt.model.GoodsDoorWindows;
import com.cn.bsnt.service.GoodsDoorWindowsService;

public class GoodsDoorWindowsServiceImpl implements GoodsDoorWindowsService{

	GoodsDoorWindowsDAOImpl gdw=new GoodsDoorWindowsDAOImpl();
	public List<GoodsDoorWindows> selectAll() {
		// TODO Auto-generated method stub
		return gdw.selectAll();
	}

	
}
