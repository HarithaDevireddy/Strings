package com.Lab2.StringExercise;

public class PositiveString {
	
	

	public String getSort(String[] str) {
		if(isEmpty(str)) {
			return null;
		
	  }
		else {
			boolean check=false;
		
		String str1=str[0];
		for(int i=0;i<str1.length()-1;i++) {
			if(str1.charAt(i)<str1.charAt(i+1)) {
				check= true;
		
			}
			else {
				check=false;
			      break;
			}
			
		}
			if(check==true ) {
				return "positive string";
			}
			else {
				return "negative string";
			}
		
					
				
			
		}
	}

	private boolean isEmpty(String[] str) {
		
		return str.length==0;
		
		
	}

	
	

}
