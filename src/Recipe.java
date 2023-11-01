import java.util.List;

/**
 * Recipe Class
 * Authors: Caleb and Mya
 * 10/31/23
 * Recipe object which holds all important information about a recipe.
 */
public class Recipe {

     public List<Ingredient> ingredientList;
     public int minutes;
     public boolean glutenFree;
     public boolean nutFree;

     public Recipe(List<Ingredient> ingredientList, int time, boolean hasGluten, boolean nutFree){
         this.ingredientList = ingredientList;
         minutes = time;
         glutenFree = hasGluten;
         this.nutFree = nutFree;
     }

    /**
     * @author anime
     * @param other their inventory/specifcations
     * @return whether the person can make the recipe
     */
    public boolean isValid(Recipe other){
        if(this.ingredientList.size() > other.ingredientList.size()){return false;}

        for(int i = 0; i < this.ingredientList.size(); ++i){
            for(int j = 0; j < other.ingredientList.size(); ++j){
                Ingredient recipeIngredient = this.ingredientList.get(i);
                Ingredient inventoryIngredient = other.ingredientList.get(j);
                if(recipeIngredient.equals(inventoryIngredient) && !recipeIngredient.isEnough(inventoryIngredient)){
                    return false;
                }
            }
        }
        
        if(this.minutes > other.minutes){
            return false;
        }
        if((other.glutenFree && !this.glutenFree) || (other.nutFree && !this.nutFree)){
            return false;
        }
        return true;
    }
}
