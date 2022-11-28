package observer1;

public class CryptoCurrencySmsNotifier implements Observer {
	private double bitcoinPrice;
	private double ethereumPrice;

	@Override
	public void update(double bitcoinPrice, double ethereumPrice) {
		this.bitcoinPrice = bitcoinPrice;
		this.ethereumPrice = ethereumPrice;
		sendSMS();
	}

	public void sendSMS() {
		System.out.println(bitcoinPrice);
		System.out.println(ethereumPrice);
	}

}
