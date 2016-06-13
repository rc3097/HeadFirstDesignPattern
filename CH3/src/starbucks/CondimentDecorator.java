package starbucks;

public abstract class CondimentDecorator extends Beverage {
	protected Beverage beverage;

	public CondimentDecorator(Beverage beverage) {
		// TODO Auto-generated constructor stub
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + "," + this.description;
	}

	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return cost + beverage.cost();
	}

}
