package com.cn.bsnt.service;

import java.sql.SQLException;
import java.util.List;

import com.cn.bsnt.model.GoodsGrainOilTaste;

public interface GoodsGrainOilTasteService {
   public List<GoodsGrainOilTaste> selectAll() throws SQLException;
}
