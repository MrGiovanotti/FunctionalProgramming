package com.nashira.functionalprogramming.stream;

import java.util.stream.Stream;

public class StreamFlatMap {

	// A diferencia de un map(), que devuelve un objeto, un flatMap()
	// devuelve un Stream de ese objeto

	public static void main(String[] args) {

		Stream<String> pepes = Stream.of("Juan", "Anibal", "Pepe", "Lorenzo", "Pepe", "Juan").flatMap(name -> {
			if (name.contentEquals("Pepe")) {
				return Stream.of(name);
			}
			return Stream.empty();
		});

		pepes.forEach(System.out::println);

	}

}
