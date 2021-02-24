package com.nashira.functionalprogramming.functionalinterfaces;

import java.util.function.BiFunction;

public class Operation {
	
	// Pasamos como parámetro un objeto del tipo de la interfaz funcional "Calculator" y dentro la utilizamos
	// así, cuando utilicemos esta función "operate", podremos implementar su único método "calculate". Podremos pasar este
	// parámetro como una función lambda
	static double operate(double a, double b, Calculator calculator) {
		return calculator.calculate(a, b);
	}
	
	
	// Ya que nuestra función "operate" es una BiFunction, podemos lograr el mismo
	// resultado con una Bifunction de Java
	
	static double operateWithBiFunction(double a, double b, BiFunction<Double, Double, Double> biFunction) {
		return biFunction.apply(a, b);
	}

}
