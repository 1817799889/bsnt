package com.cn.bsnt.service;

import java.sql.SQLException;
import java.util.List;

import com.cn.bsnt.model.GoodsTea;

public interface GoodsTeaService {
     public List<GoodsTea> selectAll()  throws SQLException;
}
