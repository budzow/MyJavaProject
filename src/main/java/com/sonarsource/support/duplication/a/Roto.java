package com.sonarsource.support.duplication.a;

public class Roto {

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

	public int bloque(){
		int j = 22 + 33;
		j++;
		j++;
		j++;
		j++;
		j++;
		return ++j;
	}
	
	
	public int mapetSHow(){
		int f = 22 + 33;
		f++;
		f++;
		f++;
		f++;
		f++;
		return ++f;
	}	
}
