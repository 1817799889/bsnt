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
import com.cn.bsnt.model.GoodsAgriculturesUseTricycle;
import com.cn.bsnt.model.User;

public class GoodsAgriculturesUseTricycleDAOImpl implements BaseDAO<GoodsAgriculturesUseTricycle>{

	Connection conn=null;
	PreparedStatement ps=null;
	ResultSet rs=null;
	public int insert(GoodsAgriculturesUseTricycle t) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int delete(int id) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int update(GoodsAgriculturesUseTricycle t) throws SQLException {
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
	public List<GoodsAgriculturesUseTricycle> selectAll()
	{
		List<GoodsAgriculturesUseTricycle> agriculturesUseTricycleList=new ArrayList<GoodsAgriculturesUseTricycle>();
		conn=ConnectionManager.getConnection();
		try {
			ps=conn.prepareStatement("select * from goods_agricultures_use_tricycle");
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
				 String maxPower=rs.getString("MAX_POWER");
				 String maxSpeed=rs.getString("MAX_SPEED");
				 String enduranceMileage=rs.getString("ENDURANCE_MILEAGE");
				 String applyThrong=rs.getString("APPLY_THRONG");
				 String restrictionsNumber=rs.getString("RESTRICTIONS_NUMBER");
				 String coolingWay=rs.getString("COOLING_WAY");
				 String cylindersNumber=rs.getString("CYLINDERS_NUMBER");
				 String engineType=rs.getString("ENGINE_TYPE");
				 String tyreSize=rs.getString("TYRE_SIZE");
				 String loadIndex=rs.getString("LOAD_INDEX");
				 String threadWidth=rs.getString("THREAD_WIDTH");
				 String serviceContext=rs.getString("SERVICE_CONTENT");
				 GoodsAgriculturesUseTricycle gaut=new GoodsAgriculturesUseTricycle(id, name, price, type, color, size, brand, count, monthSales, totalSales, desc, firstCost, maxPower, maxSpeed, enduranceMileage, applyThrong, restrictionsNumber, coolingWay, cylindersNumber, engineType, tyreSize, loadIndex, threadWidth, serviceContext);
				 agriculturesUseTricycleList.add(gaut);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				rs.close();
				ps.close();
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return agriculturesUseTricycleList;
	}

}
