package designPuzzel1;

public class Queen extends Character {
	public Queen() {
		// TODO Auto-generated constructor stub
		weapon = new KnifeBehavior();
	}
	@Override
	public void fight() {
		weapon.useWeapon();
	}
}
