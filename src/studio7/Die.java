package studio7;

public class Die {

	public int sides;

	public Die(int theSides) {
		sides = theSides;
	}

	public void setSides(int theSides) {
		this.sides = theSides;
	}

	public int roll() {
		return 1 + (int)( Math.random() * ((sides - 1) + 1));
	}

	public static void main(String[] args) {
		Die ivon = new Die(9);
		for(int counter = 0; 0 < 1000; counter++) {
			System.out.println(ivon.roll());	
		}
	}
}

