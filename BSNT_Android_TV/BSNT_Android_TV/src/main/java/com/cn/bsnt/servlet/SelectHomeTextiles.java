package com.cn.bsnt.servlet;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;

import com.cn.bsnt.model.GoodsHomeTextiles;
import com.cn.bsnt.service.GoodsHomeTextilesService;
import com.cn.bsnt.service.impl.GoodsHomeTextilesServiceImpl;

public class SelectHomeTextiles extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");

		String type = req.getParameter("type");
		List<GoodsHomeTextiles> goodsHomeTextilesList = new ArrayList<GoodsHomeTextiles>();
		int i;
		String result;
		GoodsHomeTextilesService ghts = new GoodsHomeTextilesServiceImpl();
		try {
			goodsHomeTextilesList = ghts.selectAll(type);
			if(goodsHomeTextilesList.isEmpty()){
				i=0;
				//result = "{\"rtn\":\"-2\",\"msg\":" + st + "}";
				
			}else{
				i=1;
			}
			result = "{\"state\":"+i+",\"homeTextilesList\":"+goodsHomeTextilesList+"}";
		} catch (Exception e) {
			i=-1;
			result ="{\"state\":"+i+"}";
		}
		
		JSONArray json = new JSONArray(result);
		Writer writer = resp.getWriter();
		writer.write(json.toString());
		writer.close();
	}
	
	

}
