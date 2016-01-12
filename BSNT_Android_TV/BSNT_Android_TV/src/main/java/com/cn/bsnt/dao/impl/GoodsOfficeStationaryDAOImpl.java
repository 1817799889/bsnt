package com.cn.bsnt.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cn.bsnt.dbhelper.ConnectionManager;
import com.cn.bsnt.model.GoodsOfficeStationary;

public class GoodsOfficeStationaryDAOImpl {

	Connection conn=null;
	PreparedStatement ps=null;
	ResultSet rs=null;
	public List<GoodsOfficeStationary> selectAll(){
		List<GoodsOfficeStationary> officeStationaryList=new ArrayList<GoodsOfficeStationary>();
		conn=ConnectionManager.getConnection();
		try {
			ps=conn.prepareStatement("select * from goods_office_stationary");
			rs=ps.executeQuery();
			while(rs.next())
			{
				 int id=rs.getInt("ID");
				 String Name=rs.getString("NAME");
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
				 String paperSupply=rs.getString("PAPER_SUPPLY");
				 String afterSaleService=rs.getString("AFTER_SALE_SERVICE");
				 String printerType=rs.getString("PRINTER_TYPE");
				 String supplyVoltage=rs.getString("SUPPLY_VOLTAGE");
				 String booleanAutomaticDepleexPrinting=rs.getString("BOOLEAN_AUTOMATIC_DEPLEX_PRINTING");
				 String printerSpeed=rs.getString("PRINTER_SPEED");
				 String portType=rs.getString("PORT_TYPE");
				 String model=rs.getString("MODEL");
				 String weight=rs.getString("WEIGHT");
				 String applySence=rs.getString("APPLY_SENCE");
				 String booleanNetworkPrinter=rs.getString("BOOLEAN_NETWORK_PRINTER");
				 String zoomMultiple=rs.getString("ZOOM_MULTIPLE");
				 String maxResolution=rs.getString("MAX_RESOLUTION");
				 String lightResourceType=rs.getString("LIGHT_RESOURCE_TYPE");
				 String bulbPower=rs.getString("BULB_POWER");
				 String projectionSize=rs.getString("PROJECTION_SIZE");
				 String luminance=rs.getString("LUMINANCE");
				 String projectionKind=rs.getString("PROJECTOR_KIND");
				 String projectionWay=rs.getString("PROJECTION_WAY");
				 String opticalResolution=rs.getString("OPTICAL_RESOLUTION");
				 String projectionTechnique=rs.getString("PROJECTION_TECHNIQUE");
				 String drumUnitStructure=rs.getString("DRUM_UNIT_STRUCTURE");
				 String HPType=rs.getString("HP_TYPE");
				 String HPDrumUnt=rs.getString("HP_DRUM_UNIT");
				 String breadth=rs.getString("BREADTH");
				 String packageNumber=rs.getString("PACKAGE_NUMBER");
				 String copySpeed=rs.getString("COPY_SPEED");
				 String function=rs.getString("FUNCTION");
				 String productType=rs.getString("PRODUCT_TYPE");
				 String consumableType=rs.getString("CONSUMABLE_TYPE");
				 String series=rs.getString("SERIES");
				 String scanningResolution=rs.getString("SCANNING_RESOLUTION");
				 String faxResolution=rs.getString("FAX_RESOLUTION");
				 String maxCopyNumber=rs.getString("MAX_COPY_NUMBER");
				 String faxSpeed=rs.getString("FAX_SPEED");
				 String faxType=rs.getString("FAX_TYPE");
				 String notepadClassify=rs.getString("NOTEPAD_CLASSIFY");
				 String coverHardness=rs.getString("COVER_HARDNESS");
				 String bookbindingWay=rs.getString("BOOKBINDING_WAY");
				 String style=rs.getString("STYLE");
				 String writeThickness=rs.getString("WRITE_THICKNESS");
				 String cartridgeColour=rs.getString("CARTRIDGE_COLOUR");
				 String number=rs.getString("NUMBER");
				 String booleanCustomization=rs.getString("BOOLEAN_CUSTOMIZATION");
				 String texture=rs.getString("TEXTURE");
				 String cartonBoxSize=rs.getString("CARTON_BOX_SIZE");
				 String doorStyle=rs.getString("DOOR_STYLE");
				 String strongboxType=rs.getString("STRONGBOX_TYPE");
				 String memaryCapacity=rs.getString("MEMARY_CAPACITY");
				 String enduranceTime=rs.getString("ENDURANCE_TIME");
				 String screenSize=rs.getString("SCREEN_SIZE");
				 String appearanceSize=rs.getString("APPEARANCE_SIZE");
				 String booleanTouchScreen=rs.getString("BOOLEAN_TOUCH_SCREEN");
				 String screenTexture=rs.getString("SCREEN_TEXTURE");
				 String os=rs.getString("OS");
				 String recordFunction=rs.getString("RECORD_FUNCTION");
				 String productionPort=rs.getString("PRODUCTION_PORT");
				 String screenColors=rs.getString("SCREEN_COLORS");
				 String screenType=rs.getString("SCREEN_TYPE");
				 String batteryInfo=rs.getString("BATTERY_INFO");
				 String textFormatting=rs.getString("TEXT_FORMATTING");
				 String inkWay=rs.getString("INK_WAY");
				 String ponPointElement=rs.getString("PON_POINT_ELEMENT");
				 String ponPointKind=rs.getString("PON_POINT_KIND");
				 String cartridgeHardness=rs.getString("CARTRIDGE_HARDNESS");
				 String use=rs.getString("USE");
				 String screenMaxShowPlaces=rs.getString("SCREEN_MAX_SHOW_PLACES");
				 String booleanRefillInk=rs.getString("BOOLEAN_REFILL_INK");
				 String BooleanDoubleHead=rs.getString("BOOLEAN_DOUBLE_HEAD");
				 GoodsOfficeStationary office=new GoodsOfficeStationary(id, Name, price, type, color, size, brand, count, monthSales, totalSales, desc, firstCost, paperSupply, afterSaleService, printerType, supplyVoltage, booleanAutomaticDepleexPrinting, printerSpeed, portType, model, weight, applySence, booleanNetworkPrinter, zoomMultiple, maxResolution, lightResourceType, bulbPower, projectionSize, luminance, projectionKind, projectionWay, opticalResolution, projectionTechnique, drumUnitStructure, HPType, HPDrumUnt, breadth, packageNumber, copySpeed, function, productType, consumableType, series, scanningResolution, faxResolution, maxCopyNumber, faxSpeed, faxType, notepadClassify, coverHardness, bookbindingWay, style, writeThickness, cartridgeColour, number, booleanCustomization, texture, cartonBoxSize, doorStyle, strongboxType, memaryCapacity, enduranceTime, screenSize, appearanceSize, booleanTouchScreen, screenTexture, os, recordFunction, productionPort, screenColors, screenType, batteryInfo, textFormatting, inkWay, ponPointElement, ponPointKind, cartridgeHardness, use, screenMaxShowPlaces, booleanRefillInk, BooleanDoubleHead);
				 officeStationaryList.add(office);
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
		return officeStationaryList;
	}
}
