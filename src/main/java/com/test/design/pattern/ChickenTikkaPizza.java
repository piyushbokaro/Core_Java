package com.test.design.pattern;

public class ChickenTikkaPizza extends PizzaDecorator {
    public ChickenTikkaPizza(Pizza newPizza) {
        super(newPizza);
    }
    public String bakePizza() {
        return pizza.bakePizza() + " with Chicken topping added";
    }
}