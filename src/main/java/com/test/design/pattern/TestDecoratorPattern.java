package com.test.design.pattern;

import java.util.Scanner;

public class TestDecoratorPattern {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

	    System.out.println("Enter your Pizza type: ");
	    System.out.println("1 : ChickenTikkaPizza ");
	    System.out.println("2 : VegPeppricorn ");
	    System.out.print("");
	    int pizzaCode = Integer.parseInt(scanner.next());
	    Pizza pizza=null;
	    switch (pizzaCode) {
		case 1:
			 pizza = new ChickenTikkaPizza(new BasicPizza());
		     System.out.println(pizza.bakePizza());
		     break;
		case 2:
			 pizza = new VegPeppricorn(new BasicPizza());
		     System.out.println(pizza.bakePizza());
			break;

		default:
			break;
		}
       
 
    }
}
