package com.cn.bsnt.service;

import java.sql.SQLException;
import java.util.List;

import com.cn.bsnt.model.GoodsWine;

public interface GoodsWineService {
  public List<GoodsWine> selectAll() throws SQLException;
}
