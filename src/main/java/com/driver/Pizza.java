package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean isCheeseAdded;
    private boolean isToppingsAdded;
    private boolean isTakeaway;
    private boolean isBillGenerated;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg) price=300;
        else price=400;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isCheeseAdded){
            isCheeseAdded = true;
            bill = bill + "Extra Cheese Added: 80\n";
            price+=80;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!isToppingsAdded){
            isToppingsAdded = true;
            if(isVeg){
                bill = bill + "Extra Toppings Added: 70\n";
                price+=70;
            }
            else{
                bill = bill + "Extra Toppings Added: 120\n";
                price+=120;
            }
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!isTakeaway){
            bill = bill + "Paper bag Price = 20\n";
            price+=20;
            isTakeaway = true;
        }
    }

    public String getBill(){
        // your code goes here
        if(isBillGenerated==false)
        {
            bill+="Total Price: "+price+"\n";
            isBillGenerated=true;
        }
        return bill;
    }
}
