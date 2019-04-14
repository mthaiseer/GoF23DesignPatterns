package com.dp.behavioural.nulll;

public class Main {

	public static void main(String[] args) {
		
		CustomerFactory factory = new CustomerFactory();
		String customerExists = factory.getCustomer("thaiseer").getName();
		
		System.out.println(customerExists);
		
		String customerNonExists = factory.getCustomer("Salik").getName();
		System.out.println(customerNonExists);
	}

}
