package com.cn.bsnt.service;

import java.util.List;

import com.cn.bsnt.model.GoodsShoes;

public interface GoodsShoesService {

	public List<GoodsShoes> selectAll(String type);
}
