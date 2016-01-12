package com.cn.bsnt.dao.impl;

import java.sql.Array;
import java.sql.Blob;
import java.sql.CallableStatement;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.NClob;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Savepoint;
import java.sql.Statement;
import java.sql.Struct;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Executor;

import org.omg.Dynamic.Parameter;

import com.cn.bsnt.dao.BaseDAO;
import com.cn.bsnt.dbhelper.ConnectionManager;
import com.cn.bsnt.model.GoodsSportGoods;
import com.cn.bsnt.model.GoodsWasher;
import com.cn.bsnt.model.User;

public class GoodsSportGoodsDAOImpl implements BaseDAO<GoodsSportGoods> {
	private Connection  conn = null;
	private PreparedStatement para=null;
	private ResultSet rs = null;
	private String sql;
	private List<GoodsSportGoods> goodsSportGoodsList= new ArrayList<GoodsSportGoods>();
	
	public int insert(GoodsSportGoods t) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int delete(int id) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int update(GoodsSportGoods t) throws SQLException {
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
  public List<GoodsSportGoods> selectAll() throws SQLException{
	   sql="select * from goods_sport_goods";
	   conn=ConnectionManager.getConnection();
	   para=conn.prepareStatement(sql);
	   rs=para.executeQuery();
	   GoodsSportGoods gpg=null;
	   while(rs.next()){
		   gpg=new GoodsSportGoods();
		   gpg.setId(rs.getInt("ID"));
		   gpg.setName(rs.getString("NAME"));
		   gpg.setPrice(rs.getDouble("PRICE"));
		   gpg.setType(rs.getString("PRICE"));
		   gpg.setColor(rs.getString("COLOR"));
		   gpg.setSize(rs.getString("SIZE"));
		   gpg.setBrand(rs.getString("BRAND"));
		   gpg.setCount(rs.getString("COUNT"));
		   gpg.setMonthSales(rs.getString("MONTH_SALES"));
		   gpg.setTotalSales(rs.getString("TOTAL_SALES"));
		   gpg.setDesc(rs.getString("DESC"));
		   gpg.setFirstCost(rs.getString("FIRST_COST"));
		   gpg.setBadmintonGameClassication(rs.getString("BADMINTON_GAME_CLASSIFICATION"));
		   gpg.setShaftHardness(rs.getString("SHAFT_HARDNESS"));
		   gpg.setShaftThickness(rs.getString("SHAFT_THICKNESS"));
		   gpg.setTexture(rs.getString("TEXTURE"));
		   gpg.setWeight(rs.getString("WEIGHT"));
		   gpg.setApplyObject(rs.getString("APPLY_OBJECT"));
		   gpg.setGripSize(rs.getString("GRIP_SIZE"));
		   gpg.setRacquetsFaceClassify(rs.getString("RACQUETS_FACE_CLASSIFY"));
		   gpg.setLongShotClassification(rs.getString("LONG_SHOT_CLASSIFICATION"));
		   gpg.setShape(rs.getString("SHAPE"));
		   gpg.setRacketHardness(rs.getString("RACKET_HARDNESS"));
		   gpg.setThickness(rs.getString("THICKNESS"));
		   gpg.setBallClassification(rs.getString("BALL_CLASSIFICATION"));
		   gpg.setStandard(rs.getString("STANDARD"));
		   gpg.setArtNumber(rs.getString("ART_NUMBER"));
		   gpg.setFootballStitching(rs.getString("FOOTBALL_STITCHING"));
		   gpg.setNumber(rs.getString("NUMBER"));
		   gpg.setStartLevel(rs.getString("START_LEVEL"));
		   gpg.setYasakaType(rs.getString("YASAKA_TYPE"));
		   gpg.setGripWay(rs.getString("GRIP_WAY"));
		   
		   goodsSportGoodsList.add(gpg);
   
	   }
			
	

	  
	  return goodsSportGoodsList;
	  
  }
}
