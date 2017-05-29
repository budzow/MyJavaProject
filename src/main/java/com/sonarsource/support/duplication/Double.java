package com.sonarsource.support.duplication;

public class Double {

	private String mystery;
	
	public Double(String s) {
		mystery = s;		
	}
	
	public void testU(){
		String p = "22";
		String r = "33";
		String s = "44";
		String t = "55";
		String q = "66";
		
		(p+r+s+t+q).toString();
		
		String.valueOf(44);
		String.valueOf(55);
	}

	public void testV(){
		String p = "22";
		String r = "33";
		String s = "44";
		String t = "55";
		String q = "66";
		
		(p+r+s+t+q).toString();
		
		String.valueOf(44);
		String.valueOf(55);
	}	
	
	public void testW(){
		String p = "22";
		String r = "33";
		String s = "44";
		String t = "55";
		String q = "66";
		
		(p+r+s+t+q).toString();
		
		String.valueOf(44);
		String.valueOf(55);
	}
	
	
}