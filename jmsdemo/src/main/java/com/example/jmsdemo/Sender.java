package com.example.jmsdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Sender {
@Autowired
private JmsTemplate jmstemplate;

@PostMapping("/send")
public void send(@RequestBody Entity entity) {
	System.out.println("sending a transaction");
	jmstemplate.convertAndSend("entityqueue", entity.toString());
}
}
