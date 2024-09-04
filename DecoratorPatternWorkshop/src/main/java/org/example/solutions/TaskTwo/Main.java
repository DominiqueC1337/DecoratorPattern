package org.example.solutions.TaskTwo; // DO NOT COPY THIS FOR ONLINE IDE USE

import java.util.Scanner;

// https://www.online-java.com/
// https://www.jdoodle.com/online-java-compiler
class Main{
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("What kind of Pizza do you want?(Margarita/Hawaii)");
        String pizzaType = myObj.nextLine();
        System.out.println("How much cheese do you want to add to your Pizza?(1-10)");
        int cheeseAmount = Integer.parseInt(myObj.nextLine());

        Pizza pizza = pickPizza(pizzaType);
        for(int i = 0; i < cheeseAmount; i++){
            pizza = wrapWithCheeseDecorator(pizza);
        }


        System.out.println(pizza.decoratePizza());
        System.out.println("The pizza costs " + pizza.decorateCost() + "€");
    }
    static Pizza pickPizza(String pizzaType){
        if(pizzaType.equals("Margarita")){
            return new MargaritaPizza();
        }
        if(pizzaType.equals("Hawaii")){
            return new HawaiiPizza();
        }
        throw new RuntimeException("No valid Pizza name entered");
    }

    static Pizza wrapWithCheeseDecorator(Pizza pizza) {
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




