package com.cn.bsnt.service;

import java.util.List;

import com.cn.bsnt.model.GoodsLuggage;

public interface GoodsLuggageService {

	public List<GoodsLuggage> selectAll(String type);
}
