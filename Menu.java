package Munchies;


public class Menu {

    String food;
    String protein;
    String drink;
    String others;


    //default constructor
    Menu(){}

    //mutator method 
    public void setFood(String food){
        this.food = food;
    }

    public void setProtein(String protein){
        this.protein = protein;
    }

    public void setDrink(String drink){
        this.drink = drink;

    }

    public void setOthers(String others){
        this.others = others;
    }


    String getFood(){
        return food;
    }

    String getProtein(){
        return protein;
    }

    String getDrink(){
        return drink;
    }

    String getOthers(){
        return others;
    }


}