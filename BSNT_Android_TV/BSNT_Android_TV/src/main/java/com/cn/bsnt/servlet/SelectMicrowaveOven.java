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

import com.cn.bsnt.model.GoodsMicrowaveOven;
import com.cn.bsnt.service.GoodsMicrowaveOvenService;
import com.cn.bsnt.service.impl.GoodsMicrowaveOvenServiceImpl;

public class SelectMicrowaveOven extends HttpServlet{

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
	    req.setCharacterEncoding("UTF-8");
	    resp.setCharacterEncoding("UTF-8");
	    int i;
	    String result=null;
	    try {
	    GoodsMicrowaveOvenService gmos=new GoodsMicrowaveOvenServiceImpl();
	    
	         List<GoodsMicrowaveOven> goodsMicrowaveOvenList=new ArrayList<GoodsMicrowaveOven>();
	         if(goodsMicrowaveOvenList!=null){
	  				i=1;
	  				result = "{\"state\":\"i\",\"microwaveOvenList\":" + goodsMicrowaveOvenList + "}";
	  			}else{
	  				result = "{\"state\":\"0\",\"microwaveOvenList\":" + goodsMicrowaveOvenList + "}";
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
