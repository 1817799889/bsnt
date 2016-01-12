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
import com.cn.bsnt.model.GoodsAutoAppliance;
import com.cn.bsnt.model.User;

public class GoodsAutoApplianceDAOImpl implements BaseDAO<GoodsAutoAppliance>{
	private Connection  conn = null;
	private PreparedStatement para=null;
	private ResultSet rs = null;
	private String sql;
	private List<GoodsAutoAppliance> goodsAutoApplianceList = new ArrayList<GoodsAutoAppliance>();

	public int insert(GoodsAutoAppliance t) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int delete(int id) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int update(GoodsAutoAppliance t) throws SQLException {
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
	
	public List<GoodsAutoAppliance> selectAll() throws SQLException{
		conn = ConnectionManager.getConnection();
		sql="select * from goods_auto_appliance";
		para = conn.prepareStatement(sql);
		rs = para.executeQuery();
		GoodsAutoAppliance gaa = null;
		while(rs.next()){
			gaa = new GoodsAutoAppliance();
			
			gaa.setId(rs.getInt("ID"));
			gaa.setName(rs.getString("NAME"));
			gaa.setPrice(rs.getDouble("PRICE"));
			gaa.setType(rs.getString("TYPE"));
			gaa.setColor(rs.getString("COLOR"));
			gaa.setSize(rs.getString("SIZE"));
			gaa.setBrand(rs.getString("BRAND"));
			gaa.setCount(rs.getString("COUNT"));
			gaa.setMonthSales(rs.getString("MONTH_SALES"));
			gaa.setTotalSales(rs.getString("TOTAL_SALES"));
			gaa.setDesc(rs.getString("DESC"));
			gaa.setFirstCost(rs.getString("FIRST_COST"));
			gaa.setSeatingWasherStyle(rs.getString("SEATING_WASHER_STYLE"));
			gaa.setSurfacelayerMetal(rs.getString("SURFACELAYER_METAL"));
			gaa.setCombiningForm(rs.getString("COMBINING_FORM"));
			gaa.setDesiqn(rs.getString("DESIQN"));
			gaa.setCarGarnishSort(rs.getString("CAR_GARNISH_SORT"));
			gaa.setPhotoPixel(rs.getString("PHOTO_PIXEL"));
			gaa.setSceneNumber(rs.getString("SCENE_NUMBER"));
			gaa.setCoreNumber(rs.getString("CORE_NUMBER"));
			gaa.setOutputPower(rs.getString("OUTPUT_POWER"));
			gaa.setIffasciaUSB(rs.getString("IFFASCIA_USB"));
			gaa.setElectricalSourceFashion(rs.getString("ELECTRICAL_SOURCE_FASHION"));
			gaa.setBlockSpec(rs.getString("BLOCK_SPEC"));
			gaa.setHeft(rs.getString("HEFT"));
			gaa.setAirpressureFlux(rs.getString("AIRPRESSURE_FLUX"));
			gaa.setSensorPlace(rs.getString("SENSOR_PLACE"));
			gaa.setFunction(rs.getString("FUNCTION"));
			gaa.setMuteIndex(rs.getString("MUTE_INDEX"));
			gaa.setPrincipleOf(rs.getString("PRINCIPLE_OF"));
			gaa.setOperatingSystem(rs.getString("OPERATING_SYSTEM"));
			gaa.setMapstyle(rs.getString("MAPSTYLE"));
			gaa.setTyreSpec(rs.getString("TYRE_SPEC"));
			gaa.setAutotyrePaceLevel(rs.getString("AUTOTYRE_PACE_LEVEL"));
			gaa.setTreadWidth(rs.getString("TREAD_WIDTH"));
			gaa.setHeatinsulation(rs.getString("HEATINSULATION"));
			gaa.setCarlampstyle(rs.getString("CARLAMPSTYLE"));
			gaa.setIforiginalbinding(rs.getString("IFORIGINALBINDING"));
			gaa.setHubsize(rs.getString("HUBSIZE"));
			gaa.setSetover(rs.getString("SETOVER"));
			gaa.setDiameter(rs.getString("DIAMETER"));
			gaa.setPitch(rs.getString("PITCH"));
			gaa.setAntifreezeStyle(rs.getString("ANTIFREEZE_STYLE"));
			gaa.setFreezingPoint(rs.getString("FREEZING_POINT"));
			gaa.setCarWaxStyle(rs.getString("CAR WAX_STYLE"));
			gaa.setPhysicsShape(rs.getString("PHYSICS_SHAPE"));
			gaa.setInterfaceStuff(rs.getString("INTERFACE_STUFF"));
			gaa.setSprayerStuff(rs.getString("SPRAYER_STUFF"));
			gaa.setSquirtqunSprayStyle(rs.getString("SQUIRTQUN_SPRAY_STYLE"));
			gaa.setGunSpearStuff(rs.getString("GUN SPEAR_STUFF"));
			gaa.setHandleStylesh(rs.getString("HANDLE_STYLESH"));
			
			goodsAutoApplianceList.add(gaa);
		}
		return goodsAutoApplianceList;
	}


}
