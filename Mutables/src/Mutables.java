import java.awt.Point;
import java.awt.Rectangle;

public class Mutables {

	public static void main(String[] args) {
		Point blank = new Point(3,4);
		
		printPoint(blank);
		
		blank.x= 6;
		
		printPoint(blank);
		
		Rectangle box = new Rectangle(0,0, 100, 200);
		
		Point center = findCenter(box);
		System.out.println(center);
		box.x = box.x + 50;
		System.out.println(box);

	}

	private static Point findCenter(Rectangle box) {
		int xPoint = box.x + box.width / 2;
		int yPoint = box.y + box.height / 2;
		return new Point(xPoint, yPoint);
	}

	private static void printPoint(Point blank) {
		System.out.printf("( %d, %d)\n", blank.x, blank.y);
		
	}

}
