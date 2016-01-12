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
import com.cn.bsnt.model.GoodsMedicacare;
import com.cn.bsnt.model.User;

public class GoodsMedicacareDAOImpl implements BaseDAO<GoodsMedicacare>{

	Connection conn=null;
	PreparedStatement ps=null;
	ResultSet rs=null;
	public int insert(GoodsMedicacare t) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int delete(int id) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int update(GoodsMedicacare t) throws SQLException {
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
	public List<GoodsMedicacare> selectAll(String type){
		List<GoodsMedicacare> medicacareList=new ArrayList<GoodsMedicacare>();
		conn=ConnectionManager.getConnection();
		try {
			ps=conn.prepareStatement("select * from goods_medica_care where type=?");
			ps.setString(1, type);
			rs=ps.executeQuery();
			while(rs.next()){
				 int id=rs.getInt("ID");
				 String Name=rs.getString("NAME");
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
				 String productionArea=rs.getString("PRODUCTION_AREA");
				 String function=rs.getString("FUNCTION");
				 String model=rs.getString("MODEL");
				 String appreciation=rs.getString("APPRECIATION");
				 String disease=rs.getString("DISEASE");
				 String symptom=rs.getString("SYMPTOM");
				 String applyThrong=rs.getString("APPLY_THRONG");
				 String applyPart=rs.getString("APPLY_PART");
				 String chooseHotspot=rs.getString("CHOOSE_HOTSPOT");
				 String massageManipulation=rs.getString("MASSAGE_MANIPULATION");
				 String apparentShape=rs.getString("APPARENT_SHAPE");
				 String controlWay=rs.getString("CONTROL_WAY");
				 String massageHeadNumber=rs.getString("MASSAGE_HEAD_NUMBER");
				 String powerWay=rs.getString("POWER_WAY");
				 String therapyWayClassiFication=rs.getString("THERAPY_WAY_CLASSIFICATION");
				 String massagePrincipie=rs.getString("MASSAGE_PRINCIPIE");
				 String careBodyParts=rs.getString("CARE_BODY_PARTS");
				 String protectiveClothing=rs.getString("PROTECTIVE_CLOTHING");
				 String sportsOutdoorProject=rs.getString("SPORTS_OUTDOOR_PROJECT");
				 String BooleaAameShopping=rs.getString("BOOLEAN_SAME_SHOPPING");
				 String drainageMethEd=rs.getString("DRAINAGE_METHED");
				 String booleanHandleDevice=rs.getString("BOOLEAN_HANDLE_DEVICE");
				 String waterStageHeight=rs.getString("WATER_STAGE_HEIGHT");
				 String booleanMedicineBox=rs.getString("BOOLEAN_MEDICINE_BOX");
				 String booleanWaterproofCoverDevice=rs.getString("BOOLEAN_WATERPROOF_COVER_DEVICE");
				 String booleanShiftingRoller=rs.getString("BOOLEAN_SHIFTING_ROLLER");
				 String afterSaleService=rs.getString("AFTER_SALE_SERVICE");
				 String power=rs.getString("POWER");
				 String style=rs.getString("STYLE");
				 String artNumber=rs.getString("ART_NUMBER");
				 String holeCount=rs.getString("HOLE_COUNT");
				 String shape=rs.getString("SHAPE");
				 String wenApparatusType=rs.getString("WEN_APPARATUS_TYPE");
				 String applySence=rs.getString("APPLY_SENCE");
				 GoodsMedicacare medica=new GoodsMedicacare(id, Name, price, type1, color, size, brand, count, monthSales, totalSales, desc, firstCost, productionArea, function, model, appreciation, disease, symptom, applyThrong, applyPart, chooseHotspot, massageManipulation, apparentShape, controlWay, massageHeadNumber, powerWay, therapyWayClassiFication, massagePrincipie, careBodyParts, protectiveClothing, sportsOutdoorProject, BooleaAameShopping, drainageMethEd, booleanHandleDevice, waterStageHeight, booleanMedicineBox, booleanWaterproofCoverDevice, booleanShiftingRoller, afterSaleService, power, style, artNumber, holeCount, shape, wenApparatusType, applySence);
				 medicacareList.add(medica);
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
		return medicacareList;
	}

}
