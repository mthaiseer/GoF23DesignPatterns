package com.dp.behavioural.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Invoker class
 * @author mohamed.thaiseer
 *
 */
public class CommandInvoker {
	
	List<Command> commands;
	
	public CommandInvoker() {
		commands = new ArrayList<>();
	}
	
	
	public void addCommand(Command command) {
		commands.add(command);
	}
	
	public void excuteAllCommands() {
		for(Command c : commands) {
			c.execute();
		}
	}
	

}
