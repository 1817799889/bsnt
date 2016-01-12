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
import com.cn.bsnt.model.User;

public class GoodsCleaningDAOImpl implements BaseDAO<GoodsCleaning>{

	private Connection  conn = null;
	private PreparedStatement para=null;
	private ResultSet rs = null;
	private String sql;
	private List<GoodsCleaning> goodsCleaningList = new ArrayList<GoodsCleaning>();
	
	
	public int insert(GoodsCleaning t) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int delete(int id) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int update(GoodsCleaning t) throws SQLException {
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
	
	public List<GoodsCleaning> selectAll(String type) throws SQLException{
		conn = ConnectionManager.getConnection();
		sql="select * from GOODS_CLEANING where type=?";
		para = conn.prepareStatement(sql);
		para.setString(1, type);
		rs = para.executeQuery();
		GoodsCleaning gc = null;
		while(rs.next()){
			gc = new GoodsCleaning();
			
			gc.setId(rs.getInt("ID"));
			gc.setName(rs.getString("NAME"));
			gc.setPrice(rs.getDouble("PRICE"));
			gc.setType(rs.getString("TYPE"));
			gc.setBrand(rs.getString("BRAND"));
			gc.setCount(rs.getString("COUNT"));
			gc.setMonthSales(rs.getString("MONTH_SALES"));
			gc.setTotalSales(rs.getString("TOTAL_SALES"));
			gc.setDesc(rs.getString("DESC"));
			gc.setFirstCost(rs.getString("FIRST_COST"));
			gc.setFunction(rs.getString("FUNCTION"));
			gc.setNetContent(rs.getString("NET_CONTENT"));
			gc.setApplyObject(rs.getString("APPLY_OBJENT"));
			gc.setStandardType(rs.getString("STANDARD_TYPE"));
			gc.setExpirationDate(rs.getString("EXPIRATION_DATE"));
			gc.setProductArea(rs.getString("PRODUCT_AREA"));
			gc.setApplyHairNature(rs.getString("APPLY_HAIR_NATURE"));
			gc.setBooleanVolumeEdition(rs.getString("BOOLEAN_VOLUME_EDITION"));
			gc.setNumberCase(rs.getString("NUMBER_CASE"));
			gc.setEffect(rs.getString("EFFECT"));
			gc.setPackagingNumber(rs.getString("PACKAGING_NUMBER"));
			gc.setSanitaryTowelThickness(rs.getString("SANITARY_TOWEL_THICKNESS"));
			gc.setApplyTime(rs.getString("APPLY_TIME"));
			gc.setStandard(rs.getString("STANDARD"));
			gc.setSurfaceTexture(rs.getString("SURFACE_TEXTURE"));
			gc.setBooleanFragrance(rs.getString("BOOLEAN_FRAGRANCE"));
			gc.setSanitaryTowelType(rs.getString("SANITARY_TOWEL_TYPE"));
			gc.setBooleanPrinting(rs.getString("BOOLEAN_PRINTING"));
			gc.setNumberInsulator(rs.getString("NUMBER_INSULATOR"));
			gc.setPriceSection(rs.getString("PRICE_SECTION"));
			gc.setTechnologicalCharacteristics(rs.getString("TECHNOLOGICAL_CHARACTERISTICS"));
			gc.setTexture(rs.getString("TEXTURE"));
			gc.setApplyOccassion(rs.getString("APPLY_OCCASION"));
			gc.setUse(rs.getString("USE"));
			gc.setInstallWay(rs.getString("INSTALL_WAY"));
			gc.setNumberPlies(rs.getString("NUMBER_PLIES"));
			gc.setShape(rs.getString("SHAPE"));
			gc.setPointedPushType(rs.getString("POINTED_PUSH_TYPE"));
			gc.setMopTexture(rs.getString("MOP_TEXTURE"));
			gc.setDehydrationRate(rs.getString("DEHYDRATION_RATE"));
			gc.setWaterAbsorbingQuality(rs.getString("WATER_ABSORBING_QUALITY"));
			gc.setResistanceCorrosion(rs.getString("RESISTANCE_CORROSION"));
			gc.setMopRodBearing(rs.getString("MOP_ROD_BEARING"));
			gc.setRodTexture(rs.getString("ROD_TEXTURE"));
			gc.setTrashCanType(rs.getString("TRASH_CAN_TYPE"));
			gc.setCapacity(rs.getString("CAPACITY"));
			gc.setShellTexture(rs.getString("SHELL_TEXTURE"));
			gc.setOpenCloseWay(rs.getString("OPEN_CLOSE_WAY"));
			gc.setCombType(rs.getString("COMB_TYPE"));
			gc.setLength(rs.getString("LENGTH"));
			gc.setPinaforeType(rs.getString("PINAFORE_TYPE"));
			gc.setWeight(rs.getString("WEIGHT"));
			gc.setTowelType(rs.getString("TOWEL_TYPE"));
			
			goodsCleaningList.add(gc);
		}
		return goodsCleaningList;
		
		
	}

}
