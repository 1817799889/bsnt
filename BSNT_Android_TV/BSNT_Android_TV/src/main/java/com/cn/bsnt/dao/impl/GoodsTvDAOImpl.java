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
import com.cn.bsnt.model.GoodsTv;
import com.cn.bsnt.model.User;

public class GoodsTvDAOImpl implements BaseDAO<GoodsTv>{
	private Connection  conn = null;
	private PreparedStatement para=null;
	private ResultSet rs = null;
	private String sql;
	private List<GoodsTv> goodsTvList= new ArrayList<GoodsTv>();

	public int insert(GoodsTv t) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int delete(int id) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int update(GoodsTv t) throws SQLException {
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
	
	public List<GoodsTv> selectAll() throws SQLException{
		sql ="select * from GOODS_TV";
		conn = ConnectionManager.getConnection();
		para = conn.prepareStatement(sql);
		rs = para.executeQuery();
		GoodsTv gt = null;
		while(rs.next()){
			gt = new GoodsTv();
			gt.setTvId(rs.getInt("TV_ID"));
			gt.setTvName(rs.getString("TV_NAME"));
			gt.setTvPrice(rs.getDouble("TV_PRICE"));
			gt.setTvType(rs.getString("TV_TYPE"));
			gt.setTvColor(rs.getString("TV_COLOR"));
			gt.setTvSize(rs.getString("TV_SIZE"));
			gt.setTvBrand(rs.getString("TV_BRAND"));
			gt.setTvCount(rs.getString("TV_COUNT"));
			gt.setTvMonthSales(rs.getString("TV_MONTH_SALES"));
			gt.setTvTotalSales(rs.getString("TV_TOTAL_SALES"));
			gt.setTvdesc(rs.getString("TV_DESC"));
			gt.setTvResolutionRadio(rs.getString("TV_RESOLUTION_RATIO"));
			gt.setTv3dType(rs.getString("TV_3D_TYPE"));
			gt.setTvEel(rs.getString("TV_EEI"));
			gt.setTvMacOs(rs.getString("TV_MAC_OS"));
			gt.setTvInternetConnectWay(rs.getString("TV_INTERNET_CONNECT_WAY"));
			gt.setTvScanScale(rs.getString("TV_SCRN_SCALE"));
			gt.setTvMold(rs.getString("TV_MOLD"));
			gt.setTvVideoFormat(rs.getString("TV_VIDEO_FORMAT"));
			gt.setTvBackightType(rs.getString("TV_BACKLIGHT_TYPE"));
			gt.setTvScanningMode(rs.getString("TV_SCANNING_MODE"));
			gt.setTvNtsc(rs.getString("TV_NTSC"));
			gt.setTvHdmi(rs.getString("TV_HDMI"));
			gt.setTvPortType(rs.getString("TV_PORT_TYPE"));
			gt.setTvNetNoBelow(rs.getString("TV_NET_NO_BELOW"));
			gt.setTvNetHavaBelow(rs.getString("TV_NET_HAVA_BELOW"));
			gt.setTvPackSize(rs.getString("TV_PACK_SIZE"));
			gt.setTvIncludeRimSize(rs.getString("TV_INCLUDE_RIM_SIZE"));
			gt.setTvRoughWeight(rs.getString("TV_ROUGH_WEIGHT"));
			gt.setTvMainSize(rs.getString("TV_MAIN_SIZE"));
			gt.setTvWrap1(rs.getString("TV_WRAP_1"));
			gt.setTvWrap2(rs.getString("TV_WRAP_2"));
			gt.setTvWrap3(rs.getString("TV_WRAP_3"));
			gt.setTvWrap4(rs.getString("TV_WRAP_4"));
			gt.setTvWrap5(rs.getString("TV_WRAP_5"));
			gt.setTvWrap6(rs.getString("TV_WRAP_6"));
			gt.setTvWrap7(rs.getString("TV_WRAP_7"));
			gt.setFirstCost(rs.getString("FIRST_COST"));
			
			goodsTvList.add(gt);
		}
		return goodsTvList;
	}

}
