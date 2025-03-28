package src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Recipe {
    private final ArrayList<Ingredient> ingredients;
    private final ArrayList<String> steps;

    public Recipe(){
        ingredients = new ArrayList<>();
        steps = new ArrayList<>();
    }

    public void addIngredient(Ingredient ingredient){
        if(!ingredients.contains(ingredient)){
            ingredients.add(ingredient);
            System.out.println("Added " + ingredient.getName() + " successfully.");
        }else{
            System.out.println(ingredient.getName() + " is already in this recipe.");
        }
    }
    public void addIngredient(String name, float amount, String unit){
        Ingredient ingredient = new Ingredient(name, amount, unit);
        if(!ingredients.contains(ingredient)){
            ingredients.add(ingredient);
            System.out.println("Added " + ingredient.getName() + " successfully.");
        }else{
            System.out.println(ingredient.getName() + " is already in this recipe.");
        }
    }
    public void removeIngredient(String name){
        boolean b = false;
        for(Ingredient ingredient : ingredients){
            if(Objects.equals(ingredient.getName(), name)){
                ingredients.remove(ingredient);
                b = true;
                break;
            }
        }
        if(b){
            System.out.println(name + " was successfully removed!");
        }else{
            System.out.println("This recipe does not have " + name + ".\nSorry.");
        }
    }
    public void printIngredients(){
        if(!ingredients.isEmpty()){
            System.out.println("Here are all the ingredients:");
            int i = 1;
            for (Ingredient ingredient : ingredients){
                System.out.println(i + " - " + ingredient.getAmount() + " " + ingredient.getUnit() + " " + ingredient.getName());
                i++;
            }
        }else{
            System.out.println("There are no ingredients in this recipe.");
        }
    }
    public void setIngredients(Ingredient[] newIngredients){
        if(newIngredients.length != 0){
            List<Ingredient> temp = Arrays.stream(newIngredients).toList();
            ingredients.clear();
            ingredients.addAll(temp);
        }else{
            System.out.println("The ingredients you're trying to set for this recipe is empty :(.");
        }
    }
    public void setIngredients(List<Ingredient> newIngredients){
        if(newIngredients.isEmpty()){
            System.out.println("The ingredients you're trying to set for this recipe is empty :(.");
        }else{
            ingredients.clear();
            ingredients.addAll(newIngredients);
        }
    }
    public void addStep(String step){
        steps.add(step);
    }
    public void printSteps(){

        if(steps.isEmpty()){
            System.out.println("There are no steps to print.");
        }else{
            System.out.println("Here are all the steps: ");
            int i = 1;
            for(String step : steps){
                System.out.println(i + " - " + step);
                i++;
            }
        }
    }
}
