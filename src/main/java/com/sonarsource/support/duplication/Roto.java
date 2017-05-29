package com.sonarsource.support.duplication;

public class Roto {

	public int mapetSHow(){
		int f = 22 + 33;
		f++;
		f++;
		f++;
		f++;
		f++;
		return ++f;
	}
	
	public static void main(String[] args) {
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
