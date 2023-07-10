package com.siva.desingnpattern;

import com.siva.desingnpattern.bean.Channel;
import com.siva.desingnpattern.bean.Subscriber;

public class Youtube {

	public static void main(String[] args) {
		
		Channel webx = new Channel("Webx");
		
		Subscriber siva = new Subscriber("Siva");
		siva.subscribe(webx);
		Subscriber vishnu = new Subscriber("Vishnu");
		vishnu.subscribe(webx);
		webx.publish("Spider man");
		Subscriber bharadhan = new Subscriber("Bharadhan");
		bharadhan.subscribe(webx);
		vishnu.unsubscribe(webx);
		webx.publish("Batman");

	}

}
