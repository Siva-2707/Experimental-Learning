package com.siva.springProjects.demoGame;

import org.springframework.stereotype.Component;

@Component
public class NeedForSpeed implements Game {

	@Override
	public void up() {
		// TODO Auto-generated method stub
		System.out.println("Move forward");
	}

	@Override
	public void down() {
		// TODO Auto-generated method stub
		System.out.println("Move backwards ");
	}

	@Override
	public void left() {
		// TODO Auto-generated method stub
		System.out.println("Turn left");

	}

	@Override
	public void right() {
		// TODO Auto-generated method stub
		System.out.println("Turn right");
	}

}
