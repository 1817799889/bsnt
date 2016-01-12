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



import com.cn.bsnt.model.GoodsOfficeStationary;
import com.cn.bsnt.service.GoodsOfficeStationaryService;
import com.cn.bsnt.service.impl.GoodsOfficeStationaryServiceImpl;

@SuppressWarnings("serial")
public class SelectOfficeStationary extends HttpServlet {

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		 doPost(request, response);
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	@SuppressWarnings("unused")
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		int i;
		String result=null;
		GoodsOfficeStationaryService gos=new GoodsOfficeStationaryServiceImpl(); 
		List<GoodsOfficeStationary> officeList=new ArrayList<GoodsOfficeStationary>();
		officeList=gos.selectAll();
		try{
			if(officeList!=null)
			{
				i=1;
				result="{\"state\":\"i\",\"officeStationaryList\":"+officeList+"}";
			}
		
			else{
				result="{\"state\":\"0\",\"officeStationaryList\":"+officeList+"}";
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
	}

}
