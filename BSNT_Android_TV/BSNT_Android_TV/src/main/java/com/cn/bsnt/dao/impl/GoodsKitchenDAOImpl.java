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
import com.cn.bsnt.model.GoodsCleaning;
import com.cn.bsnt.model.GoodsKitchen;
import com.cn.bsnt.model.User;

public class GoodsKitchenDAOImpl implements BaseDAO<GoodsKitchen>{
	private Connection  conn = null;
	private PreparedStatement para=null;
	private ResultSet rs = null;
	private String sql;
	private List<GoodsKitchen> goodsKitchenList = new ArrayList<GoodsKitchen>();

	public int insert(GoodsKitchen t) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int delete(int id) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int update(GoodsKitchen t) throws SQLException {
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
	
	public List<GoodsKitchen> selectAll(String type) throws SQLException{
		conn = ConnectionManager.getConnection();
		sql="select * from GOODS_KITCHEN where type=?";
		para = conn.prepareStatement(sql);
		para.setString(1, type);
		rs = para.executeQuery();
		GoodsKitchen gk = null;
		while(rs.next()){
			gk = new GoodsKitchen();
			
			gk.setId(rs.getInt("ID"));
			gk.setName(rs.getString("NAME"));
			gk.setPrice(rs.getDouble("PRICE"));
			gk.setType(rs.getString(""));
			gk.setColor(rs.getString(""));
			gk.setSize(rs.getString(""));
			gk.setBrand(rs.getString(""));
			gk.setCount(rs.getString(""));
			gk.setMonthSales(rs.getString(""));
			gk.setTotalSales(rs.getString(""));
			gk.setDesc(rs.getString(""));
			gk.setPackSiz(rs.getString(""));
			gk.setTvRoughWeight(rs.getString(""));
			gk.setNumberCase(rs.getString(""));
			gk.setPackSize(rs.getString(""));
			gk.setTeaTablewareProcess(rs.getString(""));
			gk.setStyle(rs.getString(""));
			gk.setPriceSection(rs.getString(""));
			gk.setApplyNumber(rs.getString(""));
			gk.setTexrure(rs.getString(""));
			gk.setProductArea(rs.getString(""));
			gk.setMasterMapSource(rs.getString(""));
			gk.setTablewareModel(rs.getString(""));
			gk.setPackVolume(rs.getString(""));
			gk.setBooleanSeal(rs.getString(""));
			gk.setDiameter(rs.getString(""));
			gk.setApplyObject(rs.getString(""));
			gk.setFeature(rs.getString(""));
			gk.setPotCoverType(rs.getString(""));
			gk.setPotCoverDiameterSize(rs.getString(""));
			gk.setDepth(rs.getString(""));
			gk.setCapacity(rs.getString(""));
			gk.setNumberPlies(rs.getString(""));
			gk.setBottomPanType(rs.getString(""));
			gk.setBladeAngle(rs.getString(""));
			gk.setBladeLength(rs.getString(""));
			gk.setBooleanOpenBlade(rs.getString(""));
			gk.setPotType(rs.getString(""));
			gk.setBooleanGift(rs.getString(""));
			gk.setFirstCost(rs.getString(""));
			
			
			goodsKitchenList.add(gk);
		}
		return goodsKitchenList;
	}

}
