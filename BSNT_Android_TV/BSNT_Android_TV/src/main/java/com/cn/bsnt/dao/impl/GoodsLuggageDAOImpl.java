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
import com.cn.bsnt.model.GoodsLuggage;
import com.cn.bsnt.model.User;

public class GoodsLuggageDAOImpl implements BaseDAO<GoodsLuggage> {

	Connection conn=null;
	PreparedStatement ps=null;
	ResultSet rs=null;
	public int insert(GoodsLuggage t) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int delete(int id) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int update(GoodsLuggage t) throws SQLException {
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
	public List<GoodsLuggage> selectAll(String type)
	{
		List<GoodsLuggage> luggageList=new ArrayList<GoodsLuggage>();
		conn=ConnectionManager.getConnection();
		try {
			ps=conn.prepareStatement("select * from goods_luggage where type=?");
			ps.setString(1,type);	
			rs=ps.executeQuery();
			while(rs.next()){
				int id=rs.getInt("ID");
				String name=rs.getString("NAME");
				double price=rs.getDouble("PRICE");
				String type1=rs.getString("TYPE");
				String color=rs.getString("COLOR");
				String size=rs.getString("SIZE");
				String brand=rs.getString("BRAND");
				String count=rs.getString("COUNT");
				String monthSales=rs.getString("MONTH_SALES");
				String totalSales=rs.getString("TOTAL_SALES");
				String desc=rs.getString("DESC");
				String style=rs.getString("STYLE");
				String backpackWay=rs.getString("BACKPACK_WAY");
				String grain=rs.getString("GRAIN");
				String materialProcess=rs.getString("MATERIAL_PROCESS");
				String carryComponentType=rs.getString("CARRY_COMPONENT_TYPE");
				String closeWay=rs.getString("CLOSE_WAY");
				String internalStructure=rs.getString("INTERNAL_STRUCTURE");
				String luggageOuterBagType=rs.getString("LUGGAGE_OUTER_BAG_TYPE");
				String fashionElement=rs.getString("FASHION_ELEMENT");
				String luggageHardness=rs.getString("LUGGAGE_HARDNESS");
				String booleanFold=rs.getString("BOOLEAN_FOLD");
				String condition=rs.getString("CONDITION");
				String applyScene=rs.getString("APPLY_SCENE");
				String desigh=rs.getString("DESIGH");
				String shape=rs.getString("SHAPE");
				String shoulderGirdleStyle=rs.getString("SHOULDER_GIRDLE_STYLE");
				String liningTexture=rs.getString("LINING_TEXTURE");
				String booleanExpendTier=rs.getString("BOOLEAN_EXPEND_TIER");
				String applyObject=rs.getString("APPLY_OBJECT");
				String lockType=rs.getString("LOCK_TYPE");
				String booleanPullRod=rs.getString("BOOLEAN_PULL_ROD");
				String booleanLock=rs.getString("BOOLEAN_LOCK");
				String trolleyStyle=rs.getString("TROLLEY_STYLE");
				String booleanWithPackage=rs.getString("BOOLEAN_WITH_PACKAGE");
				String sex=rs.getString("SEX");
				String pattern=rs.getString("PATTERN");
				String fashionStyleName=rs.getString("FASHION_STYLE_NAME");
				String booleanInterlayer=rs.getString("BOOLEAN_INTERLAYER");
				String waterproofDegree=rs.getString("WATERPROOF_DEGREE");
				String booleanBackBufferCotton=rs.getString("BOOLEAN_BACK_BUFFER_COTTON");
				String leatherTexture=rs.getString("LEATHER_TEXTURE");
				String accommodateComputerSize=rs.getString("ACCOMMODATE_COMPUTER_SIZE");
				String firstCost=rs.getString("FIRST_COST");
				GoodsLuggage gl=new GoodsLuggage(id, name, price, type1, color, size, brand, count, monthSales, totalSales, desc, style, backpackWay, grain, materialProcess, carryComponentType, closeWay, internalStructure, luggageOuterBagType, fashionElement, luggageHardness, booleanFold, condition, applyScene, desigh, shape, shoulderGirdleStyle, liningTexture, booleanExpendTier, applyObject, lockType, booleanPullRod, booleanLock, trolleyStyle, booleanWithPackage, sex, pattern, fashionStyleName, booleanInterlayer, waterproofDegree, booleanBackBufferCotton, leatherTexture, accommodateComputerSize, firstCost);
				luggageList.add(gl);

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
		return luggageList;
	}

}
