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
import com.cn.bsnt.model.GoodsRiceCooker;
import com.cn.bsnt.model.GoodsTv;
import com.cn.bsnt.model.GoodsWasher;
import com.cn.bsnt.model.User;

public class GoodsRiceCookerDAOImpl implements BaseDAO<GoodsRiceCooker>{
	private Connection  conn = null;
	private PreparedStatement para=null;
	private ResultSet rs = null;
	private String sql;
	private List<GoodsRiceCooker> goodsRiceCookerList= new ArrayList<GoodsRiceCooker>();

	public int insert(GoodsRiceCooker t) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int delete(int id) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int update(GoodsRiceCooker t) throws SQLException {
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
        public List<GoodsRiceCooker> selectAll() throws SQLException{
			sql="select * from goods_rice_cooker";
			conn=ConnectionManager.getConnection();
			para=conn.prepareStatement(sql);
			rs=para.executeQuery();
			GoodsRiceCooker grc=null;
			while(rs.next()){
				grc=new GoodsRiceCooker();
				grc.setId(rs.getInt("ID"));
				grc.setName(rs.getString("NAME"));
				grc.setPrice(rs.getDouble("PRICE"));
				grc.setType(rs.getString("PRICE"));
				grc.setColor(rs.getString("COLOR"));
				grc.setSize(rs.getString("SIZE"));
				grc.setBrand(rs.getString("BRAND"));
				grc.setCount(rs.getString("COUNT"));
				grc.setMonthSales(rs.getString("MONTH_SALES"));
				grc.setTotalSales(rs.getString("TOTAL_SALES"));
				grc.setDesc(rs.getString("DESC"));
				grc.setMold(rs.getString("MOLD"));
				grc.setPower(rs.getString("POWER"));
				grc.setInnerTankTexture(rs.getString("INNER_TANK_TEXTURE"));
				grc.setVoltage(rs.getString("VOLTAGE"));
				grc.setWarmType(rs.getString("WARM_TYPE"));
				grc.setShapeSize(rs.getString("SHAPE_SIZE"));
				grc.setShape(rs.getString("SHAPE"));
				grc.setFirstCost(rs.getString("FIRST_COST"));
				
				goodsRiceCookerList.add(grc);
				
				
				
			}
        	return goodsRiceCookerList;
       
        	
        }
}
