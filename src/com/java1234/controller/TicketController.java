package com.java1234.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.java1234.entity.PageBean;
import com.java1234.entity.Ticket;
import com.java1234.service.TicketService;
import com.java1234.util.ResponseUtil;
import com.java1234.util.StringUtil;

/**
 * 收银信息Controller层
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/ticket")
public class TicketController {
	
	@Resource
	private TicketService ticketService;
	
	
	/**
	 * 分页条件查询收银信息
	 * @param page
	 * @param rows
	 * @param s_ticket
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/list")
	public String list(@RequestParam(value="page",required=false)String page,@RequestParam(value="rows",required=false)String rows,Ticket s_ticket,HttpServletResponse response)throws Exception{
		PageBean pageBean=new PageBean(Integer.parseInt(page),Integer.parseInt(rows));
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("productName", StringUtil.formatLike(s_ticket.getTicketCode()));
		map.put("start", pageBean.getStart());
		map.put("size", pageBean.getPageSize());
		List<Ticket> ticketList=ticketService.find(map);
		Long total=ticketService.getTotal(map);
		JSONObject result=new JSONObject();
		JSONArray jsonArray=JSONArray.fromObject(ticketList);
		result.put("rows", jsonArray);
		result.put("total", total);
		ResponseUtil.write(response, result);
		return null;
	}
	
	@RequestMapping("/ticketGoods")
	public String ticketGoods(@RequestParam(value="page",required=false)String page,@RequestParam(value="rows",required=false)String rows,Ticket s_ticket,HttpServletResponse response)throws Exception{
		PageBean pageBean=new PageBean(Integer.parseInt(page),Integer.parseInt(rows));
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("ticketCode", s_ticket.getTicketCode());
		map.put("start", pageBean.getStart());
		map.put("size", pageBean.getPageSize());
		List<Ticket> ticketList=ticketService.findTicketGoods(map);
		Long total=ticketService.getTotal(map);
		JSONObject result=new JSONObject();
		JSONArray jsonArray=JSONArray.fromObject(ticketList);
		result.put("rows", jsonArray);
		result.put("total", total);
		ResponseUtil.write(response, result);
		return null;
	}
}
