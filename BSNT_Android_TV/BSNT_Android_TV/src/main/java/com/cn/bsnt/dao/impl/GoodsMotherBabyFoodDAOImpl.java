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
import com.cn.bsnt.model.GoodsMotherBabyFood;
import com.cn.bsnt.model.User;

public class GoodsMotherBabyFoodDAOImpl implements BaseDAO<GoodsMotherBabyFood>{

	Connection conn=null;
	PreparedStatement ps=null;
	ResultSet rs=null;
	
	public int insert(GoodsMotherBabyFood t) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int delete(int id) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int update(GoodsMotherBabyFood t) throws SQLException {
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
	public List<GoodsMotherBabyFood> selectAll(){
		List<GoodsMotherBabyFood> motherBabyFoodList=new ArrayList<GoodsMotherBabyFood>();
		conn=ConnectionManager.getConnection();
		try {
			ps=conn.prepareStatement("select * from goods_mother_baby_food");
			rs=ps.executeQuery();
			while(rs.next())
			{
				 int id=rs.getInt("ID");
				 String Name=rs.getString("NAME");
				 double price=rs.getDouble("PRICE");
				 String type=rs.getString("TYPE");
				 String color=rs.getString("COLOR");
				 String size=rs.getString("SIZE");
				 String brand=rs.getString("BRAND");
				 String count=rs.getString("COUNT");
				 String monthSales=rs.getString("MONTH_SALES");
				 String totalSales=rs.getString("TOTAL_SALES");
				 String desc=rs.getString("DESC");
				 String packWay=rs.getString("PACK_WAY");
				 String factorySite=rs.getString("FACTORY_SITE");
				 String factoryPhone=rs.getString("FACTORY_PHONE");
				 String burdenSheet=rs.getString("BURDEN_SHEET");
				 String firstCost=rs.getString("FIRST_COST");
				 String storeWay=rs.getString("STORE_WAY");
				 String expirationDate=rs.getString("EXPIRATION_DATE");
				 String foodAdditives=rs.getString("FOOD_ADDITIVES");
				 String babyBambix=rs.getString("BABY_BAMBIX");
				 String applyStage=rs.getString("APPLY_STAGE");
				 String packageKind=rs.getString("PACKAGE_KIND");
				 String productionPlace=rs.getString("PRODUCTION_PLACE");
				 String weight=rs.getString("WEIGHT");
				 String standard=rs.getString("STANDARD");
				 String applyAge=rs.getString("APPLY_AGE");
				 String saleArea=rs.getString("SALE_AREA");
				 String packageWay=rs.getString("PACKAGE_WAY");
				 String series=rs.getString("SERIES");
				 String worksInitials=rs.getString("WORKS_INITIALS");
				 String kind=rs.getString("KIND");
				 String texture=rs.getString("TEXTURE");
				 String effect=rs.getString("EFFECT");
				 String artNumber=rs.getString("ART_NUMBER");
				 String booleanImpor=rs.getString("BOOLEAN_IMPORT");
				 GoodsMotherBabyFood gmbf=new GoodsMotherBabyFood(id, Name, price, type, color, size, brand, count, monthSales, totalSales, desc, packWay, factorySite, factoryPhone, burdenSheet, firstCost, storeWay, expirationDate, foodAdditives, babyBambix, applyStage, packageKind, productionPlace, weight, standard, applyAge, saleArea, packageWay, series, worksInitials, kind, texture, effect, artNumber, booleanImpor);
				 motherBabyFoodList.add(gmbf);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				rs.close();
				ps.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return motherBabyFoodList;
	}

}
