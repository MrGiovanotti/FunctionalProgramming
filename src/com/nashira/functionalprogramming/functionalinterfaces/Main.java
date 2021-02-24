package com.nashira.functionalprogramming.functionalinterfaces;

public class Main {
	
	public static void main(String[] args) {
		
		// Aquí implementamos el método de la interfaz funcional.
		// Como una interfaz funcional tiene un solo método, no habrá confusiones sobre de qué método
		// estamos haciendo la implementación.
		Calculator sum = (a, b) -> a + b;
		
		// Puedo hacer la implementación de varias maneras:
		Calculator diff = (a, b) -> a - b;
		
		double a = 10;
		double b = 2;
		
		// Ahora la función operate tiene clara la operación que debe hacer.
		System.out.println("La suma es: " + Operation.operate(a, b, sum));
		
		System.out.println("La resta es: " + Operation.operate(a, b, diff));
		
		// Podemos pasar directamente la expresión lambda:
		System.out.println("La multiplicación es: " + Operation.operate(a, b, (num1, num2) -> num1 * num2));
		
		// Aquí utilizamos una función que utiliza dentro una BiFunction de Java
		System.out.println("La división es: " + Operation.operateWithBiFunction(a, b, (num1, num2) -> num1 / num2));
	}

}
