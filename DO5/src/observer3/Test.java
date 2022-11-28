package observer3;

public class Test {

	public static void main(String[] args) {
		CryptoCurrencyPrice cryptoCurrencyPrice = new CryptoCurrencyPrice();
		CryptoCurrencySmsNotifier cryptoCurrencySmsNotifier = new CryptoCurrencySmsNotifier();

		cryptoCurrencyPrice.addPropertyChangeListener(cryptoCurrencySmsNotifier);

		cryptoCurrencyPrice.setBitcoinPrice(50000);
		cryptoCurrencyPrice.setEthereumPrice(3000);

	}

}
