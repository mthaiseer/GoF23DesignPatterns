package com.dp.behavioural.iterator;

public class Main {

	public static void main(String[] args) {
		
		NameRepository repository = new NameRepository();
		Iterator iterator = repository.getIterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
