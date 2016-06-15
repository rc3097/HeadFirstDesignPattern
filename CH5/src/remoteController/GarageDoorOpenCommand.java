package remoteController;

public class GarageDoorOpenCommand implements Command {
	Garage garage ;
	public GarageDoorOpenCommand(Garage garage) {
		this.garage = garage;
	}
	@Override
	public void excute() {
		garage.open();
	}
	public void undo() {
		garage.close();
	}

}
