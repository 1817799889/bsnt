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
import com.cn.bsnt.model.GoodsAgriculturesUseArticles;
import com.cn.bsnt.model.User;

public class GoodsAgriculturesUseArticlesDAOImpl implements BaseDAO<GoodsAgriculturesUseArticles>{

	Connection conn=null;
	PreparedStatement ps=null;
	ResultSet rs=null;
	public int insert(GoodsAgriculturesUseArticles t) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int delete(int id) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int update(GoodsAgriculturesUseArticles t) throws SQLException {
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
	public List<GoodsAgriculturesUseArticles> selectAll()
	{
		List<GoodsAgriculturesUseArticles> agriculturesUseArticlesList=new ArrayList<GoodsAgriculturesUseArticles>();
		conn=ConnectionManager.getConnection();
		try {
			ps=conn.prepareStatement("select * from goods_agricultures_use_articles");
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
				 String virulence=rs.getString("VIRULENCE");
				 String pesiticideType=rs.getString("PESTICIDE_TYPE");
				 String netContent=rs.getString("NET_CONTENT");
				 String preparationFormulation=rs.getString("PREPARATION_FORMULATION");
				 String applyObject=rs.getString("APPLY_OBJECT");
				 String feature=rs.getString("FEATURE");
				 String pesiticideElement=rs.getString("PESTICIDE_ELEMENT");
				 String content=rs.getString("CONTENT");
				 String purpose=rs.getString("PURPOSE");
				 String productionEnterprise=rs.getString("PRODUCTION_ENTERPRISE");
				 String usageDosage=rs.getString("USAGE_DOSAGE");
				 String useRange=rs.getString("USE_RANGE");
				 String defaultDelivery=rs.getString("DEFAULT_DELIVERY");
				 String feedstuffType=rs.getString("FEEDSTUFF_TYPE");
				 String feedstuffAdditive=rs.getString("FEEDSTUFF_ADDITIVE");
				 String artNumber=rs.getString("ART_NUMBER");
				 String fullFooder=rs.getString("FULL_FOODER");
				 String dispatching=rs.getString("DISPATCHING");
				 String concentratedFeed=rs.getString("CONCENTRATED_FEED");
				 String gradenSeedVarieties=rs.getString("GRADEN_SEED_VARIETIES");
				 String seedtime=rs.getString("SEEDTIME");
				 String booleanImport=rs.getString("BOOLEAN_IMPORT");
				 String fullBloomStage=rs.getString("FULL_BLOOM_STAGE");
				 String seedType=rs.getString("SEED_TYPE");
				 String breedWay=rs.getString("BREED_WAY");
				 String seedAge=rs.getString("SEED_AGE");
				 String animialKind=rs.getString("ANIMIAL_KIND");
				 String maieFemale=rs.getString("MAIE_FEMALE");
				 String vegetableSeedKind=rs.getString("VEGETABLE_SEED_KIND");
				 String cultivarPurity=rs.getString("CULTIVAR_PURITY");
				 String seedLevel=rs.getString("SEED_LEVEL");
				 String complexity=rs.getString("COMPLEXITY");
				 String bloomSeason=rs.getString("BLOOM_SEASON");
				 String packageWay=rs.getString("PACKAGE_WAY");
				 String plantVarieties=rs.getString("PLANT_VARIETIES");
				 String plantGrowthChracteristic=rs.getString("PLANT_GROWTH_CHRACTERISTIC");
				 String nutritiveValue=rs.getString("NUTRITIVE_VALUE");
				 String fruitSeedKind=rs.getString("FRUIT_SEED_KIND");
				 String grainOilSeesKind=rs.getString("GRAIN_OIL_SEED_KIND");
				 String salelArea=rs.getString("SALEL_AREA");
				 String ripeCycle=rs.getString("RIPE_CYCLE");
				 String medicinalSeedKind=rs.getString("MEDICINAL_SEED_KIND");
				 String edibleMushroomsKind=rs.getString("EDIBLE_MUSHROOMS_KIND");
				 String thinFilmType=rs.getString("THIN_FILM_TYPE");
				 String standard=rs.getString("STANDARD");
				 String thinFilmTexture=rs.getString("THIN_FILM_TEXTURE");
				 String thinFilmCharacter=rs.getString("THIN_FILM_CHARACTER");
				 String fertilizerElement=rs.getString("FERTILIZER_ELEMENT");
				 String productDescription=rs.getString("PRODUCT_DESCRIPTION");
				 String effect=rs.getString("EFFECT");
				 String storageMode=rs.getString("STORAGE_MODE");
				 String storageTime=rs.getString("STORAGE_TIME");
				 String mainElement=rs.getString("MAIN_ELEMENT");
				 String Package=rs.getString("PACKAGE");
				 String character=rs.getString("CHARACTER");
				 String adaptationDisease=rs.getString("ADAPTATION_DISEASE");
				 String attentionNeedMatters=rs.getString("ATTENTION_NEED_MATTERS");
				 String withdrawalTime=rs.getString("WITHDRAWAL_TIME");
				 String storeUp=rs.getString("STORE_UP");
				 String drugClassfication=rs.getString("DRUG_CLASSFICATION");
				 String drugCategory=rs.getString("DRUG_CATEGORY");
				 String periodValidity=rs.getString("PERIOD_VALIDITY");
				 String aBox=rs.getString("A_BOX");
				 String aPiece=rs.getString("A_PIECE");
				 String useWay=rs.getString("USE_WAY");
				 String majorFunction=rs.getString("MAJOR_FUNCTION");
				 String withdrawalPeriod=rs.getString("WITHDRAWAL_PERIOD");
				 GoodsAgriculturesUseArticles ga=new GoodsAgriculturesUseArticles(id, name, price, type, color, size, brand, count, monthSales, totalSales, desc, firstCost, virulence, pesiticideType, netContent, preparationFormulation, applyObject, feature, pesiticideElement, content, purpose, productionEnterprise, usageDosage, useRange, defaultDelivery, feedstuffType, feedstuffAdditive, artNumber, fullFooder, dispatching, concentratedFeed, gradenSeedVarieties, seedtime, booleanImport, fullBloomStage, seedType, breedWay, seedAge, animialKind, maieFemale, vegetableSeedKind, cultivarPurity, seedLevel, complexity, bloomSeason, packageWay, plantVarieties, plantGrowthChracteristic, nutritiveValue, fruitSeedKind, grainOilSeesKind, salelArea, ripeCycle, medicinalSeedKind, edibleMushroomsKind, thinFilmType, standard, thinFilmTexture, thinFilmCharacter, fertilizerElement, productDescription, effect, storageMode, storageTime, mainElement, Package, character, adaptationDisease, attentionNeedMatters, withdrawalTime, storeUp, drugClassfication, drugCategory, periodValidity, aBox, aPiece, useWay, majorFunction, withdrawalPeriod);
				 agriculturesUseArticlesList.add(ga);
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
		return agriculturesUseArticlesList;
	}
	

}
