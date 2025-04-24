package assignment9;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class BodySegment {

	private double x, y, size;
	private Color color;
	
	public BodySegment(double x, double y, double size) {
		 this.x = x;
	     this.y = y;
	     this.size = size;
	     this.color = ColorUtils.solidColor();
		
		//See ColorUtils for some color options (or choose your own)
	}
	// Getter for x coordinate
    public double getX() {
        return x;
    }

    // Getter for y coordinate
    public double getY() {
        return y;
    }
	/**
	 * Draws the segment
	 */
	public void draw() {
		StdDraw.setPenColor(color);
        StdDraw.filledCircle(x, y, size);
	}
	
}
