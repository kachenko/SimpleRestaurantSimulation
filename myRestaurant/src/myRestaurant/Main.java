package myRestaurant;

public class Main {

	static Menu menu = new Menu();
	// static Order order = new Order();
	
	public static Menu fillMenu() {
		
		menu.addItem("Tomato soup", 4.0);
		menu.addItem("Krupnik", 4.0);
		menu.addItem("Goulash", 9.0);
		menu.addItem("Dumplings", 9.5);
		menu.addItem("Chicken roulade", 4.0);
		menu.addItem("Potatoes", 4.0);
		menu.addItem("Buckwheat groats", 3.5);
		menu.addItem("Pearl barley groats", 3.5);
		menu.addItem("Salad With sauerkraut", 4.0);
		menu.addItem("Beetroot", 4.0);
		menu.addItem("Cheesecake", 6.0);
		return menu;
		
	}
	
	public static void main(String[] args) {
		
		Order order = new Order();
		System.out.println("Our menu: ");
		fillMenu();
		menu.showMenu();

		System.out.println("\n------------\n\nLet's place your order.");
		order.makeOrder(menu, "Potatoes");
		order.makeOrder(menu, "Cheesecake");
		order.makeOrder(menu, "Salad With sauerkraut");
		order.makeOrder(menu, "Borscht");
		order.makeOrder(menu, "Dumplings");
		order.makeOrder(menu, "Potato fries");
		
		System.out.println("\nYour order: ");
		order.showOrder();

		System.out.println("");
		
		order.infoIsThisItemSelected("Cheesecake");
		order.infoIsThisItemSelected("Goulash");
		
		System.out.println("\nYou ordered "+order.howManyItemsOrdered()+" dishes in total.\n");
		
		order.showPrice(menu);
	}

}
