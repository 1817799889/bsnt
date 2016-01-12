package com.cn.bsnt.service;

import java.sql.SQLException;
import java.util.List;

import com.cn.bsnt.model.GoodsWaterFountain;

public interface GoodsWaterFountainService {
       public List<GoodsWaterFountain> selectAll() throws SQLException;
}
