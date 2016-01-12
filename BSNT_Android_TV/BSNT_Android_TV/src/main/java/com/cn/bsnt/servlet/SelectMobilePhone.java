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

import com.cn.bsnt.model.GoodsCostume;
import com.cn.bsnt.model.GoodsMobilePhone;
import com.cn.bsnt.service.GoodsCostumeService;
import com.cn.bsnt.service.GoodsMobilePhoneService;
import com.cn.bsnt.service.impl.GoodsCostumeServiceImpl;
import com.cn.bsnt.service.impl.GoodsMobilePhoneServiceImpl;

public class SelectMobilePhone extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		int i;
		String result=null;
		GoodsMobilePhoneService gss=new GoodsMobilePhoneServiceImpl(); 
		List<GoodsMobilePhone> goodsMobileList=new ArrayList<GoodsMobilePhone>();
		goodsMobileList=gss.selectAll();
		try{
			if(goodsMobileList!=null)
			{
				i=1;
				result="{\"state\":\"i\",\"mobilePhoneList\":"+goodsMobileList+"}";
			}
		
			else{
				result="{\"state\":\"0\",\"mobilePhoneList\":"+goodsMobileList+"}";
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
