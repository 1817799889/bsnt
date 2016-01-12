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
import com.cn.bsnt.model.GoodsOtherElectricAppliance;
import com.cn.bsnt.model.GoodsTv;
import com.cn.bsnt.model.User;

public class GoodsOtherElectricApplianceDAOImpl implements BaseDAO<GoodsOtherElectricAppliance> {
	private Connection  conn = null;
	private PreparedStatement para=null;
	private ResultSet rs = null;
	private String sql;
	private List<GoodsOtherElectricAppliance> goodsOtherElectricApplianceList= new ArrayList<GoodsOtherElectricAppliance>();
	public int insert(GoodsOtherElectricAppliance t) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int delete(int id) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int update(GoodsOtherElectricAppliance t) throws SQLException {
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
   
 public List<GoodsOtherElectricAppliance> selectAll() throws SQLException{		
		   sql="select * from goods_other_electric_appliance";
		   conn=ConnectionManager.getConnection();
		   para=conn.prepareStatement(sql);
		   rs=para.executeQuery();
		   GoodsOtherElectricAppliance goea=new GoodsOtherElectricAppliance();
		   while(rs.next()){
			   goea=new GoodsOtherElectricAppliance();
			   goea.setId(rs.getInt("ID"));
			   goea.setName(rs.getString("NAME"));
			   goea.setPrice(rs.getDouble("PRICE"));
			   goea.setType(rs.getString("PRICE"));
			   goea.setColor(rs.getString("COLOR"));
			   goea.setSize(rs.getString("SIZE"));
			   goea.setBrand(rs.getString("BRAND"));
			   goea.setCount(rs.getString("COUNT"));
			   goea.setMonthSales(rs.getString("MONTH_SALES"));
			   goea.setTotalSales(rs.getString("TOTAL_SALES"));
			   goea.setDesc(rs.getString("DESC"));
			   goea.setShape(rs.getString("SHAPE"));
			   goea.setEel(rs.getString("EEI"));
			   goea.setPower(rs.getString("POWER"));
			   goea.setRoughWeight(rs.getString("ROUGH_WEIGHT"));
			   goea.setUseArea(rs.getString("USE_AREA"));
			   goea.setDia(rs.getString("DIA"));
			   goea.setGears(rs.getString("CONTROL_TYPE"));
			   goea.setTexture(rs.getString("TEXTURE"));
			   goea.setAttemperationType(rs.getString("ATTEMPERATION_TYPE"));
			   goea.setWarmType(rs.getString("WARM_TYPE"));
			   goea.setWarmSpeed(rs.getString("WARM_SPEED"));
			   goea.setFunction(rs.getString("FUNCTION"));
			   goea.setStyle(rs.getString("STYLE"));
			   goea.setCapacityType(rs.getString("CAPACITY_TYPE"));
			   goea.setFirstCost(rs.getString("FIRST_COST"));
			   
			   goodsOtherElectricApplianceList.add(goea);   
		   }
		return goodsOtherElectricApplianceList;
	
		   
	}

}
