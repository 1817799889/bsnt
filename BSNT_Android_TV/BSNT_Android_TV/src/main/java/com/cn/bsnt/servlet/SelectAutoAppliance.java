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

import com.cn.bsnt.model.GoodsAutoAppliance;
import com.cn.bsnt.model.GoodsCleaning;
import com.cn.bsnt.service.GoodsAutoApplianceService;
import com.cn.bsnt.service.GoodsCleaningService;
import com.cn.bsnt.service.impl.GoodsAutoApplianceServiceImpl;
import com.cn.bsnt.service.impl.GoodsCleaningServiceImpl;

public class SelectAutoAppliance extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		this.doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");

		
		List<GoodsAutoAppliance> goodsAutoApplianceList = new ArrayList<GoodsAutoAppliance>();
		int i;
		String result;
		GoodsAutoApplianceService gaas = new GoodsAutoApplianceServiceImpl();
		try {
			goodsAutoApplianceList = gaas.selectAll();
			if(goodsAutoApplianceList.isEmpty()){
				i=0;
				//result = "{\"rtn\":\"-2\",\"msg\":" + st + "}";
				
			}else{
				i=1;
			}
			result = "{\"state\":"+i+",\"autoApplianceList\":"+goodsAutoApplianceList+"}";
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
