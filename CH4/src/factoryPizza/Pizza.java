package factoryPizza;

import java.util.ArrayList;

public abstract class Pizza {
	String name;
	String dough;
	String sauce;
	ArrayList toppings = new ArrayList();
	
	void prepare() {
		System.out.println("Preparing "+name);
		System.out.println("Tossing ");
	}

	public void bake() {
		// TODO Auto-generated method stub
		
	}

	public void cut() {
		// TODO Auto-generated method stub
		
	}

	public void box() {
		// TODO Auto-generated method stub
		
	}
}
