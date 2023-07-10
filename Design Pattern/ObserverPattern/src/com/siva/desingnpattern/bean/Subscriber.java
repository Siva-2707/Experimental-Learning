package com.siva.desingnpattern.bean;

import java.util.ArrayList;
import java.util.List;

public class Subscriber {
	private String name;
	private List<Channel> subscribedChannels;
	
	
	public void subscribe(Channel channel) {
		subscribedChannels.add(channel);
		channel.subscribe(this);
	}
	
	public void unsubscribe(Channel channel) {
		if(subscribedChannels.contains(channel)) {
			channel.unSubscribe(this);
			subscribedChannels.remove(channel);
		}
	}
	
	public void notify(String notification) {
		System.out.println("Hey "+this.name+", New "+notification+" video uploaded..!!!");
	}
	
	
	public Subscriber(String name) {
		this.name = name;
		this.subscribedChannels = new ArrayList<>();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Channel> getSubscribedChannels() {
		return subscribedChannels;
	}
	public void setSubscribedChannels(List<Channel> subscribedChannels) {
		this.subscribedChannels = subscribedChannels;
	}
	
	
}
