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
import com.cn.bsnt.model.GoodsShoes;
import com.cn.bsnt.model.User;

public class GoodsShoesDAOImpl  implements BaseDAO<GoodsShoes>{
	Connection conn=null;
	PreparedStatement ps=null;
	ResultSet rs=null;

	public int insert(GoodsShoes t) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int delete(int id) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int update(GoodsShoes t) throws SQLException {
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
	public List<GoodsShoes> selectAll(String type)
	{
		List<GoodsShoes> shoseList=new ArrayList<GoodsShoes>();
		conn=ConnectionManager.getConnection();
		try {
			ps=conn.prepareStatement("select * from goods_shoes where type=?");
			ps.setString(1, type);
			rs=ps.executeQuery();
			while(rs.next())
			{
				int id=rs.getInt("ID");
				String name=rs.getString("NAME");
				double price=rs.getDouble("PRICE");
				String color=rs.getString("COLOR");
				String size=rs.getString("SIZE");
				String brand=rs.getString("BRAND");
				String count=rs.getString("COUNT");
				String monthSales=rs.getString("MONTH_SALES");
				String tatalSales=rs.getString("TOTAL_SALES");
				String desc=rs.getString("DESC");
				String mold=rs.getString("MOLD");
				String sharfofouarterTexture=rs.getString("SHARFOFOUARTER_LINING_TEXTURE");
				String shoesTubeTexture=rs.getString("SHOES_TUBE_TEXTURE");
				String insoleTexture=rs.getString("INSOLE_TEXTURE");
				String style=rs.getString("STYLE");
				String vampTexture=rs.getString("VAMP_TEXTURE");
				String upperLiningTexyure=rs.getString("UPPER_LINING_TEXTURE");
				String corticalFeatures=rs.getString("CORTICAL_FEATURES");
				String soleTexture=rs.getString("SOLE_TEXTURE");
				String tubeHigh=rs.getString("TUBE_HIGH");
				String shoesTopStyle=rs.getString("SHOES_TOP_STYLE");
				String heelsAfter=rs.getString("HEELS_AFTER");
				String bottomStyle=rs.getString("BOTTOM_STYLE");
				String colesStyle=rs.getString("CLOSE_STYLE");
				String fashionElement=rs.getString("FASHION_ELEMENT");
				String shoesMakingProcess=rs.getString("SHOES_MAKING_PROCESS");
				String pattern=rs.getString("PATTERN");
				String applySeason=rs.getString("APPLY_SEASON");
				String applyObject=rs.getString("APPLY_OBJECT");
				String liningTexture=rs.getString("LINING_TEXTURE");
				String openDepth=rs.getString("OPEN_DAPTH");
				String grossWeight=rs.getString("GROSS_WEIGHT");
				String packagingVolume=rs.getString("PACKAGING_VOLUME");
				String design=rs.getString("DESIGH");
				String function=rs.getString("FUNCTION");
				String applyOccasion=rs.getString("APPLY_OCCASION");
				String leatherMaterialProcess=rs.getString("LEATHER_MATERIAL_PROCESS");
				String subdivisionStyle=rs.getString("SUBDIVISION_STYLE");
				String firstCost=rs.getString("FIRST_COST");
				GoodsShoes gs=new GoodsShoes(id, name, price, color, size, brand, count, monthSales, tatalSales, desc, mold, sharfofouarterTexture, shoesTubeTexture, insoleTexture, style, vampTexture, upperLiningTexyure, corticalFeatures, soleTexture, tubeHigh, shoesTopStyle, heelsAfter, bottomStyle, colesStyle, fashionElement, shoesMakingProcess, pattern, applySeason, applyObject, liningTexture, openDepth, grossWeight, packagingVolume, design, function, applyOccasion, leatherMaterialProcess, subdivisionStyle, firstCost);
				shoseList.add(gs);
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
		return shoseList;
		
	}

}
