package com.sdcj.testTemplate.service;



import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sdcj.testTemplate.json.SampleRequestJson;
import com.sdcj.testTemplate.json.SampleResponseJson;




/**
 * @author michael yin
 *
 */
@Service
public class SampleService {
	
	private final static Logger LOG = LoggerFactory.getLogger(SampleService.class);
	



	public SampleResponseJson searchByCriterial(SampleRequestJson requestJson) throws Exception {

		SampleResponseJson sampleResponseJson = new SampleResponseJson();
		sampleResponseJson.setTestPara("AAAAAAAAAAA");
		return sampleResponseJson;
	}
	
	
	
	

}
