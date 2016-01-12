package com.cn.bsnt.service;

import java.sql.SQLException;
import java.util.List;

import com.cn.bsnt.model.GoodsRiceCooker;

public interface GoodsRiceCookerService {
     public List<GoodsRiceCooker> selectAll() throws SQLException;
}
