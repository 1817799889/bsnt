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
import com.cn.bsnt.model.GoodsGrainOilTaste;
import com.cn.bsnt.model.GoodsSnack;
import com.cn.bsnt.model.GoodsWasher;
import com.cn.bsnt.model.User;

public class GoodsGrainOilTasteDAOImpl implements BaseDAO<GoodsGrainOilTaste>{
	private Connection  conn = null;
	private PreparedStatement para=null;
	private ResultSet rs = null;
	private String sql;
	private List<GoodsGrainOilTaste> goodsGrainOilTasteList= new ArrayList<GoodsGrainOilTaste>();
	
	  
	public int insert(GoodsGrainOilTaste t) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int delete(int id) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int update(GoodsGrainOilTaste t) throws SQLException {
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
 
	 public List<GoodsGrainOilTaste> selectAll() throws SQLException {
		 sql= "select * from goods_grain_oil_taste";
		conn=ConnectionManager.getConnection();
		para=conn.prepareStatement(sql);
		rs=para.executeQuery();
		GoodsGrainOilTaste ggot=null;
		while(rs.next()){
			ggot=new GoodsGrainOilTaste();
			ggot.setId(rs.getInt("ID"));
			ggot.setName(rs.getString("NAME"));
			ggot.setPrice(rs.getDouble("PRICE"));
			ggot.setType(rs.getString("TYPE"));
			ggot.setColor(rs.getString("COLOR"));
			ggot.setSize(rs.getString("SIZE"));
			ggot.setBrand(rs.getString("BRAND"));
			ggot.setCount(rs.getString("COUNT"));
			ggot.setMonthSales(rs.getString("MONTH_SALES"));
			ggot.setTotalSales(rs.getString("TOTAL_SALES"));
			ggot.setDesc(rs.getString("DESC"));
			ggot.setPackWay(rs.getString("PACK_WAY"));
			ggot.setFactorySize(rs.getString("FACTORY_SITE"));
			ggot.setFactoryPhone(rs.getString("FACTORY_PHONE"));
			ggot.setBurdenSheet(rs.getString("BURDEN_SHEET"));
	        ggot.setFirstCost(rs.getString("FIRST_COST"));
	        ggot.setStoreWay(rs.getString("STORE_WAY"));
		    ggot.setExpirationDate(rs.getString("EXPIRATION_DATE"));
		    ggot.setFoodAdditives(rs.getString("FOOD_ADDITIVES"));
		    ggot.setPackageKind(rs.getString("PACKAGE_KIND"));
		    ggot.setProductionPlace(rs.getString("PRODUCTION_PLACE"));
		    ggot.setWeight(rs.getString("WEIGHT"));
		    ggot.setStandard(rs.getString("STANDARD"));
		    ggot.setSaleArea(rs.getString("PACKAGE_WAY"));
		    ggot.setSeries(rs.getString("SERIES"));
		    ggot.setWorksInitials(rs.getString("WORKS_INITIALS"));
		    ggot.setKind(rs.getString("KIND"));
		    ggot.setArtNumber(rs.getString("ART_NUMBER"));
		    ggot.setTaste(rs.getString("TASTE"));
		    ggot.setSpecialtyCategory(rs.getString("SPECIALTY_CATEGORY"));
		    ggot.setFoodType(rs.getString("FOOD_TYPE"));
		    ggot.setLevel(rs.getString("LEVEL"));
		    ggot.setComboCycle(rs.getString("COMBO_CYCLE"));
		    ggot.setComboWeight(rs.getString("COMBO_WEIGHT"));
		    ggot.setDistributionFrequency(rs.getString("DISTRIBUTION_FREQUENCY"));
		    ggot.setSameCityService(rs.getString("SAME_CITY_SERVICE"));
		    ggot.setSaleWay(rs.getString("SALE_WAY"));
		    
		    goodsGrainOilTasteList.add(ggot);
		
		}
		return goodsGrainOilTasteList;
		
	 }
}