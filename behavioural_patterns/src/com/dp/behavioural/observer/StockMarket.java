package com.dp.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * This is subject class which hold state and observers
 * 
 * @author mohamed.thaiseer
 *
 */
public class StockMarket implements Subject{
	
	private int currentPrice;
    List<Observer> observors;
    
    public StockMarket() {
		this.observors= new ArrayList<>();
	}

	@Override
	public void addObsever(Observer observer) {
		observors.add(observer);
		
	}

	@Override
	public void removeObsever(Observer observer) {
		observors.remove(observer);		
	}

	@Override
	public void updateAllObservors() {
		for(Observer o : observors) {
			o.update(currentPrice);
		}
		
	}

	public void setCurrentPrice(int currentPrice) {
		
		this.currentPrice = currentPrice;
		updateAllObservors();
	}
	
  

}
