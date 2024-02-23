import java.util.ArrayList;

public class Recipe {
    private String name;
    private int cookingTime;
    private ArrayList<String> ingredients;

    public Recipe(String name, int time){
        this.name = name;
        this.cookingTime = time;
        this.ingredients = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }

    public int getCookingTime(){
        return this.cookingTime;
    }

    public ArrayList<String> getIngredients(){
        return this.ingredients;
    }

    public void addIngredient(String ingredient) {
        this.ingredients.add(ingredient);
    }

    public void addRecipeName(String name) {
        this.name = name;
    }

    public void addRecipeCookingTime(int time){
        this.cookingTime = time;
    }

    public boolean contains(String searchFood) {
        if(this.name.contains(searchFood)) {
            return true;
        }

        return false;
    }

    public String toString(){
        return this.getName() + ", cooking time: " + this.getCookingTime();
    }
}
