/**
 * @author Zakir Hossain Feb 18, 2020 This Rectangle class extends to the parent
 *         class Parallelogram, which itsef extends to its own abstract parent
 *         class
 *
 *         It employs additional manipulation that are unique to Rectangle.
 *
 *         The heigth is insignificant in the Rectangle (the subset figure of Parallelogram). Height is always 0.
 */
public class Rectangle extends Parallelogram {
	public Rectangle(String type, double base, double length, double height) {
		super(type, base, length, height);
	}

	// This method calculates the diagonal length of the rectangle
	public double diagonalLen() {
		return Math.sqrt(Math.pow(super.getBase(), 2) + Math.pow(super.getLength(), 2));
	}

	public boolean isRectangleSquare() {
		return super.getBase() == super.getLength();
	}

	public String toString() {
		return super.toString() + "\nDiagonal Length: " + diagonalLen();
	}

}
