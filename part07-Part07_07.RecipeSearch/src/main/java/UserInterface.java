import java.util.Scanner;


public class UserInterface {
    private Scanner scanner;
    private RecipeSearch recipes;

    public UserInterface(Scanner scanner, RecipeSearch recipes){
        this.scanner = scanner;
        this.recipes = recipes;
    }

    public void start(){
        System.out.print("File to read: ");
        String file = scanner.nextLine();
        this.recipes.readRecipesFromFile(file);
        System.out.println();System.out.println("Commands:\n" + 
        "list - lists the recipes\n" +
         "stop - stops the program\n" + 
         "find name - searches recipes by name\n" +
         "find cooking time - searches recipes by cooking time\n" +
         "find ingredient - searches recipes by ingredient\n");

        while (true){
            System.out.print("Enter command: ");
            String input = scanner.nextLine();

            if(input.equals("stop")){
                break;
            }

            if(input.equals("list")){
                System.out.println("\nRecipes:");
                for (Recipe recipe : this.recipes.getRecipes()){
                    System.out.println(recipe.toString());
                }
                System.out.println("");
                continue;
            }

            if(input.equals("find name")){
                System.out.print("Searched word: ");
                String searchFood = scanner.nextLine();
                System.out.println("\nRecipes:");

                for (Recipe recipe : this.recipes.getRecipes()){
                    if (recipe.contains(searchFood) == true) {
                        System.out.println(recipe.toString());
                    }
                }
                System.out.println("");
            }

            if(input.equals("find cooking time")){
                System.out.print("Max cooking time: ");
                int maxCookingTime = Integer.valueOf(scanner.nextLine());
                System.out.println("\nRecipes:");
                for(Recipe recipe : this.recipes.getRecipes()){
                    if (recipe.getCookingTime() <= maxCookingTime) {
                        System.out.println(recipe.toString());
                    }
                }
                System.out.println("");
                continue;
            }

            if(input.equals("find ingredient")){
                System.out.print("Ingredient: ");
                String ingredient = scanner.nextLine();
                System.out.println("\nRecipes:");

                for(Recipe recipe : this.recipes.getRecipes()){
                    if(recipe.getIngredients().contains(ingredient)){
                        System.out.println(recipe.toString());
                    }
                }
                System.out.println("");
            }
        }
    }

}
