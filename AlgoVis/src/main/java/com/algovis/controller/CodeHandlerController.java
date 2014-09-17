package com.algovis.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.servlet.ModelAndView;




import com.algovis.domain.Algorithm;
import com.algovis.service.AlgorithmService;
import com.algovis.controller.CodeAnalyzer;

@Controller
public class CodeHandlerController {
	
	@Resource(name = "algorithmService")
	private AlgorithmService algorithmService;
	
	private CodeAnalyzer ana;
	private TokenComparator tco;
	
	@RequestMapping(value = "/handle", method = RequestMethod.POST)
	public @ResponseBody
	String Evaluate(@RequestParam(value = "content", required = false) String codeContent) { 
		
		//analyze the code and get matching algorithms according to frequency, from the database
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		ana = (CodeAnalyzer) context.getBean("codeanalyzer");
		
		ana.setValues(codeContent);
		ArrayList<Integer> list = ana.getPercentagelist();//KCOI	
		
		List<Algorithm> algos = algorithmService.getMatchingSet(list);
		if(algos.size()!=0){
			//if there is more than 1 match, find the best match using levenshtein distance
			tco = (TokenComparator) context.getBean("tokencomparator");
			Algorithm matchingAlgorithm = tco.compare(algos,ana.getSequence());

			return matchingAlgorithm.getName();
		}
		else{
			return null;
		}
	}
	
}
  