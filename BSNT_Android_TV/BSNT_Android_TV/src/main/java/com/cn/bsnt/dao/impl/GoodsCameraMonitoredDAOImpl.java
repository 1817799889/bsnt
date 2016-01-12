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
import com.cn.bsnt.model.GoodsCameraMonitored;
import com.cn.bsnt.model.User;

public class GoodsCameraMonitoredDAOImpl implements BaseDAO<GoodsCameraMonitored>{

	Connection conn=null;
	PreparedStatement ps=null;
	ResultSet rs=null;
	public int insert(GoodsCameraMonitored t) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int delete(int id) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int update(GoodsCameraMonitored t) throws SQLException {
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
	public List<GoodsCameraMonitored> selectAll(){
		List<GoodsCameraMonitored> cameraMonitoredList=new ArrayList<GoodsCameraMonitored>();
		conn=ConnectionManager.getConnection();
		try {
			ps=conn.prepareStatement("select * from goods_camera_monitored");
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
				 String keepYears=rs.getString("KEEP_YEARS"); 
				 String definition=rs.getString("DEFINITION"); 
				 String focus=rs.getString("FOCUS");
				 String focal=rs.getString("FOCAL");
				 String senseArea=rs.getString("SENSE_AREA"); 
				 String sameCityService=rs.getString("SAME_CITY_SERVICE");
				 String appearanceMolding=rs.getString("APPEARANCE_MOLDING");
				 String supportOs=rs.getString("SUPPORT_OS");
				 String booleanNeedDriver=rs.getString("BOOLEAN_NEED_DRIVER");
				 String pixel=rs.getString("PIXEL");
				 String photosensitiveOriginalType=rs.getString("PHOTOSENSITIVE_ORIGINAL_TYPE");
				 String maxResolution=rs.getString("MAX_RESOLUTION");
				 String condition=rs.getString("CONDITION");
				 String additionFunction=rs.getString("ADDITION_FUNCTION");
				 String networkConnectWay=rs.getString("NETWORK_CONNECT_WAY");
				 String storageType=rs.getString("STORAGE_TYPE");
				 String effectiveDistance=rs.getString("EFFECTIVE_DISTANCE"); 
				 String smartType=rs.getString("SMART_TYPE");
				 String shotSizeStandard=rs.getString("SHOT_SIZE_STANDARD"); 
				 String memberCapacity=rs.getString("MEMBER_CAPACITY");
				 String surverillanceCameraWay=rs.getString("SURVERILLANCE_CAMERA_WAY");
				 GoodsCameraMonitored gcm=new GoodsCameraMonitored(id, name, price, type, color, size, brand, count, monthSales, totalSales, desc, firstCost, keepYears, definition, focus, focal, senseArea, sameCityService, appearanceMolding, supportOs, booleanNeedDriver, pixel, photosensitiveOriginalType, maxResolution, condition, additionFunction, networkConnectWay, storageType, effectiveDistance, smartType, shotSizeStandard, memberCapacity, surverillanceCameraWay);
				 cameraMonitoredList.add(gcm);
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
		return cameraMonitoredList;
	}

}
