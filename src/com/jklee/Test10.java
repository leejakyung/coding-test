package com.jklee;

import java.util.ArrayList;
import java.util.List;

public class Test10 {

	private List<String> strList = new ArrayList<>();
	

	
	public boolean validationString(String value) {
		
		for(String s : strList) {
			if(s.equalsIgnoreCase(value))
				return true;
		}
		
		return false;
	}
	
	
    public void add(String value) {
    	strList.add(value);
    }
	
	
}
