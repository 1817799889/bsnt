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
import com.cn.bsnt.model.GoodsSnack;
import com.cn.bsnt.model.GoodsTv;
import com.cn.bsnt.model.GoodsWasher;
import com.cn.bsnt.model.User;

public class GoodsSnackDAOImpl implements BaseDAO<GoodsSnack> {
	private Connection  conn = null;
	private PreparedStatement para=null;
	private ResultSet rs = null;
	private String sql;
	private List<GoodsSnack> GoodsSnackList= new ArrayList<GoodsSnack>();

	public int insert(GoodsSnack t) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int delete(int id) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int update(GoodsSnack t) throws SQLException {
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
	public List<GoodsSnack> selectAll() throws SQLException {
		sql= "select * from goods_snack";
		conn=ConnectionManager.getConnection();
		para=conn.prepareStatement(sql);
		rs=para.executeQuery();
		GoodsSnack gsn=null;
		while(rs.next()){
			gsn=new GoodsSnack();
			gsn.setId(rs.getInt("ID"));
			gsn.setName(rs.getString("NAME"));
			gsn.setPrice(rs.getDouble("PRICE"));
			gsn.setType(rs.getString("TYPE"));
			gsn.setColor(rs.getString("COLOR"));
			gsn.setSize(rs.getString("SIZE"));
			gsn.setBrand(rs.getString("BRAND"));
			gsn.setCount(rs.getString("COUNT"));
			gsn.setMonthSales(rs.getString("MONTH_SALES"));
			gsn.setTotalSales(rs.getString("TOTAL_SALES"));
			gsn.setDesc(rs.getString("DESC"));
			gsn.setPackWay(rs.getString("PACK_WAY"));
			gsn.setFirstCost(rs.getString("FIRST_COST"));
			gsn.setStoreWay(rs.getString("STORE_WAY"));
			gsn.setExpirationDate(rs.getString("EXPIRATION_DATE"));
			gsn.setFoodAdditives(rs.getString("FOOD_ADDITIVES"));
			gsn.setPackageKind(rs.getString("PACKAGE_KIND"));
			gsn.setProductionPlace(rs.getString("PRODUCTION_PLACE"));
			gsn.setWeight(rs.getString("WEIGHT"));
			gsn.setStandard(rs.getString("STANDARD"));
			gsn.setSaleArea(rs.getString("SALE_AREA"));
			gsn.setPackageWay(rs.getString("PACKAGE_WAY"));
			gsn.setSeries(rs.getString("SERIES"));
			gsn.setWorksInitials(rs.getString("WORKS_INITIALS"));
			gsn.setKind(rs.getString("KIND"));
			gsn.setArtNumber(rs.getString("ART_NUMBER"));
			gsn.setMeatPproducts(rs.getString("MEAT_PRODUCTS"));
			gsn.setTeste(rs.getString("TASTE"));
			gsn.setSpecialtyCategory(rs.getString("SPECIALTY_CATEGORY"));
			gsn.setFoodType(rs.getString("FOOD_TYPE"));
			gsn.setBooleanIncludeSugar(rs.getString("BOOLEAN_INCLUDE_SUGAR"));
			gsn.setWaterContent(rs.getString("WATER_CONTENT"));
			gsn.setLevel(rs.getString("LEVEL"));
			gsn.setSingleFruitDiameter(rs.getString("SINGLE_FRUIT_DIAMETER"));
			gsn.setBooleanCocoa(rs.getString("BOOLEAN_COCOA"));
			gsn.setBooleanHandStripping(rs.getString("BOOLEAN_HAND_STRIPPING"));
			gsn.setBooleanNew(rs.getString("BOOLEAN_NEW"));
            gsn.setFoodProcess(rs.getString("FOOD_PROCESS"));
		}
		
		return GoodsSnackList;
	}
}