package com.company;

public class Pasta implements Food{
    public String prepItem;
    @Override
    public void prepareFood(String item) {
        prepItem = "Tomato pasta with ingredients";
    }

    @Override
    public String deliverFood() {
        return prepItem ;
    }
}

