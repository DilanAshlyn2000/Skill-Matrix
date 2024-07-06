package com.chainsys.skillmatrix;

public class RemoveDuplicates {
	    public int removeDuplicates(int[] nums) {
	        if (nums.length == 0) {
	            return 0;
	        }	        
	        int j = 0; 	        
	        for (int i = 1; i < nums.length; i++) {
	            if (nums[i] != nums[j]) {
	                j++;
	                nums[j] = nums[i];
	            }
	        }    
	        return j + 1;
	    }
	    
	    public static void main(String[] args) {
	    	RemoveDuplicates solution = new RemoveDuplicates();	        
	        int[] nums1 = {1, 1, 2};
	        int len1 = solution.removeDuplicates(nums1); 
	        System.out.println("Length after removing duplicates: " + len1);        
	        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
	        int len2 = solution.removeDuplicates(nums2);  
	        System.out.println("Length after removing duplicates: " + len2);
	    }
	}


