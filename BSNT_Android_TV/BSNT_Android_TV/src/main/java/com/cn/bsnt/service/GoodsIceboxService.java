package com.cn.bsnt.service;

import java.sql.SQLException;
import java.util.List;

import com.cn.bsnt.model.GoodsIcebox;

public interface GoodsIceboxService {
  
	 public List<GoodsIcebox> selectAll() throws SQLException;
}
