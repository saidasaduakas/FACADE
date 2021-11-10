package com.company;

public class Waiter {
    public static String deliverFood(Foodtype foodtype){

        Ingredient ingredient=new Ingredient();
        switch (foodtype){
            case PASTA:
                Food pasta =new Pasta();
                String pastaItem= ingredient.getPastaitem();
                pasta.prepareFood(pastaItem);
                return pasta.deliverFood();
            case PIZZA:
                Food pizza =new Pizza();
                String pizzaItem = ingredient.getPizzaitem();
                pizza.prepareFood(pizzaItem);
                return pizza.deliverFood();
        }
        return null;
    }
}
