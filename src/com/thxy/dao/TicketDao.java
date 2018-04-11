package com.thxy.dao;

import java.util.List;
import java.util.Map;

import com.thxy.entity.Ticket;

/**
 * ����Dao�ӿ�
 * @author Administrator
 *
 */
public interface TicketDao {

	
	/**
	 * ��ѯ��������
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
	 */
	public List<Ticket> findTicketGoods(Map<String, Object> map);

}
