package com.dp.behavioural.template;

public abstract class DatabaseTemplate {
	
	public abstract void init();
	public abstract void executeQuery();
	public abstract void close();
	
	public void run() {
		init();
		executeQuery();
		close();
	}
	

}
