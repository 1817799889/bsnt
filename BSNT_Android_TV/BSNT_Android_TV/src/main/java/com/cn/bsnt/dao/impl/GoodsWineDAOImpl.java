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
import com.cn.bsnt.model.GoodsWaterFountain;
import com.cn.bsnt.model.GoodsWine;
import com.cn.bsnt.model.User;

public class GoodsWineDAOImpl implements BaseDAO<GoodsWine>{
	private Connection  conn = null;
	private PreparedStatement para=null;
	private ResultSet rs = null;
	private String sql;
	private List<GoodsWine> goodsWineList= new ArrayList<GoodsWine>();
	
	public int insert(GoodsWine t) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int delete(int id) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int update(GoodsWine t) throws SQLException {
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
   public List<GoodsWine> selectAll() throws SQLException{
	       sql="select * from goods_wine";
	       conn=ConnectionManager.getConnection();
	       para=conn.prepareStatement(sql);
	       rs=para.executeQuery();
	       GoodsWine gdw=null;
	       while(rs.next()){
	    	  gdw = new GoodsWine();
	    	   gdw.setId(rs.getInt("ID"));
	    	   gdw.setName(rs.getString("NAME"));
	    	   gdw.setPrice(rs.getDouble("PRICE"));
	    	   gdw.setType(rs.getString("TYPE"));
	    	   gdw.setColor(rs.getString("COLOR"));
	    	   gdw.setSize(rs.getString("SIZE"));
	    	   gdw.setBrand(rs.getString("BRAND"));
	    	   gdw.setCount(rs.getString("COUNT"));
	    	   gdw.setMonthSales(rs.getString("MONTH_SALES"));
	    	   gdw.setTotalSales(rs.getString("TOTAL_SALES"));
	    	   gdw.setDesc(rs.getString("DESC"));
	    	   gdw.setFactorySite(rs.getString("FACTORY_SITE"));
	    	   gdw.setFantoryPhone(rs.getString("FACTORY_PHONE"));
	    	   gdw.setBurdenSheet(rs.getString("BURDEN_SHEET"));
	    	   gdw.setFirstCost(rs.getString("FIRST_COST"));
	    	   gdw.setStoreWay(rs.getString("STORE_WAY"));
	    	   gdw.setExpirationDate(rs.getString("EXPIRATION_DATE"));
	    	   gdw.setFoodAdditives(rs.getString("FOOD_ADDITIVES"));
	    	   gdw.setProductionPlace(rs.getString("PRODUCTION_PLACE"));
	    	   gdw.setNetWeight(rs.getString("NET_WEIGHT"));
	    	   gdw.setPackageWay(rs.getString("PACKAGE_WAY"));
	    	   gdw.setWorksInitials(rs.getString("WORKS_INITIALS"));
	    	   gdw.setArtNumber(rs.getString("ART_NUMBER"));
	           gdw.setVolume(rs.getString("VOLUME"));
	    	   gdw.setApplySence(rs.getString("APPLY_SENCE"));
	    	   gdw.setPackageKind(rs.getString("PACKAGE_KIND"));
	    	   gdw.setDegree(rs.getString("DEGREE"));
	    	   gdw.setYears(rs.getString("YEARS"));
	    	   gdw.setSuitStandard(rs.getString("SUIT_STANDARD"));
	    	   gdw.setWineLevel(rs.getString("WINE_LEVEL"));
	    	   gdw.setTaste(rs.getString("TASTE"));
	    	   gdw.setGrading(rs.getString("GRADING"));
	    	   gdw.setEragrance(rs.getString("FRAGRANCE"));
	    	   gdw.setImportType(rs.getString("IMPORT_TYPE"));
	    	   gdw.setSeries(rs.getString("SERIES"));
	    	   gdw.setProductionProcess(rs.getString("PRODUCTION_PROCESS"));
	    	   gdw.setPackageNumber(rs.getString("PACKAGE_NUMBER"));
	    	   gdw.setConcentration(rs.getString("CONCENTRATION"));
	    	   gdw.setOdorType(rs.getString("ODOR_TYPE"));
	    	   gdw.setDistribution(rs.getString("DISTRIBUTION"));
	    	   
	    	   
	       }
	   return goodsWineList;
	   
   }
}
