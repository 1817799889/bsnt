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
import com.cn.bsnt.model.GoodsDoorWindows;
import com.cn.bsnt.model.User;

public class GoodsDoorWindowsDAOImpl implements BaseDAO<GoodsDoorWindows>{

	Connection conn=null;
	PreparedStatement ps=null;
	ResultSet rs=null;
	public int insert(GoodsDoorWindows t) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int delete(int id) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int update(GoodsDoorWindows t) throws SQLException {
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
	public List<GoodsDoorWindows> selectAll(){
		List<GoodsDoorWindows> doorWindowsList=new ArrayList<GoodsDoorWindows>();
		conn=ConnectionManager.getConnection();
		try {
			ps=conn.prepareStatement("select * from goods_door_windows");
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
				 String texture=rs.getString("TEXTURE");
				 String facingProcess=rs.getString("FACING_PROCESS");
				 String openCloseWay=rs.getString("OPEN_CLOSE_WAY");
				 String chargeUnit=rs.getString("CHARGE_UNIT");
				 String doorSheetTexture=rs.getString("DOOR_SHEET_TEXTURE");
				 String borderTexture=rs.getString("BORDER_TEXTURE");
				 String GlassType=rs.getString("GLASS_TYPE");
				 String sameCityService=rs.getString("SAME_CITY_SERVICE");
				 GoodsDoorWindows gdw=new GoodsDoorWindows(id, name, price, type, color, size, brand, count, monthSales, totalSales, desc, firstCost, texture, facingProcess, openCloseWay, chargeUnit, doorSheetTexture, borderTexture, GlassType, sameCityService);
				 doorWindowsList.add(gdw);
				 
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
		return doorWindowsList;
	}

}
