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
import com.cn.bsnt.model.GoodsAgriculturesUseTools;
import com.cn.bsnt.model.User;

public class GoodsAgriculturesUseToolsDAOImpl implements BaseDAO<GoodsAgriculturesUseTools> {

	Connection conn=null;
	PreparedStatement ps=null;
	ResultSet rs=null;
	public int insert(GoodsAgriculturesUseTools t) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int delete(int id) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int update(GoodsAgriculturesUseTools t) throws SQLException {
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
	public List<GoodsAgriculturesUseTools> selectAll(){
		List<GoodsAgriculturesUseTools> agriculturesUseToolsList=new ArrayList<GoodsAgriculturesUseTools>();
		conn=ConnectionManager.getConnection();
		try {
			ps=conn.prepareStatement("select * from goods_agricultures_use_tools");
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
				 String bladeAngle=rs.getString("BLADE_ANGLE"); 
				 String hiltTexture=rs.getString("HILT_TEXTURE");
				 String hiltLength=rs.getString("HILT_LENGTH");
				 String bladeLength=rs.getString("BLADE_LENGTH"); 
				 String shape=rs.getString("SHAPE"); 
				 String booleanOpenBlade=rs.getString("BOOLEAN_OPEN_BLADE"); 
				 String handShnakTexture=rs.getString("HAND_SHANK_TEXTURE"); 
				 String booleanTakeSawtooth=rs.getString("BOOLEAN_TAKE_SAWTOOTH"); 
				 String booleanFold=rs.getString("BOOLEAN_FOLD"); 
				 String applyTrade=rs.getString("APPLY_TRADE");
				 String teethNumber=rs.getString("TEETH_NUMBER"); 
				 String texture=rs.getString("TEXTURE"); 
				 String structure=rs.getString("STRUCTURE");
				 GoodsAgriculturesUseTools tools=new GoodsAgriculturesUseTools(id, name, price, type, color, size, brand, count, monthSales, totalSales, desc, firstCost, bladeAngle, hiltTexture, hiltLength, bladeLength, shape, booleanOpenBlade, handShnakTexture, booleanTakeSawtooth, booleanFold, applyTrade, teethNumber, texture, structure);
				 agriculturesUseToolsList.add(tools);
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
		return agriculturesUseToolsList;
	}

}
