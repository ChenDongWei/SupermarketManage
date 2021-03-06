package com.thxy.dao;

import java.util.List;
import java.util.Map;

import com.thxy.entity.Member;

/**
 * 会员Dao接口
 * @author Administrator
 *
 */
public interface MemberDao {

	/**
	 * 会员登录
	 * @param member
	 * @return
	 */
	public Member login(Member member);
	
	/**
	 * 查询会员集合
	 * @param map
	 * @return
	 */
	public List<Member> find(Map<String,Object> map);
	
	/**
	 * 获取总记录数
	 * @param map
	 * @return
	 */
	public Long getTotal(Map<String,Object> map);
	
	/**
	 * 修改会员
	 * @param member
	 * @return
	 */
	public int update(Member member);
	
	/**
	 * 添加会员
	 * @param member
	 * @return
	 */
	public int add(Member member);
	
	/**
	 * 删除会员
	 * @param id
	 * @return
	 */
	public int delete(Integer id);
}
