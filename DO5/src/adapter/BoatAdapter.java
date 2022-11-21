package adapter;

public class BoatAdapter implements Vehicle {
	private Boat boat;

	public BoatAdapter(Boat boat) {
		this.boat = boat;
	}

	public void moveFaster() {
		boat.rowFaster();
	}

}
