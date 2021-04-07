package com.nashira.functionalprogramming.stream;

import java.util.stream.Stream;

public class StreamDistinct {

	public static void main(String[] args) {

		// Nos permite obtener los distintos objetos de un stream

		Stream<String> names = Stream.of("Giova", "Juan", "Carol", "Giova", "Carol", "Felipe").distinct();

		names.forEach(System.out::println);

	}

}
