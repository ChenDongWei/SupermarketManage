package com.thxy.service;

import java.util.List;
import java.util.Map;

import com.thxy.entity.Bill;

/**
 * 订单Service接口
 * @author Administrator
 *
 */
public interface BillService {

	/**
	 * 查询订单集合
	 * @param map
	 * @return
	 */
	public List<Bill> find(Map<String,Object> map);
	
	/**
	 * 获取总记录数
	 * @param map
	 * @return
	 */
	public Long getTotal(Map<String,Object> map);

	/**
	 * 通过ID查找实体
	 * @param parseInt
	 * @return
	 */
	public Bill findById(int id);
}
