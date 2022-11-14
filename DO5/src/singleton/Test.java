package singleton;

public class Test {

	public static void main(String[] args) {
		DatabaseConnection databaseConnection = DatabaseConnection.getInstance();
		DatabaseConnection databaseConnection2 = DatabaseConnection.getInstance();
		
		System.out.println(databaseConnection);
		System.out.println(databaseConnection2);
		System.out.println(Integer.toHexString(databaseConnection2.hashCode()));
		
		DatabaseConnectionLazy dataConnectionLazy = 
				DatabaseConnectionLazy.getInstance();
		
		DatabaseConnectionLazy dataConnectionLazy2 = 
				DatabaseConnectionLazy.getInstance();
		
		System.out.println(dataConnectionLazy);
		System.out.println(dataConnectionLazy2);

	}

}
