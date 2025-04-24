package assignment9;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;
import java.util.Random;

public class Food {

	public static final double FOOD_SIZE = 0.02;
	private double x, y;
	
	/**
	 * Creates a new Food at a random location
	 */
	public Food() {
		 Random r = new Random();
	     this.x = r.nextDouble();
	     this.y = r.nextDouble();
	}
	
	/**
	 * Draws the Food
	 */
	public void draw() {
		 StdDraw.setPenColor(Color.RED);
	     StdDraw.filledCircle(x, y, FOOD_SIZE);
	}
	public double getX() {
        return x;
    }
	public double getY() {
        return y;
	}
}
