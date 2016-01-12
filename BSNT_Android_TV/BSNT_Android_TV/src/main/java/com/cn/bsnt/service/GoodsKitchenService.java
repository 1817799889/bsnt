package com.cn.bsnt.service;

import java.util.List;

import com.cn.bsnt.model.GoodsKitchen;

public interface GoodsKitchenService {
	public List<GoodsKitchen> selectAll(String type) throws Exception;

}
