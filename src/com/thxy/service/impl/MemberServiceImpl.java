package com.thxy.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.thxy.dao.MemberDao;
import com.thxy.entity.Member;
import com.thxy.service.MemberService;

/**
 * 会员Service实现类
 * @author Administrator
 *
 */
@Service("memberService")
public class MemberServiceImpl implements MemberService{

	@Resource
	private MemberDao memberDao;

	@Override
	public Member login(Member member) {
		return memberDao.login(member);
	}

	@Override
	public List<Member> find(Map<String, Object> map) {
		return memberDao.find(map);
	}

	@Override
	public Long getTotal(Map<String, Object> map) {
		return memberDao.getTotal(map);
	}

	@Override
	public int update(Member member) {
		return memberDao.update(member);
	}

	@Override
	public int add(Member member) {
		return memberDao.add(member);
	}

	@Override
	public int delete(Integer id) {
		return memberDao.delete(id);
	}
}
