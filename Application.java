
/**
 * This Application class will use the other two classes and will 
 * instantiate a square with a side of size 2 and will print the area.
 * It will then instantiate a circle with a radius of 1 and print the area.
 */
public class Application {
	public static void main(String[] args) {
		//instantiating the square with side length 2
		Square sq = new Square(2);
		System.out.println("Square Area: " + sq.area());
		
		//instantiating the circle with radius 1
		Circle cr = new Circle(1);
		System.out.println("Circle Area: " + cr.area());
	}
}