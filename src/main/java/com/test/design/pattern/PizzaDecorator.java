package com.test.design.pattern;

public abstract class PizzaDecorator implements Pizza {
    Pizza pizza;
    public PizzaDecorator(Pizza newPizza) {
        this.pizza = newPizza;
    }
    public String bakePizza() {
        return pizza.bakePizza();
    }
}
