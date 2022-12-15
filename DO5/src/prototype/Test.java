package prototype;

import java.awt.Color;

import mvc.Point;

public class Test {

	public static void main(String[] args) {
		Point p1 = new Point(10, 10, Color.RED);
		Point p2 = new Point(20, 20, Color.RED);

		Line lin1 = new Line(p1, p2, Color.RED);

		Line lin2 = lin1.clone();

		System.out.println(lin1);
		System.out.println(lin2);

		lin1.getStartPoint().setX(100);

		System.out.println(lin2.getStartPoint().getX());

		LineDeep lineDeep1 = new LineDeep(p1, p2, Color.RED);

		LineDeep lineDeep2 = lineDeep1.clone();

		lineDeep1.getStartPoint().setX(200);

		System.out.println(lineDeep2.getStartPoint().getX());

	}

}
