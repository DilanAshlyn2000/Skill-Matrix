package com.chainsys.skillmatrix;

public class PrintSampleOutput {
	public static void main(String[] args) {
		int[] arr= {4,3,7,6,7,2,2};
		int number=76;

		for(int i=0;i<arr.length-1;i++) {
			if((arr[i]*10)+arr[i+1]==number) {
				System.out.println(arr[i-1]);
				break;
			}
		}
	}
}
