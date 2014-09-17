package com.algovis.service;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.algovis.domain.Contact;

@Service("contactService")
@Transactional
public class ContactService {

	@Resource(name = "sessionFactory")
	private SessionFactory sessionFactory;
	
	public void add(Contact contact){
		
		Session session = sessionFactory.getCurrentSession();
		session.save(contact);
	}
		
}
