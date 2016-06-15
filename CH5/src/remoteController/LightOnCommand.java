package remoteController;

public class LightOnCommand implements Command {
	Light light;
	public LightOnCommand(Light light) {
		this.light = light;
	}
	@Override
	public void excute() {
		light.on();
	}
	
	public void undo() {
		light.off();
	}
}
