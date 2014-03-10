package org.dongdong.study.patterns.command;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;

public class RemoteControl {

	Command[] onCommands;
	Command[] offCommands;

	Queue<Command> queue;

	public RemoteControl() {

		queue = new LinkedBlockingDeque<>();

		onCommands = new Command[7];
		offCommands = new Command[7];
		Command noCommand = new Command() {
			@Override
			public void execute() {
				System.out.println("doing nothing");
			}

			@Override
			public void undo() {
				System.out.println("doing nothing");
			}
		};

		for (int i = 0, j = onCommands.length; i < j; i++) {
			onCommands[i] = noCommand;
		}

		for (int i = 0, j = offCommands.length; i < j; i++) {
			offCommands[i] = noCommand;
		}

	}

	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}

	public void onButtonWasPushed(int slot) {
		onCommands[slot].execute();
		queue.add(onCommands[slot]);
	}

	public void offButtonWasPushed(int slot) {
		offCommands[slot].execute();
		queue.add(offCommands[slot]);
	}

	public Queue<Command> getQueue() {
		return queue;
	}

}
