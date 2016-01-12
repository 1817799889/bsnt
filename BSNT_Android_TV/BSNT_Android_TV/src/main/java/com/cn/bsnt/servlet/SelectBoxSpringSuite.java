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

import com.cn.bsnt.model.GoodsBoxSpringSuite;
import com.cn.bsnt.service.GoodsBoxSpringSuiteService;
import com.cn.bsnt.service.impl.GoodsBoxSpringSuiteServiceImpl;

public class SelectBoxSpringSuite extends HttpServlet{

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

		List<GoodsBoxSpringSuite> goodsBoxSpringSuiteList = new ArrayList<GoodsBoxSpringSuite>();
		int i;
		String result;
		GoodsBoxSpringSuiteService gbsss = new GoodsBoxSpringSuiteServiceImpl();
		try {
			goodsBoxSpringSuiteList = gbsss.selectAll();
			if(goodsBoxSpringSuiteList.isEmpty()){
				i=0;
				//result = "{\"rtn\":\"-2\",\"msg\":" + st + "}";
				
			}else{
				i=1;
			}
			result = "{\"state\":"+i+",\"boxSpringSuiteList\":"+goodsBoxSpringSuiteList+"}";
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
