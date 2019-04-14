package com.dp.behavioural.strategy;

public class MultiplyOperation implements OperationalStrategy {

	@Override
	public int calculate(int op1, int op2) {
		return op1 * op2;
	}

}
