package day3;

import java.util.Iterator;

public class Rot3Helper {
	public static char rotate(char achar ) {
		if(achar>='a' && achar<='m' || achar>='A' && achar<='M') {
			achar=(char)(achar+13);
		}else if(achar>='n' && achar<='z' || achar>='N' && achar<='Z') {
			achar=(char)(achar-13);
		}
		return achar;
	}
	public static void main(String[] args) {
		String s="Hello World1 ";
		for (int i = 0; i < s.length(); i++) {
			System.out.println(rotate(s.charAt(i)));
			
		}
		
	}

}
