package com.cn.bsnt.service;

import java.sql.SQLException;
import java.util.List;

import com.cn.bsnt.model.GoodsFitnessEquipment;

public interface GoodsFitnessEquipmentService {
    public List<GoodsFitnessEquipment> selectAll() throws SQLException;
}
