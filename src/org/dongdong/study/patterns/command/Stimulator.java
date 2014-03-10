package org.dongdong.study.patterns.command;

import java.util.Queue;

public class Stimulator {

	public static void main(String[] args) {

		RemoteControl control = new RemoteControl();

		control.setCommand(0, new LightOnCommand(new Light()), new LightOffCommand(new Light()));
		control.setCommand(1, new DoorOpenCommand(new Door()), new DoorCloseCommand(new Door()));

		control.onButtonWasPushed(0);
		control.offButtonWasPushed(0);
		control.onButtonWasPushed(1);
		control.offButtonWasPushed(1);

		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		Queue<Command> qCommands = control.getQueue();
		for (Command command : qCommands) {
			command.undo();
		}

	}

}
