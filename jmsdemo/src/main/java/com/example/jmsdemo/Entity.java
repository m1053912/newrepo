package com.example.jmsdemo;

public class Entity {
int transactionid;
String from;
String to;
int amount;
public int getTransactionid() {
	return transactionid;
}
public void setTransactionid(int transactionid) {
	this.transactionid = transactionid;
}
public String getFrom() {
	return from;
}
public void setFrom(String from) {
	this.from = from;
}
public String getTo() {
	return to;
}
public void setTo(String to) {
	this.to = to;
}
public int getAmount() {
	return amount;
}
public void setAmount(int amount) {
	this.amount = amount;
}
public Entity(int transactionid, String from, String to, int amount) {
	super();
	this.transactionid = transactionid;
	this.from = from;
	this.to = to;
	this.amount = amount;
}
public Entity() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Entity [transactionid=" + transactionid + ", from=" + from + ", to=" + to + ", amount=" + amount + "]";
}
}
