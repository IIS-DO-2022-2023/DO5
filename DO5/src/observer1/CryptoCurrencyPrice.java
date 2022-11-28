package observer1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CryptoCurrencyPrice implements Observable {
	private double bitcoinPrice;
	private double ethereumPrice;
	private List<Observer> observers = new ArrayList<>();

	public void setBitcoinPrice(double bitcoinPrice) {
		this.bitcoinPrice = bitcoinPrice;
		notifyObservers();
	}

	public void setEthereumPrice(double ethereumPrice) {
		this.ethereumPrice = ethereumPrice;
		notifyObservers();
	}

	@Override
	public void addObserver(Observer o) {
		observers.add(o);

	}

	@Override
	public void removeObserver(Observer o) {
		observers.remove(o);

	}

	@Override
	public void notifyObservers() {
		Iterator<Observer> it = observers.iterator();
		while (it.hasNext())
			it.next().update(bitcoinPrice, ethereumPrice);
	}

}
