import java.lang.Math;
/**
 * The Circle class contains one variable for the radius of the circle, a default constructor,
 * a preferred constructor that takes the radius as a parameter, getters and setters.
 * Also included is a method to calculate the area of the Circle. 
 */
public class Circle {
	double radius;
	
	//constructors
	public Circle() {
		this.radius = 0;
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	// getters and setters
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	//method area
	public double area() {
		return Math.PI * Math.pow(radius, 2);
	}
}
