package com.cn.bsnt.service;

import java.util.List;

import com.cn.bsnt.model.GoodsMedicacare;

public interface GoodsMedicacareService {

	public List<GoodsMedicacare> selectAll(String type);
}
