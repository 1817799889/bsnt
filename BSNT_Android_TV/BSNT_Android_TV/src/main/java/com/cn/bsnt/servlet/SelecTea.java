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

import com.cn.bsnt.model.GoodsIcebox;
import com.cn.bsnt.model.GoodsTea;
import com.cn.bsnt.service.GoodsIceboxService;
import com.cn.bsnt.service.GoodsTeaService;
import com.cn.bsnt.service.impl.GoodsIceboxServiceImpl;
import com.cn.bsnt.service.impl.GoodsTeaServiceImpl;

public class SelecTea extends HttpServlet {
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
  			GoodsTeaService gts = new GoodsTeaServiceImpl();
  			List<GoodsTea> goodsTeaList = new ArrayList<GoodsTea>();
  			if(goodsTeaList!=null){
  				i=1;
  				result = "{\"state\":\"i\",\"eaList\":" + goodsTeaList + "}";
  			}else{
  				result = "{\"state\":\"0\",\"eaList\":" + goodsTeaList + "}";
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
