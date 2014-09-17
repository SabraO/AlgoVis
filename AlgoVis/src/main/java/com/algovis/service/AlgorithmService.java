package com.algovis.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.algovis.domain.Algorithm;

@Service("algorithmService")
@Transactional
public class AlgorithmService {

	@Resource(name = "sessionFactory")
	private SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	public List<Algorithm> getAll() {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("FROM Algorithm");
		
		return query.list();
	}
	
	@SuppressWarnings("unchecked")
	public List<Algorithm> getMatchingSet(ArrayList<Integer> list) {//KCOI
		
		int range = 40;

		SQLQuery query = sessionFactory.getCurrentSession().createSQLQuery("SELECT * FROM `algorithm` WHERE `KEYWORD_PER` between :kl and :ku and `OPERATOR_PER` between :ol and :ou and `COMPARISON_PER` between :cl and :cu and `INSIGNIFICANT_PER` between :il and :iu").addEntity(Algorithm.class);
		query.setParameter("kl",list.get(0) - range);
		query.setParameter("ku",list.get(0) + range);
		query.setParameter("ol",list.get(2) - range);
		query.setParameter("ou",list.get(2) + range);
		query.setParameter("cl",list.get(1) - range);
		query.setParameter("cu",list.get(1) + range);
		query.setParameter("il",list.get(3) - range);
		query.setParameter("iu",list.get(3) + range);
		List<Algorithm> algolist = query.list();
		return algolist;
	}
		
}
