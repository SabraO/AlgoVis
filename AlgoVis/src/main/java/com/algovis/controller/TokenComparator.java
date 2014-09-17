package com.algovis.controller;

import java.util.List;

import org.apache.commons.lang3.StringUtils;

import com.algovis.domain.Algorithm;

public class TokenComparator {

	public Algorithm compare(List<Algorithm> list, String seq){
		
		Algorithm minAlgorithm ;
		int minDistance = StringUtils.getLevenshteinDistance(list.get(0).getSequence(),seq),levDistance;
		minAlgorithm = list.get(0);
		
		for(int i = 1; i<list.size();i++){
			levDistance = StringUtils.getLevenshteinDistance(list.get(i).getSequence(),seq);
			if(minDistance > levDistance){
				minDistance = levDistance;
				minAlgorithm = list.get(i);
			}
		}
		
		return minAlgorithm;
	}
	
}
