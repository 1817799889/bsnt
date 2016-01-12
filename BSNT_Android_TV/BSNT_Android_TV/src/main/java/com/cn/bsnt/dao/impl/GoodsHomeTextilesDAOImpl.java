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
import com.cn.bsnt.model.GoodsHomeTextiles;
import com.cn.bsnt.model.GoodsKitchen;
import com.cn.bsnt.model.User;

public class GoodsHomeTextilesDAOImpl implements BaseDAO<GoodsHomeTextiles>{
	private Connection  conn = null;
	private PreparedStatement para=null;
	private ResultSet rs = null;
	private String sql;
	private List<GoodsHomeTextiles> goodsHomeTextilesList = new ArrayList<GoodsHomeTextiles>();


	public int insert(GoodsHomeTextiles t) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int delete(int id) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int update(GoodsHomeTextiles t) throws SQLException {
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
	
	public List<GoodsHomeTextiles> selectAll(String type) throws SQLException{
		conn = ConnectionManager.getConnection();
		sql="select * from GOODS_HOME_TEXTILES where type=?";
		para = conn.prepareStatement(sql);
		para.setString(1, type);
		rs = para.executeQuery();
		GoodsHomeTextiles ght = null;
		while(rs.next()){
			ght = new GoodsHomeTextiles();
			
			ght.setId(rs.getInt("id"));
			ght.setName(rs.getString("NAME"));
			ght.setPrice(rs.getDouble("PRICE"));
			ght.setType(rs.getString("TYPE"));
			ght.setColor(rs.getString("COLOR"));
			ght.setSize(rs.getString("SIZE"));
			ght.setBrand(rs.getString("BRAND"));
			ght.setCount(rs.getString("COUNT"));
			ght.setMonthSales(rs.getString("MONTH_SALES"));
			ght.setTotalSales(rs.getString("TOTAL_SALES"));
			ght.setDesc(rs.getString("DESC"));
			ght.setFirstCost(rs.getString("FIRST_COST"));
			ght.setHolderTexture(rs.getString("HOLDER_TEXTURE"));
			ght.setDesign(rs.getString("DESIGN"));
			ght.setDoorNumber(rs.getString("DOOR_NUMBER"));
			ght.setApplyBedSize(rs.getString("APPLY_BED_SIZE"));
			ght.setApplyObject(rs.getString("APPLY_OBJECT"));
			ght.setInstallWay(rs.getString("INSTALL_WAY"));
			ght.setArtNumber(rs.getString("ART_NUMBER"));
			ght.setTexture(rs.getString("TEXTURE"));
			ght.setProductLevel(rs.getString("PRODUCT_LEVEL"));
			ght.setSeason(rs.getString("SEASON"));
			ght.setQuiltFabric(rs.getString("QUILT_FABRIC"));
			ght.setCottonType(rs.getString("COTTON_TYPE"));
			ght.setFiller(rs.getString("FILLER"));
			ght.setMakingProcess(rs.getString("MAKING_PROCESS"));
			ght.setWeaveProcess(rs.getString("WEAVE_PROCESS"));
			ght.setFiberType(rs.getString("FIBER_TYPE"));
			ght.setSilkType(rs.getString("SILK_TYPE"));
			ght.setMulberrySilkContent(rs.getString("MULBERRY_SILK_CONTENT"));
			ght.setNumberCase(rs.getString("NUMBER_CASE"));
			ght.setQuiltOutTexture(rs.getString("QUILT_OUT_TEXTURE"));
			ght.setQuiltInTexture(rs.getString("QUILT_IN_TEXTURE"));
			ght.setQuiltInTextureElement(rs.getString("QUILT_IN_TEXTURE_ELEMENT"));
			ght.setQuiltOutTextureElement(rs.getString("QUILT_OUT_TEXTURE_ELEMENT"));
			ght.setComponentContent(rs.getString("COMPONENT_CONTENT"));
			ght.setBeddingProcess(rs.getString("BEDDING_PROCESS"));
			ght.setLiningNumber(rs.getString("LINING_NUMBER"));
			ght.setLiningDensity(rs.getString("LINING_DENSITY"));
			ght.setPrintingProcess(rs.getString("PRINTING_PROCESS"));
			ght.setDownFeatherType(rs.getString("DOWN_FEATHER_TYPE"));
			ght.setWhiteGoogsDownContent(rs.getString("WHITE_GOOSE_DOWN_CONTENT"));
			ght.setWeight(rs.getString("WEIGHT"));
			ght.setShape(rs.getString("SHAPE"));
			ght.setPillowFabrics(rs.getString("PILLOW_FABRICS"));
			ght.setApplyNumber(rs.getString("APPLY_NUMBER"));
			ght.setCottonClothType(rs.getString("COTTON_CLOTH_TYPE"));
			ght.setFiberHolePillowType(rs.getString("FIBER_HOLE_PILLOW_TYPE"));
			ght.setShadingFunction(rs.getString("SHADING_FUNCTION"));
			ght.setBooleanImport(rs.getString("BOOLEAN_IMPORT"));
			ght.setRawMaterialElement(rs.getString("RAW_MATERIAL_ELEMENT"));
			ght.setChargeUnit(rs.getString("CHARGE_UNIT"));
			ght.setBooleanProcessingAccessoriesFree(rs.getString("BOOLEAN_PROCESSING_ACCESSORIES_FREE"));
			ght.setCurtainTopStyle(rs.getString("CURTAIN_TOP_STYLE"));
			ght.setApplyScene(rs.getString("APPLY_SCENE"));
			ght.setApplySpace(rs.getString("APPLY_SPACE"));
			ght.setSaleWay(rs.getString("SALE_WAY"));
			ght.setRinseType(rs.getString("RINSE_TYPE"));
			ght.setProcess(rs.getString("PROCESS"));
			ght.setStandard(rs.getString("STANDARD"));
			ght.setForNameType(rs.getString("FOR_NAME_TYPE"));
			ght.setCoatTexture(rs.getString("COAT_TEXTURE"));
			ght.setBooleanCustomization(rs.getString("BOOLEAN_CUSTOMIZATION"));
			ght.setPattern(rs.getString("PATTERN"));
		
			
			goodsHomeTextilesList.add(ght);
		}
		
		return goodsHomeTextilesList;
	}

}
