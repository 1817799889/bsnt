package com.cn.bsnt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;

import com.cn.bsnt.model.GoodsLuggage;
import com.cn.bsnt.model.GoodsShoes;
import com.cn.bsnt.service.GoodsLuggageService;
import com.cn.bsnt.service.GoodsShoesService;
import com.cn.bsnt.service.impl.GoodsLuggageServiceImpl;
import com.cn.bsnt.service.impl.GoodsShoesServiceImpl;

public class SelectRelaxationShoes extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request,response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		int i;
		String type=request.getParameter("type");
		String result=null;
		GoodsLuggageService gls=new GoodsLuggageServiceImpl(); 
		List<GoodsLuggage> goodsCostumeList=new ArrayList<GoodsLuggage>();
		goodsCostumeList=gls.selectAll(type);
		try{
			if(goodsCostumeList!=null)
			{
				i=1;
				result="{\"state\":\"i\",\"luggageList\":"+goodsCostumeList+"}";
			}
		
			else{
				result="{\"state\":\"0\",\"luggageList\":"+goodsCostumeList+"}";
			}
		}
		catch(Exception e){
			result="{\"state\":\"-1\"}";
		}
		
		JSONArray json=new JSONArray(result);
		Writer writer=response.getWriter();
		writer.write(result);
		writer.flush();
		writer.close();
	}

}
