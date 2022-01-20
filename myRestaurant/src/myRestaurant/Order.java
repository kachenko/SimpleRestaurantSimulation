package myRestaurant;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Order {
	
	private List<String> order;
	
	public Order() {
		order = new ArrayList<>();
	}

	public List<String> getOrder() {
		return order;
	}

	public void setOrder(List<String> orderedItems) {
		this.order = orderedItems;
	}
	
	public void makeOrder(Menu m, String name) {
		try {
			if(m.ifExistInMenu(name))
			{
				order.add(name);
				System.out.println("You have ordered "+name+". Something else?");
			}
			else throw new ProductDoesNotExistException();
		}
		catch (ProductDoesNotExistException e) {
			System.err.println("You should select something else.");
		}
	}
	
	public boolean isThisItemSelected(String name) {
		for(int i=0; i<order.size(); i++)
			if(order.get(i)==name) return true;
		return false;
	}
	
	public void infoIsThisItemSelected(String name) {
		if(isThisItemSelected(name)) System.out.println(name+"? Yes, you ordered "+name+".");
		else System.out.println(name+"? No, you didn’t order "+name+".");
	}
	
	public Integer howManyItemsOrdered() {
		return order.size();
	}
	
	public Double orderPrice(Menu menu) {
		double price = 0.0; 
		for(Map.Entry<String, Double> e : menu.entrySet()) 
			for(int i=0; i<order.size(); i++) 
				if(order.get(i) == e.getKey()) 
					price+=e.getValue(); 
		return price; 
	}
	
	public void showPrice(Menu menu) {
		System.out.println("You ordered for "+orderPrice(menu)+" PLN.");
	}
	
	public void showOrder() {
		for(int i=0; i<order.size(); i++)
			System.out.println("Your "+(i+1)+" item: "+order.get(i));
	}
}
