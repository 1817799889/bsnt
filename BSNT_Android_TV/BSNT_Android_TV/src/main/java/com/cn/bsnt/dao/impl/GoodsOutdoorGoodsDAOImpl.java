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
import com.cn.bsnt.model.GoodsOutdoorGoods;
import com.cn.bsnt.model.GoodsSnack;
import com.cn.bsnt.model.User;

/**
 * @author Administrator
 *
 */
public class GoodsOutdoorGoodsDAOImpl implements BaseDAO<GoodsOutdoorGoods> {
	private Connection  conn = null;
	private PreparedStatement para=null;
	private ResultSet rs = null;
	private String sql;
	private List<GoodsOutdoorGoods> GoodsOutdoorGoodskList= new ArrayList<GoodsOutdoorGoods>();

	public int insert(GoodsOutdoorGoods t) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int delete(int id) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int update(GoodsOutdoorGoods t) throws SQLException {
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
   public List<GoodsOutdoorGoods> selectAll() throws SQLException{
	  sql="select * from goods_outdoor_goods";
	   conn=ConnectionManager.getConnection();
	   para=conn.prepareStatement(sql);
	   rs=para.executeQuery();
	   GoodsOutdoorGoods gog=null;
	   while(rs.next()){
		    gog=new GoodsOutdoorGoods();
		    gog.setId(rs.getInt("ID"));
		    gog.setName(rs.getString("NAME"));
		    gog.setPrice(rs.getDouble("PRICE"));
		    gog.setType(rs.getString("TYPE"));
		    gog.setColor(rs.getString("COLOR"));
		    gog.setSize(rs.getString("SIZE"));
		    gog.setBrand(rs.getString("BRAND"));
		    gog.setCount(rs.getString("COUNT"));
		    gog.setMonthSales(rs.getString("MONTH_SALES"));
		    gog.setTotalSales(rs.getString("TOTAL_SALES"));
		    gog.setDesc(rs.getString("DESC"));
		    gog.setFirstCost(rs.getString("FIRST_COST")); 
		    gog.setArtNumber(rs.getString("ART_NUMBER"));
		    gog.setTexture(rs.getString("TEXTURE"));
		    gog.setProductiongArea(rs.getString("PRODUCTIONG_AREA"));
		    gog.setSportsOutdoorProject(rs.getString("SPORTS_OUTDOOR_PROJECT"));
		    gog.setBooleanWaterproof(rs.getString("BOOLEAN_WATERPROOF"));
		    gog.setContinuousLightTime(rs.getString("CONTINUOUS_LIGHT_TIME"));
		    gog.setIrradiationDistance(rs.getString("IRRADIATION_DISTANCE"));
		    gog.setFilletType(rs.getString("FILLET_TYPE"));
		    gog.setBulbKind(rs.getString("BULB_KIND"));
		    gog.setCellStandard(rs.getString("CELL_STANDARD"));
		    gog.setWeight(rs.getString("WEIGHT"));
		    gog.setOutsideTentWaterproofIndex(rs.getString("OUTSIDE_TENT_WATERPROOF_INDEX"));
		    gog.setHolderTexture(rs.getString("HOLDER_TEXTURE"));
		    gog.setOutsideTentTexture(rs.getString("OUTSIDE_TENT_TEXTURE"));
		    gog.setHolderJackstayDiamater(rs.getString("HOLDER_JACKSTAY_DIAMATER"));
		    gog.setHolderJackstay(rs.getString("HOLDER_JACKSTAY"));
		    gog.setPriceSection(rs.getString("PRICE_SECTION"));
		    gog.setRatioType(rs.getString("RATIO_TYPE"));
		    gog.setMaxMultiples(rs.getString("MAX_MULTIPLES"));
		    gog.setFunction(rs.getString("FUNCTION"));
		    gog.setUseWay(rs.getString("USE_WAY"));
		    gog.setTapPosition(rs.getString("TAP_POSITION"));
		    gog.setUseTime(rs.getString("USE_TIME"));
		    gog.setApplyEnvironment(rs.getString("APPLY_ENVIRONMENT"));
		    gog.setMaxHeightLuminance(rs.getString("MAX_HEIGHT_LUMINANCE"));
		    gog.setBooleanFocus(rs.getString("BOOLEAN_FOCUS"));
		    gog.setLength(rs.getString("LENGTH"));
		    gog.setBooleanElectricize(rs.getString("BOOLEAN_ELECTRICIZE"));
		    gog.setMaxGunshot(rs.getString("MAX_GUNSHOT"));
		    gog.setTentSize(rs.getString("TENT_SIZE"));
		    gog.setTentStructure(rs.getString("TENT_STRUCTURE"));
		    gog.setSetUpSituation(rs.getString("SET_UP_SITUATION"));
		    gog.setUnfoldSize(rs.getString("UNFOLD_SIZE"));
		    gog.setApplySeason(rs.getString("APPLY_SEASON"));
		    gog.setTentSpaceStructure(rs.getString("TENT_SPACE_STRUCTURE"));
		    gog.setTentLowTexture(rs.getString("TENT_LOW_TEXTURE"));
		    gog.setTentLowWaterproofIndex(rs.getString("TENT_LOW_WATERPROOF_INDEX"));
		    gog.setApplyNumberPeople(rs.getString("APPLY_NUMBER_PEOPLE"));
		    gog.setStandard(rs.getString("STANDARD"));
		    
		    GoodsOutdoorGoodskList.add(gog);
		    
	   }
	   
	   return GoodsOutdoorGoodskList;
	   
   }
}
