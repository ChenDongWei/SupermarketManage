package com.thxy.service;

import java.util.List;
import java.util.Map;

import com.thxy.entity.Ticket;

/**
 * ������ϢService�ӿ�
 * @author Administrator
 *
 */
public interface TicketService {

	/**
	 * ��ѯ������Ϣ����
	 * @param map
	 * @return
	 */
	public List<Ticket> find(Map<String,Object> map);
	
	/**
	 * ��ȡ�ܼ�¼��
	 * @param map
	 * @return
	 */
	public Long getTotal(Map<String,Object> map);

	/**
	 * ��ȡ������Ϣ�嵥
	 * @param map
	 * @return
	 */
	public List<Ticket> findTicketGoods(Map<String, Object> map);
}
