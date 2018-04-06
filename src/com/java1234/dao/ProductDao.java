package com.java1234.dao;

import java.util.List;
import java.util.Map;

import com.java1234.entity.Product;
import com.java1234.entity.Product;

/**
 * 商品库存Dao接口
 * @author Administrator
 *
 */
public interface ProductDao {

	
	/**
	 * 查询商品库存集合
	 * @param map
	 * @return
	 */
	public List<Product> find(Map<String,Object> map);
	
	/**
	 * 获取总记录数
	 * @param map
	 * @return
	 */
	public Long getTotal(Map<String,Object> map);

	/**
	 * 修改商品库存
	 * @param product
	 * @return
	 */
	public int update(Product product);
	
	/**
	 * 添加商品库存
	 * @param product
	 * @return
	 */
	public int add(Product product);
	
	/**
	 * 删除商品库存
	 * @param id
	 * @return
	 */
	public int delete(Integer id);
}
