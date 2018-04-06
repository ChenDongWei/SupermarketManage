package com.java1234.service;

import java.util.List;
import java.util.Map;

import com.java1234.entity.Bill;

/**
 * ����Service�ӿ�
 * @author Administrator
 *
 */
public interface BillService {

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
	 * ͨ��ID����ʵ��
	 * @param parseInt
	 * @return
	 */
	public Bill findById(int id);
}
