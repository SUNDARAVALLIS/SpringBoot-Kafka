package com.tataelxsi.training.kafka.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
 
@Service
public class KafkaConsumerService {

	@KafkaListener(topics = "CodeDecode_Topic", groupId = "CodeDecode_Group")
	public void listenToTopic(String receivedMessage) {
		System.out.println("The Message is " + receivedMessage);
}
}
