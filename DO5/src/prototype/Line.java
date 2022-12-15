package prototype;

import java.awt.Color;
import java.awt.Graphics;

import mvc.Point;
import mvc.Shape;

public class Line extends Shape implements Cloneable {
	private Point startPoint = new Point();
	private Point endPoint = new Point();
	private Color color;

	public Line(Point startPoint, Point endPoint, Color color) {
		this.startPoint = startPoint;
		this.endPoint = endPoint;
		this.color = color;
	}

	public Line() {
		// TODO Auto-generated constructor stub
	}

	public Point getStartPoint() {
		return startPoint;
	}

	public void setStartPoint(Point startPoint) {
		this.startPoint = startPoint;
	}

	public Point getEndPoint() {
		return endPoint;
	}

	public void setEndPoint(Point endPoint) {
		this.endPoint = endPoint;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub

	}

//	@Override
//	public String toString() {
//		return "Line [startPoint=" + startPoint + ", endPoint=" + endPoint + ", color=" + color + "]";
//	}

	public Line clone() {
		try {
			Line line = (Line) super.clone();
			return line;
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;

	}

}
