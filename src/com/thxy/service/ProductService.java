package com.thxy.service;

import java.util.List;
import java.util.Map;

import com.thxy.entity.Product;

/**
 * 商品库存Service接口
 * @author Administrator
 *
 */
public interface ProductService {

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
	 * 添加商品库存
	 * @param product
	 * @return
	 */
	public int add(Product product);

	/**
	 * 修改商品库存
	 * @param product
	 * @return
	 */
	public int update(Product product);

	/**
	 * 删除商品库存
	 * @param parseInt
	 */
	public int delete(int id);
}
