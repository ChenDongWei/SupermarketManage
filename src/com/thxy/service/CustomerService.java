package com.thxy.service;

import java.util.List;
import java.util.Map;

import com.thxy.entity.Customer;
import com.thxy.entity.CustomerFw;
import com.thxy.entity.CustomerGc;
import com.thxy.entity.CustomerDd;

/**
 * 供货商Service接口
 * @author Administrator
 *
 */
public interface CustomerService {

	/**
	 * 查询供货商集合
	 * @param map
	 * @return
	 */
	public List<Customer> find(Map<String,Object> map);
	
	/**
	 * 获取总记录数
	 * @param map
	 * @return
	 */
	public Long getTotal(Map<String,Object> map);
	
	/**
	 * 添加供货商
	 * @param customer
	 * @return
	 */
	public int add(Customer customer);
	
	/**
	 * 修改供货商
	 * @param customer
	 * @return
	 */
	public int update(Customer customer);
	
	/**
	 * 删除供货商
	 * @param id
	 * @return
	 */
	public int delete(Integer id);
	
	/**
	 * 通过Id查找实体
	 * @param id
	 * @return
	 */
	public Customer findById(Integer id);
	
	/**
	 * 查询供货商贡献
	 * @param map
	 * @return
	 */
	public List<CustomerDd> findCustomerDd(Map<String,Object> map);
	
	/**
	 * 查询供货商贡献记录数
	 * @param map
	 * @return
	 */
	public Long getTotalCustomerDd(Map<String,Object> map);
	
	/**
	 * 查询供货商构成
	 * @return
	 */
	public List<CustomerGc> findCustomerGc();
	
	/**
	 * 查询供货商服务分析
	 * @return
	 */
	public List<CustomerFw> findCustomerFw();

	/**
	 * 根据khno查找
	 * @param khno
	 * @return
	 */
	public Customer findByKhno(String khno);
}
