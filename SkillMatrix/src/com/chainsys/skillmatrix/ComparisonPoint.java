package com.chainsys.skillmatrix;

public class ComparisonPoint {
	public static void getMarks(int[] alice,int[] bob) {
		int aliceMark=0;
		int bobMark=0;
		for(int i=0;i<alice.length;i++) {
			if(alice[i]>bob[i]) {
				aliceMark++;
			}
			else if(bob[i]>alice[i]){
				bobMark++;
			}
		}
		System.out.println("Alice "+aliceMark+"\n"+"Bob "+bobMark);
	}
	public static void main(String[] args) {
		getMarks(new int[] {5,6,7}, new int[]{3,6,10});
		getMarks(new int[] {17,28,30}, new int[]{99,16,8});
	}
}

