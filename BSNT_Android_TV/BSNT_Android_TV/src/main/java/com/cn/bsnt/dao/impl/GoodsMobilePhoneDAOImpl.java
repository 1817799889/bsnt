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
import com.cn.bsnt.model.GoodsMobilePhone;
import com.cn.bsnt.model.User;

public class GoodsMobilePhoneDAOImpl implements BaseDAO<GoodsMobilePhone> {

	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;

	public int insert(GoodsMobilePhone t) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int delete(int id) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int update(GoodsMobilePhone t) throws SQLException {
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

	public List<GoodsMobilePhone> selectAll()
	{
		List<GoodsMobilePhone> mobilePhoneList=new ArrayList<GoodsMobilePhone>();
		conn=ConnectionManager.getConnection();
		try {
			ps=conn.prepareStatement("select * from goods_mobile_phone");
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
				String runRam=rs.getString("RUN_RAM");
				String phoneMemory=rs.getString("PHONE_MEMORY");
				String pxel=rs.getString("PIXEL");
				String coreNumber=rs.getString("CORE_NUMBER");
				String sharpnessSeparation=rs.getString("SHARPNESS_SEPARATION");
				String os=rs.getString("OS");
				String batteryCapacity=rs.getString("BATTERY_CAPACITY");
				String style=rs.getString("STYLE");
				String booleanSmartphone=rs.getString("BOOLEAN_SMARTPHONE");
				String phoneType=rs.getString("PHONE_TYPE");
				String keyboardType=rs.getString("KEYBOARD_TYPE");
				String weight=rs.getString("WEIGHT");
				String thickness=rs.getString("THICKNESS");
				String CPUType=rs.getString("CPU_TYPE");
				String additionFunction=rs.getString("ADDITION_FUNCTION");
				String networkModel=rs.getString("NETWORK_MODEL");
				String storageFunction=rs.getString("STORAGE_FUNCTION");
				String networkType=rs.getString("NETWORK_TYPE");
				String maxStorageExtensions=rs.getString("MAX_STORAGE_EXTENSIONS");
				String camearType=rs.getString("CAMEAR_TYPE");
				String SIMStandard=rs.getString("SIM_STANDARD");
				String screenTexture=rs.getString("SCREEN_TEXTURE");
				String screenType=rs.getString("SCREEN_TYPE");
				String fuselageSize=rs.getString("FUSELAGE_SIZE");
				String BooleanMusicPlay=rs.getString("BOOLEAN_MUSIC_PLAY");
				String booleanVideoPlay=rs.getString("BOOLEAN_VIDEO_PLAY");
				String BooleanJava=rs.getString("BOOLEAN_JAVA");
				String booleanRingingSound=rs.getString("BOOLEAN_RINGING_SOUND");
				String secondCamera=rs.getString("SECOND_CAMERA");
				String senseOrganType=rs.getString("SENSE_ORGAN_TYPE");
				String booleanFlashlight=rs.getString("BOOLEAN_FLASHLIGHT");
				String booleanContinuousFunction=rs.getString("BOOLEAN_CONTINUOUS_FUNCTION");
				String zoomMode=rs.getString("ZOOM_MODE");
				String booleanShootScene=rs.getString("BOOLEAN_SHOOT_SCENE");
				String booleanAlarmClock=rs.getString("BOOLEAN_ALARM_CLOCK");
				String booleanRecord=rs.getString("BOOLEAN_RECORD");
				String booleanCounter=rs.getString("BOOLEAN_COUNTER");
				String booleanGSP=rs.getString("BOOLEAN_GPS");
				String booleanWIFI=rs.getString("BOOLEAN_WIFI");
				String booleanBluetooth=rs.getString("BOOLEAN_BLUETOOTH");
				String booleanWirelessAp=rs.getString("BOOLEAN_WIRELESS_AP");
				String USB=rs.getString("USB");
				String batteryType=rs.getString("BATTERY_TYPE");
				String callTime=rs.getString("CALL_TIME");
				String waitTime=rs.getString("WAIT_TIME");
				String booleanGravitySensor=rs.getString("BOOLEAN_GRAVITY_SENSOR");
				String booleanLightSenseOrgan=rs.getString("BOOLEAN_LIGHT_SENSE_ORGAN");
				String booleanDistanceReaction=rs.getString("BOOLEAN_DISTANCE_REACTION");
				String firstCost=rs.getString("FIRST_COST");
				GoodsMobilePhone gmp=new GoodsMobilePhone(id, name, price, type, color, size, brand, count, monthSales, totalSales, desc, runRam, phoneMemory, pxel, coreNumber, sharpnessSeparation, os, batteryCapacity, style, booleanSmartphone, phoneType, keyboardType, weight, thickness, CPUType, additionFunction, networkModel, storageFunction, networkType, maxStorageExtensions, camearType, SIMStandard, screenTexture, screenType, fuselageSize, BooleanMusicPlay, booleanVideoPlay, BooleanJava, booleanRingingSound, secondCamera, senseOrganType, booleanFlashlight, booleanContinuousFunction, zoomMode, booleanShootScene, booleanAlarmClock, booleanRecord, booleanCounter, booleanGSP, booleanWIFI, booleanBluetooth, booleanWirelessAp, USB, batteryType, callTime, waitTime, booleanGravitySensor, booleanLightSenseOrgan, booleanDistanceReaction, firstCost);
				
				mobilePhoneList.add(gmp);
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
		return mobilePhoneList;
	}
}
