package com.dp.behavioural.observer;

public class Main {

	public static void main(String[] args) {
		
		StockMarket stock = new StockMarket();
		StockMarketObserver observer = new StockMarketObserver(stock);
		NewsChannelMarketObserver newsObserver = new NewsChannelMarketObserver(stock);
		
		
		
		stock.setCurrentPrice(400);

		

	}

}
