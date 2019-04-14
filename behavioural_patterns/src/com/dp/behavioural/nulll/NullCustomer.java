package com.dp.behavioural.nulll;

public class NullCustomer extends AbstractCustomer {

	@Override
	public boolean isNull() {
		return true;
	}

	@Override
	public String getName() {
		return "No record found";
	}

}
