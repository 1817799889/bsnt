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
import com.cn.bsnt.model.GoodsVideoPlayOrgan;
import com.cn.bsnt.model.User;

public class GoodsVideoPlayOrganDAOImpl implements BaseDAO<GoodsVideoPlayOrgan>{

	Connection conn=null;
	PreparedStatement ps=null;
	ResultSet rs=null;
	public int insert(GoodsVideoPlayOrgan t) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int delete(int id) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int update(GoodsVideoPlayOrgan t) throws SQLException {
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
	public List<GoodsVideoPlayOrgan> selectAll()
	{
		List<GoodsVideoPlayOrgan> videoPlayOrganList=new ArrayList<GoodsVideoPlayOrgan>();
	    conn=ConnectionManager.getConnection();
	    try {
			ps=conn.prepareStatement("select * from goods_video_play_organ");
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
				 String factoryprice=rs.getString("FACTORY_PRICE");
				 String audioPlayFormat=rs.getString("AUDIO_PLAY_FORMAT");
				 String memoryCapacity=rs.getString("MEMORY_CAPACITY");
				 String displayScreenType=rs.getString("DISPLAY_SCREEN_TYPE");
				 String memoryType=rs.getString("MEMORY_TYPE");
				 String videoPlayFormat=rs.getString("VIDEO_PLAY_FORMAT");
				 String cellSpec=rs.getString("CELL_SPEC");
				 String recordPen=rs.getString("RECORD_PEN");
				 String textBrowse=rs.getString("TEXT_BROWSE");
				 String imageBrowse=rs.getString("IMAGE_BROWSE");
				 GoodsVideoPlayOrgan gvpo=new GoodsVideoPlayOrgan(id, name, price, type, color, size, brand, count, monthSales, totalSales, desc, factoryprice, audioPlayFormat, memoryCapacity, displayScreenType, memoryType, videoPlayFormat, cellSpec, recordPen, textBrowse, imageBrowse);
				 videoPlayOrganList.add(gvpo);
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
	    return videoPlayOrganList;
	}

}
