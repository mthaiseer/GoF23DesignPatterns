package com.dp.behavioural.nulll;

import java.util.ArrayList;
import java.util.List;

public class Database {
	
	List<String> names;
	
	public Database() {
		
		names= new ArrayList<>();
		names.add("thaiseer");
		names.add("safa");
		names.add("nashwa");
	}
	
	public boolean isExists(String name) {
		
		for(String id : names) {
			
			if(id.equals(name)) {
				return true;
			}
			
		}
		
		return false;
		
	}
	
	

}
