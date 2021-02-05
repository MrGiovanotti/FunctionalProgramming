package com.nashira.functionalprogramming;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

import com.nashira.functionalprogramming.models.User;

public class ConsumerPractice {
	
	public static void main(String[] args) {
		
		// =========== EXAMPLE 1 ===========
		// A Consumer is a function that takes(consumes) a parameter and returns nothing
		Consumer<String> myConsumer = message -> System.out.println(message);
		// To execute your consumer, you must use accept()
		myConsumer.accept("Hello world from myConsumer");
		
		
		// =========== EXAMPLE 2 ===========
		// You can abbreviate a consumer.
		// The next consumer is exactly the same as the one in Example 1
		Consumer<String> myShortConsumer = System.out::println;
		myShortConsumer.accept("Hello from myShortConsumer");
		
		// ========== EXAMPLE 3 ============
		// We can use consumers with other functions that accepts them
		List<String> names = Arrays.asList("Jose", "Juan", "Pedro", "Jhosua");
		names.forEach(myShortConsumer);
		
		
		
		// ********** BICONSUMERS ****************
		
		// ============ EXAMPLE 1 ===============
		// BiConsumers acceps two parameters and returns nothing
		BiConsumer<String, Date> myBiConsumer =
				(message, date) -> System.out.println(String.format("Message: %s, Date: %s", message, date));
				
		// We also use accept() to execute it
		myBiConsumer.accept("Hello today", new Date());
		
		// ========== EXAMPLE 2=================
		// Now, we are going to use an object		
		User myUser = new User("Juan", "Erazo");
		BiConsumer<User, String> nameChanger = (user, name) -> {
			user.setName(name);
		};
		System.out.println("With no changes: " + myUser);
		nameChanger.accept(myUser, "Cristóbal");
		System.out.println("With changes: " + myUser);
		
		// EXAMPLE 3
		// We can also abbreviate BiConsumers.
		// This is exactly the same BiConsumer that the one in example 2
		BiConsumer<User, String> shortNameChanger = User::setName;
		shortNameChanger.accept(myUser, "Roberto");
		System.out.println("With the last change: " + myUser);
		
	}

}
