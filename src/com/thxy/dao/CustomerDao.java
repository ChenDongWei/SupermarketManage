package com.thxy.dao;

import java.util.List;
import java.util.Map;

import com.thxy.entity.Customer;
import com.thxy.entity.CustomerFw;
import com.thxy.entity.CustomerGc;
import com.thxy.entity.CustomerDd;

/**
 * �ͻ�Dao�ӿ�
 * @author Administrator
 *
 */
public interface CustomerDao {

	
	/**
	 * ��ѯ�ͻ�����
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
	 * ��ӿͻ�
	 * @param customer
	 * @return
	 */
	public int add(Customer customer);
	
	/**
	 * �޸Ŀͻ�
	 * @param customer
	 * @return
	 */
	public int update(Customer customer);
	
	/**
	 * ɾ���ͻ�
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
	 * ������ʧ�Ŀͻ� 6����δ�µ��Ŀͻ�
	 * @return
	 */
	public List<Customer> findLossCustomer();
	
	/**
	 * ��ѯ�ͻ�����
	 * @param map
	 * @return
	 */
	public List<CustomerDd> findCustomerDd(Map<String,Object> map);
	
	/**
	 * ��ѯ�ͻ����׼�¼��
	 * @param map
	 * @return
	 */
	public Long getTotalCustomerDd(Map<String,Object> map);
	
	/**
	 * ��ѯ�ͻ�����
	 * @return
	 */
	public List<CustomerGc> findCustomerGc();
	
	/**
	 * ��ѯ�ͻ��������
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
