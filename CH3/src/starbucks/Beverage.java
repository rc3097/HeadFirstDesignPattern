package starbucks;

public abstract class Beverage {
	protected String description = "Unknown Beverage";
	protected int cost = 0;

	public int cost() {
		return cost;
	}

	public String getDescription() {
		return description;
	}
}
