package Munchies;


import java.util.Scanner;
public class Order {

    public static void main(String[] args){

        //create a new object called order1
        Menu order1 = new Menu();
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Munchies! Please enter your order: " );
    

        System.out.println("\n" + "What food do you want?: " );
        order1.setFood(input.nextLine());
    
        System.out.println("What protein do you want?: " );
        order1.setProtein(input.nextLine());

        System.out.println("What drink do you want?: " );
        order1.setDrink(input.nextLine());

        System.out.println("Any other thing you want?: " );
        order1.setOthers(input.nextLine());

   

        System.out.println("\n" + "Food: " + order1.getFood());
        System.out.println("Protein: " + order1.getProtein());
        System.out.println("Drink: " + order1.getDrink());
        System.out.println("Other: " + order1.getOthers());
    
}

}



//

This program should ask a customer for their order, 
//it should note how mcuh each item costs, rice, jollof, fufu etc
//it shouls calculate the total cost of the order
//it should also ask the customer if they are eating here or taking away. if yes then include pack in the menu if not pass
//it should also customer to confirm their order, if the order is corret, it should print the order and the total cost,
// if the order is wrong, it should ask the cusomer to re-enter their order again and confirm the order again 
//after the order has been confirmed, it should ask the customer if they want to pay with cash or card
//if the customer pays with cash, it should ask the customer to enter the amount of money they are paying
//if card it should ask the customer to enter their card details; number and pin 