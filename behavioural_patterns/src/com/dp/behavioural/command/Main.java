package com.dp.behavioural.command;

/**
 * Main classes
 * 
 * Command  - TurnOnCommand and TurnOffCommand
 * Receiver  - Light class 
 * Invoker  - Command Invoker 
 * 
 * @author mohamed.thaiseer
 *
 */
public class Main {

	public static void main(String[] args) {
		
		CommandInvoker invoker = new CommandInvoker();
		Light light  = new Light();
		
		TurnOffCommand turnOffCommand = new TurnOffCommand(light);
		TurnOnCommand turnOnCommand = new TurnOnCommand(light);
		
		invoker.addCommand(turnOnCommand);
		invoker.addCommand(turnOffCommand);

		invoker.excuteAllCommands();

	}

}
