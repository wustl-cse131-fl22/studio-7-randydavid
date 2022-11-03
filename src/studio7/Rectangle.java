package studio7;

public class Rectangle {
	
	private int length;
	private int width;
	
	public Rectangle(int length, int width) {
		// TODO Auto-generated constructor stub
		length = this.length;
		width = this.length;
	}
	
	
	int width() {
		return this.width;
	}
	
	int length() {
		return this.length;
	}
	
	
	int area() {
		int res = this.length * this.width;
		return res;
	}
	
	boolean square() {
		return this.length == this.width;
	}
	
	boolean smaller(Rectangle another) {
		return another.area() > this.area();
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
