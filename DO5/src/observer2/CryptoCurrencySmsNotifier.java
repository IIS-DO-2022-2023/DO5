package observer2;

import java.util.Observable;
import java.util.Observer;

public class CryptoCurrencySmsNotifier implements Observer {
	private double bitcoinPrice;
	private double ethereumPrice;

	@Override
	public void update(Observable o, Object arg) {
		CryptoCurrencyPrice cryptoCurrencyPrice = (CryptoCurrencyPrice) o;
		bitcoinPrice = cryptoCurrencyPrice.getBitcoinPrice();
		ethereumPrice = cryptoCurrencyPrice.getEthereumPrice();
		sendSMS();
	}

	public void sendSMS() {
		System.out.println(bitcoinPrice);
		System.out.println(ethereumPrice);
	}

}
