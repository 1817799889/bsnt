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
import com.cn.bsnt.model.GoodsOtherElectricAppliance;

import com.cn.bsnt.service.GoodsOtherelectricApplianceService;

import com.cn.bsnt.service.impl.GoodsOtherelectricApplianceServiceImpl;

public class SelectOtherElectricAppliance extends HttpServlet{

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
	
	  @SuppressWarnings("unused")
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		  req.setCharacterEncoding("utf-8");
  		resp.setCharacterEncoding("utf-8");
  		int i;
  		String result =null;
  		try {
  			GoodsOtherelectricApplianceService  geas= new GoodsOtherelectricApplianceServiceImpl();
  			List<GoodsOtherElectricAppliance> GoodsOtherElectricApplianceList = new ArrayList<GoodsOtherElectricAppliance>();
  			if(GoodsOtherElectricApplianceList!=null){
  				i=1;
  				result = "{\"state\":\"i\",\"otherElectricApplianceList\":" + GoodsOtherElectricApplianceList + "}";
  			}else{
  				result = "{\"state\":\"0\",\"otherElectricApplianceList\":" + GoodsOtherElectricApplianceList + "}";
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
