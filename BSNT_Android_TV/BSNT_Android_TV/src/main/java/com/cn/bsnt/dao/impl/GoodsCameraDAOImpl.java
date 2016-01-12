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
import com.cn.bsnt.model.GoodsCamera;
import com.cn.bsnt.model.User;

public class GoodsCameraDAOImpl implements BaseDAO<GoodsCamera>{

	Connection conn=null;
	PreparedStatement ps=null;
	ResultSet rs=null;
	public int insert(GoodsCamera t) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int delete(int id) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int update(GoodsCamera t) throws SQLException {
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
	public List<GoodsCamera> selectAll()
	{
		List<GoodsCamera> CameraList=new ArrayList<GoodsCamera>();
		conn=ConnectionManager.getConnection();
		try {
			ps=conn.prepareStatement("select * from goods_camera");
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
				String digitalPixel=rs.getString("DIGITAL_PIXEL");
				String weight=rs.getString("WEIGHT");
				String slrFormat=rs.getString("SLR_FORMAT");
				String focalLength=rs.getString("FOCAL_LENGTH");
				String booleanFuselageAntiShank=rs.getString("BOOLEAN_FUSELAGE_ANTI_SHAKE");
				String sensorDesc=rs.getString("SENSOR_DESC");
				String sensorSize=rs.getString("SENSOR_SIZE");
				String viewfinderType=rs.getString("VIEWFINDER_TYPE");
				String storageType=rs.getString("STORAGE_TYPE");
				String booleanFushlageMotor=rs.getString("BOOLEAN_FUSHLAGE_MOTOR");
				String ccdType=rs.getString("CCD_TYPE");
				String booleanFushlageDedustring=rs.getString("BOOLEAN_FUSHLAGE_DEDUSTRING");
				String booleanFushlageCircumscribedFlashlight=rs.getString("BOOLEAN_FUSHLAGE_CIRCUMSCRIBED_FLASHLIGHT");
				String batteryWay=rs.getString("BATTERY_WAY");
				String slrLevel=rs.getString("SLR_LEVEL");
				String screenSize=rs.getString("SCREEN_SIZE");
				String lcdSize=rs.getString("LCD_SIZE");
				String maxResolution=rs.getString("MAX_RESOLUTION");
				String lcdPixel=rs.getString("LCD_PIXEL");
				String focusingWay=rs.getString("FOCUSING_WAY");
				String exposureModel=rs.getString("EXPOSURE_MODEL");
				String exposureSompenstae=rs.getString("EXPOSURE_SOMPENSTAE");
				String photometryWay=rs.getString("PHOTOMETRY_WAY");
				String isoSensitivity=rs.getString("ISO_SENSITIVITY");
				String whiteBalanceModel=rs.getString("WHITE_BALANCE_MODEL");
				String shutter=rs.getString("SHUTTER");
				String continuousCapture=rs.getString("CONTINUOUS_CAPTURE");
				String autodyne=rs.getString("AUTODYNE");
				String booleanFushlageFlashlight=rs.getString("BOOLEAN_FUSHLAGE_FLASHLIGHT");
				String flashlightCharacter=rs.getString("FLASHLIGHT_CHARACTER");
				String slrPriceSection=rs.getString("SLR_PRICE_SECTION");
				String dataInterface=rs.getString("DATA_INTERFACE");
				String effectivePixel=rs.getString("EFFECTIVE_PIXEL");
				String applySence=rs.getString("APPLY_SENCE");
				String additionFunction=rs.getString("ADDITION_FUNCTION");
				String screenType=rs.getString("SCREEN_TYPE");
				String shotType=rs.getString("SHOT_TYPE");
				String apertureRange=rs.getString("APERTURE_RANGE");
				String shootDistance=rs.getString("SHOOT_DISTANCE");
				String closeUp=rs.getString("CLOSE_UP");
				String pictureSize=rs.getString("PICTURE_SIZE");
				String series=rs.getString("SERIES");
				String combaType=rs.getString("COMBA_TYPE");
				String booleanCloseUp=rs.getString("BOOLEAN_CLOSE_UP");
				String closeUpDistance=rs.getString("CLOSE_UP_DISTANCE");
				String booleanFlashlight=rs.getString("BOOLEAN_FLASHLIGHT");
				String photographicPaperSize=rs.getString("PHOTOGRAPHIC_PAPER_SIZE");
				String imageProcessor=rs.getString("IMAGE_PROCESSOR");
				String shortShoot=rs.getString("SHORT_SHOOT");
				String opticalZoomMultiples=rs.getString("OPTICAL_ZOOM_MULTIPLES");
				GoodsCamera gc=new GoodsCamera(id, name, price, type, color, size, brand, count, monthSales, totalSales, desc, firstCost, digitalPixel, weight, slrFormat, focalLength, booleanFuselageAntiShank, sensorDesc, sensorSize, viewfinderType, storageType, booleanFushlageMotor, ccdType, booleanFushlageDedustring, booleanFushlageCircumscribedFlashlight, batteryWay, slrLevel, screenSize, lcdSize, maxResolution, lcdPixel, focusingWay, exposureModel, exposureSompenstae, photometryWay, isoSensitivity, whiteBalanceModel, shutter, continuousCapture, autodyne, booleanFushlageFlashlight, flashlightCharacter, slrPriceSection, dataInterface, effectivePixel, applySence, additionFunction, screenType, shotType, apertureRange, shootDistance, closeUp, pictureSize, series, combaType, booleanCloseUp, closeUpDistance, booleanFlashlight, photographicPaperSize, imageProcessor, shortShoot, opticalZoomMultiples);
				CameraList.add(gc);
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
		return CameraList;
	}

}
