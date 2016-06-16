package menu;

import java.util.Iterator;

public class Waitress {
	PancakeHouseMenu pancakeHouseMenu;
	DinerMenu dinerMenu;
	CafeMenu cafeMenu;
	
	public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu, CafeMenu cafeMenu) {
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;
		this.cafeMenu = cafeMenu;
	}
	
	public void printMenu() {
		Iterator<MenuItem> pancakeIterator = pancakeHouseMenu.createIterator();
		Iterator<MenuItem> dinerIterator = dinerMenu.createIterator();
		Iterator<MenuItem> cafeIterator = cafeMenu.createIterator();
		System.out.println("MENU\n---\nBREAKFAST");
		printMenu(pancakeIterator);
		System.out.println("\nLunch");
		printMenu(dinerIterator);
		System.out.println("\nDinner");
		printMenu(cafeIterator);
	}

	private void printMenu(Iterator<MenuItem> iterator) {
		// TODO Auto-generated method stub
		while (iterator.hasNext()) {
			MenuItem menuItem = iterator.next();
			System.out.println(menuItem);
		}
	}
}
