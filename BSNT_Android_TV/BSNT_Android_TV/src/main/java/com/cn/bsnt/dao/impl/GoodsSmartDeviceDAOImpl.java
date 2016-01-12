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
import com.cn.bsnt.model.GoodsSmartDevice;
import com.cn.bsnt.model.User;

public class GoodsSmartDeviceDAOImpl implements BaseDAO<GoodsSmartDevice> {

	Connection conn=null;
	PreparedStatement ps=null;
	ResultSet rs=null;
	public int insert(GoodsSmartDevice t) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int delete(int id) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int update(GoodsSmartDevice t) throws SQLException {
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
	public List<GoodsSmartDevice> selectAll(){
		List<GoodsSmartDevice> smartDeviceList=new ArrayList<GoodsSmartDevice>();
		conn=ConnectionManager.getConnection();
		try {
			ps=conn.prepareStatement("select * from goods_smart_device");
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
				 String compatiblePlatform=rs.getString("COMPATIBLE_PLATFORM");
				 String function=rs.getString("FUNCTION");
				 String applySence=rs.getString("APPLY_SENCE");
				 String stripsInsertedDigits=rs.getString("STRIPS_INSERTED_DIGITS");
				 String comboType=rs.getString("COMBO_TYPE");
				 String watchbandSize=rs.getString("WATCHBAND_SIZE");
				 String dialShape=rs.getString("DIAL_SHAPE");
				 String watchbandStyle=rs.getString("WATCHBAND_STYLE");
				 String memoryCapacity=rs.getString("MEMORY_CAPACITY");
				 String screenSize=rs.getString("SCREEN_SIZE");
				 String batteryCapacity=rs.getString("BATTERY_CAPACITY");
				 String watchcaseTexture=rs.getString("WATCHCASE_TEXTURE");
				 String wathcbandTexture=rs.getString("WATCHBAND_TEXTURE");
				 String weight=rs.getString("WEIGHT");
				 String wirelessDistance=rs.getString("WIRELESS_DISTANCE");
				 String connectWay=rs.getString("CONNECT_WAY");
				 String applyObject=rs.getString("APPLY_OBJECT");
				 String memoryResolution=rs.getString("MEMORY_RESOLUTION");
				 String cameraPixel=rs.getString("CAMERA_PIXEL");
				 String stainlessMetalSpotGluing=rs.getString("STAINLESS_METAL_SPOT_GLUING");
				 String weightIndicate=rs.getString("WEIGHT_INDICATE");
				 String specialFunction=rs.getString("SPECIAL_FUNCTION");
				 String panelTexture=rs.getString("PANEL_TEXTURE");
				 String afterSaleService=rs.getString("AFTER-SALE_SERVICE");
				 String driverType=rs.getString("DRIVER_TYPE");
				 String wireLength=rs.getString("WIRE_LENGTH");
				 String booleanMarketShinee=rs.getString("BOOLEAN_MARKET_SHINEE");
				 GoodsSmartDevice gsd=new GoodsSmartDevice(id, name, price, type, color, size, brand, count, monthSales, totalSales, desc, firstCost, compatiblePlatform, function, applySence, stripsInsertedDigits, comboType, watchbandSize, dialShape, watchbandStyle, memoryCapacity, screenSize, batteryCapacity, watchcaseTexture, wathcbandTexture, weight, wirelessDistance, connectWay, applyObject, memoryResolution, cameraPixel, stainlessMetalSpotGluing, weightIndicate, specialFunction, panelTexture, afterSaleService, driverType, wireLength, booleanMarketShinee);
				 smartDeviceList.add(gsd);
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
		return smartDeviceList;
	}

}
