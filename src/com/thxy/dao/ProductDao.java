package com.thxy.dao;

import java.util.List;
import java.util.Map;

import com.thxy.entity.Product;
import com.thxy.entity.Product;

/**
 * ��Ʒ���Dao�ӿ�
 * @author Administrator
 *
 */
public interface ProductDao {

	
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
	 * �޸���Ʒ���
	 * @param product
	 * @return
	 */
	public int update(Product product);
	
	/**
	 * �����Ʒ���
	 * @param product
	 * @return
	 */
	public int add(Product product);
	
	/**
	 * ɾ����Ʒ���
	 * @param id
	 * @return
	 */
	public int delete(Integer id);
}
