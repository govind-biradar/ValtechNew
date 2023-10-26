package corejava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortOnVowels {
	public static void main(String[] args) {
		
		SortOnVowels sc= new SortOnVowels();
		
		String s1 = "Hello how are you";
//		String[] words = s1.split(" ");
//		System.out.println(Arrays.toString(words));
//		
//		String arrayString=	(String) Arrays.toString(words);
//		System.out.println(arrayString);
		
		sc.countingVowels(s1);
	}

	private void countingVowels(String s1) {
      char [] vowels = {'a','e','i','o','u'};
      int count=0;
		String[] words = s1.split(" ");
		ArrayList<String> arr = new ArrayList<String>();
		for(String s:words) {
			System.out.println(s);
			arr.add(s);	
		}
		System.out.println(arr.get(2));
		
		for(int i=0;i<arr.size();i++) {
			String name = arr.get(i);
			System.out.println(name);
			for(int j=0; j<vowels.length;i++) {
				if(name.charAt(j)==vowels[j]) {
					
					
				}count++;
//				System.out.println(count);
			}
	
			
		}
		
		
	}
	
	
	

}
//String s1 = "java string split method by javatpoint";
//String[] words = s1.split("\\s"); //splits the string based on whitespace
////using java foreach loop to print elements of string array
//for(String w:words) {
//  System.out.println(w);
//}