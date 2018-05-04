package com.oracle.labor.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.oracle.labor.dao.BioMapper;
import com.oracle.labor.po.Bio;
import com.oracle.labor.po.BioExample;

@Service
public class UnitService {

	@Autowired
	BioMapper bioDao;
	
	@Transactional(readOnly=true)
	public Bio getBioById(String bioId){
		BioExample e=new BioExample();
	    e.createCriteria().andBioIdEqualTo(bioId);
		return bioDao.selectByPrimaryKey(bioId);
	}
	
	@Transactional(readOnly=true)
	public void  save(Bio bio){
		bioDao.insert(bio);
	}
}
