package com.thxy.dao;

import java.util.List;
import java.util.Map;

import com.thxy.entity.Bill;

/**
 * ����Dao�ӿ�
 * @author Administrator
 *
 */
public interface BillDao {

	
	/**
	 * ��ѯ��������
	 * @param map
	 * @return
	 */
	public List<Bill> find(Map<String,Object> map);
	
	/**
	 * ��ȡ�ܼ�¼��
	 * @param map
	 * @return
	 */
	public Long getTotal(Map<String,Object> map);

	/**
	 * ����ID����ʵ��
	 * @param id
	 * @return
	 */
	public Bill findById(int id);

}