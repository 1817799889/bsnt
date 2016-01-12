package com.cn.bsnt.service.impl;

import java.sql.SQLException;
import java.util.List;

import com.cn.bsnt.dao.impl.GoodsClangMovieDAOImpl;
import com.cn.bsnt.model.GoodsClangMovie;
import com.cn.bsnt.service.GoodsClangMovieService;

public class GoodsClangMovieServiceImpl implements GoodsClangMovieService{
       GoodsClangMovieDAOImpl gcm=new GoodsClangMovieDAOImpl();
	public List<GoodsClangMovie> selectAll() throws SQLException {
		
		return gcm.selectAll();
	}

}
