package com.dp.behavioural.template;

public class NoSQLConnection extends DatabaseTemplate {

	@Override
	public void init() {

		System.out.println("NO SQL connection established");
	}

	@Override
	public void executeQuery() {
		
		System.out.println("NO SQL Executing query ");

	}

	@Override
	public void close() {
		
		System.out.println("Closing NOSQL  connection");

	}

}
