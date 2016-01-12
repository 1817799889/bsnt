package com.cn.bsnt.service;

import java.sql.SQLException;
import java.util.List;

import com.cn.bsnt.model.GoodsNourishingHealth;

public interface GoodsNourishingHealthService {
  public List<GoodsNourishingHealth> selectAll() throws SQLException ;
	  
  
}
