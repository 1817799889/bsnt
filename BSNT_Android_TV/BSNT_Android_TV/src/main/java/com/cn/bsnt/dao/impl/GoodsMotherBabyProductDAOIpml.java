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
import com.cn.bsnt.model.GoodsMotherBabyProduct;
import com.cn.bsnt.model.User;

public class GoodsMotherBabyProductDAOIpml implements BaseDAO<GoodsMotherBabyProduct>{

	Connection conn=null;
	PreparedStatement ps=null;
	ResultSet rs=null;
	public int insert(GoodsMotherBabyProduct t) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int delete(int id) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int update(GoodsMotherBabyProduct t) throws SQLException {
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
	public List<GoodsMotherBabyProduct> selectAll(){
		List<GoodsMotherBabyProduct> motherBabyProductList=new ArrayList<GoodsMotherBabyProduct>();
		conn=ConnectionManager.getConnection();
		try {
			ps=conn.prepareStatement("select * from goods_mother_baby_product");
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
				 String applyAge=rs.getString("APPLY_AGE");
				 String priceSection=rs.getString("PRICE_SECTION");
				 String loadBearing=rs.getString("LOAD_BEARING");
				 String texture=rs.getString("TEXTURE");
				 String firstCost=rs.getString("FIRST_COST");
				 String function=rs.getString("FUNCTION");
				 String standard=rs.getString("STANDARD");
				 String powerWay=rs.getString("POWER_WAY");
				 String booleanWaterproof=rs.getString("BOOLEAN_WATERPROOF");
				 String series=rs.getString("SERIES");
				 String capacity=rs.getString("CAPACITY");
				 String feeserBooleanHandle=rs.getString("FEEDER_BOOLEAN_HANDLE");
				 String caliberSize=rs.getString("CALIBER_SIZE");
				 String shape=rs.getString("SHAPE");
				 String pattern=rs.getString("PATTERN");
				 String strapsWay=rs.getString("STRAPS_WAY");
				 String testStaNdard=rs.getString("TEST_STANDARD");
				 String applyWeight=rs.getString("APPLY_WEIGHT");
				 String installWay=rs.getString("INSTALL_WAY");
				 String peopleFixationWay=rs.getString("PEOPLE_FIXATION_WAY");
				 String applySex=rs.getString("APPLY_SEX");
				 String diaperCategory=rs.getString("DIAPER_CATEGORY");
				 String videoCarType=rs.getString("VIDEO_CAR_TYPE");
				 String booleanShoppingView=rs.getString("BOOLEAN_SHOPPING_VIEW");
				 String driverType=rs.getString("DRIVER_TYPE");
				 String artNo=rs.getString("ART_NO");
				 String booleanHandPush=rs.getString("BOOLEAN_HAND_PUSH");
				 String booleanStorageBasket=rs.getString("BOOLEAN_STORAGE_BASKET");
				 String BooleanSunshade=rs.getString("BOOLEAN_SUNSHADE");
				 String wheelType=rs.getString("WHEEL_TYPE");
				 String wheelNumber=rs.getString("WHEEL_NUMBER");
				 String comboType=rs.getString("COMBO_TYPE");
				 String toyType=rs.getString("TOY_TYPE");
				 String productType=rs.getString("PRODUCT_TYPE");
				 String appearanceMolding=rs.getString("APPEARANCE_MOLDING");
				 String booleanRemoteControl=rs.getString("BOOLEAN_REMOTE_CONTROL");
				 String high=rs.getString("HIGH");
				 String filler=rs.getString("FILLER");
				 String dollType=rs.getString("DOLL_TYPE");
				 String BooleanWashable=rs.getString("BOOLEAN_WASHABLE");
				 String use=rs.getString("USE");
				 String thickness=rs.getString("THICKNESS");
				 String applySeason=rs.getString("APPLY_SEASON");
				 String sanitartNapkinSurface=rs.getString("SANITART_NAPKIN_SURFACE");
				 String applyObject=rs.getString("APPLY_OBJECT");
				 String expectantPackageType=rs.getString("EXPECTANT_PACKAGE_TYPE");
				 String linging=rs.getString("LINGING");
				 GoodsMotherBabyProduct gmbp=new GoodsMotherBabyProduct(id, Name, price, type, color, size, brand, count, monthSales, totalSales, desc, applyAge, priceSection, loadBearing, texture, firstCost, function, standard, powerWay, booleanWaterproof, series, capacity, feeserBooleanHandle, caliberSize, shape, pattern, strapsWay, testStaNdard, applyWeight, installWay, peopleFixationWay, applySex, diaperCategory, videoCarType, booleanShoppingView, driverType, artNo, booleanHandPush, booleanStorageBasket, BooleanSunshade, wheelType, wheelNumber, comboType, toyType, productType, appearanceMolding, booleanRemoteControl, high, filler, dollType, BooleanWashable, use, thickness, applySeason, sanitartNapkinSurface, applyObject, expectantPackageType, linging);
				 motherBabyProductList.add(gmbp);
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
		return motherBabyProductList;
	}

}
