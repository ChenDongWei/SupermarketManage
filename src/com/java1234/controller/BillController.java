package com.java1234.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.java1234.entity.Bill;
import com.java1234.entity.PageBean;
import com.java1234.entity.Bill;
import com.java1234.service.BillService;
import com.java1234.util.ResponseUtil;
import com.java1234.util.StringUtil;

/**
 * 订单Controller层
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/bill")
public class BillController {
	
	@Resource
	private BillService billService;
	
	
	/**
	 * 分页条件查询订单
	 * @param page
	 * @param rows
	 * @param s_bill
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/list")
	public String list(@RequestParam(value="page",required=false)String page,@RequestParam(value="rows",required=false)String rows,Bill s_bill,HttpServletResponse response)throws Exception{
		PageBean pageBean=new PageBean(Integer.parseInt(page),Integer.parseInt(rows));
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("productName", StringUtil.formatLike(s_bill.getProductName()));
		map.put("providerId",s_bill.getProviderId());
		map.put("start", pageBean.getStart());
		map.put("size", pageBean.getPageSize());
		List<Bill> billList=billService.find(map);
		Long total=billService.getTotal(map);
		JSONObject result=new JSONObject();
		JSONArray jsonArray=JSONArray.fromObject(billList);
		result.put("rows", jsonArray);
		result.put("total", total);
		ResponseUtil.write(response, result);
		return null;
	}
	
	/**
	 * 通过ID查找实体
	 * @param id
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/findById")
	public String findById(@RequestParam(value="id")String id,HttpServletResponse response)throws Exception{
		Bill bill=billService.findById(Integer.parseInt(id));
		JsonConfig jsonConfig=new JsonConfig();
		jsonConfig.setExcludes(new String[]{"bill"});
		jsonConfig.registerJsonValueProcessor(java.util.Date.class, new DateJsonValueProcessor("yyyy-MM-dd"));
		JSONObject jsonObject=JSONObject.fromObject(bill,jsonConfig);
		ResponseUtil.write(response, jsonObject);
		return null;
	}
}
