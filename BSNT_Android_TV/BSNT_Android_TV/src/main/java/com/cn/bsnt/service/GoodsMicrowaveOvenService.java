package com.cn.bsnt.service;

import java.sql.SQLException;
import java.util.List;

import com.cn.bsnt.model.GoodsMicrowaveOven;

public interface GoodsMicrowaveOvenService {
     public List<GoodsMicrowaveOven> selectAll() throws SQLException;
}
