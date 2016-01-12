package com.cn.bsnt.service.impl;

import java.util.List;

import com.cn.bsnt.dao.impl.GoodsSmartDeviceDAOImpl;
import com.cn.bsnt.model.GoodsSmartDevice;
import com.cn.bsnt.service.GoodsSmartDeviceService;

public class GoodsSmartDeviceServiceImpl implements GoodsSmartDeviceService {

	GoodsSmartDeviceDAOImpl gsd=new GoodsSmartDeviceDAOImpl();
	public List<GoodsSmartDevice> selectAll() {
		// TODO Auto-generated method stub
		return gsd.selectAll();
	}

}
