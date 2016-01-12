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
import com.cn.bsnt.model.GoodsTv;
import com.cn.bsnt.model.GoodsWaterFountain;
import com.cn.bsnt.model.User;
        
public class GoodsWaterFountainDAOImpl implements BaseDAO<GoodsWaterFountain>{
	private Connection  conn = null;
	private PreparedStatement para=null;
	private ResultSet rs = null;
	private String sql;
	private List<GoodsWaterFountain> goodsWaterFountainList= new ArrayList<GoodsWaterFountain>();
	
	public int insert(GoodsWaterFountain t) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int delete(int id) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int update(GoodsWaterFountain t) throws SQLException {
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
	public List<GoodsWaterFountain> selectAll() throws SQLException{
		   sql="select * from goods_water_fountain";
		   conn=ConnectionManager.getConnection();
		   para=conn.prepareStatement(sql);
		   rs=para.executeQuery();
		   GoodsWaterFountain gwf=null;
		   while(rs.next()){
			   gwf=new GoodsWaterFountain();
			   gwf.setId(rs.getInt("ID"));
			   gwf.setName(rs.getString("NAME"));
			   gwf.setPrice(rs.getDouble("PRICE"));
			   gwf.setType(rs.getString("PRICE"));
			   gwf.setColor(rs.getString("COLOR"));
			   gwf.setSize(rs.getString("SIZE"));
			   gwf.setBrand(rs.getString("BRAND"));
			   gwf.setCount(rs.getString("COUNT"));
			   gwf.setMonthSales(rs.getString("MONTH_SALES"));
			   gwf.setTotalSales(rs.getString("TOTAL_SALES"));
			   gwf.setDesc(rs.getString("DESC"));
			   gwf.setShape(rs.getString("SHAPE"));
			   gwf.setWaterTemperature(rs.getString("WATER_TEMPERATURE"));
			   gwf.setFirstCost(rs.getString("FIRST_COST"));
			   
			   
			   goodsWaterFountainList.add(gwf);
			   	   
		   }
		   
		      return goodsWaterFountainList;
		
	}

}
