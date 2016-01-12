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
import com.cn.bsnt.model.GoodsBoxSpringSuite;
import com.cn.bsnt.model.User;

public class GoodsBoxSpringSuiteDAOImpl implements BaseDAO<GoodsBoxSpringSuite>{

	private Connection  conn = null;
	private PreparedStatement para=null;
	private ResultSet rs = null;
	private String sql;
	private List<GoodsBoxSpringSuite> goodsBoxSpringSuite = new ArrayList<GoodsBoxSpringSuite>();
	
	public int insert(GoodsBoxSpringSuite t) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int delete(int id) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int update(GoodsBoxSpringSuite t) throws SQLException {
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
	
	public List<GoodsBoxSpringSuite> selectAll() throws SQLException{
		conn = ConnectionManager.getConnection();
		sql="select * from goods_auto_appliance";
		para = conn.prepareStatement(sql);
		rs = para.executeQuery();
		GoodsBoxSpringSuite gbss = null;
		while(rs.next()){
			gbss = new GoodsBoxSpringSuite();
			
			gbss.setId(rs.getInt("ID"));
			gbss.setName(rs.getString("NAME"));
			gbss.setPrice(rs.getDouble("PRICE"));
			gbss.setType(rs.getString("TYPE"));
			gbss.setColor(rs.getString("COLOR"));
			gbss.setSize(rs.getString("SIZE"));
			gbss.setBrand(rs.getString("BRAND"));
			gbss.setCount(rs.getString("COUNT"));
			gbss.setMonthSales(rs.getString("MONTH_SALES"));
			gbss.setTotalSales(rs.getString("TOTAL_SALES"));
			gbss.setDesc(rs.getString("DESC"));
			gbss.setFirstCost(rs.getString("FIRST_COST"));
			gbss.setBooleanTexiTreansportation(rs.getString("BOOLEAN_TEXI_TREANSPORTATION"));
			gbss.setInstallationInstructDetail(rs.getString("INSTALLATION_INSTRUCT_DETAIL"));
			gbss.setPattern(rs.getString("PATTERN"));
			gbss.setDesighElement(rs.getString("DESIGH_ELEMNENT"));
			gbss.setApplyNumberPeople(rs.getString("APPLY_NUMBER_PEOPLE"));
			gbss.setBooleanStoringSpace(rs.getString("BOOLEAN_STORING_SPACE"));
			gbss.setBooleanSoft(rs.getString("BOOLEAN_SOFT"));
			gbss.setBooleanFence(rs.getString("BOOLEAN_FENCE"));
			gbss.setBooleanCustomize(rs.getString("BOOLEAN_CUSTOMIZE"));
			gbss.setTexture(rs.getString("TEXTURE"));
			gbss.setProcess(rs.getString("PROCESS"));
			gbss.setStyle(rs.getString("STYLE"));
			gbss.setStructyre(rs.getString("STRUCTYRE"));
			gbss.setBooleanDeliveryInstall(rs.getString("BOOLEAN_DELIVERY_INSTALL"));
			gbss.setGrossWeight(rs.getString("GROSS_WEIGHT"));
			gbss.setShape(rs.getString("SHAPE"));
			gbss.setLining(rs.getString("LINING"));
			gbss.setBooleanBedstock(rs.getString("BOOLEAN_BEDSTOCK"));
			gbss.setPatternDetail(rs.getString("PATTERN_DETAIL"));
			gbss.setLiningProcess(rs.getString("LINING_PROCESS"));
			gbss.setRoundBedSize(rs.getString("ROUND_BED_SIZE"));
			gbss.setDermis(rs.getString("DERMIS"));
			gbss.setLeatherProcess(rs.getString("LEATHER_PROCESS"));
			gbss.setLeatherTexture(rs.getString("LEATHER_TEXTURE"));
			gbss.setPackageVolume(rs.getString("PACKAGE_VOLUME"));
			gbss.setThickness(rs.getString("THICKNESS"));
			gbss.setApplyObject(rs.getString("APPLY_OBJECT"));
			gbss.setBooleanHealthFunction(rs.getString("BOOLEAN_HEALTH_FUNCTION"));
			gbss.setBooleanSeatSoft(rs.getString("BOOLEAN_SEAT_SOFT"));
			gbss.setAdditionFunction(rs.getString("ADDITION_FUNCTION"));
			gbss.setOpenCloseWay(rs.getString("OPEN_CLOSE_WAY"));
			gbss.setFacingTexture(rs.getString("FACING_TEXTURE"));
			gbss.setFacingProcess(rs.getString("FACING_PROCESS"));
			gbss.setKind(rs.getString("KIND"));
			gbss.setDoorNumber(rs.getString("DOOR_NUMBE"));
			gbss.setInstallWay(rs.getString("INSTALL_WAY"));
			gbss.setBucketNumber(rs.getString("BUCKET_COUNT"));
			gbss.setBooleanMirror(rs.getString("BOOLEAN_MIRROR"));
			gbss.setFacingPaintProcess(rs.getString("FACING_PAINT_PROCESS"));
			gbss.setBooleanDressingStool(rs.getString("BOOLEAN_DRESSING_STOOL"));
			gbss.setBooleanOtherLikin(rs.getString("BOOLEAN_OTHER_LIKIN"));
			gbss.setBooleanSafetySideboard(rs.getString("BOOLEAN_SAFETY_SIDEBOARD"));
			gbss.setLiningFacingProcess(rs.getString("LINING_FACING_PROCESS"));
			gbss.setLeatherFacingScope(rs.getString("LEATHER_FACING_SCOPE"));
			gbss.setFiller(rs.getString("FILLER"));
			gbss.setStructureProcess(rs.getString("STRUCTURE_PROCESS"));
			gbss.setWoodinessProcess(rs.getString("WOODINESS_PROCESS"));
			gbss.setWoodinessStructureProcess(rs.getString("WOODINESS_STRUCTURE_PROCESS"));
			gbss.setLeatherFacingProcess(rs.getString("LEATHER_FACING_PROCESS"));
			gbss.setFillerHardness(rs.getString("FILLER_HARDNESS"));
			gbss.setBooleanFitting(rs.getString("BOOLEAN_FITTING"));
			gbss.setCombiningForm(rs.getString("COMBINING_FORM"));
			gbss.setBooleanUnpickWash(rs.getString("BOOLEAN_UNPICK_WASH"));
			gbss.setDesign(rs.getString("DESIGH"));
			gbss.setProductArea(rs.getString("PRODUCT_AREA"));
			gbss.setSkeleton(rs.getString("SKELETON"));
			gbss.setWoodinessTexture(rs.getString("WOODINESS_TEXTURE"));
			gbss.setPerimeter(rs.getString("PERIMETER"));
			gbss.setBooleanInnerContainner(rs.getString("BOOLEAN_INNER_CONTAINNER"));
	
			
			
			goodsBoxSpringSuite.add(gbss);
		}
		return goodsBoxSpringSuite;
	}

}
