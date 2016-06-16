package menu;

public class MenuTestDrive {
	public static void main(String[] args) {
		PancakeHouseMenu panHouseMenu = new PancakeHouseMenu();
		DinerMenu dinerMenu = new DinerMenu();
		CafeMenu cafeMenu = new CafeMenu();
		Waitress waitress = new Waitress(panHouseMenu, dinerMenu,cafeMenu);
		
		waitress.printMenu();
	}
}
