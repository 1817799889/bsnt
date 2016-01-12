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
import com.cn.bsnt.model.GoodsEarlyEductionEnlightenment;
import com.cn.bsnt.model.User;

public class GoodsEarlyEductionEnlightenmentDAOImpl implements BaseDAO<GoodsEarlyEductionEnlightenment>{

	Connection conn=null;
	PreparedStatement ps=null;
	ResultSet rs=null;
	public int insert(GoodsEarlyEductionEnlightenment t) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int delete(int id) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int update(GoodsEarlyEductionEnlightenment t) throws SQLException {
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
	public List<GoodsEarlyEductionEnlightenment> selecAll()
	{
		List<GoodsEarlyEductionEnlightenment> earlyEductionEnlightenmentList=new ArrayList<GoodsEarlyEductionEnlightenment>();
		conn=ConnectionManager.getConnection();
		try {
			ps=conn.prepareStatement("select * from goods_early_education_enlightenment");
			rs=ps.executeQuery();
			while(rs.next())
			{
				 int id=rs.getInt("ID");
				 String name=rs.getString("NAME");
				 double price=rs.getDouble("PRICE");
				 String type=rs.getString("TYPE");
				 String color=rs.getString("COLOR");
				 String size=rs.getString("SIZE");
				 String brand=rs.getString("BRAND");
				 String count=rs.getString("COUNT");
				 String monthSales=rs.getString("MONTH_SALES");
				 String totalSales=rs.getString("TOTAL_SALES");
				 String desc=rs.getString("DESC");
				 String firstCost=rs.getString("FIRST_COST");
				 String memberCapacity=rs.getString("MEMBER_CAPACITY");
				 String applyAge=rs.getString("APPLY_AGE");
				 String booleanShoppingVideo=rs.getString("BOOLEAN_SHOPPING_VIDEO");
				 String texture=rs.getString("TEXTURE");
				 String artNumber=rs.getString("ART_NUMBER");
				 String parklonType=rs.getString("PARKLON_TYPE");
				 String thickness=rs.getString("THICKNESS");
				 String series=rs.getString("SERIES");
				 String puzzleType=rs.getString("PUZZLE_TYPE");
				 String standard=rs.getString("STANDARD");
				 GoodsEarlyEductionEnlightenment ge=new GoodsEarlyEductionEnlightenment(id, name, price, type, color, size, brand, count, monthSales, totalSales, desc, firstCost, memberCapacity, applyAge, booleanShoppingVideo, texture, artNumber, parklonType, thickness, series, puzzleType, standard);
				 earlyEductionEnlightenmentList.add(ge);
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
		return earlyEductionEnlightenmentList;
	}

}
