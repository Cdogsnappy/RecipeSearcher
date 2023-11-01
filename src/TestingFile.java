import java.util.ArrayList;

public class TestingFile {
    public static void main(String args[]){
        Ingredient i1 = new Ingredient("flour", 2.0);
        Ingredient i2 = new Ingredient("sugar", 1.0);
        ArrayList<Ingredient> ingList = new ArrayList<>();
        ingList.add(i1);
        ingList.add(i2);
        Recipe r1 = new Recipe(ingList, 30, true, false);
        System.out.println("The amount of time to make sugar bread is " + r1.minutes + " minutes");
        for(int i = 0; i < 12; ++i){
            System.out.println("I AM ANIMENERD");
        }
    }
}
