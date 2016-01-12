package com.cn.bsnt.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.omg.Dynamic.Parameter;

import com.cn.bsnt.dao.BaseDAO;
import com.cn.bsnt.dbhelper.ConnectionManager;
import com.cn.bsnt.model.GoodsClangMovie;
import com.cn.bsnt.model.User;

public class GoodsClangMovieDAOImpl implements BaseDAO<GoodsClangMovie>{
	private Connection  conn = null;
	private PreparedStatement para=null;
	private ResultSet rs = null;
	private String sql;
	private List<GoodsClangMovie> goodsClangMovieList= new ArrayList<GoodsClangMovie>();
	public int insert(GoodsClangMovie t) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int delete(int id) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int update(GoodsClangMovie t) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public User select(int id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> selectList(Parameter p) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
    public List<GoodsClangMovie> selectAll() throws SQLException{
		sql="select * from goods_clang_movie";
		conn=ConnectionManager.getConnection();
		para=conn.prepareStatement(sql);
		rs=para.executeQuery();
		GoodsClangMovie gcm=null;
		while(rs.next()){
			gcm=new GoodsClangMovie();
			gcm.setId(rs.getInt("ID"));
			gcm.setName(rs.getString("NAME"));
			gcm.setPrice(rs.getDouble("PRICE"));
			gcm.setType(rs.getString("PRICE"));
			gcm.setColor(rs.getString("COLOR"));
			gcm.setSize(rs.getString("SIZE"));
			gcm.setBrand(rs.getString("BRAND"));
			gcm.setCount(rs.getString("COUNT"));
			gcm.setMonthSales(rs.getString("MONTH_SALES"));
			gcm.setTotalSales(rs.getString("TOTAL_SALES"));
			gcm.setDesc(rs.getString("DESC"));
			gcm.setPackSize(rs.getString("PACK_SIZE"));
			gcm.setRoughWeight(rs.getString("TV_ROUGH_WEIGHT"));
			gcm.setCondition(rs.getString("CONDITION"));
			gcm.setBoxTexture(rs.getString("BOX_TEXTURE"));
			gcm.setFirstCost(rs.getString("FIRST_COST"));
			  
			 goodsClangMovieList.add(gcm);
		
			
		}
    	
    	return goodsClangMovieList;
    	
    }
}
