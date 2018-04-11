package com.thxy.service;

import java.util.List;
import java.util.Map;

import com.thxy.entity.Member;

/**
 * ��ԱService�ӿ�
 * @author Administrator
 *
 */
public interface MemberService {

	/**
	 * ��Ա��¼
	 * @param member
	 * @return
	 */
	public Member login(Member member);
	
	/**
	 * ��ѯ��Ա����
	 * @param map
	 * @return
	 */
	public List<Member> find(Map<String,Object> map);
	
	/**
	 * ��ȡ�ܼ�¼��
	 * @param map
	 * @return
	 */
	public Long getTotal(Map<String,Object> map);
	
	/**
	 * �޸Ļ�Ա
	 * @param member
	 * @return
	 */
	public int update(Member member);
	
	/**
	 * ��ӻ�Ա
	 * @param member
	 * @return
	 */
	public int add(Member member);
	
	/**
	 * ɾ����Ա
	 * @param id
	 * @return
	 */
	public int delete(Integer id);
}
