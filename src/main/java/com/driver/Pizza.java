package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean isCheeseAdded;
    private boolean isToppingsAdded;
    private boolean isTakeaway;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg) price+=300;
        else price+=400;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isCheeseAdded){
            isCheeseAdded = true;
            System.out.println("Extra Cheese Added: 80");
            price+=80;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!isToppingsAdded){
            isToppingsAdded = true;
            if(isVeg){
                System.out.println("Extra Toppings Added: 70");
                price+=70;
            }
            else{
                System.out.println("Extra Toppings Added: 120");
                price+=120;
            }
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!isTakeaway){
            System.out.println("Paper bag Price = 20");
            price+=20;
            isTakeaway = true;
        }
    }

    public String getBill(){
        // your code goes here
        String bill = "Total Price: "+price;
        return bill;
    }
}
