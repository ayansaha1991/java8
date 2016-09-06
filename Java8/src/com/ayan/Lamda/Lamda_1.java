package com.ayan.Lamda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Lamda_1 {

	public static void main(String[] args) {
		
		List<String> names  = Arrays.asList("ayan","asmita");
/*		Collections.sort(names, new Comparator<String>() {

			@Override
			public int compare(String a, String b) {
				return a.compareTo(b);
			}
		});*/
		
		
		Collections.sort(names, (a,b) -> a.compareTo(b));
		
		System.out.println(names);
	}

}
