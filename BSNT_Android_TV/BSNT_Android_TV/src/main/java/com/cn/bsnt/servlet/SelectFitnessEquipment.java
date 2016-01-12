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

import com.cn.bsnt.model.GoodsFitnessEquipment;
import com.cn.bsnt.model.GoodsWasher;
import com.cn.bsnt.service.GoodsFitnessEquipmentService;
import com.cn.bsnt.service.GoodsWasherService;
import com.cn.bsnt.service.impl.GoodsFitnessEquipmentServiceImpl;
import com.cn.bsnt.service.impl.GoodsWasherServiceImpl;

public class SelectFitnessEquipment extends HttpServlet{
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
			GoodsFitnessEquipmentService gws = new GoodsFitnessEquipmentServiceImpl();
			List<GoodsFitnessEquipment> goodsfitnessEquipmentList = new ArrayList<GoodsFitnessEquipment>();
			if(goodsfitnessEquipmentList!=null){
				i=1;
				result = "{\"state\":\"i\",\"fitnessEquipmentList\":" + goodsfitnessEquipmentList + "}";
			}else{
				result = "{\"state\":\"0\",\"fitnessEquipmentList\":" + goodsfitnessEquipmentList + "}";
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
