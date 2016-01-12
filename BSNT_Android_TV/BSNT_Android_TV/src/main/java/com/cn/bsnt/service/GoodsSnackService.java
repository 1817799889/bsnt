package com.cn.bsnt.service;

import java.sql.SQLException;
import java.util.List;

import com.cn.bsnt.model.GoodsSnack;

public interface GoodsSnackService {
   public List<GoodsSnack> selectAll() throws SQLException;
}
