package com.component.rest;

import org.junit.Test;

public class Teste {
	
	@Test
	public void printFizzBuzz() {
		for (int i = 1; i<=100; i++) {
			if ((i % 3 == 0) && (i % 5 == 0)) {
				System.out.println("FizzBuzz");
			}else if (i % 3 == 0) {
				System.out.println("Fizz");
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
		}
	}
	
	
	private int countStars(String[] result) {
		int stars = 0;
		for (String str : result) {
			if (str.startsWith("*")) {
				stars++;
				int i = 1;
				String temp = str;
				while ( i<=temp.length()) {
					temp = temp.substring(1);
					if (temp.startsWith("*")) {
						stars++;
					}
					i++;
				}
				
			}	
				
		}
		return stars;
	}
	
	@Test
	public void count() {
		String[] result = {"*--", "**-", "***"};
		System.out.println(countStars(result));
	}

}
