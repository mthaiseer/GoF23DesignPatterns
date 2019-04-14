package com.dp.behavioural.observer;

/**
 * This is observer class which listen to stock subject
 * @author mohamed.thaiseer
 *
 */
public class StockMarketObserver implements Observer {
	
	private StockMarket stock;
	
	public StockMarketObserver(StockMarket stock) {
		this.stock = stock;
		stock.addObsever(this);
	}

	@Override
	public void update(int currentPrice) {
		
		System.out.println("updated stock market current value :"+ currentPrice);

	}

}
