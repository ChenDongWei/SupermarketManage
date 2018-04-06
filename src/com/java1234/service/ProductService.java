package com.java1234.service;

import java.util.List;
import java.util.Map;

import com.java1234.entity.Product;

/**
 * ��Ʒ���Service�ӿ�
 * @author Administrator
 *
 */
public interface ProductService {

	/**
	 * ��ѯ��Ʒ��漯��
	 * @param map
	 * @return
	 */
	public List<Product> find(Map<String,Object> map);
	
	/**
	 * ��ȡ�ܼ�¼��
	 * @param map
	 * @return
	 */
	public Long getTotal(Map<String,Object> map);

	/**
	 * �����Ʒ���
	 * @param product
	 * @return
	 */
	public int add(Product product);

	/**
	 * �޸���Ʒ���
	 * @param product
	 * @return
	 */
	public int update(Product product);

	/**
	 * ɾ����Ʒ���
	 * @param parseInt
	 */
	public int delete(int id);
}
