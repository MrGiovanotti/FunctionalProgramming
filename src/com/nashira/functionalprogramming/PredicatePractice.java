package com.nashira.functionalprogramming;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicatePractice {
	
	public static void main(String[] args) {
		
		// A Predicate takes an argument and returns a boolean value
		
		
		// =========== Example 1 ============
		Predicate<Integer> myPredicate = num -> num > 0;		
		// To execute a Predicate we use test()
		boolean result = myPredicate.test(-2);		
		System.out.println(result);
		
		
		// ============== Example 2 =============
		Predicate<String> myPredicate2 = word -> word.equals("hello");
		if (myPredicate2.test("hello")) {
			System.out.println("Esto es un saludo");
		} else {
			System.out.println("Esto no es un saludo");
		}
		
		
		// ************* BIPREDICATE *****************
		
		// A BiPredicate takes two arguments and returns a boolean value
		
		
		// =========== Example 1 ============
		BiPredicate<String, String> myBiPredicate = (word1, word2) -> word1.equalsIgnoreCase(word2);
		if (myBiPredicate.test("hola", "Hola")) {
			System.out.println("Las palabras son iguales");
		} else {
			System.out.println("Las palabras no son iguales");
		}
		
		// ============ Example 2 ===========
		
		// We are going to a abbreviate the last BiPredicate
		// This is the same BiPredicate than the one in example 1
		BiPredicate<String, String> myShortPredicate = String::equalsIgnoreCase;
		System.out.println(myShortPredicate.test("Hola", "Chao"));
		
		
		
	}

}
