package com.java1234.dao;

import java.util.List;
import java.util.Map;

import com.java1234.entity.Bill;

/**
 * 订单Dao接口
 * @author Administrator
 *
 */
public interface BillDao {

	
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
	 * 根据ID查找实体
	 * @param id
	 * @return
	 */
	public Bill findById(int id);

}
