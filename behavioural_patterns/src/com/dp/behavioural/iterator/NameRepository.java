package com.dp.behavioural.iterator;

public class NameRepository {
	
	private String[] names =  {"thaiseer", "sabir", "fayiz", "safa"};
	
	public Iterator getIterator() {
		return  new NameIterator(names);
	}

}
