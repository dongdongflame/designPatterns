package org.dongdong.study.patterns.command;

public class DoorCloseCommand implements Command {

	Door door;

	public DoorCloseCommand(Door door) {
		this.door = door;
	}

	@Override
	public void undo() {
		door.open();
	}

	@Override
	public void execute() {
		door.close();
	}

}
