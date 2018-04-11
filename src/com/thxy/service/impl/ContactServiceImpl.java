package com.thxy.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.thxy.dao.ContactDao;
import com.thxy.entity.Contact;
import com.thxy.service.ContactService;

/**
 * ������¼Serviceʵ����
 * @author Administrator
 *
 */
@Service("contactService")
public class ContactServiceImpl implements ContactService{

	@Resource
	private ContactDao contactDao;
	
	@Override
	public List<Contact> find(Map<String, Object> map) {
		return contactDao.find(map);
	}

	@Override
	public Long getTotal(Map<String, Object> map) {
		return contactDao.getTotal(map);
	}

	@Override
	public int update(Contact contact) {
		return contactDao.update(contact);
	}

	@Override
	public int add(Contact contact) {
		return contactDao.add(contact);
	}

	@Override
	public int delete(Integer id) {
		return contactDao.delete(id);
	}

}