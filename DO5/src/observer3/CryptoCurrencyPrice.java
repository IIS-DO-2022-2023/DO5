package observer3;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class CryptoCurrencyPrice {
	private double bitcoinPrice;
	private double ethereumPrice;

	PropertyChangeSupport propertyChangeSupport;

	public CryptoCurrencyPrice() {
		propertyChangeSupport = new PropertyChangeSupport(this);
	}

	public void setBitcoinPrice(double bitcoinPrice) {
		propertyChangeSupport.firePropertyChange("bitcoin", this.bitcoinPrice, bitcoinPrice);
		this.bitcoinPrice = bitcoinPrice;
	}

	public void setEthereumPrice(double ethereumPrice) {
		propertyChangeSupport.firePropertyChange("ethereum", this.ethereumPrice, ethereumPrice);
		this.ethereumPrice = ethereumPrice;
	}

	public void addPropertyChangeListener(PropertyChangeListener pcl) {
		propertyChangeSupport.addPropertyChangeListener(pcl);
	}

	public void removePropertyChangeListener(PropertyChangeListener pcl) {
		propertyChangeSupport.removePropertyChangeListener(pcl);
	}
}
