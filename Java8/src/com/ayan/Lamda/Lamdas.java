package com.ayan.Lamda;

import java.util.Arrays;
import java.util.List;

public class Lamdas {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5);
		
		
		
		System.out.println(isPrime(numbers));
	}

	private static Integer isPrime(List<Integer> numbers) {
		
		return numbers
				.stream()
				.filter(e -> e > 3)
				.findFirst()
				.get();
		
		
		
	}

}
