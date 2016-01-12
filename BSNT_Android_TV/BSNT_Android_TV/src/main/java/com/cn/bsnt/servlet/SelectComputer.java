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

import com.cn.bsnt.model.GoodsCostume;
import com.cn.bsnt.service.GoodsCostumeService;
import com.cn.bsnt.service.impl.GoodsCostumeServiceImpl;

@SuppressWarnings("serial")
public class SelectComputer extends HttpServlet {


	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	@SuppressWarnings("deprecation")
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		int i;
		String type=request.getParameter("type");
		String result=null;
		GoodsCostumeService gss=new GoodsCostumeServiceImpl(); 
		List<GoodsCostume> goodsCosmputerList=new ArrayList<GoodsCostume>();
		goodsCosmputerList=gss.selectAll(type);
		try{
			if(goodsCosmputerList!=null)
			{
				i=1;
				result="{\"state\":\"i\",\"computerList\":"+goodsCosmputerList+"}";
			}
		
			else{
				result="{\"state\":\"0\",\"computerList\":"+goodsCosmputerList+"}";
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
