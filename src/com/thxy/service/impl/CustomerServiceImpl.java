package com.thxy.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.thxy.dao.CustomerDao;
import com.thxy.dao.OrderDao;
import com.thxy.entity.Customer;
import com.thxy.entity.CustomerFw;
import com.thxy.entity.CustomerGc;
import com.thxy.entity.CustomerDd;
import com.thxy.entity.CustomerLoss;
import com.thxy.entity.Order;
import com.thxy.service.CustomerService;

/**
 * 客户Service接口
 * @author Administrator
 *
 */
@Service("customerService")
public class CustomerServiceImpl implements CustomerService{

	@Resource
	private CustomerDao customerDao;
	
	@Resource
	private OrderDao orderDao;
	
	@Override
	public List<Customer> find(Map<String, Object> map) {
		return customerDao.find(map);
	}

	@Override
	public Long getTotal(Map<String, Object> map) {
		return customerDao.getTotal(map);
	}

	@Override
	public int add(Customer customer) {
		return customerDao.add(customer);
	}

	@Override
	public int update(Customer customer) {
		return customerDao.update(customer);
	}

	@Override
	public int delete(Integer id) {
		return customerDao.delete(id);
	}

	@Override
	public Customer findById(Integer id) {
		return customerDao.findById(id);
	}

	@Override
	public List<CustomerDd> findCustomerDd (Map<String, Object> map) {
		return customerDao.findCustomerDd (map);
	}

	@Override
	public Long getTotalCustomerDd (Map<String, Object> map) {
		return customerDao.getTotalCustomerDd (map);
	}

	@Override
	public List<CustomerGc> findCustomerGc() {
		return customerDao.findCustomerGc();
	}

	@Override
	public List<CustomerFw> findCustomerFw() {
		return customerDao.findCustomerFw();
	}

	@Override
	public Customer findByKhno(String khno) {
		return customerDao.findByKhno(khno);
	}

}
