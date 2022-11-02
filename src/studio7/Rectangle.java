package studio7;

public class Rectangle {

	private double width;
	private double length;

	public Rectangle() {
		width = 0.0;
		length = 0.0;
	}

	public Rectangle(double initWidth, double initLength) {
		width = initWidth;
		length = initLength;
	}

	public double getWidth() {
		return this.width;
	}

	public double getLength() {
		return this.length;
	}

	public double area() {
		return this.length * this.width;
	}

	public boolean smallerThan(Rectangle rectTwo) {
		if (area() < rectTwo.area()) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isSquare() {
		if (this.width == this.length) {
			return true;
		} else {
			return false;
		}
	}

	public double perimeter() {
		return (2 * this.length) + (2 * this.width);
	}
	
	public String toString() {
		return "Width: "+this.width+", Length: "+this.length;
	}
	
	public static void main(String[] args) {
		
	}
}
