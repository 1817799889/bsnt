package com.cn.bsnt.service;

import java.sql.SQLException;
import java.util.List;

import com.cn.bsnt.model.GoodsSportGoods;

public interface GoodsSportGoodsService {

	  public List<GoodsSportGoods> selectAll() throws SQLException;
}
