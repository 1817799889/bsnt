package com.cn.bsnt.service.impl;

import java.util.List;

import com.cn.bsnt.dao.impl.GoodsCameraMonitoredDAOImpl;
import com.cn.bsnt.model.GoodsCameraMonitored;
import com.cn.bsnt.service.GoodsCameraMonitoredService;

public class GoodsCameraMonitoredServiceImpl implements GoodsCameraMonitoredService{

	GoodsCameraMonitoredDAOImpl monitor=new GoodsCameraMonitoredDAOImpl();
	public List<GoodsCameraMonitored> selectAll() {
		// TODO Auto-generated method stub
		return monitor.selectAll();
	}

}
