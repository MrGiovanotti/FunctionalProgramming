package com.nashira.functionalprogramming.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamCreation {
	
	public static void main(String[] args) {
		
		
		// Creación de un stream por medio del método of()
		Stream<String> animals = Stream.of("cat", "dog", "snake");
		animals.forEach(System.out::println);
		
		
		// Creación de un stream a partir de un arreglo
		String[] namesArray = {"Jose", "Giovanny", "Diana"};
		Stream<String> namesStream = Arrays.stream(namesArray);
		namesStream.forEach(System.out::println);
		
		// Creación de un stream utilizando builder()
		Stream<Integer> numbers = Stream.<Integer>builder().add(1).add(2).add(3).build();
		numbers.forEach(num -> System.out.println(num.toString()));
		
		// Creación de un stream a partir de una lista
		List<String> citiesList = Arrays.asList("Quito", "Manta", "Guayaquil");
		Stream<String> citiesStream = citiesList.stream();
		citiesList.forEach(System.out::println);
	}

}
