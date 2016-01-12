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
import com.cn.bsnt.model.GoodsHomeFurnishingArticles;
import com.cn.bsnt.model.GoodsKitchen;
import com.cn.bsnt.model.User;

public class GoodsHomeFurnishingArticlesDAOImpl implements BaseDAO<GoodsHomeFurnishingArticles>{

	private Connection  conn = null;
	private PreparedStatement para=null;
	private ResultSet rs = null;
	private String sql;
	private List<GoodsHomeFurnishingArticles> goodsHomeFurnishingArticlesList = new ArrayList<GoodsHomeFurnishingArticles>();
	
	public int insert(GoodsHomeFurnishingArticles t) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int delete(int id) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int update(GoodsHomeFurnishingArticles t) throws SQLException {
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
	
	public List<GoodsHomeFurnishingArticles> selectAll() throws SQLException{
		conn = ConnectionManager.getConnection();
		sql="select * from goods_home_furnishing_articles";
		para = conn.prepareStatement(sql);
		rs = para.executeQuery();
		GoodsHomeFurnishingArticles ghfa = null;
		while(rs.next()){
			ghfa = new GoodsHomeFurnishingArticles();
			
			ghfa.setId(rs.getInt("ID"));
			ghfa.setName(rs.getString("NAME"));
			ghfa.setPrice(rs.getDouble("PRICE"));
			ghfa.setType(rs.getString("TYPE"));
			ghfa.setColor(rs.getString("COLOR"));
			ghfa.setSize(rs.getString("SIZE"));
			ghfa.setBrand(rs.getString("BRAND"));
			ghfa.setCount(rs.getString("COUNT"));
			ghfa.setMonthSales(rs.getString("MONTH_SALES"));
			ghfa.setTotalSales(rs.getString("TOTAL_SALES"));
			ghfa.setDesc(rs.getString("DESC"));
			ghfa.setFirstCost(rs.getString("FIRST_COST"));
			ghfa.setTexture(rs.getString("TEXTURE"));
			ghfa.setStyle(rs.getString("STYLE"));
			ghfa.setFunction(rs.getString("FUNCTION"));
			ghfa.setArticleNumber(rs.getString("ARTICLE_NUMBER"));
			ghfa.setAppearanceMoiding(rs.getString("APPEARANCE_MOIDING"));
			ghfa.setApplySpace(rs.getString("APPLY_SPACE"));
			ghfa.setFloralOrganType(rs.getString("FLORAL_ORGAN_TYPE"));
			ghfa.setCombiningForm(rs.getString("COMBINING_FORM"));
			ghfa.setPutSpace(rs.getString("PUT_SPACE"));
			ghfa.setArtificialFlowerType(rs.getString("ARTIFICIAL_FLOWER_TYPE"));
			ghfa.setFlowersAre(rs.getString("FLOWERS_ARE"));
			ghfa.setBooleanTwoSide(rs.getString("BOOLEAN_TWO_SIDE"));
			ghfa.setPackingVolume(rs.getString("PACKING_VOLUME"));
			ghfa.setGrossWeight(rs.getString("GROSS_WEIGHT"));
			ghfa.setShellTexture(rs.getString("SHELL_TEXTURE"));
			ghfa.setMirrorFaceTexture(rs.getString("MIRROR_FACE_TEXTURE"));
			ghfa.setDialPlateTexture(rs.getString("DIAL_PLATE_TEXTURE"));
			ghfa.setMovementBrand(rs.getString("MOVEMENT_BRAND"));
			ghfa.setMovementType(rs.getString("MOVEMENT_TYPE"));
			ghfa.setPowerType(rs.getString("POWER_TYPE"));
			ghfa.setAfterSaleService(rs.getString("AFTER_SALE_SERVICE"));
			ghfa.setWidthNumber(rs.getString("WIDTH_NUMBER"));
			ghfa.setPaintingCoreTexture(rs.getString("PAINTING_CORE_TEXTURE"));
			ghfa.setMountWay(rs.getString("MOUNT_WAY"));
			ghfa.setOutlineBorderTexture(rs.getString("OUTLINE_BORDER_TEXTURE"));
			ghfa.setPattern(rs.getString("PATTERN"));
			ghfa.setProcess(rs.getString("PROCESS"));
			ghfa.setThickness(rs.getString("THICKNESS"));
			ghfa.setPictureForm(rs.getString("PICTURE_FORM"));
			ghfa.setPictureFrameNumber(rs.getString("PICTURE_FRAME_NUMBER"));
			ghfa.setWidth(rs.getString("WIDTH"));
			ghfa.setCamboType(rs.getString("CAMBO_TYPE"));
			ghfa.setFurnishingArticlesType(rs.getString("FURNISHING_ARTICLES_TYPE"));
			
			
			
			goodsHomeFurnishingArticlesList.add(ghfa);
		}
		return goodsHomeFurnishingArticlesList;
	}

}
