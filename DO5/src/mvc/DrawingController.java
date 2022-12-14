package mvc;

import java.awt.Color;
import java.awt.event.MouseEvent;

import command.AddPointCmd;
import composite.SremBanatBacka;

public class DrawingController {
	private DrawingFrame frame;
	private DrawingModel model;

	public DrawingController(DrawingModel model, DrawingFrame frame) {
		this.model = model;
		this.frame = frame;
	}

	public void mouseClicked(MouseEvent e) {
		Point p = new Point(e.getX(), e.getY(), Color.RED);
		// model.add(p);
		AddPointCmd addPointCmd = new AddPointCmd(model, p);
		addPointCmd.execute();

		Point srem = new Point(20, 20, Color.BLUE);
		Point banat = new Point(30, 20, Color.BLUE);
		Point backa = new Point(25, 12, Color.BLUE);

		SremBanatBacka sremBanatBacka = new SremBanatBacka();

		sremBanatBacka.add(srem);
		sremBanatBacka.add(banat);
		sremBanatBacka.add(backa);

		model.add(sremBanatBacka);

		frame.repaint();
	}

}
