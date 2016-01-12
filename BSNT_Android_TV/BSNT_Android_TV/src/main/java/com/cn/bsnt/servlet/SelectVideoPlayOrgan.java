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

import com.cn.bsnt.model.GoodsVideoPlayOrgan;

import com.cn.bsnt.service.GoodsVideoPlayOrganService;

import com.cn.bsnt.service.impl.GoodsVideoPlayOrganServiceImpl;

@SuppressWarnings("serial")
public class SelectVideoPlayOrgan extends HttpServlet {

	/**
	 * The doGet method of the servlet. <br>
	 * 
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request
	 *            the request send by the client to the server
	 * @param response
	 *            the response send by the server to the client
	 * @throws ServletException
	 *             if an error occurred
	 * @throws IOException
	 *             if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);

	}

	/**
	 * The doPost method of the servlet. <br>
	 * 
	 * This method is called when a form has its tag value method equals to
	 * post.
	 * 
	 * @param request
	 *            the request send by the client to the server
	 * @param response
	 *            the response send by the server to the client
	 * @throws ServletException
	 *             if an error occurred
	 * @throws IOException
	 *             if an error occurred
	 */
	@SuppressWarnings("deprecation")
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		int i;
		String result = null;
		GoodsVideoPlayOrganService gss = new GoodsVideoPlayOrganServiceImpl();
		List<GoodsVideoPlayOrgan> videoPlayList = new ArrayList<GoodsVideoPlayOrgan>();
		videoPlayList = gss.selectAll();
		try {
			if (videoPlayList != null) {
				i = 1;
				result = "{\"state\":\"i\",\"videoPlayOrganList\":"
						+ videoPlayList + "}";
			}

			else {
				result = "{\"state\":\"0\",\"videoPlayOrganList\":"
						+ videoPlayList + "}";
			}
		} catch (Exception e) {
			result = "{\"state\":\"-1\"}";
		}

		JSONArray json = new JSONArray(result);
		Writer writer = response.getWriter();
		writer.write(result);
		writer.flush();

	}

}
