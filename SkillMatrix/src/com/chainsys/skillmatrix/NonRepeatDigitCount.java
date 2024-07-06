package com.chainsys.skillmatrix;
	import java.util.Scanner;

	public class NonRepeatDigitCount {
	    
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int start = scanner.nextInt();
	        int end = scanner.nextInt();
	        int count = 0;
	        for (int num = start; num <= end; num++) {
	            if (!hasRepeatDigits(num)) {
	                count++;
	            }
	        }
	        System.out.println(count); 
	        scanner.close();
	    }
	    private static boolean hasRepeatDigits(int number) {
	        String numStr = String.valueOf(number);
	        char firstDigit = numStr.charAt(0);
	        for (int i = 1; i < numStr.length(); i++) {
	            if (numStr.charAt(i) != firstDigit) {
	                return false;
	            }
	        }
	        
	        return true;
	    }
	}

