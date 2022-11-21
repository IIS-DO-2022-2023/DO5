package composite;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import mvc.Point;
import mvc.Shape;

public class SremBanatBacka extends Shape {

	private List<Point> sremBanatbacka = new ArrayList<>();

	public void add(Point p) {
		sremBanatbacka.add(p);
	}

	public void remove(Point p) {
		sremBanatbacka.remove(p);
	}

	@Override
	public void draw(Graphics g) {
		Iterator<Point> it = sremBanatbacka.iterator();
		while (it.hasNext())
			it.next().draw(g);

	}

}
