package com.siva.springProjects.demoGame;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MarioGame implements Game {

	@Override
	public void up() {
		// TODO Auto-generated method stub
		System.out.println("Jump up");
	}

	@Override
	public void down() {
		// TODO Auto-generated method stub
		System.out.println("Do nothing");
	}

	@Override
	public void left() {
		// TODO Auto-generated method stub
		System.out.println("Do nothing");
	}

	@Override
	public void right() {
		// TODO Auto-generated method stub
		System.out.println("Move right");
	}

}
