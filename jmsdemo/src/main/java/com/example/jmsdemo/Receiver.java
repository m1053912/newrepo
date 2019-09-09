package com.example.jmsdemo;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver {
 @JmsListener(destination="entityqueue")
 public void messageReceiver(String transaction) {
	 System.out.println(transaction);
	 
	 System.out.println("received");
 }
}
