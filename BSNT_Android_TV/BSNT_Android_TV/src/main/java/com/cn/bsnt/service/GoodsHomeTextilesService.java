package com.cn.bsnt.service;

import java.util.List;

import com.cn.bsnt.model.GoodsHomeTextiles;

public interface GoodsHomeTextilesService {
	public List<GoodsHomeTextiles> selectAll(String type) throws Exception;

}
