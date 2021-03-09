package com.nashira.functionalprogramming.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.nashira.functionalprogramming.models.User;

public class StreamMap {
	
	public static void main(String[] args) {
		
		// map() sirve para transformar los datos de un stream.
		// Como un stream es inmutable, lo que se hace es generar una nueva
		//instancia del stream con esta transformación, y al original lo deja intacto.
		// Por lo tanto podemos regresar al estado anterior en cualquier instante.
		
		// peek() sirve para inspeccionar el stream en cierto momento; pero no se ejecutará hasta
		//que apliquemos al stream un método terminal, como un system.out.println o un collect.
		
		Stream<Integer> numbersStream = Stream.of(1, 2, 3)
				.map(num -> num*2)
				.peek(System.out::println)
				.map(num -> num + 1);
		
		// Al ejecutar esta línea, ya podremos ver en consola las impresiones hechas con peek. 
		List<Integer> numbersList = numbersStream.collect(Collectors.toList());
		
		numbersList.forEach(num -> System.out.println(num.toString()));
		
		
		// ============= Ejemplo usando el modelo User ================
		// Transformo una lista de String en una lista de User
		List<String> names = Arrays.asList("Jose Granda", "Diana Guznay", "Nicholas Cage");
		List<User> users = names.stream()
				.map(name -> new User(name.split(" ")[0], name.split(" ")[1]))
				.collect(Collectors.toList());
		users.forEach(user -> System.out.println(user));
		
	}

}
