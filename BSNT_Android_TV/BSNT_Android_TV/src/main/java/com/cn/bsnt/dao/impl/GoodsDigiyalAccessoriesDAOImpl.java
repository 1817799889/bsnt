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
import com.cn.bsnt.model.GoodsDigiyalAccessories;
import com.cn.bsnt.model.User;

public class GoodsDigiyalAccessoriesDAOImpl implements
		BaseDAO<GoodsDigiyalAccessories> {

	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;

	public int insert(GoodsDigiyalAccessories t) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int delete(int id) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int update(GoodsDigiyalAccessories t) throws SQLException {
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

	public List<GoodsDigiyalAccessories> selectAll(String type)
	{
		List<GoodsDigiyalAccessories> selectDigiyalAccessoriesList=new ArrayList<GoodsDigiyalAccessories>();
		conn=ConnectionManager.getConnection();
		try {
			ps=conn.prepareStatement("select * form goods_digiyal_accessories");
			ps.setString(1, type);
			rs=ps.executeQuery();
			while(rs.next())
			{
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
				 String firstCost=rs.getString("FIRST_COST");
				 String character=rs.getString("CHARACTER"); 
				 String style=rs.getString("STYLE"); 
				 String applyPhoneType=rs.getString("APPLY_PHONE_TYPE");
				 String texture=rs.getString("TEXTURE");
				 String pattern=rs.getString("PATTERN");
				 String padPastingFeature=rs.getString("PAD_PASTING_FEATURE");
				 String padPastingType=rs.getString("PAD_PASTING_TYPE");
				 String applyBrand=rs.getString("APPLY_BRAND");
				 String shellTexture=rs.getString("SHELL_TEXTURE"); 
				 String batteryCapacity=rs.getString("BATTERY_CAPACITY");
				 String batteryType=rs.getString("BATTERY_TYPE"); 
				 String additionFunction=rs.getString("ADDITION_FUNCTION");
				 String bayonet=rs.getString("BAYONET");
				 String applyCamera=rs.getString("APPLY_CAMERA");
				 String warrantyPeriod=rs.getString("WARRANTY_PERIOD");
				 String dataPartsType=rs.getString("DATA_PARTS_TYPE"); 
				 String holderType=rs.getString("HOLDER_TYPE");
				 String horseDayNumber=rs.getString("HORSE_DAY_NUMBER");
				 String acceptHigh=rs.getString("ACCEPT_HIGH");
				 String selfWeight=rs.getString("SELF_WEIGHT");
				 String materialWeight=rs.getString("MATERIAL_WEIGHT");
				 String afterSameService=rs.getString("AFTER_SALE_SERVICE");
				 String booleanoriginal=rs.getString("BOOLEAN_ORIGINAL");
				 String batteryStandard=rs.getString("BATTERY_STANDARD");
				 String batteryPitchNumber=rs.getString("BATTERY_PITCH_NUMBER"); 
				 String shotType=rs.getString("SHOT_TYPE"); 
				 String shotBaynoet=rs.getString("SHOT_BAYONET");
				 String maxAperture=rs.getString("MAX_APERTURE"); 
				 String booleanSilentFrame=rs.getString("BOOLEAN_SILENT_FRAME");
				 String filterCaliber=rs.getString("FILTER_CALIBER");
				 String lensHood=rs.getString("LENS_HOOD");  
				 String apertureLeafNumber=rs.getString("APERTURE_LEAF_NUMBER");
				 String viewAngleScope=rs.getString("VIEW_ANGLE_SCOPE");
				 String zoomWay=rs.getString("ZOOM_WAY"); 
				 String minAperture=rs.getString("MIN_APERTURE");
				 String maxAmplificationFactor=rs.getString("MAX_AMPLIFICATION_FACTOR");
				 String closeFocusingDistance=rs.getString("CLOSE_FOCUSING_DISTANCE");
				 String shotStructure=rs.getString("SHOT_STRUCTURE");
				 String shotSize=rs.getString("SHOT_SIZE");
				 String productFeature=rs.getString("PRODUCT_FEATURE");
				 String booleanAntiShakeType=rs.getString("BOOLEAN_ANTI_SHAKE_TYPE"); 
				 String focus=rs.getString("FOCUS");
				 String priceSection=rs.getString("PRICE_SECTION");
				 String cellType=rs.getString("CELL_TYPE");
				 String propagationRadius=rs.getString("PROPAGATION_RADIUS");
				 String comboType=rs.getString("COMBO_TYPE");
				 String standTime=rs.getString("STAND_TIME");
				 String booleanSingleDoubleEar=rs.getString("BOOLEAN_SINGLE_DOUBLE_EAR");
				 String bluetoothVersion=rs.getString("BLUETOOTH_VERSION");
				 String soundTrack=rs.getString("SOUND_TRACK");
				 String useType=rs.getString("USE_TYPE");
				 String condition=rs.getString("CONDITION");
				 String flashCapacity=rs.getString("FLASH_CAPACITY");
				 String booleanSecurityCheck=rs.getString("BOOLEAN_SECURITY_CHECK");
				 String usbType=rs.getString("USB_TYPE");
				 String characteristic=rs.getString("CHARACTERISTIC");
				 String creativeUsbTheme=rs.getString("CREATIVE_USB_THEME");
				 String booleanWifi=rs.getString("BOOLEAN_WIFI");
				 String memoryCapacity=rs.getString("MEMORY_CAPACITY");
				 String applyObject=rs.getString("APPLY_OBJECT");
				 String readWriteSpeed=rs.getString("READ_WRITE_SPEED"); 
				 String storageType=rs.getString("STORAGE_TYPE");
				 String booleanExternalPowerSource=rs.getString("BOOLEAN_EXTERNAL_POWER_SOURCE");
				 GoodsDigiyalAccessories gda=new GoodsDigiyalAccessories(id, name, price, type1, color, size, brand, count, monthSales, totalSales, desc, firstCost, character, style, applyPhoneType, texture, pattern, padPastingFeature, padPastingType, applyBrand, shellTexture, batteryCapacity, batteryType, additionFunction, bayonet, applyCamera, warrantyPeriod, dataPartsType, holderType, horseDayNumber, acceptHigh, selfWeight, materialWeight, afterSameService, booleanoriginal, batteryStandard, batteryPitchNumber, shotType, shotBaynoet, maxAperture, booleanSilentFrame, filterCaliber, lensHood, apertureLeafNumber, viewAngleScope, zoomWay, minAperture, maxAmplificationFactor, closeFocusingDistance, shotStructure, shotSize, productFeature, booleanAntiShakeType, focus, priceSection, cellType, propagationRadius, comboType, standTime, booleanSingleDoubleEar, bluetoothVersion, soundTrack, useType, condition, flashCapacity, booleanSecurityCheck, usbType, characteristic, creativeUsbTheme, booleanWifi, memoryCapacity, applyObject, readWriteSpeed, storageType, booleanExternalPowerSource);
				 selectDigiyalAccessoriesList.add(gda);
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
		return selectDigiyalAccessoriesList;
	}
}
