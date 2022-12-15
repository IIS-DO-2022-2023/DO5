package methodFactory;

public class UtilityBill implements Bill {

	@Override
	public void calculateTotal() {
		System.out.println("Total is calculated...");

	}

	@Override
	public void pay() {
		System.out.println("The bill is paid...");

	}

}
