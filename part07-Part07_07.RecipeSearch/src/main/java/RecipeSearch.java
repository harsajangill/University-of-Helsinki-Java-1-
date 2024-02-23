
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Paths;


public class RecipeSearch {
    private ArrayList<Recipe> recipes;

    public RecipeSearch(){
        recipes = new ArrayList<>();
    }

    public ArrayList<Recipe> getRecipes(){
        return this.recipes;
    }

    public ArrayList<Recipe> readRecipesFromFile(String file) {
        ArrayList<Recipe> recipes = new ArrayList<>();
        String recipe = "";
        try (Scanner reader = new Scanner(Paths.get(file))) {
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                if (line.isEmpty()) {
                    String[] parts = recipe.split(",");
                    Recipe food = new Recipe(parts[0], Integer.valueOf(parts[1]));
                    for (int i = 2; i < parts.length; i++) {
                        food.addIngredient(parts[i]);
                    }
                    recipes.add(food);
                    recipe = "";
                    continue;
                }

                recipe = recipe + line + ",";
            }

            String[] parts = recipe.split(",");
            Recipe food = new Recipe(parts[0], Integer.valueOf(parts[1]));
            for (int i = 2; i < parts.length; i++) {
                food.addIngredient(parts[i]);
            }
            recipes.add(food);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        this.recipes = recipes;
        return this.recipes;
    }
    


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        RecipeSearch newRecipes = new RecipeSearch();
        UserInterface ui = new UserInterface(scanner, newRecipes);

        ui.start();
    }
}
