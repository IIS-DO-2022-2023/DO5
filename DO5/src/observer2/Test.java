package observer2;

public class Test {

	public static void main(String[] args) {
		CryptoCurrencyPrice cryptoCurrencyPrice = new CryptoCurrencyPrice();
		CryptoCurrencySmsNotifier cryptoCurrencySmsNotifier = new CryptoCurrencySmsNotifier();

		cryptoCurrencyPrice.addObserver(cryptoCurrencySmsNotifier);

		cryptoCurrencyPrice.setBitcoinPrice(50000);
		cryptoCurrencyPrice.setEthereumPrice(3000);

	}

}
