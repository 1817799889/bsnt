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

import com.cn.bsnt.model.GoodsWaterFountain;
import com.cn.bsnt.service.GoodsTeaWineService;
import com.cn.bsnt.service.GoodsWaterFountainService;
import com.cn.bsnt.service.impl.GoodsTeaWineServiceImpl;
import com.cn.bsnt.service.impl.GoodsWaterFountainServiceImpl;

public class GoodsTeaWine extends HttpServlet{
    
	   @Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(req, resp);
	}
	   
	   @SuppressWarnings("unused")
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		   req.setCharacterEncoding("utf-8");
		   resp.setCharacterEncoding("utf-8");
			int i;
			String result =null;
			try {
				GoodsTeaWineService gwf = new GoodsTeaWineServiceImpl();
				List<GoodsTeaWine> goodsTeaWineList = new ArrayList<GoodsTeaWine>();
				if(goodsTeaWineList!=null){
					i=1;
					result = "{\"state\":\"i\",\"teaWineList\":" + goodsTeaWineList + "}";
				}else{
					result = "{\"state\":\"0\",\"teaWineList\":" + goodsTeaWineList + "}";
				}
				
			} catch (Exception e) {
				result = "{\"state\":\"-1\"}";
			}
			
			JSONArray json = new JSONArray(result);
			
			Writer writer = resp.getWriter();
			writer.write(result);
			writer.close();
	}
}
