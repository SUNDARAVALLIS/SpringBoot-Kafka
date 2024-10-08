package com.tataelxsi.training.kafka.service;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
 
@Service
public class KafkaProducerService {
	
	@Autowired
	KafkaTemplate<String,String> kafkaTemplate;
	
	public void sendMsgToTopic(String message) {
		kafkaTemplate.send("CodeDecode_Topic", message);
	}
	
 
}
