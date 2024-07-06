package com.chainsys.skillmatrix;

import java.util.Scanner;

public class GCD {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int n = scanner.nextInt();
	        int[] arr = new int[n];
	        for (int i = 0; i < n; i++) {
	            arr[i] = scanner.nextInt();
	        }
	        int gcdResult = arr[0];
	        for (int i = 1; i < n; i++) {
	            gcdResult = gcd(gcdResult, arr[i]);
	        }
	        for (int i = 0; i < n; i++) {
	            System.out.print(arr[i] / gcdResult + " ");
	        }
	        
	        scanner.close();
	    }
	    private static int gcd(int a, int b) {
	        while (b != 0) {
	            int temp = b;
	            b = a % b;
	            a = temp;
	        }
	        return a;
	    }
	}
