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
import com.cn.bsnt.model.GoodsAgriculturesMachinery;
import com.cn.bsnt.model.User;

public class GoodsAgriculturesMachineryDAOImpl implements BaseDAO<GoodsAgriculturesMachinery>{

	Connection conn=null;
	PreparedStatement ps=null;
	ResultSet rs=null;
	public int insert(GoodsAgriculturesMachinery t) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int delete(int id) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int update(GoodsAgriculturesMachinery t) throws SQLException {
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
	public List<GoodsAgriculturesMachinery> selectAll()
	{
		List<GoodsAgriculturesMachinery> agriculturesMachineryList=new ArrayList<GoodsAgriculturesMachinery>();
		conn=ConnectionManager.getConnection();
		try {
			ps=conn.prepareStatement("select * from goods_agricultures_machinery");
			rs=ps.executeQuery();
			while(rs.next())
			{
				 int id=rs.getInt("ID");
				 String name=rs.getString("NAME");
				 double price=rs.getDouble("PRICE");
				 String type=rs.getString("TYPE");
				 String color=rs.getString("COLOR");
				 String size=rs.getString("SIZE");
				 String brand=rs.getString("BRAND");
				 String count=rs.getString("COUNT");
				 String monthSales=rs.getString("MONTH_SALES");
				 String totalSales=rs.getString("TOTAL_SALES");
				 String desc=rs.getString("DESC");
				 String firstCost=rs.getString("FIRST_COST");
				 String agriculturalMachineryType=rs.getString("AGRICULTURAL_MACHINERY_TYPE");
				 String booleanCustomize=rs.getString("BOOLEAN_CUSTOMIZE");
				 String applyTradde=rs.getString("APPLY_TRADDE");
				 String automationDegree=rs.getString("AUTOMATION_DEGREE");
				 String applyObject=rs.getString("APPLY_OBJECT");
				 String texture=rs.getString("TEXTURE");
				 String powerType=rs.getString("POWER_TYPE");
				 String fertilizerForm=rs.getString("FERTILIZER_FORM");
				 String artNumber=rs.getString("ART_NUMBER");
				 String applyEnvironment=rs.getString("APPLY_ENVIRONMENT");
				 String seaSale=rs.getString("SEA_SALT");
				 String fineSeaSale=rs.getString("FINE_SEA_SALT");
				 String seaculture=rs.getString("SEACULTURE");
				 String waterSterillzation=rs.getString("WATER_STERILLZATION");
				 String productionDate=rs.getString("PRODUCTION_DATE");
				 GoodsAgriculturesMachinery gam=new GoodsAgriculturesMachinery(id, name, price, type, color, size, brand, count, monthSales, totalSales, desc, firstCost, agriculturalMachineryType, booleanCustomize, applyTradde, automationDegree, applyObject, texture, powerType, fertilizerForm, artNumber, applyEnvironment, seaSale, fineSeaSale, seaculture, waterSterillzation, productionDate);
				 agriculturesMachineryList.add(gam);
				 
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
		return agriculturesMachineryList;
	}
	

}
