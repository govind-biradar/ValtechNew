package assignment2;

import java.util.Scanner;

public class NumberSystem {
	
	public static void main(String[] args) {
		
		NumberSystem n =new NumberSystem();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number 1");
		int a = sc.nextInt();
		System.out.println("Enter the number 2");
		int b = sc.nextInt();
		
		int number = a + b ;
		
		n.decToBinary(number);
		
		
		
	}

	private void decToBinary(int number) {
		
//		int[] binary = new int[30];
//		
//		int i = 0; 
//        while (number > 0) { 
//            // storing remainder in binary array 
//            binary[i] = number % 2; 
//            number = number / 2; 
//            i++; 
//        } 
//  
//        // printing binary array in reverse order 
//        for (int j = i - 1; j >= 0; j--) 
//            System.out.print(binary[j]); 
        
        String inte = Integer.toBinaryString(number);
        
        String inte1= Integer.toHexString(number);
        
        System.out.println(inte);
        System.out.println(inte1);
        
		
		
		
		
		
		
	}

}
