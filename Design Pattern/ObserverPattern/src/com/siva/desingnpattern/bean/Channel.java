package com.siva.desingnpattern.bean;

import java.util.ArrayList;
import java.util.List;

public class Channel {
	private String name;
	private List<Subscriber> subscribers;
	
	protected void subscribe(Subscriber subscriber) {
		subscribers.add(subscriber);
	}
	
	protected void unSubscribe(Subscriber subscriber) {
		if(subscribers.contains(subscriber))
			subscribers.remove(subscriber);
	}
	
	public void publish(String message) {
		subscribers.forEach(subscriber -> subscriber.notify(message));
	}
	
	
	public Channel(String name) {
		this.name = name;
		this.subscribers = new ArrayList<>();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Subscriber> getSubscribers() {
		return subscribers;
	}
	public void setSubscribers(List<Subscriber> subscribers) {
		this.subscribers = subscribers;
	}
	
	
	
}
