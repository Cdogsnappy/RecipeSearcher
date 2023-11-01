import java.util.HashMap;

/**
 * Ingredient Class
 * Authors: Caleb and Mya
 * 10/31/23
 * Ingredient object which holds all important information about an ingredient in a recipe.
 */
public class Ingredient {

    public static int idCount = 0;
    public static HashMap<String,Integer> ingredientDictionary = new HashMap<String,Integer>();
    public int id;
    public double amount;

    public Ingredient(String name, double amount){
        if(ingredientDictionary.containsKey(name)){
            this.id = ingredientDictionary.get(name);
        }
        else{
            this.id = ++idCount;
            ingredientDictionary.put(name, idCount);
        }
        this.amount = amount;
    }
    public boolean equals(Ingredient other){
        return this.id == other.id;
    }
    public boolean isEnough(Ingredient other){
        return this.amount >= other.amount;
    }
}
