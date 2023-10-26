package corejava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class AsceDesc {
	public static void main(String[] args) {
		List<Integer> arr = Arrays.asList(4,5,3,2,1);
		List<Integer> arr1 = new ArrayList<Integer>();
//		System.out.println(arr);
//		List<Integer> arr2 = new ArrayList<Integer>();
		int j =Collections.max(arr);
		for(int i=0; i< arr.indexOf(j);i++) {
		if (arr.get(i) > j) {
				arr1.add(arr.get(i));
				arr1.add(j);
				
			}
			System.out.println(arr1);
		
		
		}
		
		
		
		
		
		
	}

}
