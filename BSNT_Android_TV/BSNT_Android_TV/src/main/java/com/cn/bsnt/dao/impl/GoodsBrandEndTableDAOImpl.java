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
import com.cn.bsnt.model.GoodsBrandEndTable;
import com.cn.bsnt.model.User;

public class GoodsBrandEndTableDAOImpl implements BaseDAO<GoodsBrandEndTable>{

	Connection conn=null;
	PreparedStatement ps=null;
	ResultSet rs=null;
	public int insert(GoodsBrandEndTable t) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int delete(int id) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int update(GoodsBrandEndTable t) throws SQLException {
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
	public List<GoodsBrandEndTable> selectAll(){
		List<GoodsBrandEndTable> brandEndTableList=new ArrayList<GoodsBrandEndTable>();
		conn=ConnectionManager.getConnection();
		try {
			ps=conn.prepareStatement("select * from goods_brand_end_table");
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
				 String booleanTextTransportation=rs.getString("BOOLEAN_TSIX_TRANSPORTATION");
				 String booleanFitting=rs.getString("BOOLEAN_FITTING");
				 String angleShape=rs.getString("ANGLE_SHAPE");
				 String doorNumber=rs.getString("DOOR_NUMBER");
				 String booleanStretch=rs.getString("BOOLEAN_STRETCH");
				 String booleanIdlerWheel=rs.getString("BOOLEAN_IDLER_WHEEL");
				 String booleanStoringSpace=rs.getString("BOOLEAN_STORING_SPACE");
				 String style=rs.getString("STYLE");
				 String productArea=rs.getString("PRODUCT_AREA");
				 String facingProcess=rs.getString("FACING_PROCESS");
				 String booleanCustomize=rs.getString("BOOLEAN_CUSTOMIZE");
				 String texture=rs.getString("TEXTURE");
				 String metalTexture=rs.getString("METAL_TEXTURE");
				 String installWay=rs.getString("INSTALL_WAY");
				 String grossWeight=rs.getString("GROSS_WEIGHT");
				 String packageVolume=rs.getString("PACKAGE_VOLUME");
				 String glassProcess=rs.getString("GLASS_PROCESS");
				 String structureProcess=rs.getString("STRUCTURE_PROCESS");
				 String kind=rs.getString("KIND");
				 String facingTexture=rs.getString("FACING_TEXTURE");
				 String shape=rs.getString("SHAPE");
				 String booleanDeliveryInstall=rs.getString("BOOLEAN_DELIVERY_INSTALL");
				 String installInstructionDetail=rs.getString("INSTALL_INSTRUCTION_DETAIL");
				 String packageWay=rs.getString("PACKAGE_WAY");
				 String pliesNumber=rs.getString("PLIES_NUMBER");
				 String booleanCabinet=rs.getString("BOOLEAN_CABINET");
				 String function=rs.getString("FUNCTION");
				 String diskBooleanAdjust=rs.getString("DISK_BOOLEAN_ADJUST");
				 String structure=rs.getString("STRUCTURE");
				 String applyNumberPeople=rs.getString("APPLY_NUMBER_PEOPLE");
				 String booleanStool=rs.getString("BOOLEAN_STOOL");
				 String booleanDial=rs.getString("BOOLEAN_DIAL");
				 String booleanOtherLikin=rs.getString("BOOLEAN_OTHER_LIKIN");
				 GoodsBrandEndTable gbet=new GoodsBrandEndTable(id, name, price, type, color, size, brand, count, monthSales, totalSales, desc, firstCost, booleanTextTransportation, booleanFitting, angleShape, doorNumber, booleanStretch, booleanIdlerWheel, booleanStoringSpace, style, productArea, facingProcess, booleanCustomize, texture, metalTexture, installWay, grossWeight, packageVolume, glassProcess, structureProcess, kind, facingTexture, shape, booleanDeliveryInstall, installInstructionDetail, packageWay, pliesNumber, booleanCabinet, function, diskBooleanAdjust, structure, applyNumberPeople, booleanStool, booleanDial, booleanOtherLikin);
				 brandEndTableList.add(gbet);
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
		return brandEndTableList;
	}

}
