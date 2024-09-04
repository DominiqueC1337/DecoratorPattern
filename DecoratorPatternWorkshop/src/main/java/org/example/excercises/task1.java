package org.example.excercises;

import java.sql.SQLOutput;

public class task1 {
    public static void main(String[] args) {

        Pizza pizza = new CheeseDecorator(new CheeseDecorator(new MargaritaPizza()));
        System.out.println(pizza.decoratePizza());
        System.out.println("The pizza costs " + pizza.decorateCost() + "€");
    }
}

interface Pizza{
    //Write two decorator methods without body
}

class MargaritaPizza implements Pizza{
    //Implement the base functionality of the two decorator methods

}

abstract class PizzaDecorator implements Pizza{
    Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    //Override the base decorator methods
}

class CheeseDecorator extends PizzaDecorator {
    public CheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    //Implement the extended functionality of the two decorator methods
}

