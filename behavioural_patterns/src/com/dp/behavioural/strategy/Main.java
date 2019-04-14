package com.dp.behavioural.strategy;

public class Main {

	public static void main(String[] args) {

		OperationManager manager = new OperationManager(new AddOperation());
		int addResult = manager.calculate(10, 20);
		System.out.println("Add result : " + addResult);

		manager = new OperationManager(new MultiplyOperation());
		int multiResult = manager.calculate(10, 20);
		System.out.println("Add result : " + multiResult);
	}

}
