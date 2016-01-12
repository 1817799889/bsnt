package com.cn.bsnt.service.impl;

import java.util.List;

import com.cn.bsnt.dao.impl.GoodsMobilePhoneDAOImpl;
import com.cn.bsnt.model.GoodsMobilePhone;
import com.cn.bsnt.service.GoodsMobilePhoneService;

public class GoodsMobilePhoneServiceImpl implements GoodsMobilePhoneService{

	GoodsMobilePhoneDAOImpl mobilePhone=new GoodsMobilePhoneDAOImpl();
	public List<GoodsMobilePhone> selectAll() {
		// TODO Auto-generated method stub
		return mobilePhone.selectAll();
	}

}
