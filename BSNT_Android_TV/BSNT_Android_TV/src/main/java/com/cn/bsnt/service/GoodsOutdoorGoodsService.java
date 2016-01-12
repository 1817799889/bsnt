package com.cn.bsnt.service;

import java.sql.SQLException;
import java.util.List;

import com.cn.bsnt.model.GoodsOutdoorGoods;

public interface GoodsOutdoorGoodsService {
    public List<GoodsOutdoorGoods> selectAll() throws SQLException;
}
