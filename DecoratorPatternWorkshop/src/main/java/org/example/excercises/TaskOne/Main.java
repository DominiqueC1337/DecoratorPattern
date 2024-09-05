package org.example.excercises.TaskOne; // DO NOT COPY THIS FOR ONLINE IDE USE
// https://www.online-java.com/
// https://www.jdoodle.com/online-java-compiler

// You're running a pizzeria and are using the pizza class to track the toppings and price of the pizza being ordered
// You only have a basic pizza class but want to use decorators to add the functionality of adding toppings and tracking the price of the pizza
class TaskOne {
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

