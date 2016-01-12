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
import com.cn.bsnt.model.GoodsIcebox;
import com.cn.bsnt.model.GoodsWasher;
import com.cn.bsnt.model.User;

public class GoodsIceboxDAOImpl implements BaseDAO<GoodsIcebox>{
        
	private Connection  conn = null;
	private PreparedStatement para=null;
	private ResultSet rs = null;
	private String sql;
	private List<GoodsIcebox> goodsIceboxList= new ArrayList<GoodsIcebox>();

	public int insert(GoodsIcebox t) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int delete(int id) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int update(GoodsIcebox t) throws SQLException {
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
     public List<GoodsIcebox> selectAll() throws SQLException{
		sql="select * from GoodsIcebox";
		conn=ConnectionManager.getConnection();
		para=conn.prepareStatement(sql);
		rs=para.executeQuery();
		GoodsIcebox gix=null;
		while(rs.next()){
			gix=new GoodsIcebox();
			gix.setId(rs.getInt("ID"));
			gix.setName(rs.getString("NAME"));
			gix.setPrice(rs.getDouble("PRICE"));
			gix.setType(rs.getString("PRICE"));
			gix.setColor(rs.getString("COLOR"));
			gix.setSize(rs.getString("SIZE"));
			gix.setBrand(rs.getString("BRAND"));
			gix.setCount(rs.getString("COUNT"));
			gix.setMonthSales(rs.getString("MONTH_SALES"));
			gix.setTotalSales(rs.getString("TOTAL_SALES"));
			gix.setDesc(rs.getString("DESC"));
			gix.setMold(rs.getString("MOLD"));
			gix.setStructure(rs.getString("STRUCTURE"));
			gix.setuF(rs.getString("U_F"));
			gix.setOpenDoorType(rs.getString("OPEN_DOOR_TYPE"));
			gix.setMax_v(rs.getString("MAX_V"));
			gix.setFreezing_chamber_v(rs.getString("FREEZING_CHAMBER_V"));
			gix.setPanel_type(rs.getString("PANEL_TYPE"));
			gix.setRefrigerationType(rs.getString("REFRIGERATION_TYPE"));
			gix.setDefrostType(rs.getString("DEFROST_TYPE"));
			gix.setRevolveVoiceDb(rs.getString("REVOLVE_VOICE_DB"));
			gix.setDefrostDose(rs.getString("DEFROST_DOSE"));
			gix.setProductWeight(rs.getString("PRODUCT_WEIGHT"));
			gix.setPowerConsumption(rs.getString("POWER_CONSUMPTION"));
			gix.setBooleanNoRime(rs.getString("BOOLEAN_NO_RIME"));
			gix.setHeatType(rs.getString("HEAT_TYPE"));
			gix.setEei(rs.getString("EEI"));
			gix.setFirstCost(rs.getString("FIRST_COST"));
			
			
			  goodsIceboxList.add(gix);
		}
		return goodsIceboxList;
		 
     }
     
}
