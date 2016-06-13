package starbucks;

public class Whip extends CondimentDecorator {

	public Whip(Beverage beverage) {
		super(beverage);
		// TODO Auto-generated constructor stub
		this.description = "Whip";
		this.cost = 30;

	}

}
