package menu;

public class MenuItem {
	String name;
	String description;
	boolean vegetarian;
	double price;
	public MenuItem(String name, String description, boolean vegetarian2,
			double price) {
		super();
		this.name = name;
		this.description = description;
		this.vegetarian = vegetarian2;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public String getDescription() {
		return description;
	}
	public boolean getVegetarian() {
		return vegetarian;
	}
	public double getPrice() {
		return price;
	}
	
	public String toString() {
		return name+","+price+"--"+description;
	}
	
}
