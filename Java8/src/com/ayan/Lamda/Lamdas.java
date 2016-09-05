package com.ayan.Lamda;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Lamdas {
	
	public static boolean isGT3(int number) {
		return number > 3;
	}
	
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5);
		
		Optional<Integer> result = numbers.stream()
			.filter(Lamdas::isGT3)
			.filter(e -> e % 2 == 0)
			.map(e -> e*2)
			.findFirst();
		
		System.out.println(result);
		
		
	}

	

}
