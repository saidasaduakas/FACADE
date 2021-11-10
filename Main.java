package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Ingredient ingredient =new Ingredient();
        Food pasta =new Pasta();
        String pastaItem= ingredient.getPastaitem();
        pasta.prepareFood(pastaItem);
        System.out.println(pasta.deliverFood());

        Food pizza =new Pizza();
        String pizzaItem= ingredient.getPizzaitem();
        pizza.prepareFood(pizzaItem);
        System.out.println(pizza.deliverFood());


        System.out.println("-----------facade-------");
        System.out.println(Waiter.deliverFood(Foodtype.PASTA));
        System.out.println(Waiter.deliverFood(Foodtype.PIZZA));
    }
}
