package com.sdcj.testTemplate.controller;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sdcj.testTemplate.json.SampleRequestJson;
import com.sdcj.testTemplate.json.SampleResponseJson;
import com.sdcj.testTemplate.pojo.Greeting;
import com.sdcj.testTemplate.service.SampleService;

@RestController
public class sampleController {
	
	 private static final String template = "Hello, %s!";
	 private final AtomicLong counter = new AtomicLong();
	 
	 @Autowired
	 public SampleService sampleService;
	


	 @RequestMapping(value = "/request", method = RequestMethod.GET)
	 public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
	        return new Greeting(counter.incrementAndGet(),
	                            String.format(template, name));
	 }
	 
	 
	 @RequestMapping(value = "/post", method = RequestMethod.POST)
	 public SampleResponseJson getTest(@RequestBody SampleRequestJson clientGroupRequestJson) throws Exception{

			SampleResponseJson resp = sampleService.searchByCriterial(clientGroupRequestJson);
			return  resp;
	 }

}
