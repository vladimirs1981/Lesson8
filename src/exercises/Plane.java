package exercises;

import java.util.List;
import java.util.Random;

public class Plane {

	SnakeFactory snakeFactory = new SnakeFactory();
	

	public void addSnakes() {
		
		SnakeFactory.createListOfSnakesWithThatAreRandomlyVenomous();

	}

	public int getNumberOfVenomousSnakes() {
		
		int count = 0;
		 
		List<Snake> snakes = snakeFactory.createListOfSnakesWithThatAreRandomlyVenomous();
		for (Snake snake : snakes) {
			if (snake.isVenomous()) {
				count++;
			}
		}
		return count;
	}
}
