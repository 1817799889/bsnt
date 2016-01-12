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
import com.cn.bsnt.model.GoodsDecorateBuildingmaterials;
import com.cn.bsnt.model.User;

public class GoodsDecorateBuildingmaterialsDAOImpl implements BaseDAO<GoodsDecorateBuildingmaterials>{

	Connection conn=null;
	PreparedStatement ps=null;
	ResultSet rs=null;
	public int insert(GoodsDecorateBuildingmaterials t) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int delete(int id) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int update(GoodsDecorateBuildingmaterials t) throws SQLException {
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
	public List<GoodsDecorateBuildingmaterials> selectAll()
	{
		List<GoodsDecorateBuildingmaterials> decorateBuildingmaterialsList=new ArrayList<GoodsDecorateBuildingmaterials>();
		conn=ConnectionManager.getConnection();
		try {
			ps=conn.prepareStatement("select * from goods_decorate_building_materials");
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
			     String perTabletWidth=rs.getString("PER_TABLET_WIDTH"); 
				 String perTabletLength=rs.getString("PER_TABLET_LENGTH"); 
				 String chargeUnit=rs.getString("CHARGE_UNIT"); 
				 String applyObject=rs.getString("APPLY_OBJECT"); 
				 String grain=rs.getString("GRAIN"); 
				 String sameCityService=rs.getString("SAME_CITY_SERVICE");
				 String style=rs.getString("STYLE"); 
				 String pattern=rs.getString("PATTERN");
				 String booleanPattern=rs.getString("BOOLEAN_PATTERN");
				 String applySpace=rs.getString("APPLY_SPACE");
				 String standard=rs.getString("STANDARD"); 
				 String surfaceCourseProcess=rs.getString("SURFACE_COURSE_PROCESS");
				 String booleanSurfaceCourse=rs.getString("BOOLEAN_SURFACE_COURSE");
				 String keepYear=rs.getString("KEEP_YEAR"); 
				 String productType=rs.getString("PRODUCT_TYPE");
				 String jackType=rs.getString("JACK_TYPE");
				 String ratedCourent=rs.getString("RATED_CURRENT"); 
				 String keyNumber=rs.getString("KEY_NUMBER"); 
				 String tablet=rs.getString("TABLET"); 
				 String thickness=rs.getString("THICKNESS");
				 String booleanSanmeColorLine=rs.getString("BOOLEAN_SANME_COLOR_LINE");
				 String abrasionCycle=rs.getString("ABRASION_CYCLE");
				 String formaldehydeFreeContent=rs.getString("FORMALDEHYDE_FREE_CONTENT");
				 String rabbetType=rs.getString("RABBET_TYPE");
				 String texture=rs.getString("TEXTURE");
				 String paintGloss=rs.getString("PAINT_GLOSS");
				 String paintType=rs.getString("PAINT_TYPE");
				 String capacity=rs.getString("CAPACITY");
				 String booleanColourModuation=rs.getString("BOOLEAN_COLOUR_MODULATION");
				 String coatType=rs.getString("COAT_TYPE");
				 String additiongDunction=rs.getString("ADDITIONG_DUNCTION");
				 String applyPart=rs.getString("APPLY_PART");
				 String pipeDiameter=rs.getString("PIPE_DIAMETER");
				 String packageVolume=rs.getString("PACKAGE_VOLUME");
				 String booleanCustomization=rs.getString("BOOLEAN_CUSTOMIZATION");
				 String grossWeight=rs.getString("GROSS_WEIGHT"); 
				 String accessory=rs.getString("ACCESSORY");
				 String glassType=rs.getString("GLASS_TYPE"); 
				 String smartType=rs.getString("SMART_TYPE");
				 String lampshadeAuxilaryTexture=rs.getString("LAMPSHADE_AUXILARY_TEXTURE");
				 String lampBodyAuxilaryTexture=rs.getString("LAMP_BODY_AUXILARY_TEXTURE");
				 String lampBodyMainTexture=rs.getString("LAMP_BODY_MAIN_TEXTURE");
				 String lampshadeMainTexture=rs.getString("LAMPSHADE_MAIN_TEXTURE");
				 String lightSourceType=rs.getString("LIGHT_SOURCE_TYPE"); 
				 String process=rs.getString("PROCESS"); 
				 String lightSourceNumber=rs.getString("LIGHT_SOURCE_NUMBER");
				 String irradiatedArea=rs.getString("IRRADIATED_AREA");
				 String booleanTakeLightSource=rs.getString("BOOLEAN_TAKE_LIGHT_SOURCE");
				 String voltage=rs.getString("VOLTAGE");
				 String lampshadeShape=rs.getString("LAMPSHADE_SHAPE");
				 String power=rs.getString("POWER");
				 String swithType=rs.getString("SWITH_TYPE");
				 GoodsDecorateBuildingmaterials gdb=new GoodsDecorateBuildingmaterials(id, name, price, type, color, size, brand, count, monthSales, totalSales, desc, firstCost, perTabletWidth, perTabletLength, chargeUnit, applyObject, grain, sameCityService, style, pattern, booleanPattern, applySpace, standard, surfaceCourseProcess, booleanSurfaceCourse, keepYear, productType, jackType, ratedCourent, keyNumber, tablet, thickness, booleanSanmeColorLine, abrasionCycle, formaldehydeFreeContent, rabbetType, texture, paintGloss, paintType, capacity, booleanColourModuation, coatType, additiongDunction, applyPart, pipeDiameter, packageVolume, booleanCustomization, grossWeight, accessory, glassType, smartType, lampshadeAuxilaryTexture, lampBodyAuxilaryTexture, lampBodyMainTexture, lampshadeMainTexture, lightSourceType, process, lightSourceNumber, irradiatedArea, booleanTakeLightSource, voltage, lampshadeShape, power, swithType);
				 decorateBuildingmaterialsList.add(gdb);
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
		return decorateBuildingmaterialsList;
	}

}
