package com.nashira.functionalprogramming.stream;

import java.util.stream.Stream;

public class StreamMapToInt {

	public static void main(String[] args) {
		// Convierte un Stream en un IntStream:

		// Vamos a sumar las letras de un Stream de palabras.

		Stream<String> words = Stream.of("Hola", "abajo", "llama", "corazón");

		int lettersCount = words.mapToInt(word -> word.length()).sum();

		System.out.println("Cantidad de letras: " + lettersCount);

	}

}
