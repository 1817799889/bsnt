package com.cn.bsnt.service;

import java.sql.SQLException;
import java.util.List;

import com.cn.bsnt.model.GoodsWasher;

public interface GoodsWasherService {

	 public List<GoodsWasher> selectAll() throws SQLException; 
}
