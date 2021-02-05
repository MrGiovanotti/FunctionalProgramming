package com.nashira.functionalprogramming;

import java.util.Date;
import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionPractice {
	
	public static void main(String[] args) {
		// A function takes a parameter and returns a value.It's like a mix between Consumer and Supplier
		
		// =========== EXAMPLE 1 =============
		Function<String, String> myFunction = (name) -> "Hello, my name is " + name;
		// To call a Function, we call apply()
		System.out.println(myFunction.apply("Giovanny"));
		
		
		// =========== EXAMPLE 2 =============
		Function<String, String> convertToUpper = (word) -> word.toUpperCase();
		System.out.println(convertToUpper.apply("hello world"));
		
		
		// ========== EXAMPLE 3 =============
		// We can also abbreviate a Function.
		// This Function is the same that the one in example 2
		Function<String, String> shortConvertToUpper = String::toUpperCase;
		System.out.println(shortConvertToUpper.apply("vamos a convertir a mayúsculas"));
		
		
		// ******************* BIFUNCTION *******************
		
		// A BiFunction receives two parameters and returns a value
		
		// ============ EXAMPLE 1 ========================
		BiFunction<String, Date, String> myBiFunction =
				(name, date) -> "Hello, my name is " + name + " and the date is " + date;
		System.out.println(myBiFunction.apply("Giovanny", new Date()));
		
		// ============= EXAMPLE 2 ================
		BiFunction<String, String, Integer> myComparator = (name1, name2) -> name1.compareTo("name2");
		System.out.println(myComparator.apply("Jose", "Giovanny"));
		
		// ============ EXAMPLE 3 ================
		// We are going to abbreviate the Function in example 2
		BiFunction<String, String, Integer> myShortComparator = String::compareTo;
		System.out.println(myShortComparator.apply("Giova", "Giova"));
	}

}
