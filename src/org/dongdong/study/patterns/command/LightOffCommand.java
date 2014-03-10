package org.dongdong.study.patterns.command;

public class LightOffCommand implements Command {

	Light light;

	public LightOffCommand(Light light) {
		this.light = light;
	}

	@Override
	public void undo() {
		light.lightOn();
	}

	@Override
	public void execute() {
		light.lightOff();
	}

}
