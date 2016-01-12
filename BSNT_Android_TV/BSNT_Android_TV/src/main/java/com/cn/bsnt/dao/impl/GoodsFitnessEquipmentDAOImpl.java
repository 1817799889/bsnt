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
import com.cn.bsnt.model.GoodsFitnessEquipment;
import com.cn.bsnt.model.GoodsWaterFountain;
import com.cn.bsnt.model.User;

public class GoodsFitnessEquipmentDAOImpl implements BaseDAO<GoodsFitnessEquipment>{
	private Connection  conn = null;
	private PreparedStatement para=null;
	private ResultSet rs = null;
	private String sql;
	private List<GoodsFitnessEquipment> goodsFitnessEquipmentList= new ArrayList<GoodsFitnessEquipment>();
	
	public int insert(GoodsFitnessEquipment t) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int delete(int id) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int update(GoodsFitnessEquipment t) throws SQLException {
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
   public List<GoodsFitnessEquipment> selectAll() throws SQLException{
	     sql="select * from goods_fitness_equipment";
	     conn=ConnectionManager.getConnection();
	     para=conn.prepareStatement(sql);
	     rs=para.executeQuery();
	     GoodsFitnessEquipment gfe=null; 
	     while(rs.next()){
	    	   gfe=new GoodsFitnessEquipment();
	    	   gfe.setId(rs.getInt("ID"));
	    	   gfe.setName(rs.getString("NAME"));
	    	   gfe.setPrice(rs.getDouble("PRICE"));
	    	   gfe.setType(rs.getString("PRICE"));
	    	   gfe.setColor(rs.getString("COLOR"));
	    	   gfe.setSize(rs.getString("SIZE"));
	    	   gfe.setBrand(rs.getString("BRAND"));
	    	   gfe.setCount(rs.getString("COUNT"));
	    	   gfe.setMonthSales(rs.getString("MONTH_SALES"));
	    	   gfe.setTotalSales(rs.getString("TOTAL_SALES"));
	    	   gfe.setDesc(rs.getString("DESC")); 
	    	   gfe.setFirstCost(rs.getString("FIRST_COST"));
	    	   gfe.setArtNumber(rs.getString("ART_NUMBER"));
	    	   gfe.setApplyNumberPeople(rs.getString("APPLY_NUMBER_PEOPLE")); 
	    	   gfe.setFitnessEquipent(rs.getString("FITNESS_EQUIPMENT"));
	    	   gfe.setApplyObject(rs.getString("APPLY_OBJECT"));
	    	   gfe.setFitnessEffectChoice(rs.getString("FITNESS_EFFECT_CHOICE"));
	    	   gfe.setBooleanSameShopping(rs.getString("BOOLEAN_SAME_SHOPPING"));
	    	   gfe.setTeachingPattern(rs.getString("TEACHING_PATTERN"));
	    	   gfe.setPowerWristType(rs.getString("POWER_WRIST_TYPE"));
	    	   gfe.setFirstsdType(rs.getString("FIRSTSD_TYPE"));
	    	   gfe.setDumbbell(rs.getString("DUMBBELL"));
	    	   gfe.setWallPulley(rs.getString("WALL_PULLEY"));
	    	   gfe.setTreadmillType(rs.getString("TREADMILL_TYPE"));
	    	   gfe.setAfterSaleService(rs.getString("AFTER_SALE_SERVICE"));
	    	   gfe.setHreatRateTest(rs.getString("HREAT_RATE_TEST"));
	    	   gfe.setBooleanFold(rs.getString("BOOLEAN_FOLD"));
	    	   gfe.setDriverType(rs.getString("DRIVER_TYPE"));
	    	   
	    	   goodsFitnessEquipmentList.add(gfe);
	     }
	   
	   return goodsFitnessEquipmentList;
	   
   }
}
