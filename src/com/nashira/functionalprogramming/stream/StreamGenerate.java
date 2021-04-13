package com.nashira.functionalprogramming.stream;

import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

public class StreamGenerate {

	// generate() nos sirve para generar un Stream, podemos poner un límite
	// o puede ser infinito

	public static void main(String[] args) {

		// Vamos a escribir "Hola Mundo" cada dos segundos, 10 veces:

		Stream.generate(() -> {
			try {
				// Damos una pausa de dos segundos
				TimeUnit.SECONDS.sleep(2);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			return "Hola Mundo";
		}).limit(10).forEach(System.out::println);

		System.out.println("Fin");

	}

}
