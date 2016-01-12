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
import com.cn.bsnt.model.GoodsWasher;
import com.cn.bsnt.model.User;

public class GoodsWasherDAOImpl implements BaseDAO<GoodsWasher> {
	private Connection  conn = null;
	private PreparedStatement para=null;
	private ResultSet rs = null;
	private String sql;
	private List<GoodsWasher> goodsWasherList= new ArrayList<GoodsWasher>();
	
   public int insert(GoodsWasher t) throws SQLException {
		// TODO Aut-generated method stub
		return 0;
	}

	public int delete(int id) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int update(GoodsWasher t) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public User select(int id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public List<GoodsWasher> selectAll() throws SQLException {
		sql= "select * from goods_washer";
		conn=ConnectionManager.getConnection();
		para=conn.prepareStatement(sql);
		rs=para.executeQuery();
		GoodsWasher gwa=null;
		while(rs.next()){
			gwa=new GoodsWasher();
			gwa.setId(rs.getInt("ID"));
			gwa.setName(rs.getString("NAME"));
			gwa.setPrice(rs.getDouble("PRICE"));
			gwa.setType(rs.getString("TYPE"));
			gwa.setColor(rs.getString("COLOR"));
			gwa.setSize(rs.getString("SIZE"));
			gwa.setBrand(rs.getString("BRAND"));
			gwa.setCount(rs.getString("COUNT"));
			gwa.setMonthSales(rs.getString("MONTH_SALES"));
			gwa.setTotalSales(rs.getString("TOTAL_SALES"));
			gwa.setDesc(rs.getString("DESC"));
			gwa.setEel(rs.getString("EEI"));
			gwa.setMold(rs.getString("MOLD"));
			gwa.setWashingMount(rs.getString("WASHING_MOUNT"));
			gwa.setPower(rs.getString("POWER"));
			gwa.setInnerTankTexure(rs.getString("INNER_TANK_TEXTURE"));
			gwa.setTankTexure(rs.getString("TANK_TEXTURE"));
			gwa.setOpenCloseType(rs.getString("OPEN_CLOSE_TYPE"));
			gwa.setUseType(rs.getString("USE_TYPE"));
			gwa.setDynamoType(rs.getString("DYNAMO_TYPE"));
			gwa.setDrainageType(rs.getString("DRAINAGE_TYPE"));
			gwa.setRinedPower(rs.getString("RINED_POWER"));
			gwa.setWashFlow(rs.getString("WASH_FLOW"));
			gwa.setFirstCost(rs.getString("FIRST_COST"));
			goodsWasherList.add(gwa);
		}
		return goodsWasherList;
	}

	public List<User> selectList(Parameter p) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}



}
