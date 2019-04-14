package com.dp.behavioural.nulll;

public class CustomerFactory {
	
	private Database  database;
	
	public CustomerFactory() {
		
		this.database = new Database();
	}
	
	public AbstractCustomer getCustomer(String name) {
		
		if(database.isExists(name)) {
			return new RealCustomer(name);
		}
		
		return new NullCustomer();
	}

}
