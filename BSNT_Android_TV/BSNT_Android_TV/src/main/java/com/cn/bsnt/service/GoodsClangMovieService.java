package com.cn.bsnt.service;

import java.sql.SQLException;
import java.util.List;

import com.cn.bsnt.model.GoodsClangMovie;

public interface GoodsClangMovieService {
      public List<GoodsClangMovie> selectAll() throws SQLException;
}
