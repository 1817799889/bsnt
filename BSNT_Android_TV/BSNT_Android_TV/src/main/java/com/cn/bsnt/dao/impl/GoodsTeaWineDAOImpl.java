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
import com.cn.bsnt.model.GoodsTeaWine;
import com.cn.bsnt.model.GoodsTv;
import com.cn.bsnt.model.GoodsWaterFountain;
import com.cn.bsnt.model.User;

public class GoodsTeaWineDAOImpl implements BaseDAO<GoodsTeaWine>{
	private Connection  conn = null;
	private PreparedStatement para=null;
	private ResultSet rs = null;
	private String sql;
	private List<GoodsTeaWine> goodsTeaWineList= new ArrayList<GoodsTeaWine>();
	
	public int insert(GoodsTeaWine t) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int delete(int id) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int update(GoodsTeaWine t) throws SQLException {
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
	public List<GoodsTeaWine> selectAll() throws SQLException{
		sql ="select * from goods_tea_wine";
		conn = ConnectionManager.getConnection();
		para = conn.prepareStatement(sql);
		rs = para.executeQuery();
		GoodsTeaWine gtw = null;
		while(rs.next()){
			gtw=new GoodsTeaWine();
			gtw.setId(rs.getInt("ID"));
			gtw.setName(rs.getString("NAME"));
			gtw.setPrice(rs.getDouble("PRICE"));
			gtw.setType(rs.getString("PRICE"));
			gtw.setColor(rs.getString("COLOR"));
			gtw.setSize(rs.getString("SIZE"));
			gtw.setBrand(rs.getString("BRAND"));
			gtw.setCount(rs.getString("COUNT"));
			gtw.setMonthSales(rs.getString("MONTH_SALES"));
			gtw.setTotalSales(rs.getString("TOTAL_SALES"));
			gtw.setDesc(rs.getString("DESC"));
			gtw.setFirstCost(rs.getString("FIRST_COST"));
		    gtw.setGlassColor(rs.getString("GLASS_COLOR"));
		    gtw.setShape(rs.getString("SHAPE"));
		    gtw.setArtNumber(rs.getString("ART_NUMBER"));
		    gtw.setPriceSection(rs.getString("PRICE_SECTION"));
		    gtw.setNumber(rs.getString("NUMBER"));
		    gtw.setMainSource(rs.getString("MAIN_SOURCE"));
		    gtw.setCapacity(rs.getString("CAPACITY"));
		    gtw.setPackageVolume(rs.getString("PACKAGE_VOLUME"));
		    gtw.setGrossWeight(rs.getString("GROSS_WEIGHT"));
		    gtw.setProductionArea(rs.getString("PRODUCTION_AREA"));
		    gtw.setTexture(rs.getString("TEXTURE"));
		    gtw.setApplyNumberPeople(rs.getString("APPLY_NUMBER_PEOPLE"));
		    gtw.setTerTrayTextuer(rs.getString("TEA_TRAY_TEXTURE"));
		    gtw.setTerTablewareProcess(rs.getString("TEA_TABLEWARE_PROCESS"));
		    gtw.setGlossKind(rs.getString("GLOSS_KIND"));
		    
		    
		
		}
		return goodsTeaWineList;
		}
}
