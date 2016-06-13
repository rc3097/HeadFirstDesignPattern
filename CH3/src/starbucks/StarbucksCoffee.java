package starbucks;

public class StarbucksCoffee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Beverage beverage = new Espresso();
		sysout(beverage);
		
		Beverage beverage2 = new DarkRoast();
		beverage2 =  new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		sysout(beverage2);
		
		Beverage beverage3 = new HouseBlend();
		beverage3 = new Whip(beverage3);
		beverage3 = new Mocha(beverage3);
		sysout(beverage3);
	}
	
	public static void sysout(Beverage beverage) {
		System.out.println(beverage.getDescription()+"$"+beverage.cost());
	}

}
