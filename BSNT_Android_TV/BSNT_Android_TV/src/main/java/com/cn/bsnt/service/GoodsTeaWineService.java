package com.cn.bsnt.service;

import java.sql.SQLException;
import java.util.List;

import com.cn.bsnt.model.GoodsTeaWine;

public interface GoodsTeaWineService {
 
	 public List<GoodsTeaWine> selectAll() throws SQLException;
}
