package com.java1234.service;

import java.util.List;
import java.util.Map;

import com.java1234.entity.Customer;
import com.java1234.entity.CustomerFw;
import com.java1234.entity.CustomerGc;
import com.java1234.entity.CustomerGx;

/**
 * ������Service�ӿ�
 * @author Administrator
 *
 */
public interface CustomerService {

	/**
	 * ��ѯ�����̼���
	 * @param map
	 * @return
	 */
	public List<Customer> find(Map<String,Object> map);
	
	/**
	 * ��ȡ�ܼ�¼��
	 * @param map
	 * @return
	 */
	public Long getTotal(Map<String,Object> map);
	
	/**
	 * ���ӹ�����
	 * @param customer
	 * @return
	 */
	public int add(Customer customer);
	
	/**
	 * �޸Ĺ�����
	 * @param customer
	 * @return
	 */
	public int update(Customer customer);
	
	/**
	 * ɾ��������
	 * @param id
	 * @return
	 */
	public int delete(Integer id);
	
	/**
	 * ͨ��Id����ʵ��
	 * @param id
	 * @return
	 */
	public Customer findById(Integer id);
	
	/**
	 * ��ѯ�����̹���
	 * @param map
	 * @return
	 */
	public List<CustomerGx> findCustomerGx(Map<String,Object> map);
	
	/**
	 * ��ѯ�����̹��׼�¼��
	 * @param map
	 * @return
	 */
	public Long getTotalCustomerGx(Map<String,Object> map);
	
	/**
	 * ��ѯ�����̹���
	 * @return
	 */
	public List<CustomerGc> findCustomerGc();
	
	/**
	 * ��ѯ�����̷������
	 * @return
	 */
	public List<CustomerFw> findCustomerFw();

	/**
	 * ����khno����
	 * @param khno
	 * @return
	 */
	public Customer findByKhno(String khno);
}