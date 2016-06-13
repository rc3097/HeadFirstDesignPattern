package starbucks;

public class Mocha extends CondimentDecorator {

	public Mocha(Beverage beverage) {
		super(beverage);
		this.description = "Mocha";
		this.cost = 20;
	}

}
