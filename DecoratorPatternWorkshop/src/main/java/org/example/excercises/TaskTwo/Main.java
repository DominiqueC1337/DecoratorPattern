package org.example.excercises.TaskTwo; // DO NOT COPY THIS FOR ONLINE IDE USE
// https://www.online-java.com/
// https://www.jdoodle.com/online-java-compiler
class Main{
    public static void main(String[] args) {

        Pizza pizza = new CheeseDecorator(new CheeseDecorator(new MargaritaPizza()));
        pizza = wrapWithCheeseDecorator(pizza);
        System.out.println(pizza.decoratePizza());
        System.out.println("The pizza costs " + pizza.decorateCost() + "€");
    }

    public static Pizza wrapWithCheeseDecorator(Pizza pizza) {
        return new CheeseDecorator(pizza);
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




