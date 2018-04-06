package com.java1234.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.java1234.entity.Product;
import com.java1234.entity.PageBean;
import com.java1234.entity.Product;
import com.java1234.service.ProductService;
import com.java1234.util.ResponseUtil;
import com.java1234.util.StringUtil;

/**
 * 商品库存Controller层
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/product")
public class ProductController {
	
	@Resource
	private ProductService productService;
	
	/**
	 * 分页条件查询商品库存
	 * @param page
	 * @param rows
	 * @param s_product
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/list")
	public String list(@RequestParam(value="page",required=false)String page,@RequestParam(value="rows",required=false)String rows,Product s_product,HttpServletResponse response)throws Exception{
		PageBean pageBean=new PageBean(Integer.parseInt(page),Integer.parseInt(rows));
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("productName", StringUtil.formatLike(s_product.getProductName()));
		map.put("start", pageBean.getStart());
		map.put("size", pageBean.getPageSize());
		List<Product> productList=productService.find(map);
		Long total=productService.getTotal(map);
		JSONObject result=new JSONObject();
		JSONArray jsonArray=JSONArray.fromObject(productList);
		result.put("rows", jsonArray);
		result.put("total", total);
		ResponseUtil.write(response, result);
		return null;
	}
	
	/**
	 * 添加或者修改商品库存
	 * @param product
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/save")
	public String save(Product product,HttpServletResponse response)throws Exception{
		int resultTotal=0; // 操作的记录条数
		if(product.getId()==null){
			resultTotal=productService.add(product);
		}else{
			resultTotal=productService.update(product);
		}
		JSONObject result=new JSONObject();
		if(resultTotal>0){
			result.put("success", true);
		}else{
			result.put("success", false);
		}
		ResponseUtil.write(response, result);
		return null;
	}
	
	/**
	 * 删除商品库存
	 * @param ids
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/delete")
	public String delete(@RequestParam(value="ids")String ids,HttpServletResponse response)throws Exception{
		String []idsStr=ids.split(",");
		for(int i=0;i<idsStr.length;i++){
			productService.delete(Integer.parseInt(idsStr[i]));
		}
		JSONObject result=new JSONObject();
		result.put("success", true);
		ResponseUtil.write(response, result);
		return null;
	}
}
