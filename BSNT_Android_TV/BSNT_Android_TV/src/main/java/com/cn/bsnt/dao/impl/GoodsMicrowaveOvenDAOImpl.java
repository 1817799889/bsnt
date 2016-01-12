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
import com.cn.bsnt.model.GoodsMicrowaveOven;
import com.cn.bsnt.model.GoodsTv;
import com.cn.bsnt.model.GoodsWasher;
import com.cn.bsnt.model.User;

public class GoodsMicrowaveOvenDAOImpl implements BaseDAO<GoodsMicrowaveOven>{
	private Connection  conn = null;
	private PreparedStatement para=null;
	private ResultSet rs = null;
	private String sql;
	private List<GoodsMicrowaveOven> goodsMicrowaveOvenList= new ArrayList<GoodsMicrowaveOven>();

	public int insert(GoodsMicrowaveOven t) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int delete(int id) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int update(GoodsMicrowaveOven t) throws SQLException {
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
     public List<GoodsMicrowaveOven> SelectAll() throws SQLException{
    	     sql="select * from goods_microwave_oven";
    	     conn=ConnectionManager.getConnection();
    	     para=conn.prepareStatement(sql);
    	     rs=para.executeQuery();
    	     
    	     GoodsMicrowaveOven gmc=null;
    	    while(rs.next()){
    	    	gmc=new GoodsMicrowaveOven();
    	    	gmc.setId(rs.getInt("ID"));
    	    	gmc.setName(rs.getString("NAME"));
    	    	gmc.setPrice(rs.getDouble("PRICE"));
    	    	gmc.setType(rs.getString("PRICE"));
    	    	gmc.setColor(rs.getString("COLOR"));
    	    	gmc.setSize(rs.getString("SIZE"));
    	    	gmc.setBrand(rs.getString("BRAND"));
    	    	gmc.setCount(rs.getString("COUNT"));
    	    	gmc.setMonthSales(rs.getString("MONTH_SALES"));
    	    	gmc.setTotalSales(rs.getString("TOTAL_SALES"));
    	    	gmc.setDesc(rs.getString("DESC"));
    	    	gmc.setBelownMold(rs.getString("BELOW_MOLD"));
    	    	gmc.setPower(rs.getString("POWER"));
    	    	gmc.setOpenDoorType(rs.getString("OPEN_DOOR_TYPE"));
    	    	gmc.setControlType(rs.getString("CONTROL_TYPE"));
    	    	gmc.setMicrowaveType(rs.getString("MICROWAVE_TYPE"));
    	    	gmc.setCapacity(rs.getString("CAPACITY"));
    	    	gmc.setFirstCost(rs.getString("FIRST_COST"));
    	    	  
    	    	  goodsMicrowaveOvenList.add(gmc);
    	    	
    	    	
    	    	
    	    }
			return goodsMicrowaveOvenList;
    	     
     }
}
