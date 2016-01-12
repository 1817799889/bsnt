package com.cn.bsnt.service;

import java.sql.SQLException;
import java.util.List;

import com.cn.bsnt.model.GoodsOtherElectricAppliance;

public interface GoodsOtherelectricApplianceService {

	 public List<GoodsOtherElectricAppliance> selectAll() throws SQLException;
}
