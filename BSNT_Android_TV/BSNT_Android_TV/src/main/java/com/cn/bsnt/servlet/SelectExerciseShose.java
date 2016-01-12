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

import com.cn.bsnt.model.GoodsShoes;
import com.cn.bsnt.service.GoodsShoesService;
import com.cn.bsnt.service.impl.GoodsShoesServiceImpl;

@SuppressWarnings("serial")
public class SelectExerciseShose extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doPost(request, response);
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		int i;
		String type=request.getParameter("type");
		String result=null;
		GoodsShoesService gss=new GoodsShoesServiceImpl(); 
		List<GoodsShoes> goodsShoesList=new ArrayList<GoodsShoes>();
		goodsShoesList=gss.selectAll(type);
		try{
			if(goodsShoesList!=null)
			{
				i=1;
				result="{\"state\":\"i\",\"shoseList\":"+goodsShoesList+"}";
			}
		
			else{
				result="{\"state\":\"0\",\"shoseList\":"+goodsShoesList+"}";
			}
		}
		catch(Exception e){
			result="{\"state\":\"-1\"}";
		}
		
		@SuppressWarnings("deprecation")
		JSONArray json=new JSONArray(result);
		Writer writer=response.getWriter();
		writer.write(result);
		writer.flush();
		writer.close();
	}


}
