package com.dp.behavioural.template;

public class OracleConnection extends DatabaseTemplate {

	@Override
	public void init() {

		System.out.println("Oracle connection established");
	}

	@Override
	public void executeQuery() {
		
		System.out.println("Executing query ");

	}

	@Override
	public void close() {
		
		System.out.println("Closing oracle connection");

	}

}
