package com.thxy.dao;

import java.util.List;
import java.util.Map;

import com.thxy.entity.Ticket;

/**
 * 订单Dao接口
 * @author Administrator
 *
 */
public interface TicketDao {

	
	/**
	 * 查询订单集合
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
	 */
	public List<Ticket> findTicketGoods(Map<String, Object> map);

}
