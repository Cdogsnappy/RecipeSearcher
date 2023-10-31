import java.util.HashMap;

/**
 * Ingredient Class
 * Authors: Caleb and Mya
 * 10/31/23
 * Ingredient object which holds all important information about an ingredient in a recipe.
 */
public class Ingredient {
    public static HashMap<String,Integer> ingredientDictionary = new HashMap<String,Integer>();
    public int id;
    public float amount;
    public boolean equals(Ingredient other){
        return this.id == other.id;
    }
    public boolean isEnough(Ingredient other){
        return this.equals(other) && this.amount >= other.amount;
    }
}
