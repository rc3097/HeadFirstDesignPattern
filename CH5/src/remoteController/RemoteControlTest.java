package remoteController;

public class RemoteControlTest {
	public static void main(String[] args) {
		SimpleRemoteControl remote = new SimpleRemoteControl();
		Light light = new Light();
		LightOnCommand lightOn = new LightOnCommand(light);
		Garage garage = new Garage();
		GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garage); 
		
		remote.setCommand(lightOn);
		remote.setCommand(garageDoorOpen);
		remote.buttomWasPressed();
		remote.buttomWasPressed();
		
		
	}
}
