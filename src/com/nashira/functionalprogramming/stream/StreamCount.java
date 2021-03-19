package com.nashira.functionalprogramming.stream;

import java.util.Arrays;
import java.util.List;

public class StreamCount {

	public static void main(String[] args) {
		// count() nos sirve para contar los elementos de un stream. Devuelve un Long

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 20, 30, 40);

		System.out.println(numbers.stream().count());
	}

}
