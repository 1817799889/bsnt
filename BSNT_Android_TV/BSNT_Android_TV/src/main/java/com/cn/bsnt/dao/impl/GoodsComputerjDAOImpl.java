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
import com.cn.bsnt.model.GoodsComputer;
import com.cn.bsnt.model.User;

public class GoodsComputerjDAOImpl implements BaseDAO<GoodsComputer>{

	Connection conn=null;
	PreparedStatement ps=null;
	ResultSet rs=null;
	public int insert(GoodsComputer t) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int delete(int id) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int update(GoodsComputer t) throws SQLException {
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
	public List<GoodsComputer> selectAll()
	{
		List<GoodsComputer> computerList=new ArrayList<GoodsComputer>();
		conn=ConnectionManager.getConnection();
		try {
			ps=conn.prepareStatement("select * from goods_computer");
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
				String cpu=rs.getString("CPU");
				String ssd=rs.getString("SSD");
				String gb=rs.getString("GB");
				String mb=rs.getString("MB");
				String videoCardType=rs.getString("VIDEO_CARD_TYPE");
				String sence=rs.getString("APPLY_SENCE"); 
				String memoryCapacity=rs.getString("MEMORY_CAPACITY"); 
				String screenColumn=rs.getString("SCREEN_COLUMN");
				String ghz=rs.getString("GHZ");
				String weight=rs.getString("WEIGHT");
				String ddrii=rs.getString("DDRII");
				String maxMemoryCapacity=rs.getString("MAX_MEMORY_CAPACITY");
				String cdDriverType=rs.getString("CD_DRIVER_TYPE");
				String lithiumIonBatteryNumber=rs.getString("LITHIUM_ION_BATTERY_BATTERIES_NUMBER");
				String os=rs.getString("OS");
				String sharpnessSeparation=rs.getString("SHARPNESS_SEPARATION");
				String booleanTouchScreen=rs.getString("BOOLEAN_TOUCH_SCREEN");
				String booleanUitrabook=rs.getString("BOOLEAN_UITRABOOK");
				String screenType=rs.getString("SCREEN_TYPE");
				String averageBrightness=rs.getString("AVERAGE_BRIGHTNESS");
				String blackWhiteResponseTime=rs.getString("BLACK_WHITE_RESPONSE_TIME");
				String grayLevelResponseTime=rs.getString("GRAY_LEVEL_RESPONSE_TIME");
				String applySence=rs.getString("APPLY_SCENE"); 
				String dotPitch=rs.getString("DOT_PITCH");
				String verticalViewingAngle=rs.getString("VERTICAL_VIEWING_ANGLE");
				String backLightType=rs.getString("BACK_LIGHT_TYPE");
				String colourType=rs.getString("COLOUR_TYPE");
				String booleanSound=rs.getString("BOOLEAN_SOUND");
				String portType=rs.getString("PORT_TYPE");
				String levelViewingAngle=rs.getString("LEVEL_VIEWING_ANGLE");
				String packagingVolumn=rs.getString("PACKAGING_VOLUMN");
				String screenSize=rs.getString("SCREEN_SIZE");
				String hardDiskSpeed=rs.getString("HARD_DISK_SPEED");
				String condition=rs.getString("CONDITION");
				String desktopComputerType=rs.getString("DESKTOP_COMPUTER_TYPE");
				String cameraType=rs.getString("CAMERA_TYPE");
				String energyEfficiencyLevel=rs.getString("ENERGY_EFFICIENCY_LEVEL");
				String applyBrand=rs.getString("APPLY_BRAND");
				String soundCardType=rs.getString("SOUND_CARD_TYPE");
				String afterSaleService=rs.getString("AFTER_SALE_SERVICE");
				String displayerType=rs.getString("DISPLAYER_TYPE");
				String sameCityService=rs.getString("SAME_CITY_SERVICE");
				String batteryCapacity=rs.getString("BATTERY_CAPACITY");
				String coreNumber=rs.getString("CORE_NUMBER");
				String boolean4g=rs.getString("BOOLEAN_4G");
				String booleanBluetooth=rs.getString("BOOLEAN_BLUETOOTH");
				String additionFunction=rs.getString("ADDITION_FUNCTION");
				String enduranceTime=rs.getString("ENDURANCE_TIME");
				String storageType=rs.getString("STORAGE_TYPE");
				String productType=rs.getString("PRODUCT_TYPE");
				String prepositionCameraPixel=rs.getString("PREPOSITION_CAMERA_PIXEL");
				String postpositionCameraPixel=rs.getString("POSTPOSITION_CAMERA_PIXEL");
				String firstCost=rs.getString("FIRST_COST");
				GoodsComputer gc=new GoodsComputer(id, name, price, type, color, size, brand, count, monthSales, totalSales, desc, cpu, ssd, gb, mb, videoCardType, sence, memoryCapacity, screenColumn, ghz, weight, ddrii, maxMemoryCapacity, cdDriverType, lithiumIonBatteryNumber,os, sharpnessSeparation, booleanTouchScreen, booleanUitrabook, screenType, averageBrightness, blackWhiteResponseTime, grayLevelResponseTime, applySence, dotPitch, verticalViewingAngle, backLightType, colourType, booleanSound, portType, levelViewingAngle, packagingVolumn, screenSize, hardDiskSpeed, condition, desktopComputerType, cameraType, energyEfficiencyLevel, applyBrand, soundCardType, afterSaleService, displayerType, sameCityService, batteryCapacity, coreNumber, boolean4g, booleanBluetooth, additionFunction, enduranceTime, storageType, productType, prepositionCameraPixel, postpositionCameraPixel,firstCost);
				
				computerList.add(gc);
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
		return computerList;
	}

}
