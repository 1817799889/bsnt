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
import com.cn.bsnt.model.GoodsNourishingHealth;
import com.cn.bsnt.model.GoodsRiceCooker;
import com.cn.bsnt.model.User;

public class GoodsNourishingHealthDAOImpl implements BaseDAO<GoodsNourishingHealth>{
	private Connection  conn = null;
	private PreparedStatement para=null;
	private ResultSet rs = null;
	private String sql;
	private List<GoodsNourishingHealth> goodsNourishingHealthList= new ArrayList<GoodsNourishingHealth>();

	public int insert(GoodsNourishingHealth t) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int delete(int id) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int update(GoodsNourishingHealth t) throws SQLException {
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
    public List<GoodsNourishingHealth> selectAll() throws SQLException {
    	sql="select * from goods_nourishing_health";
		conn=ConnectionManager.getConnection();
		para=conn.prepareStatement(sql);
		rs=para.executeQuery();
		GoodsNourishingHealth gnh=null;
		while(rs.next()){
			gnh=new GoodsNourishingHealth();
			gnh.setId(rs.getInt("ID"));
			gnh.setName(rs.getString("NAME"));
			gnh.setPrice(rs.getDouble("PRICE"));
			gnh.setType(rs.getString("PRICE"));
			gnh.setColor(rs.getString("COLOR"));
			gnh.setSize(rs.getString("SIZE"));
			gnh.setBrand(rs.getString("BRAND"));
			gnh.setCount(rs.getString("COUNT"));
			gnh.setMonthSales(rs.getString("MONTH_SALES"));
			gnh.setTotalSales(rs.getString("TOTAL_SALES"));
			gnh.setDesc(rs.getString("DESC"));
			gnh.setPackageWay(rs.getString("PACK_WAY"));
			gnh.setFactorySite(rs.getString("FACTORY_SITE"));
			gnh.setFactoryPhone(rs.getString("FACTORY_PHONE"));
			gnh.setBurdenSheet(rs.getString("BURDEN_SHEET"));
			gnh.setFirstCost(rs.getString("FIRST_COST"));
    	   gnh.setStoreWay(rs.getString("STORE_WAY"));
    	   gnh.setExpirationDate(rs.getString("EXPIRATION_DATE"));
    	   gnh.setFoodAdditives(rs.getString("EXPIRATION_DATE"));
    	   gnh.setPackageKind(rs.getString("PACKAGE_KIND"));
		   gnh.setProductionPlace(rs.getString("PRODUCTION_PLACE"));
		   gnh.setWeight(rs.getString("WEIGHT"));
		   gnh.setStandard(rs.getString("STANDARD"));
		   gnh.setSaleArea(rs.getString("SALE_AREA"));
		   gnh.setPackageWay(rs.getString("PACKAGE_WAY"));
		   gnh.setSeries(rs.getString("SERIES"));
		   gnh.setWorksInitials(rs.getString("WORKS_INITIALS"));
		   gnh.setKind(rs.getString("KIND"));
		   gnh.setArtNumber(rs.getString("ART_NUMBER"));
		   gnh.setTaste(rs.getString("TASTE"));
		   gnh.setSpecialtyCateGory(rs.getString("SPECIALTY_CATEGORY"));
		   gnh.setFoodType(rs.getString("FOOD_TYPE"));
		   gnh.setLevel(rs.getString("LEVEL"));
		   gnh.setComboCycle(rs.getString("COMBO_CYCLE"));
           gnh.setComboWeight(rs.getString("COMBO_WEIGHT"));
           gnh.setApplyObject(rs.getString("BOOLEAN_ORGANIC_FOOD"));
           gnh.setBooleanIncludeSugar(rs.getString("BOOLEAN_INCLUDE_SUGAR"));
           
           goodsNourishingHealthList.add(gnh);
		
    }  	
		return goodsNourishingHealthList;
        
}
}
