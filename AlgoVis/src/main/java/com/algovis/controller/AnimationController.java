package com.algovis.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.algovis.domain.AlgorithmInfo;
import com.algovis.service.AlgorithmInfoService;


@Controller
public class AnimationController {
	
	@Resource(name = "algorithminfoService")
	private AlgorithmInfoService algorithmInfoService;
	
	@RequestMapping(value = "/animate", method = RequestMethod.GET)
	public ModelAndView getdata(@RequestParam(value = "algorithm", required = false) String algorithm) {

		Map<String, Object> model = new HashMap<String, Object>();
		
		model.put("algo", algorithm);
		return new ModelAndView("animation", model);
	}
	
	@RequestMapping(value = "/analysis", method = RequestMethod.POST)
	public @ResponseBody
	String getAnalysis(@RequestParam(value = "content", required = false) String algoName) { 

		List<AlgorithmInfo> algolist = algorithmInfoService.getMatchingSet(algoName);
		
		return algolist.get(0).getAnalysis();
		
	}
	
	@RequestMapping(value = "/pseudo", method = RequestMethod.POST)
	public @ResponseBody
	String getPseudo(@RequestParam(value = "content", required = false) String algoName) { 

		List<AlgorithmInfo> algolist = algorithmInfoService.getMatchingSet(algoName);
		
		return algolist.get(0).getPseudo();
		
	}
	
	@RequestMapping(value = "/variant", method = RequestMethod.POST)
	public @ResponseBody
	String getVariant(@RequestParam(value = "content", required = false) String algoName) { 

		List<AlgorithmInfo> algolist = algorithmInfoService.getMatchingSet(algoName);
		
		return algolist.get(0).getVariant();
		
	}
}
