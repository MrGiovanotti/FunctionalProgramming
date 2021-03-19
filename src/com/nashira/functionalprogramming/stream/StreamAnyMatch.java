package com.nashira.functionalprogramming.stream;

import java.util.Arrays;
import java.util.List;

public class StreamAnyMatch {

	public static void main(String[] args) {

		// anyMatch es un operador terminal, devuelve un booleano.
		// Puede utilizarse para búsquedas
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 20, 30, 40);

		// Vamos a buscar un número en numbers:
		boolean numberExists = numbers.stream().anyMatch(n -> n == 50);
		System.out.println(numberExists);
	}

}
