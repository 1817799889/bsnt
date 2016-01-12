package com.cn.bsnt.service.impl;

import java.sql.SQLException;
import java.util.List;

import com.cn.bsnt.dao.impl.GoodsFitnessEquipmentDAOImpl;
import com.cn.bsnt.model.GoodsFitnessEquipment;
import com.cn.bsnt.service.GoodsFitnessEquipmentService;
  
public class GoodsFitnessEquipmentServiceImpl implements GoodsFitnessEquipmentService{
	GoodsFitnessEquipmentDAOImpl gfed=new GoodsFitnessEquipmentDAOImpl();
	public List<GoodsFitnessEquipment> selectAll() throws SQLException {
		  return gfed.selectAll();
	}

}
