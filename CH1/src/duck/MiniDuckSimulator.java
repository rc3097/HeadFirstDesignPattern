package duck;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		Duck mallarDuck = new MallardDuck();
		mallarDuck.performQuack();
		mallarDuck.performFly();
		
		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}

}
