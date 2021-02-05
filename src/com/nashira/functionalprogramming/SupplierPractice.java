package com.nashira.functionalprogramming;

import java.util.function.Supplier;

import com.nashira.functionalprogramming.models.User;

public class SupplierPractice {
	
	public static void main(String[] args) {
		// A Supplier doesn't take arguments, but returns a value
		
		// ========== EXAMPLE 1 =========
		Supplier<String> mySupplier = () -> "Hello from mySupplier";
		// To get the value returned by the supplier, we use get()
		System.out.println(mySupplier.get());
		
		
		// ============= EXAMPLE 2 =============
		// We can use the supplier to create objects' instances
		Supplier<User> createUser = () -> new User();
		User myUser = createUser.get();
		System.out.println(myUser);
		
		
		// ============= EXAMPLE 3 =============
		// We can abbreviate a supplier.
		// This is the same supplier that the one in example 2
		Supplier<User> shortCreateUser = User::new;
		User myNewUser = shortCreateUser.get();
		System.out.println(myNewUser);
	}

}
