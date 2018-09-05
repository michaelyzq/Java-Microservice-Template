package com.sdcj.testTemplate.service;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.sdcj.testTemplate.Repository.StudentDao;
import com.sdcj.testTemplate.json.SampleRequestJson;
import com.sdcj.testTemplate.json.SampleResponseJson;




/**
 * @author michael yin
 *
 */
@Service
public class SampleService {
	
	private final static Logger LOG = LoggerFactory.getLogger(SampleService.class);
	
	@Autowired
	StudentDao studentDao;

	public SampleResponseJson searchByCriterial(SampleRequestJson requestJson) throws Exception {

		SampleResponseJson sampleResponseJson = new SampleResponseJson();
		sampleResponseJson.setTestPara("AAAAAAAAAAA");
		Gson gson = new Gson();
		LOG.warn(gson.toJson((studentDao.searchstudent())));
		return sampleResponseJson;
	}
	
	
	
	

}
