package observer3;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class CryptoCurrencySmsNotifier implements PropertyChangeListener {
	private double bitcoinPrice;
	private double ethereumPrice;

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		if (evt.getPropertyName().equals("bitcoin"))
			this.bitcoinPrice = (double) evt.getNewValue();
		if (evt.getPropertyName().equals("ethereum"))
			this.ethereumPrice = (double) evt.getNewValue();
		sendSMS();

	}

	public void sendSMS() {
		System.out.println(bitcoinPrice);
		System.out.println(ethereumPrice);
	}

}
