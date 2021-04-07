package com.nashira.functionalprogramming.stream;

import java.util.stream.Stream;

public class StreamReduce {

	public static void main(String[] args) {
		// Nos permite reducir un stream a un solo elemento:

		Stream<String> names = Stream.of("Juan", "Lorenzo", "Diana");

		// El primer parámetro es un valor inicial
		String result = names.reduce("Resultado concatenación: ",
				(valorAnterior, elementoActual) -> valorAnterior + " " + elementoActual);
		System.out.println(result);

		// Otro ejemplo: Vamos a sumar los enteros de un stream
		Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5);
		int resultSum = numbers.reduce(0,
				(valorAnterior, elementoActual) -> valorAnterior + elementoActual);
		System.out.println(resultSum);

		// Otra manera de hacer el ejemplo anterior
		Stream<Integer> numbers1 = Stream.of(1, 2, 3, 4, 5);
		int resultSum1 = numbers1.reduce(0,
				(valorAnterior, elementoActual) -> Integer.sum(valorAnterior, elementoActual));
		System.out.println(resultSum1);

		// Podemos abreviar el ejemplo anterior
		Stream<Integer> numbers2 = Stream.of(1, 2, 3, 4, 5);
		int resultSum2 = numbers2.reduce(0, Integer::sum);
		System.out.println(resultSum2);
	}

}
