package com.cn.bsnt.service.impl;

import java.util.List;

import com.cn.bsnt.dao.impl.GoodsMotherBabyProductDAOIpml;
import com.cn.bsnt.model.GoodsMotherBabyProduct;
import com.cn.bsnt.service.GoodsMotherBabyProductService;

public class GoodsMotherBabyProductServiceImpl implements GoodsMotherBabyProductService{

	GoodsMotherBabyProductDAOIpml gmbp=new GoodsMotherBabyProductDAOIpml();
	public List<GoodsMotherBabyProduct> selectAll() {
		// TODO Auto-generated method stub
		return gmbp.selectAll();
	}

}
