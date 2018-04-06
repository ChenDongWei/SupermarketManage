package com.java1234.service;

import java.util.List;
import java.util.Map;

import com.java1234.entity.Ticket;

/**
 * 收银信息Service接口
 * @author Administrator
 *
 */
public interface TicketService {

	/**
	 * 查询收银信息集合
	 * @param map
	 * @return
	 */
	public List<Ticket> find(Map<String,Object> map);
	
	/**
	 * 获取总记录数
	 * @param map
	 * @return
	 */
	public Long getTotal(Map<String,Object> map);

	/**
	 * 获取收银信息清单
	 * @param map
	 * @return
	 */
	public List<Ticket> findTicketGoods(Map<String, Object> map);
}
