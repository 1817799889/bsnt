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
import com.cn.bsnt.model.GoodsCostume;
import com.cn.bsnt.model.User;

public class GoodsCostumeDAOImpl implements BaseDAO<GoodsCostume> {

	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;

	public int insert(GoodsCostume t) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int delete(int id) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int update(GoodsCostume t) throws SQLException {
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

	public List<GoodsCostume> selectAll(String type) {

		List<GoodsCostume> costumeList=new ArrayList<GoodsCostume>();
		conn = ConnectionManager.getConnection();
		try {
			ps = conn
					.prepareStatement("select * from goods_costume where type=?");
			ps.setString(1, type);
			rs = ps.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("ID");
				String name = rs.getString("NAME");
				double price = rs.getDouble("PRICE");
				String type1 = rs.getString("TYPE");
				String color = rs.getString("COLOR");
				String size = rs.getString("SIZE");
				String brand = rs.getString("BRAND");
				String count = rs.getString("count");
				String monthSales = rs.getString("MONTH_SALES");
				String totalSales = rs.getString("TOTAL_SALES");
				String desc = rs.getString("DESC");
				String mold = rs.getString("MOLD");
				String fashion = rs.getString("FASHION");
				String texture = rs.getString("TEXTURE");
				String outsideSleeve = rs.getString("OUTSIDE_SLEEVE");
				String outSeam = rs.getString("OUTSEAM");
				String waistCollarType= rs.getString("WAIST_COLLAR_TYPE");
				String clothesLengths= rs.getString("CLOTHES_LENGTHS");
				String thickness= rs.getString("THICKNESS");
				String clothesPlacket= rs.getString("CLOTHES_PLACKET");
				String clothesModel= rs.getString("CLOTHES_MODEL");
				String skirtModel= rs.getString("SKIRT_MODEL");
				String skirtLength= rs.getString("SKIRT_LENGTH");
				String style= rs.getString("STYLE");
				String craft= rs.getString("CRAFT");
				String applySeason= rs.getString("APPLY_SEASON");
				String applyObject= rs.getString("APPLY_OBJECT");
				String function= rs.getString("FUNCTION");
				String applySex= rs.getString("APPLY_SEX");
				String numberPlies= rs.getString("NUMBER_PLIES");
				String waistType= rs.getString("WAIST_TYPE");
				String booleanSteelRim= rs.getString("BOOLEAN_STEEL_RIM");
				String fastenerNumber= rs.getString("FASTENER_NUMBER");
				String illustration= rs.getString("ILLUSTRATION");
				String cupLiningOut= rs.getString("CUP_LINING_OUT");
				String cupLiningIn= rs.getString("CUP__LINING_IN");
				String flankLiningOut= rs.getString("FLANK_LINING_OUT");
				String flankLiningIn= rs.getString("FLANK_LINING_IN");
				String mouldCupLining= rs.getString("MOULD_CUP_LINING");
				String booleanCap= rs.getString("BOOLEAN_CAP");
				String groupForm= rs.getString("GROUP_FORM");
				String bodyHeight= rs.getString("BODY_HEIGHT");
				String firstCost=rs.getString("FIRST_COST");
				GoodsCostume gs=new GoodsCostume(id, name, price, type1, color, size, brand, count, monthSales, totalSales, desc, firstCost, mold, fashion, texture, outsideSleeve, outSeam, waistCollarType, clothesLengths, thickness, clothesPlacket, clothesModel, skirtModel, skirtLength, style, craft, applySeason, applyObject, function, applySex, numberPlies, waistType, booleanSteelRim, fastenerNumber, illustration, cupLiningOut, cupLiningIn, flankLiningOut, flankLiningIn, mouldCupLining, booleanCap, groupForm, bodyHeight);
				costumeList.add(gs);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try {
				rs.close();
				ps.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return costumeList;
	}

}
