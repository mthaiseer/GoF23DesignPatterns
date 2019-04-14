package com.dp.behavioural.strategy;

public class OperationManager implements OperationalStrategy {
	
	OperationalStrategy operation;
	
	public OperationManager(OperationalStrategy operation){
		this.operation = operation;
		
	}

	@Override
	public int calculate(int op1, int op2) {
		return operation.calculate(op1, op2);
	}

}
