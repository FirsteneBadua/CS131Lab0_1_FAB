/**
 * The Square class contains a single variable side and two constructors,
 * one to set the side to 0 and another to set the side to a particular value,
 * as well as getters and setters for side. Also included is a 
 * method to calculate the area of the Square. 
 */
public class Square {
	double side;
	
	//constructors
	public Square() {
		this.side = 0;
	}
	
	public Square(double side) {
		this.side = side;
	}
	
	// getters and setters
	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}
	
	// method area
	public double area() {
		return side * side;
	}
}
