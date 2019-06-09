package exercises;

import java.util.ArrayList;
import java.util.List;

public class MovieProducer {

	/*
	 * Snakes can be venomous or not. 
	 * A Plane contains a list of snakes. 
	 * How many snakes does Sam have to kill to make the plane safe?
	 */

	public static void main(String[] args) {
		List<Snake> snakes = SnakeFactory.createListOfSnakesWithThatAreRandomlyVenomous();
		Plane plane = new Plane();
		plane.addSnakes();
		int howManyCanKillMe = plane.getNumberOfVenomousSnakes();
		System.out.println("Sam has to kill the right " + howManyCanKillMe + " snakes.");
	}
}
