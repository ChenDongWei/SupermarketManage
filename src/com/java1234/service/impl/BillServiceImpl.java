package com.java1234.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.java1234.dao.BillDao;
import com.java1234.entity.Bill;
import com.java1234.service.BillService;
import com.java1234.service.BillService;
import com.java1234.util.DateUtil;

/**
 * 订单Service实现类
 * @author Administrator
 *
 */
@Service("billService")
public class BillServiceImpl implements BillService{

	@Resource
	private BillDao billDao;
	
	@Override
	public List<Bill> find(Map<String, Object> map) {
		List<Bill> billList = billDao.find(map);
		for (Bill bill : billList) {
			bill.setCreationDateStr(DateUtil.formatDate(bill.getCreationDate(), "yyyy-MM-dd HH:mm:ss"));
		}
		return billList;
	}

	@Override
	public Long getTotal(Map<String, Object> map) {
		return billDao.getTotal(map);
	}

	@Override
	public Bill findById(int id) {
		return billDao.findById(id);
	}

}
