package com.nashira.functionalprogramming.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilter {

	public static void main(String[] args) {
		// filter() sirve para filtrar datos, se puede utilñizar para búsquedas

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 20, 30, 40);

		List<Integer> lowNumbers = numbers.stream().filter(num -> num < 10)
				.collect(Collectors.toList());
		lowNumbers.forEach(System.out::println);

		// Vamos a buscar el número 8 (Para este ejemplo sería mejor usar anyMatch())
		List<Integer> number8 = numbers.stream().filter(num -> num == 8)
				.collect(Collectors.toList());

		if (!number8.isEmpty()) {
			System.out.println("El número fue encontrado");
		} else {
			System.out.println("El número NO fue encontrado");
		}

		// findFirst() es un método terminal, interrumpe el filter cuando encuentra
		// la primera coincidencia. Devuelve un Optional
		int firstHighNumber = numbers.stream().filter(num -> num > 10).findFirst().get();

		System.out.println("El primer número alto encontrado es: " + firstHighNumber);

	}

}
