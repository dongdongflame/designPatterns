package org.dongdong.study.patterns.command;

public class LightOnCommand implements Command {

	Light light;

	public LightOnCommand(Light light) {
		this.light = light;
	}

	@Override
	public void undo() {
		light.lightOff();
	}

	@Override
	public void execute() {
		light.lightOn();
	}

}
