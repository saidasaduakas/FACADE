package com.company;

public class Pizza implements Food{
    public String prepItem;
    @Override
    public void prepareFood(String item) {
        prepItem = "This pizza with ingredients";
    }

    @Override
    public String deliverFood() {
        return prepItem ;
    }
}
