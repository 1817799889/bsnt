package com.cn.bsnt.service.impl;

import java.sql.SQLException;
import java.util.List;

import com.cn.bsnt.dao.impl.GoodsOtherElectricApplianceDAOImpl;
import com.cn.bsnt.model.GoodsOtherElectricAppliance;
import com.cn.bsnt.service.GoodsOtherelectricApplianceService;

public class GoodsOtherelectricApplianceServiceImpl implements GoodsOtherelectricApplianceService {

	GoodsOtherElectricApplianceDAOImpl goea=new GoodsOtherElectricApplianceDAOImpl();
	public List<GoodsOtherElectricAppliance> selectAll() throws SQLException {
	       return goea.selectAll();
	}
}
