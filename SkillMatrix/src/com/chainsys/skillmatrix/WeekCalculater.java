package com.chainsys.skillmatrix;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class WeekCalculater {
	 public static void main(String[] args) {
	        LocalDate startDate = LocalDate.of(2024, 1, 1);
	        LocalDate endDate = LocalDate.of(2024, 3, 31);   
	        long weeks = calculateWeeks(startDate, endDate);    
	        System.out.println("Number of weeks between " + startDate + " and " + endDate + ": " + weeks);
	    }
	    
	    public static long calculateWeeks(LocalDate startDate, LocalDate endDate) {
	        long days = ChronoUnit.DAYS.between(startDate, endDate);
	        long weeks = days / 7;
	        
	        return weeks;
	    }
	}

