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
import com.cn.bsnt.model.GoodsTea;
import com.cn.bsnt.model.GoodsWasher;
import com.cn.bsnt.model.User;


public class GoodsTeaDAOImpl implements BaseDAO<GoodsTea>{
          private Connection conn=null;
      	  private PreparedStatement para=null;
          private  ResultSet rs= null;
          private String sql;
          private  List<GoodsTea> GoodsTeaList=new ArrayList<GoodsTea>();     
	public int insert(GoodsTea t) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int delete(int id) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int update(GoodsTea t) throws SQLException {
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
     public List<GoodsTea> selectAll() throws SQLException{
    	 sql="select * from Goods_Tea";
    	 conn=ConnectionManager.getConnection();
    	 para=conn.prepareStatement(sql);
    	 rs=para.executeQuery();
		  GoodsTea gta=null;
		  while(rs.next()){
			  gta=new GoodsTea();
			  gta.setId(rs.getInt("ID"));
			  gta.setName(rs.getString("NAME"));
			  gta.setPrice(rs.getDouble("PRICE"));
			  gta.setType(rs.getString("TYPE"));
			  gta.setColor(rs.getString("COLOR"));
			  gta.setSize(rs.getString("SIZE"));
			  gta.setBrand(rs.getString("BRAND"));
			  gta.setCount(rs.getString("COUNT"));
			  gta.setMonthSales(rs.getString("MONTH_SALES"));
			  gta.setTotalSales(rs.getString("TOTAL_SALES"));
			  gta.setDesc(rs.getString("DESC"));
			  gta.setFactorySite(rs.getString("FACTORY_SITE"));
			  gta.setFactoryPhone(rs.getString("FACTORY_PHONE"));
			  gta.setBurdensheef(rs.getString("BURDEN_SHEET"));
			  gta.setFirstCost(rs.getString("FIRST_COST"));
			  gta.setStoreWay(rs.getString("STORE_WAY"));
			  gta.setExpiprationDate(rs.getString("EXPIRATION_DATE"));
			  gta.setFoodAdditives(rs.getString("FOOD_ADDITIVES"));
			  gta.setProductionPlace(rs.getString("PRODUCTION_PLACE"));
			  gta.setNetWeight(rs.getString("NET_WEIGHT"));
			  gta.setPackageWay(rs.getString("PACKAGE_WAY"));
			  gta.setWorksInitials(rs.getString("WORKS_INITIALS"));
			  gta.setArtNumber(rs.getString("ART_NUMBER"));
			  gta.setBooleanIncludeSugar(rs.getString("BOOLEAN_INCLUDE_SUGAR"));
			  gta.setTaste(rs.getString("TASTE"));
			  gta.setSeries(rs.getString("SERIES"));
			  gta.setComboWeight(rs.getString("COMBO_WEIGHT"));
			  gta.setComboCycle(rs.getString("COMBO_CYCLE"));
			  gta.setKind(rs.getString("KIND"));
			  gta.setDistributionFrequency(rs.getString("DISTRIBUTION_FREQUENCY"));
			  gta.setApplyObject(rs.getString("APPLY_OBJECT"));
			   
			  GoodsTeaList.add(gta);
			  
		  }
		return GoodsTeaList;
    	
    
     }
}
