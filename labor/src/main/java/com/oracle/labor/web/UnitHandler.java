package com.oracle.labor.web;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import com.oracle.labor.po.Bio;
import com.oracle.labor.service.UnitService;

@Controller
public class UnitHandler {

	
	@Autowired
	UnitService unitService;
	
	@RequestMapping(value="service/getBio/{bioId}")
	public String getBio(@PathVariable("bioId") String bioId,Map<String,Bio> map){
		Bio bio=unitService.getBioById(bioId);
		map.put("bio", bio);
		return "service/zj/dwzp/dwdj_2";
	}
	
	@RequestMapping("/save")
	public String saveBio(Bio bio){
		unitService.save(bio);
		System.out.println(bio.toString());
		return "redirect:";
	}
	
	
}
