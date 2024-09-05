package org.example.excercises.TaskTwo; // DO NOT COPY THIS FOR ONLINE IDE USE

import java.util.Scanner;

// https://www.online-java.com/
// https://www.jdoodle.com/online-java-compiler
class Main{
    public static void main(String[] args) {
        // Extend the functionality of the result of TaskOne here, you could add more Pizza types or different toppings
        // Have the targets wrapped dynamically based on user input(can use Scanner as an example)
        // Add at least 1 method that wraps a target object in a decorator
    }
}

interface Pizza{
    public String decoratePizza();

    public int decorateCost();
}

class MargaritaPizza implements Pizza {
    public String decoratePizza(){
        return "You've made a Margarita Pizza";
    }

    public int decorateCost(){
        return 10;
    }
}

class HawaiiPizza implements Pizza {
    public String decoratePizza(){
        return "You've made a Hawaii Pizza";
    }

    public int decorateCost(){
        return 15;
    }
}

abstract class PizzaDecorator implements Pizza {
    Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String decoratePizza() {
        return pizza.decoratePizza();
    }

    @Override
    public int decorateCost() {
        return pizza.decorateCost();
    }
}

class CheeseDecorator extends PizzaDecorator {
    public CheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    public String decoratePizza() {
        return super.decoratePizza() + " with cheese";
    }

    public int decorateCost() {
        return super.decorateCost() + 2;
    }
}




