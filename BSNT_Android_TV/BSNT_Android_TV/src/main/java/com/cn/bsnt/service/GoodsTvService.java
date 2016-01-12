package com.cn.bsnt.service;



import java.sql.SQLException;
import java.util.List;

import com.cn.bsnt.model.GoodsTv;

public interface GoodsTvService {
	public List<GoodsTv> selectAll()  throws SQLException;

}
