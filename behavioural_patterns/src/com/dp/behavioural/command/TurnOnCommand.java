package com.dp.behavioural.command;

/**
 * Command class 
 * @author mohamed.thaiseer
 *
 */
public class TurnOnCommand implements Command {
	
	private Light light;
	
	public TurnOnCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {

		light.turnOn();
	}

}
