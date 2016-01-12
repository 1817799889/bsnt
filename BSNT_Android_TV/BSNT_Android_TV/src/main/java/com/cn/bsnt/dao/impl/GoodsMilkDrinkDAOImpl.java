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
import com.cn.bsnt.model.GoodsMilkDrink;
import com.cn.bsnt.model.User;

public class GoodsMilkDrinkDAOImpl implements BaseDAO<GoodsMilkDrink>{

	Connection conn=null;
	PreparedStatement ps=null;
	ResultSet rs=null;
	public int insert(GoodsMilkDrink t) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int delete(int id) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int update(GoodsMilkDrink t) throws SQLException {
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
	public List<GoodsMilkDrink> selectAll(){
		List<GoodsMilkDrink> milkDrinkList=new ArrayList<GoodsMilkDrink>();
		conn=ConnectionManager.getConnection();
		try {
			ps=conn.prepareStatement("select * from goods_milk_drink");
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
					 String woeksInitials=rs.getString("WORKS_INITIALS");
					 String factorySite=rs.getString("FACTORY_SITE");
					 String factoryPhone=rs.getString("FACTORY_PHONE");
					 String firstCost=rs.getString("FIRST_COST");
					 String burdeSheet=rs.getString("BURDE_SHEET");
					 String storeWay=rs.getString("STORE_WAY");
					 String expiratoinDate=rs.getString("EXPIRATOIN_DATE");
					 String foodAdditives=rs.getString("FOOD_ADDITIVES");
					 String netContent=rs.getString("NET_CONTENT");
					 String seriecs=rs.getString("SERIES");
					 String privatencludeSugar=rs.getString("BOOLEAN_INCLUDE_SUGAR");
					 String prpductArea=rs.getString("PRPDUCT_AREA");
					 String kind=rs.getString("KIND");
					 String booleanInstant=rs.getString("BOOLEAN_INSTANT");
					 String productDate=rs.getString("PRODUCT_DATE");
					 String materialElement=rs.getString("MATERIAL_ELEMENT");
					 String taste=rs.getString("TASTE");
					 String comboWeight=rs.getString("COMBO_WEIGHT");
					 String comboCycle=rs.getString("COMBO_CYCLE");
					 String distributionFrequency=rs.getString("DISTRIBUTION_FREQUENCY");
					 String packageKind=rs.getString("PACKAGE_KIND");
					 String applyObject=rs.getString("APPLY_OBJECT");
					 String foodProcess=rs.getString("FOOD_PROCESS");
					 String specialtyCategory=rs.getString("SPECIALTY_CATEGORY");
					 GoodsMilkDrink gmd=new GoodsMilkDrink(id, Name, price, type, color, size, brand, count, monthSales, totalSales, desc, packWay, woeksInitials, factorySite, factoryPhone, firstCost, burdeSheet, storeWay, expiratoinDate, foodAdditives, netContent, seriecs, privatencludeSugar, prpductArea, kind, booleanInstant, productDate, materialElement, taste, comboWeight, comboCycle, distributionFrequency, packageKind, applyObject, foodProcess, specialtyCategory);
					 milkDrinkList.add(gmd);
					 
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
		return milkDrinkList;
	}

}
