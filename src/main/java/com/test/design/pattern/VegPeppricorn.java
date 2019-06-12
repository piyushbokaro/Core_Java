package com.test.design.pattern;

public class VegPeppricorn extends PizzaDecorator {
    public VegPeppricorn(Pizza newPizza) {
        super(newPizza);
    }
    public String bakePizza() {
        return pizza.bakePizza() + " with pepricorn topping added";
    }

}
