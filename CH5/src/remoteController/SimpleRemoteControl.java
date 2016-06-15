package remoteController;

public class SimpleRemoteControl {
	Command slot;

	public SimpleRemoteControl() {

	}

	public void setCommand(Command command) {
		this.slot = command;
	}
	
	public void buttomWasPressed() {
		this.slot.excute();
	}
	
	public void undobuttomWasPressed() {
		this.slot.undo();
	}
}
