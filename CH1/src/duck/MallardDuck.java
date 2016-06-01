package duck;


public class MallardDuck extends Duck {

	public  MallardDuck() {
		// TODO Auto-generated constructor stub
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	@Override
	public void display() {
		System.out.println("I am a MallardDuck");
	}

}
