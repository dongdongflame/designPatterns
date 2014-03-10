package org.dongdong.study.patterns.command;

public class DoorOpenCommand implements Command {

	Door door;

	public DoorOpenCommand(Door door) {
		this.door = door;
	}

	@Override
	public void undo() {
		door.close();
	}

	@Override
	public void execute() {
		door.open();
	}

}
