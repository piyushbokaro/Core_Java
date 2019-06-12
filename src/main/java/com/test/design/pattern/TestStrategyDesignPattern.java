package com.test.design.pattern;

public class TestStrategyDesignPattern {
	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();

		Item item1 = new Item("1234",10);
		Item item2 = new Item("5678",40);
		Item item3 = new Item("5678",40);
		cart.addItem(item1);
		cart.addItem(item2);
		cart.addItem(item3);
		//pay by paypal
		cart.pay(new PaypalStrategy("myemail@example.com", "mypwd"));

		//pay by credit card
		cart.pay(new CreditCardStrategy("Ajith", "1234567890123456", "786", "12/15"));
	}
}
