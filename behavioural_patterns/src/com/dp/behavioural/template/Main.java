package com.dp.behavioural.template;

public class Main {

	public static void main(String[] args) {

		DatabaseTemplate oracle = new OracleConnection();
		oracle.run();
		
		System.out.println("**************");

		DatabaseTemplate nosql = new NoSQLConnection();
		nosql.run();

	}

}
