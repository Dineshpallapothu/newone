package Day3;

public class Square {
	private int side;

	public int getSide(int side) {
		return side;
	}

	public int getArea(int side) {
		return side * side;
	}

	public Square(int side) {

		this.side = side;
	}

	public Square() {

	}

	public int getCircumference(int side) {
		return 4 * side;
	}

}
