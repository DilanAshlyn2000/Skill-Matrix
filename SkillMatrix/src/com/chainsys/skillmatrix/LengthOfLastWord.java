package com.chainsys.skillmatrix;

public class LengthOfLastWord {

	    public static int lengthOfLastWord(String s) {
	   	        s = s.trim();
	        if (s.isEmpty()) {
	            return 0;
	        }
	        int lastSpaceIndex = s.lastIndexOf(' ');
	        return s.length() - lastSpaceIndex - 1;
	    }
	    
	    public static void main(String[] args) {
	        String input1 = "Hello World";
	        System.out.println(lengthOfLastWord(input1)); 
	        
	        String input2 = "Hello World";
	        System.out.println(lengthOfLastWord(input2)); 
	        
	        String input3 = "   ";
	        System.out.println(lengthOfLastWord(input3)); 
	        
	        String input4 = "";
	        System.out.println(lengthOfLastWord(input4)); 
	    }
	}

