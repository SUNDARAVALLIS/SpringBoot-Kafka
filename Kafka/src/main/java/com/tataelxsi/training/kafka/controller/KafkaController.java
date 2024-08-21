package com.tataelxsi.training.kafka.controller;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tataelxsi.training.kafka.service.KafkaProducerService;
 
@RestController
@RequestMapping("/rest/api")
public class KafkaController{
	
	@Autowired
	KafkaProducerService producer;
	
	@GetMapping("/producer")
	public void getMessageFromClient(@RequestParam("message") String message) {
		producer.sendMsgToTopic(message);
	}
	
	
}
