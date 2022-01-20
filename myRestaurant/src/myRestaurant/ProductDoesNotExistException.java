package myRestaurant;

public class ProductDoesNotExistException extends Exception {
	
	public ProductDoesNotExistException() {
		System.err.println("The item does not exist.");
	}
	
}
