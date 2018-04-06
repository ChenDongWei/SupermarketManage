package com.java1234.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.java1234.dao.TicketDao;
import com.java1234.entity.Ticket;
import com.java1234.service.TicketService;
import com.java1234.util.DateUtil;

/**
 * 收银信息Service实现类
 * @author Administrator
 *
 */
@Service("ticketService")
public class TicketServiceImpl implements TicketService{

	@Resource
	private TicketDao ticketDao;
	
	@Override
	public List<Ticket> find(Map<String, Object> map) {
		List<Ticket> ticketList = ticketDao.find(map);
		for (Ticket ticket : ticketList) {
			ticket.setTimeStr(DateUtil.formatDate(ticket.getTime(), "yyyy-MM-dd HH:mm:ss"));
		}
		return ticketList;
	}

	@Override
	public Long getTotal(Map<String, Object> map) {
		return ticketDao.getTotal(map);
	}

	@Override
	public List<Ticket> findTicketGoods(Map<String, Object> map) {
		List<Ticket> ticketList = ticketDao.findTicketGoods(map);
		for (Ticket ticket : ticketList) {
			ticket.setPriceSum(ticket.getPrice() * ticket.getGoodsNum());
		}
		return ticketList;
	}

}
