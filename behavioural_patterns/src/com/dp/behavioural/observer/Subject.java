package com.dp.behavioural.observer;

public interface Subject {
	
	public void addObsever(Observer observer);
	public void removeObsever(Observer observer);
	public void updateAllObservors();
	

}
