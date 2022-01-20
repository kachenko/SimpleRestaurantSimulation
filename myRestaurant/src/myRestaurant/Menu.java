package myRestaurant;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Menu {
	
	private Map<String, Double> menu;
	
	public Menu() {
		menu = new HashMap<>();
	}
	
	public Map<String, Double> getMenu() {
		return menu;
	}
	
	public void setMenu(Map<String, Double> menu) {
		this.menu = menu;
	}
	
	public Set<Entry<String, Double>> entrySet() {
		return menu.entrySet();
	}
	
	public void addItem(String name, Double price) {
		menu.put(name, price);
	}
		
	public void removeItem(String name) {
		for(String n : menu.keySet()) {
            if(ifExistInMenu(name)) {
                System.out.println("\n"+n + " has been removed from the menu.\n");
                menu.remove(name);
                break;
            }
        }
        System.out.println("\nNo item found\n");
	}
	
	public Double getPrice(String name) {
		for(Map.Entry<String, Double> entry : menu.entrySet()) {
				if(entry.getKey()==name)
					return menu.get(name);
		}
		return null;
	}

	public void showMenu() {
		for(Map.Entry<String, Double> entry : menu.entrySet())
			System.out.println(entry.getKey() + " - " + entry.getValue());
	}

	public boolean ifExistInMenu(String name) {
		if(menu.containsKey(name)) return true;
		return false;
	}
	
}
