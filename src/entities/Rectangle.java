package entities;

public class Rectangle {
	
	public double width;
	public double height;
	
	public double area;
	public double perimeter;
	public double diagonal;
	
	public double Area() {
		area = width * height;
		return area;
	}
	
	public double Perimeter() {
		perimeter = 2 * (width + height);
		return perimeter;
	}
	
	public double Diagonal () {
		diagonal = Math.sqrt((width * width) + (height * height));
		return diagonal;
	}
	
}
