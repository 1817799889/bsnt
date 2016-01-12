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

import com.cn.bsnt.model.GoodsKitchen;
import com.cn.bsnt.service.GoodsKitchenService;
import com.cn.bsnt.service.impl.GoodsKitchenServiceImpl;

public class SelectKitchen extends HttpServlet{

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

		String type = req.getParameter("type");
		List<GoodsKitchen> goodsKitchenList = new ArrayList<GoodsKitchen>();
		int i;
		String result;
		GoodsKitchenService gks = new GoodsKitchenServiceImpl();
		try {
			goodsKitchenList = gks.selectAll(type);
			if(goodsKitchenList.isEmpty()){
				i=0;
				//result = "{\"rtn\":\"-2\",\"msg\":" + st + "}";
				
			}else{
				i=1;
			}
			result = "{\"state\":"+i+",\"kitchenList\":"+goodsKitchenList+"}";
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
