package com.cn.bsnt.service;

import java.util.List;

import com.cn.bsnt.model.GoodsCleaning;

public interface GoodsCleaningService {
	public List<GoodsCleaning> selectAll(String type) throws Exception;

}
