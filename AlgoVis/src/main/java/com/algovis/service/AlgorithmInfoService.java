package com.algovis.service;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SQLQuery;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.algovis.domain.AlgorithmInfo;

@Service("algorithminfoService")
@Transactional
public class AlgorithmInfoService {

	@Resource(name = "sessionFactory")
	private SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	public List<AlgorithmInfo> getMatchingSet(String name) {
		
		SQLQuery query = sessionFactory.getCurrentSession().createSQLQuery("SELECT * FROM `algorithm_info` WHERE `NAME` = :name").addEntity(AlgorithmInfo.class);
		query.setParameter("name",name);

		List<AlgorithmInfo> algoinfo = query.list();
		return algoinfo;
	}
		
}
