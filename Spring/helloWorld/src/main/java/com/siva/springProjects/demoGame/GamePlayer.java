package com.siva.springProjects.demoGame;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;



@SpringBootApplication
public class GamePlayer {

	public static void main(String[] args) {
	
		/* Loosely coupled
		Game game = new MarioGame();
		GameRunner runner = new GameRunner(game);
		runner.run();
		*/
		
		ApplicationContext context = SpringApplication.run(GamePlayer.class, args);
		GameRunner runner =  context.getBean(GameRunner.class);
		runner.run();
	}

}
