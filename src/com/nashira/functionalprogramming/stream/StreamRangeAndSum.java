package com.nashira.functionalprogramming.stream;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class StreamRangeAndSum {

	public static void main(String[] args) {
		// Sirve para crear un stream con un rango de números, pero no se puede aplicar directamente a
		// un Stream como tal, sino a u tipo de Stream llamado IntStream

		System.out.println("Example 1");
		IntStream numbers = IntStream.range(5, 20);
		numbers.forEach(System.out::println);


		// Un IntStream tiene también un método sum(), que suma los enteros del IntStream
		System.out.println("Example 2");
		IntStream integers = IntStream.range(1,  5);
		System.out.println("La suma de los números de 1 a 4 es: " + integers.sum());



		//****** summaryStatistics() nos habilita a encontrar algunas métricas importantes para
		// un rango de enteros
		System.out.println("Example 3");
		IntStream numbers1To19 = IntStream.range(1,  20);
		IntSummaryStatistics stats = numbers1To19.summaryStatistics();
		System.out.println("Max: " + stats.getMax());
		System.out.println("Min: " + stats.getMin());
		System.out.println("Sum: " + stats.getSum());
		System.out.println("Average: " + stats.getAverage());
		System.out.println("Count: " + stats.getCount());

	}

}
