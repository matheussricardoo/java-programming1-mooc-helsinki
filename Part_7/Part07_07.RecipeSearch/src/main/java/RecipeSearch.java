import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Recipe {
    private String name;
    private int cookingTime;
    private List<String> ingredients;

    public Recipe(String name, int cookingTime, List<String> ingredients) {
        this.name = name;
        this.cookingTime = cookingTime;
        this.ingredients = ingredients;
    }

    public String getName() {
        return name;
    }

    public int getCookingTime() {
        return cookingTime;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return name + ", cooking time: " + cookingTime;
    }
}

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Recipe> recipes = new ArrayList<>();

        System.out.print("File to read: ");
        String fileName = scanner.nextLine();

        try {
            recipes = readRecipesFromFile(fileName);
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
            return;
        }

        System.out.println("\nCommands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");

        while (true) {
            System.out.print("\nEnter command: ");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;
            } else if (command.equals("list")) {
                listRecipes(recipes);
            } else if (command.equals("find name")) {
                findRecipesByName(scanner, recipes);
            } else if (command.equals("find cooking time")) {
                findRecipesByCookingTime(scanner, recipes);
            } else if (command.equals("find ingredient")) {
                findRecipesByIngredient(scanner, recipes);
            } else {
                System.out.println("Unknown command!");
            }
        }
    }

    public static List<Recipe> readRecipesFromFile(String fileName) throws IOException {
        List<Recipe> recipes = new ArrayList<>();
        Scanner fileScanner = new Scanner(new File(fileName));

        while (fileScanner.hasNextLine()) {
            String name = fileScanner.nextLine();
            if (name.isEmpty()) {
                continue;
            }

            int cookingTime = Integer.parseInt(fileScanner.nextLine());
            List<String> ingredients = new ArrayList<>();

            while (fileScanner.hasNextLine()) {
                String ingredient = fileScanner.nextLine();
                if (ingredient.isEmpty()) {
                    break;
                }
                ingredients.add(ingredient);
            }

            recipes.add(new Recipe(name, cookingTime, ingredients));
        }

        return recipes;
    }

    public static void listRecipes(List<Recipe> recipes) {
        System.out.println("\nRecipes:");
        for (Recipe recipe : recipes) {
            System.out.println(recipe);
        }
    }

    public static void findRecipesByName(Scanner scanner, List<Recipe> recipes) {
        System.out.print("Searched word: ");
        String searchedWord = scanner.nextLine().toLowerCase();

        System.out.println("\nRecipes:");
        for (Recipe recipe : recipes) {
            if (recipe.getName().toLowerCase().contains(searchedWord)) {
                System.out.println(recipe);
            }
        }
    }

    public static void findRecipesByCookingTime(Scanner scanner, List<Recipe> recipes) {
        System.out.print("Max cooking time: ");
        int maxTime = Integer.parseInt(scanner.nextLine());

        System.out.println("\nRecipes:");
        for (Recipe recipe : recipes) {
            if (recipe.getCookingTime() <= maxTime) {
                System.out.println(recipe);
            }
        }
    }

    public static void findRecipesByIngredient(Scanner scanner, List<Recipe> recipes) {
        System.out.print("Ingredient: ");
        String ingredient = scanner.nextLine().toLowerCase();

        System.out.println("\nRecipes:");
        for (Recipe recipe : recipes) {
            if (recipe.getIngredients().stream().anyMatch(i -> i.equalsIgnoreCase(ingredient))) {
                System.out.println(recipe);
            }
        }
    }
}
